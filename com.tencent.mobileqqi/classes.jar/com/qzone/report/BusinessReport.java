package com.qzone.report;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.qzone.common.CommonTaskThread;
import com.qzone.common.logging.QDLog;
import com.qzone.download.DownloaderFactory;
import com.qzone.download.NetworkManager;
import com.qzone.download.uinterface.IDownloadConfig;
import com.qzone.utils.http.HttpUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BusinessReport
{
  private static final int APP_OP_COUNT = 12;
  private static final int MAX_COUNT = 10;
  private static final int MAX_TIME = 600000;
  private static final int RADOM_PERCENT = 5;
  private static final String TAG = "BusinessReport";
  private static SparseArray<ArrayList<ReportObj>> appReportLists = new SparseArray(12);
  private static final Object init_lock;
  private static volatile boolean inited;
  private static final Object[] locks;
  private static CommonTaskThread mTaskThread = new CommonTaskThread("BusinessReport");
  private static Random r = new Random();
  private static long startTime;
  
  static
  {
    locks = new Object[12];
    init_lock = new Object();
    inited = false;
    startTime = SystemClock.uptimeMillis();
  }
  
  private static ArrayList<ReportObj> createRamdomArrayList()
  {
    new ArrayList()
    {
      private final boolean isFailed(ReportObj paramAnonymousReportObj)
      {
        return paramAnonymousReportObj.retCode != 0;
      }
      
      public boolean add(ReportObj paramAnonymousReportObj)
      {
        boolean bool2 = false;
        boolean bool1;
        if (isFailed(paramAnonymousReportObj))
        {
          QDLog.i("BusinessReport", "download a img fail. need report");
          bool1 = super.add(paramAnonymousReportObj);
        }
        int i;
        do
        {
          do
          {
            return bool1;
            if ((paramAnonymousReportObj != null) && ((paramAnonymousReportObj instanceof DownloadImageReport.DownloadReportObject)) && (((DownloadImageReport.DownloadReportObject)paramAnonymousReportObj).needForceReport())) {
              return super.add(paramAnonymousReportObj);
            }
            i = BusinessReport.access$1();
            bool1 = bool2;
          } while (i <= 0);
          bool1 = bool2;
        } while (BusinessReport.r.nextInt(Math.round(100 / i)) != 0);
        return super.add(paramAnonymousReportObj);
      }
    };
  }
  
  private static int getReportPercent()
  {
    IDownloadConfig localIDownloadConfig = DownloaderFactory.getDownloadConfig();
    int i;
    if (localIDownloadConfig == null) {
      i = 5;
    }
    int j;
    do
    {
      return i;
      j = localIDownloadConfig.getReportPercent();
      if (j < 0) {
        return 5;
      }
      i = j;
    } while (j <= 100);
    return 100;
  }
  
  public static void init()
  {
    if (inited) {
      return;
    }
    synchronized (init_lock)
    {
      if (inited) {
        return;
      }
    }
    inited = true;
    int i = 0;
    break label96;
    for (;;)
    {
      if (i >= locks.length)
      {
        return;
        label47:
        appReportLists.append(i, createRamdomArrayList());
        break;
        label60:
        appReportLists.append(i, new ArrayList());
        break;
      }
      locks[i] = new Object();
      i += 1;
    }
    for (;;)
    {
      label96:
      if (i >= 12)
      {
        i = 0;
        break;
      }
      if (i == 1) {
        break label47;
      }
      if (i != 11) {
        break label60;
      }
      break label47;
      i += 1;
    }
  }
  
  public static void uploadReport(ReportObj paramReportObj, int paramInt1, int paramInt2)
  {
    if (((paramInt1 < 0) || (paramInt1 > 9)) && (paramInt1 % 2 != 0)) {}
    for (;;)
    {
      return;
      if ((paramInt2 == 0) || (paramInt2 == 1))
      {
        int i = paramInt1 + paramInt2;
        long l1 = SystemClock.uptimeMillis();
        long l2 = startTime;
        ArrayList localArrayList = (ArrayList)appReportLists.get(i);
        synchronized (locks[i])
        {
          localArrayList.add(paramReportObj);
          switch (i)
          {
          case 0: 
          case 2: 
          case 3: 
          case 4: 
          case 6: 
          case 8: 
          case 9: 
          case 10: 
          default: 
            return;
          case 1: 
          case 7: 
          case 11: 
            if ((localArrayList.size() >= 10) || (l1 - l2 >= 600000L))
            {
              uploadReportImmediately(paramInt1, paramInt2);
              return;
            }
            break;
          }
        }
      }
    }
    uploadReportImmediately(paramInt1, paramInt2);
  }
  
  public static void uploadReportImmediately(int paramInt1, int paramInt2)
  {
    if (((paramInt1 < 0) || (paramInt1 > 11)) && (paramInt1 % 2 != 0)) {}
    int i;
    ArrayList localArrayList1;
    do
    {
      do
      {
        return;
      } while (((paramInt2 != 0) && (paramInt2 != 1)) || (!NetworkManager.isNetworkAvailable()));
      i = paramInt1 + paramInt2;
      localArrayList1 = (ArrayList)appReportLists.get(i);
    } while (localArrayList1.isEmpty());
    synchronized (locks[i])
    {
      ArrayList localArrayList2 = new ArrayList(localArrayList1);
      if ((i == 1) || (i == 11))
      {
        appReportLists.setValueAt(i, createRamdomArrayList());
        localArrayList1.clear();
        startTime = SystemClock.uptimeMillis();
        mTaskThread.post(new ReportRunnable(localArrayList2, paramInt1, paramInt2));
        return;
      }
      appReportLists.setValueAt(i, new ArrayList());
    }
  }
  
  public static class ReportRunnable
    implements Runnable
  {
    private static final int MAX_TRY_COUNT = 3;
    int appid;
    String body;
    boolean inited = false;
    ArrayList<ReportObj> listToSend;
    int op;
    boolean successed = false;
    int tryCount = 0;
    String url;
    
    public ReportRunnable(ArrayList<ReportObj> paramArrayList, int paramInt1, int paramInt2)
    {
      this.listToSend = paramArrayList;
      this.appid = paramInt1;
      this.op = paramInt2;
    }
    
    private void init()
    {
      if (this.inited) {
        return;
      }
      if (this.listToSend.isEmpty())
      {
        QDLog.e("BusinessReport", "listToSend is empty.");
        return;
      }
      Object localObject = this.listToSend;
      localJSONObject = new JSONObject();
      for (;;)
      {
        try
        {
          localJSONObject.put("count", ((ArrayList)localObject).size());
          localJSONArray = new JSONArray();
          localObject = ((ArrayList)localObject).iterator();
          if (((Iterator)localObject).hasNext()) {
            continue;
          }
          localJSONObject.put("data", localJSONArray);
        }
        catch (JSONException localJSONException)
        {
          JSONArray localJSONArray;
          localJSONObject = null;
          QDLog.e("BusinessReport", "JSONException when uploadReport.", localJSONException);
          continue;
        }
        this.url = ReportObj.getReportUrl(this.appid, this.op);
        QDLog.i("BusinessReport", "url : " + this.url);
        if (localJSONObject != null) {
          this.body = localJSONObject.toString();
        }
        QDLog.i("BusinessReport", "json : " + this.body);
        this.inited = true;
        return;
        localJSONArray.put(((ReportObj)((Iterator)localObject).next()).toJSON());
      }
    }
    
    public void run()
    {
      init();
      if ((TextUtils.isEmpty(this.url)) || (TextUtils.isEmpty(this.body))) {}
      for (;;)
      {
        return;
        QDLog.i("BusinessReport", "start report thread.");
        try
        {
          HttpResponse localHttpResponse = HttpUtil.executeHttpPost(DownloaderFactory.getContext(), this.url, new StringEntity(this.body));
          if (localHttpResponse.getStatusLine().getStatusCode() == 200)
          {
            this.listToSend.clear();
            this.successed = true;
            QDLog.i("BusinessReport", "report success.");
          }
          while ((!this.successed) && (this.tryCount <= 3))
          {
            BusinessReport.mTaskThread.postDelay(this, 300000L);
            return;
            this.tryCount += 1;
            QDLog.e("BusinessReport", "HttpStatus error when report : " + localHttpResponse.getStatusLine().getStatusCode());
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          for (;;)
          {
            this.tryCount += 1;
            QDLog.w("BusinessReport", "exception when report", localUnsupportedEncodingException);
          }
        }
        catch (ClientProtocolException localClientProtocolException)
        {
          for (;;)
          {
            this.tryCount += 1;
            QDLog.w("BusinessReport", "exception when report", localClientProtocolException);
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            this.tryCount += 1;
            QDLog.w("BusinessReport", "exception when report", localIOException);
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          for (;;)
          {
            this.tryCount += 1;
            QDLog.w("BusinessReport", "exception when report", localIllegalArgumentException);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            this.tryCount += 1;
            QDLog.w("BusinessReport", "exception when report", localException);
          }
        }
        catch (Error localError)
        {
          for (;;)
          {
            this.tryCount += 1;
            QDLog.w("BusinessReport", "error when report", localError);
          }
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.qzone.report.BusinessReport
 * JD-Core Version:    0.7.0.1
 */