package com.tencent.mobileqq.shortvideo;

import acbn;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import anfl;
import anii;
import anpc;
import aoll;
import aolm;
import aomi;
import aopm;
import aopo;
import aopp;
import aqec;
import aqhq;
import aqiw;
import com.tencent.common.app.AppInterface;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.shortvideo.ptvfilter.material.QQTemplateParser;
import com.tencent.qphone.base.util.QLog;
import com.tencent.ttpic.openapi.model.VideoMaterial;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jqp;
import mqq.app.AppRuntime;
import mqq.os.MqqHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PtvTemplateManager
{
  public static File aH;
  public static File aL;
  public static final Long ab = Long.valueOf(60000L);
  static PtvTemplateManager b;
  public static String bYM = "ptv_template_usable";
  public static String bYN = "ptv_debug";
  public static boolean cFf;
  private static boolean cFi;
  public static String cdu = "ptv_template_usable_doodle";
  public static String cdv;
  public static String cdw;
  public static String cdx;
  static Object sLock = new Object();
  public ArrayList<PtvTemplateInfo> As = new ArrayList();
  public ArrayList<PtvTemplateInfo> At = new ArrayList();
  ArrayList<PtvTemplateInfo> Au = new ArrayList();
  public ArrayList<VideoMaterial> Av = new ArrayList();
  public ArrayList<PtvTemplateInfo> Aw = new ArrayList();
  public c a;
  String bYP;
  String bYQ;
  public boolean cFg;
  public boolean cFh;
  public boolean cFj;
  public boolean cFk;
  public boolean czW;
  Object eI = new Object();
  Object eJ = new Object();
  Object eK = new Object();
  public PtvTemplateInfo h;
  String mVersion;
  
  static
  {
    cdv = "5";
    cdw = "200";
    cdx = "20";
    int i = 0;
    try
    {
      boolean bool = "mounted".equals(Environment.getExternalStorageState());
      i = bool;
    }
    catch (Exception localException)
    {
      label62:
      File localFile;
      break label62;
    }
    if (i != 0) {}
    for (localFile = new File(acbn.SDCARD_PATH);; localFile = BaseApplicationImpl.getApplication().getCacheDir())
    {
      aH = new File(localFile, "ptv_template");
      bYM = aH.getPath() + File.separator + bYM + File.separator;
      bYN = aH.getPath() + File.separator + bYN;
      aL = new File(localFile, "doodle_template");
      cdu = aL.getPath() + File.separator + cdu + File.separator;
      cFi = anii.isFoundProductFeatureRom(anii.KEY_BLACK_NOT_SUPPORT_3D_TK);
      return;
    }
  }
  
  private PtvTemplateManager(AppInterface paramAppInterface) {}
  
  /* Error */
  static PtvTemplateInfo a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 204	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 206	org/json/JSONObject
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 207	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   17: astore_0
    //   18: aload_0
    //   19: ldc 9
    //   21: invokestatic 213	aqec:convertFrom	(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;
    //   24: checkcast 9	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo
    //   27: astore_3
    //   28: aload_0
    //   29: ldc 215
    //   31: invokevirtual 218	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   34: ifeq +166 -> 200
    //   37: aload_0
    //   38: ldc 215
    //   40: invokevirtual 222	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   43: astore_0
    //   44: aload_3
    //   45: astore 4
    //   47: aload_0
    //   48: astore_3
    //   49: aload 4
    //   51: astore_0
    //   52: aload_3
    //   53: ifnull -46 -> 7
    //   56: aload_0
    //   57: ifnull -50 -> 7
    //   60: aload_3
    //   61: invokevirtual 228	org/json/JSONArray:length	()I
    //   64: istore_2
    //   65: iload_2
    //   66: ifle -59 -> 7
    //   69: aload_0
    //   70: new 178	java/util/ArrayList
    //   73: dup
    //   74: iload_2
    //   75: invokespecial 231	java/util/ArrayList:<init>	(I)V
    //   78: putfield 234	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:doodleInfos	Ljava/util/ArrayList;
    //   81: iconst_0
    //   82: istore_1
    //   83: iload_1
    //   84: iload_2
    //   85: if_icmpge +71 -> 156
    //   88: aload_3
    //   89: iload_1
    //   90: invokevirtual 238	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   93: ldc 6
    //   95: invokestatic 213	aqec:convertFrom	(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;
    //   98: checkcast 6	com/tencent/mobileqq/shortvideo/PtvTemplateManager$DoodleInfo
    //   101: astore 4
    //   103: aload 4
    //   105: ifnull +13 -> 118
    //   108: aload_0
    //   109: getfield 234	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:doodleInfos	Ljava/util/ArrayList;
    //   112: aload 4
    //   114: invokevirtual 241	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   117: pop
    //   118: iload_1
    //   119: iconst_1
    //   120: iadd
    //   121: istore_1
    //   122: goto -39 -> 83
    //   125: astore_3
    //   126: aconst_null
    //   127: astore_0
    //   128: invokestatic 247	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   131: ifeq +7 -> 138
    //   134: aload_3
    //   135: invokevirtual 250	org/json/JSONException:printStackTrace	()V
    //   138: aconst_null
    //   139: astore_3
    //   140: goto -88 -> 52
    //   143: astore_0
    //   144: invokestatic 253	com/tencent/qphone/base/util/QLog:isDevelopLevel	()Z
    //   147: ifeq -140 -> 7
    //   150: aload_0
    //   151: invokevirtual 250	org/json/JSONException:printStackTrace	()V
    //   154: aconst_null
    //   155: areturn
    //   156: invokestatic 247	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   159: ifeq +29 -> 188
    //   162: ldc 255
    //   164: iconst_2
    //   165: new 135	java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   172: ldc_w 257
    //   175: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: aload_0
    //   179: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   182: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   185: invokestatic 264	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   188: aload_0
    //   189: areturn
    //   190: astore 4
    //   192: aload_3
    //   193: astore_0
    //   194: aload 4
    //   196: astore_3
    //   197: goto -69 -> 128
    //   200: aconst_null
    //   201: astore_0
    //   202: goto -158 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	paramString	String
    //   82	40	1	i	int
    //   64	22	2	j	int
    //   27	62	3	localObject1	Object
    //   125	10	3	localJSONException1	JSONException
    //   139	58	3	localObject2	Object
    //   45	68	4	localObject3	Object
    //   190	5	4	localJSONException2	JSONException
    // Exception table:
    //   from	to	target	type
    //   9	28	125	org/json/JSONException
    //   60	65	143	org/json/JSONException
    //   69	81	143	org/json/JSONException
    //   88	103	143	org/json/JSONException
    //   108	118	143	org/json/JSONException
    //   28	44	190	org/json/JSONException
  }
  
  public static PtvTemplateManager a(AppInterface paramAppInterface)
  {
    if (b != null) {
      return b;
    }
    synchronized (sLock)
    {
      if (b != null)
      {
        paramAppInterface = b;
        return paramAppInterface;
      }
    }
    b = new PtvTemplateManager(paramAppInterface);
    paramAppInterface = b;
    return paramAppInterface;
  }
  
  static List<PtvTemplateInfo> a(PtvTemplateManager paramPtvTemplateManager, String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.i("PtvTemplateManager", 2, "parse config: " + paramString);
    }
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return null;
      try
      {
        localJSONObject = new JSONObject(paramString);
        if (localJSONObject.has("content"))
        {
          paramString = localJSONObject.getJSONArray("content");
          if (paramPtvTemplateManager == null) {}
        }
      }
      catch (JSONException localJSONException1)
      {
        for (;;)
        {
          try
          {
            JSONObject localJSONObject;
            if (localJSONObject.has("guide_video_url")) {
              paramPtvTemplateManager.bYP = localJSONObject.getString("guide_video_url");
            }
            if (localJSONObject.has("guide_video_md5")) {
              paramPtvTemplateManager.bYQ = localJSONObject.getString("guide_video_md5");
            }
            if (localJSONObject.has("version")) {
              paramPtvTemplateManager.mVersion = localJSONObject.getString("version");
            }
            if (localJSONObject.has("gestureGapFrame")) {
              cdv = localJSONObject.getString("gestureGapFrame");
            }
            if (localJSONObject.has("gestureGapTime")) {
              cdw = localJSONObject.getString("gestureGapTime");
            }
            if (localJSONObject.has("gesturethreadcoldtime")) {
              cdx = localJSONObject.getString("gesturethreadcoldtime");
            }
            paramPtvTemplateManager = paramString;
            if (localJSONObject.has("gestureShouldUpload"))
            {
              cFf = localJSONObject.getBoolean("gestureShouldUpload");
              paramPtvTemplateManager = paramString;
            }
            if (paramPtvTemplateManager == null) {
              break;
            }
            paramPtvTemplateManager = PtvTemplateInfo.convertFrom(paramPtvTemplateManager);
            if ((paramPtvTemplateManager == null) || (paramPtvTemplateManager.isEmpty())) {
              break;
            }
            return paramPtvTemplateManager;
          }
          catch (JSONException localJSONException2)
          {
            continue;
          }
          localJSONException1 = localJSONException1;
          paramString = null;
          paramPtvTemplateManager = paramString;
          if (QLog.isColorLevel())
          {
            localJSONException1.printStackTrace();
            paramPtvTemplateManager = paramString;
            continue;
            paramString = null;
          }
        }
      }
    }
  }
  
  public static boolean auE()
  {
    return new File(aH, "ptv_template_new.cfg").exists();
  }
  
  public static boolean awA()
  {
    return new File(aL, "doodle_template_new.cfg").exists();
  }
  
  public static boolean awB()
  {
    return new File(aH, "ptv_template_bless.cfg").exists();
  }
  
  public static boolean awz()
  {
    return new File(aH, "ptv_template_web.cfg").exists();
  }
  
  private void dPg()
  {
    if (this.a != null) {
      this.a.cwS();
    }
  }
  
  public static void destroy()
  {
    synchronized (sLock)
    {
      if (b != null) {
        b = null;
      }
      return;
    }
  }
  
  static void he(String paramString1, String paramString2)
  {
    ThreadManager.getFileThreadHandler().post(new PtvTemplateManager.2(paramString2, paramString1));
  }
  
  public static String p(File paramFile)
  {
    paramFile = aqhq.fileToBytes(paramFile);
    if ((paramFile == null) || (paramFile.length <= 0)) {
      return null;
    }
    if (Build.VERSION.SDK_INT <= 8) {
      return new String(paramFile);
    }
    try
    {
      paramFile = new String(paramFile, "UTF-8");
      return paramFile;
    }
    catch (UnsupportedEncodingException paramFile)
    {
      if (QLog.isDevelopLevel()) {
        paramFile.printStackTrace();
      }
    }
    return null;
  }
  
  @TargetApi(9)
  public void A(AppInterface paramAppInterface)
  {
    Object localObject = new File(aH, "ptv_template_bless.cfg");
    if (!((File)localObject).exists())
    {
      if (QLog.isColorLevel()) {
        QLog.d("PtvTemplateManager", 2, "initBlessSpecialPendantConfigInfo config file not exist.");
      }
      Ok(true);
      return;
    }
    localObject = new PtvTemplateManager.16(this, paramAppInterface, (File)localObject);
    if (QLog.isDevelopLevel()) {
      QLog.d("PtvTemplateManager", 4, String.format("initBlessTemplateConfigInfo async, runnable[%s]", new Object[] { Integer.valueOf(localObject.hashCode()) }));
    }
    if ((paramAppInterface instanceof QQAppInterface))
    {
      ThreadManager.getFileThreadHandler().postDelayed((Runnable)localObject, ab.longValue());
      return;
    }
    ThreadManager.postImmediately((Runnable)localObject, null, false);
  }
  
  public void Ok(boolean paramBoolean)
  {
    ThreadManager.postImmediately(new PtvTemplateManager.1(this, paramBoolean), null, false);
  }
  
  public ArrayList<PtvTemplateInfo> a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramBoolean2) && (this.h != null) && (this.h.doodleInfos != null) && (!this.h.doodleInfos.isEmpty()))
    {
      this.h.usable = true;
      localArrayList.add(0, this.h);
    }
    Object localObject2;
    if (paramInt == 1) {
      localObject2 = this.As;
    }
    for (Object localObject1 = this.eI; paramBoolean1; localObject1 = this.eJ)
    {
      localArrayList.addAll((Collection)localObject2);
      return localArrayList;
      localObject2 = this.At;
    }
    try
    {
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        PtvTemplateInfo localPtvTemplateInfo = (PtvTemplateInfo)((Iterator)localObject2).next();
        if (localPtvTemplateInfo != null)
        {
          if ((localPtvTemplateInfo.usable) && (!new File(aH, localPtvTemplateInfo.name).exists())) {
            localPtvTemplateInfo.usable = false;
          }
          if ((!localPtvTemplateInfo.predownload) || (localPtvTemplateInfo.usable)) {
            localArrayList.add(localPtvTemplateInfo);
          }
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  List<PtvTemplateInfo> a(AppInterface paramAppInterface, File paramFile, HashMap<String, PtvTemplateInfo> paramHashMap)
  {
    if (QLog.isColorLevel()) {
      if (paramAppInterface == null) {
        break label67;
      }
    }
    label67:
    for (boolean bool = true;; bool = false)
    {
      QLog.i("PtvTemplateManager", 2, String.format("rebuildTemplateInfos, app[%s], isUpdateedByServer[%s], cur_runnable[%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(this.czW), Integer.valueOf(hashCode()) }));
      if (!this.czW) {
        break;
      }
      return null;
    }
    paramAppInterface = p(paramFile);
    if (TextUtils.isEmpty(paramAppInterface)) {
      return null;
    }
    paramAppInterface = a(this, paramAppInterface);
    if ((paramAppInterface == null) || (paramAppInterface.isEmpty())) {
      return null;
    }
    paramFile = paramAppInterface.iterator();
    while (paramFile.hasNext())
    {
      PtvTemplateInfo localPtvTemplateInfo = (PtvTemplateInfo)paramFile.next();
      if (localPtvTemplateInfo != null)
      {
        localPtvTemplateInfo.usable = a(localPtvTemplateInfo);
        if (paramHashMap != null) {
          paramHashMap.put(localPtvTemplateInfo.id, localPtvTemplateInfo);
        }
      }
    }
    return paramAppInterface;
  }
  
  public void a(AppInterface paramAppInterface, PtvTemplateInfo paramPtvTemplateInfo, b paramb)
  {
    if (paramPtvTemplateInfo == null) {}
    for (;;)
    {
      return;
      paramPtvTemplateInfo.startDownloadTime = System.currentTimeMillis();
      aoll localaoll = new aoll();
      localaoll.f = new anfl(this, paramPtvTemplateInfo, paramb);
      localaoll.bZ = paramPtvTemplateInfo.resurl;
      localaoll.mHttpMethod = 0;
      localaoll.atY = new File(aH, paramPtvTemplateInfo.name).getPath();
      localaoll.mContinuErrorLimit = aqiw.kb(aomi.a().getNetType());
      try
      {
        paramAppInterface.getNetEngine(0).a(localaoll);
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.i("PtvTemplateManager", 2, "startDownloadTemplate url: " + paramPtvTemplateInfo.resurl);
        return;
      }
      catch (Exception paramAppInterface)
      {
        for (;;)
        {
          if (QLog.isColorLevel()) {
            paramAppInterface.printStackTrace();
          }
        }
      }
    }
  }
  
  public void a(AppInterface paramAppInterface, a parama, boolean paramBoolean)
  {
    if ((this.h != null) && (!this.h.doodleInfos.isEmpty()))
    {
      if (QLog.isColorLevel()) {
        QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "initDoodleInfo has inited.");
      }
      if (paramBoolean) {
        ThreadManager.postImmediately(new PtvTemplateManager.11(this), null, false);
      }
    }
    File localFile;
    do
    {
      return;
      localFile = new File(aL, "doodle_template_new.cfg");
      if (localFile.exists()) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "initLocalDoodleInfo config file not exist.");
    return;
    parama = new PtvTemplateManager.12(this, localFile, paramBoolean, parama, paramAppInterface instanceof QQAppInterface);
    if (QLog.isDevelopLevel()) {
      QLog.d("Doodle_Strokes_PtvTemplateManager", 4, String.format("initLocalDoodleInfo async, runnable[%s]", new Object[] { Integer.valueOf(parama.hashCode()) }));
    }
    if ((paramAppInterface instanceof QQAppInterface))
    {
      ThreadManager.getFileThreadHandler().postDelayed(parama, ab.longValue());
      return;
    }
    ThreadManager.postImmediately(parama, null, false);
  }
  
  public void a(c paramc)
  {
    this.a = paramc;
  }
  
  public void a(String paramString, QQAppInterface paramQQAppInterface, int paramInt)
  {
    List localList = a(null, paramString);
    if ((localList == null) || (localList.isEmpty())) {
      return;
    }
    String str;
    if (paramInt == 1) {
      str = "ptv_template_new.cfg";
    }
    for (ArrayList localArrayList = this.As;; localArrayList = this.At)
    {
      he(paramString, str);
      ab(localList, paramInt);
      if (this.cFh) {
        break;
      }
      ThreadManager.getFileThreadHandler().post(new PtvTemplateManager.3(this, localList));
      h(paramQQAppInterface, localArrayList);
      return;
      str = "ptv_template_web.cfg";
    }
  }
  
  public boolean a(DoodleInfo paramDoodleInfo, boolean paramBoolean)
  {
    if ((paramDoodleInfo == null) || (TextUtils.isEmpty(paramDoodleInfo.doodleName))) {}
    do
    {
      for (;;)
      {
        return false;
        Object localObject = new File(aL, paramDoodleInfo.doodleName);
        if (!((File)localObject).exists())
        {
          if (QLog.isColorLevel())
          {
            QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "isDoodleTemplateUsable|file is not exist -> " + paramDoodleInfo.doodleName);
            return false;
          }
        }
        else {
          try
          {
            localObject = aqhq.px(((File)localObject).getPath());
            if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).equalsIgnoreCase(paramDoodleInfo.doodleMd5)))
            {
              if ((!paramBoolean) || (new File(cdu + paramDoodleInfo.doodleName + File.separator, "params.json").exists())) {
                break label268;
              }
              if (QLog.isColorLevel()) {
                QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "isDoodleTemplateUsable|paramFile is not exist->>" + paramDoodleInfo.doodleName);
              }
              if (!QLog.isColorLevel()) {}
            }
          }
          catch (UnsatisfiedLinkError paramDoodleInfo)
          {
            try
            {
              jqp.b(new File(aL, paramDoodleInfo.doodleName), cdu);
              if (QLog.isColorLevel()) {
                QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "isDoodleTemplateUsable|unZipFile->>" + paramDoodleInfo.doodleName);
              }
              return true;
            }
            catch (IOException paramDoodleInfo) {}
            paramDoodleInfo = paramDoodleInfo;
          }
        }
      }
      paramDoodleInfo.printStackTrace();
      return false;
    } while (!QLog.isColorLevel());
    paramDoodleInfo.printStackTrace();
    return false;
    label268:
    return true;
  }
  
  /* Error */
  public boolean a(PtvTemplateInfo paramPtvTemplateInfo)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +13 -> 14
    //   4: aload_1
    //   5: getfield 465	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:name	Ljava/lang/String;
    //   8: invokestatic 204	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   11: ifeq +5 -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: new 118	java/io/File
    //   19: dup
    //   20: getstatic 133	com/tencent/mobileqq/shortvideo/PtvTemplateManager:aH	Ljava/io/File;
    //   23: aload_1
    //   24: getfield 465	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:name	Ljava/lang/String;
    //   27: invokespecial 131	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   30: astore_2
    //   31: aload_2
    //   32: invokevirtual 328	java/io/File:exists	()Z
    //   35: ifeq -21 -> 14
    //   38: aload_2
    //   39: invokevirtual 139	java/io/File:getPath	()Ljava/lang/String;
    //   42: invokestatic 608	aqhq:px	(Ljava/lang/String;)Ljava/lang/String;
    //   45: astore_2
    //   46: aload_2
    //   47: invokestatic 204	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   50: ifne -36 -> 14
    //   53: aload_2
    //   54: aload_1
    //   55: getfield 630	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:md5	Ljava/lang/String;
    //   58: invokevirtual 614	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   61: ifeq -47 -> 14
    //   64: new 135	java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   71: getstatic 77	com/tencent/mobileqq/shortvideo/PtvTemplateManager:bYM	Ljava/lang/String;
    //   74: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_1
    //   78: getfield 465	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:name	Ljava/lang/String;
    //   81: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: getstatic 146	java/io/File:separator	Ljava/lang/String;
    //   87: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: astore_3
    //   94: new 118	java/io/File
    //   97: dup
    //   98: aload_3
    //   99: ldc_w 616
    //   102: invokespecial 617	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: astore_2
    //   106: new 118	java/io/File
    //   109: dup
    //   110: aload_3
    //   111: ldc_w 632
    //   114: invokespecial 617	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: astore_3
    //   118: aload_2
    //   119: invokevirtual 328	java/io/File:exists	()Z
    //   122: ifne +58 -> 180
    //   125: aload_3
    //   126: invokevirtual 328	java/io/File:exists	()Z
    //   129: ifne +51 -> 180
    //   132: new 118	java/io/File
    //   135: dup
    //   136: getstatic 133	com/tencent/mobileqq/shortvideo/PtvTemplateManager:aH	Ljava/io/File;
    //   139: aload_1
    //   140: getfield 465	com/tencent/mobileqq/shortvideo/PtvTemplateManager$PtvTemplateInfo:name	Ljava/lang/String;
    //   143: invokespecial 131	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   146: getstatic 77	com/tencent/mobileqq/shortvideo/PtvTemplateManager:bYM	Ljava/lang/String;
    //   149: invokestatic 623	jqp:b	(Ljava/io/File;Ljava/lang/String;)V
    //   152: iconst_1
    //   153: ireturn
    //   154: astore_1
    //   155: invokestatic 247	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   158: ifeq -144 -> 14
    //   161: aload_1
    //   162: invokevirtual 626	java/lang/UnsatisfiedLinkError:printStackTrace	()V
    //   165: iconst_0
    //   166: ireturn
    //   167: astore_1
    //   168: invokestatic 247	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   171: ifeq -157 -> 14
    //   174: aload_1
    //   175: invokevirtual 562	java/lang/Exception:printStackTrace	()V
    //   178: iconst_0
    //   179: ireturn
    //   180: iconst_1
    //   181: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	PtvTemplateManager
    //   0	182	1	paramPtvTemplateInfo	PtvTemplateInfo
    //   30	89	2	localObject1	Object
    //   93	33	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   38	46	154	java/lang/UnsatisfiedLinkError
    //   132	152	167	java/lang/Exception
  }
  
  public void ab(List<PtvTemplateInfo> paramList, int paramInt)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    ??? = paramList.iterator();
    while (((Iterator)???).hasNext())
    {
      PtvTemplateInfo localPtvTemplateInfo = (PtvTemplateInfo)((Iterator)???).next();
      if (localPtvTemplateInfo != null) {
        localPtvTemplateInfo.usable = a(localPtvTemplateInfo);
      }
    }
    if (paramInt == 1) {
      synchronized (this.eI)
      {
        this.As.clear();
        this.As.addAll(paramList);
        this.czW = true;
        return;
      }
    }
    synchronized (this.eJ)
    {
      this.At.clear();
      this.At.addAll(paramList);
      this.cFg = true;
      return;
    }
  }
  
  public void ai(Runnable paramRunnable)
  {
    PtvTemplateManager.6 local6 = new PtvTemplateManager.6(this, paramRunnable);
    if (QLog.isDevelopLevel()) {
      if (paramRunnable == null) {
        break label63;
      }
    }
    label63:
    for (boolean bool = true;; bool = false)
    {
      QLog.d("PtvTemplateManager", 2, String.format("双人挂件加载, onInitFinishSink[%s], runnable[%s]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(local6.hashCode()) }));
      ThreadManager.postImmediately(local6, null, false);
      return;
    }
  }
  
  public ArrayList<PtvTemplateInfo> dG()
  {
    return this.Au;
  }
  
  public ArrayList<DoodleInfo> dH()
  {
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      DoodleInfo localDoodleInfo;
      synchronized (this.eK)
      {
        if ((this.h == null) || (this.h.doodleInfos.isEmpty())) {
          return null;
        }
        Iterator localIterator = this.h.doodleInfos.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localDoodleInfo = (DoodleInfo)localIterator.next();
        if ((localDoodleInfo == null) || (TextUtils.isEmpty(localDoodleInfo.doodleName)))
        {
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "info is null or info name is null " + localDoodleInfo);
        }
      }
      if (!new File(aL, localDoodleInfo.doodleName).exists())
      {
        if (QLog.isColorLevel()) {
          QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "getDoodleInfos|file is not exist ");
        }
        localDoodleInfo.doodleUsable = false;
      }
      else if (!new File(cdu + localDoodleInfo.doodleName + File.separator, "params.json").exists())
      {
        if (QLog.isColorLevel()) {
          QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "getDoodleInfos|paramFile is not exist ");
        }
        localDoodleInfo.doodleUsable = false;
      }
      else
      {
        localArrayList1.add(localDoodleInfo);
      }
    }
    return localArrayList1;
  }
  
  public ArrayList<PtvTemplateInfo> dI()
  {
    return this.Aw;
  }
  
  void dPh()
  {
    QQAppInterface localQQAppInterface = getQQAppInterface();
    if ((this.h == null) || (this.h.doodleInfos.isEmpty()) || (localQQAppInterface == null)) {
      if (QLog.isColorLevel()) {
        QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "Exception!");
      }
    }
    for (;;)
    {
      return;
      if (QLog.isColorLevel()) {
        QLog.d("Doodle_Strokes_PtvTemplateManager", 2, "preDownloadDoodleTemplate!");
      }
      Iterator localIterator = this.h.doodleInfos.iterator();
      while (localIterator.hasNext())
      {
        DoodleInfo localDoodleInfo = (DoodleInfo)localIterator.next();
        if ((localDoodleInfo != null) && (!TextUtils.isEmpty(localDoodleInfo.doodleUrl)) && (!localDoodleInfo.doodleUsable))
        {
          Object localObject = new PtvTemplateManager.15(this, localDoodleInfo);
          aopo localaopo = (aopo)localQQAppInterface.getManager(193);
          if (localaopo.isEnable())
          {
            localObject = new aopp(localQQAppInterface, "qq_doodle_res", (Runnable)localObject, 4000L);
            localaopo.a(10020, null, localDoodleInfo.doodleName, 0, localDoodleInfo.doodleUrl, new File(aL, localDoodleInfo.doodleName).getPath(), 2, 0, true, (aopm)localObject);
          }
          else
          {
            ThreadManager.post((Runnable)localObject, 8, null, true);
          }
        }
      }
    }
  }
  
  public void dPi()
  {
    synchronized (this.eK)
    {
      this.h = null;
      this.Av.clear();
      File localFile = new File(aL, "doodle_template_new.cfg");
      if (localFile.exists()) {
        localFile.delete();
      }
      return;
    }
  }
  
  void eS(ArrayList<PtvTemplateInfo> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }
    int i = 0;
    label14:
    PtvTemplateInfo localPtvTemplateInfo;
    if (i < paramArrayList.size())
    {
      localPtvTemplateInfo = (PtvTemplateInfo)paramArrayList.get(i);
      if ((localPtvTemplateInfo != null) && (localPtvTemplateInfo.predownload) && (!TextUtils.isEmpty(localPtvTemplateInfo.resurl))) {
        break label59;
      }
    }
    for (;;)
    {
      i += 1;
      break label14;
      break;
      label59:
      ThreadManager.getFileThreadHandler().post(new PtvTemplateManager.5(this, localPtvTemplateInfo));
    }
  }
  
  public String fd(int paramInt)
  {
    if ((this.h != null) && (this.h.doodleInfos != null) && (!this.h.doodleInfos.isEmpty()))
    {
      Iterator localIterator = this.h.doodleInfos.iterator();
      while (localIterator.hasNext())
      {
        DoodleInfo localDoodleInfo = (DoodleInfo)localIterator.next();
        if (Integer.valueOf(localDoodleInfo.doodleId).intValue() == paramInt) {
          return cdu + localDoodleInfo.doodleName;
        }
      }
    }
    return "";
  }
  
  public QQAppInterface getQQAppInterface()
  {
    AppRuntime localAppRuntime = BaseApplicationImpl.getApplication().getRuntime();
    if ((localAppRuntime instanceof QQAppInterface)) {
      return (QQAppInterface)localAppRuntime;
    }
    return null;
  }
  
  public List<VideoMaterial> gi()
  {
    if ((this.Av.isEmpty()) && (this.h != null)) {
      synchronized (this.eK)
      {
        Iterator localIterator = this.h.doodleInfos.iterator();
        while (localIterator.hasNext())
        {
          Object localObject3 = (DoodleInfo)localIterator.next();
          if (((DoodleInfo)localObject3).doodleUsable)
          {
            localObject3 = cdu + ((DoodleInfo)localObject3).doodleName;
            VideoMaterial localVideoMaterial = QQTemplateParser.parseVideoMaterial((String)localObject3, "params");
            if (localVideoMaterial != null)
            {
              localVideoMaterial.setDataPath((String)localObject3);
              this.Av.add(localVideoMaterial);
              if (QLog.isDevelopLevel()) {
                QLog.d("Doodle_Strokes_PtvTemplateManager", 4, new Object[] { "getDoodleMaterials add DoodleMaterial:", localVideoMaterial.getId() });
              }
            }
          }
        }
      }
    }
    return this.Av;
  }
  
  void h(QQAppInterface paramQQAppInterface, ArrayList<PtvTemplateInfo> paramArrayList)
  {
    ThreadManager.getSubThreadHandler().postDelayed(new PtvTemplateManager.4(this, paramArrayList), ab.longValue());
  }
  
  void mq(List<PtvTemplateInfo> paramList) {}
  
  public void p(String arg1, QQAppInterface paramQQAppInterface)
  {
    paramQQAppInterface = a(???);
    if (paramQQAppInterface == null) {
      return;
    }
    ThreadManager.getFileThreadHandler().post(new PtvTemplateManager.13(this, ???));
    synchronized (this.eK)
    {
      this.h = paramQQAppInterface;
      ThreadManager.getFileThreadHandler().post(new PtvTemplateManager.14(this));
      dPh();
      return;
    }
  }
  
  public void q(String arg1, QQAppInterface paramQQAppInterface)
  {
    List localList = a(null, ???);
    if ((localList == null) || (localList.isEmpty())) {}
    for (;;)
    {
      return;
      he(???, "ptv_template_bless.cfg");
      ??? = localList.iterator();
      while (???.hasNext())
      {
        PtvTemplateInfo localPtvTemplateInfo = (PtvTemplateInfo)???.next();
        if (localPtvTemplateInfo != null)
        {
          localPtvTemplateInfo.usable = a(localPtvTemplateInfo);
          localPtvTemplateInfo.businessID = 1;
        }
      }
      synchronized (this.Aw)
      {
        this.Aw.clear();
        this.Aw.addAll(localList);
        this.cFj = true;
        if (this.cFk) {
          continue;
        }
        ThreadManager.getFileThreadHandler().post(new PtvTemplateManager.17(this, localList));
        h(paramQQAppInterface, this.Aw);
        return;
      }
    }
  }
  
  @TargetApi(9)
  public void y(AppInterface paramAppInterface)
  {
    Object localObject = new File(aH, "ptv_template_new.cfg");
    if (!((File)localObject).exists())
    {
      if (QLog.isColorLevel()) {
        QLog.w("PtvTemplateManager", 1, "initLocalTemplateConfigInfo, not exist, AbsolutePath[" + ((File)localObject).getAbsolutePath() + "]");
      }
      return;
    }
    localObject = new PtvTemplateManager.7(this, paramAppInterface, (File)localObject);
    if (QLog.isDevelopLevel()) {
      QLog.d("PtvTemplateManager", 4, String.format("initLocalTemplateConfigInfo async, runnable[%s]", new Object[] { Integer.valueOf(localObject.hashCode()) }));
    }
    if ((paramAppInterface instanceof QQAppInterface))
    {
      ThreadManager.getFileThreadHandler().postDelayed((Runnable)localObject, ab.longValue());
      return;
    }
    ThreadManager.postImmediately((Runnable)localObject, null, false);
  }
  
  @TargetApi(9)
  public void z(AppInterface paramAppInterface)
  {
    Object localObject = new File(aH, "ptv_template_web.cfg");
    if (!((File)localObject).exists())
    {
      if (QLog.isColorLevel()) {
        QLog.d("PtvTemplateManager", 2, "initLocalWebTemplateConfigInfo config file not exist.");
      }
      return;
    }
    localObject = new PtvTemplateManager.8(this, paramAppInterface, (File)localObject);
    if (QLog.isDevelopLevel()) {
      QLog.d("PtvTemplateManager", 4, String.format("initLocalWebTemplateConfigInfo async, runnable[%s]", new Object[] { Integer.valueOf(localObject.hashCode()) }));
    }
    if ((paramAppInterface instanceof QQAppInterface))
    {
      ThreadManager.getFileThreadHandler().postDelayed((Runnable)localObject, ab.longValue());
      return;
    }
    ThreadManager.postImmediately((Runnable)localObject, null, false);
  }
  
  public static class DoodleInfo
  {
    public String doodleId;
    public String doodleMd5;
    public String doodleName;
    public String doodleUrl;
    public boolean doodleUsable;
    
    public String toString()
    {
      return "PtvTemplateInfo{id='" + this.doodleId + '\'' + ", doodleName='" + this.doodleName + '\'' + ", doodleUsable='" + this.doodleUsable + '\'' + '}';
    }
  }
  
  public static class PtvTemplateInfo
  {
    public static final int AR_PARTICLE = 9;
    public static final int Category_BeautyMakeup = 3;
    public static final int Category_Face = 0;
    public static final int Category_FaceAndGesture = 2;
    public static final int Category_Gesture = 1;
    public static final int D3D_TK = 1;
    public static final int DG_FILTER = 3;
    public static final int DOODLE = 1;
    public static final int DOV_DG_FILTER = 5;
    public static final int DOV_FDG_FILTER = 6;
    public static final int FDG_FILTER = 4;
    public static final int FILTER = 0;
    public static int FUNC_REDBAG_GET = 1;
    public static final int LBS_MACDONALD = 1;
    public static final int LBS_NORMAL_FILTER = 0;
    public static final int NORMAL = 0;
    public static final int OLD_FILTER = 22;
    public static final int PORTRAIT_FILTER = 7;
    public static final int PTU_FILTER = 21;
    public static final int QQ_BIG_HEAD = 20;
    static final String SV_FILTER_DOWNLOAD_TIME = "sv_filter_download_time";
    public static final int YSLD_FILTER = 2;
    public int activityType = 0;
    public String advertiseIconUrl;
    public String advertiseStr;
    public String advertiseWebUrl;
    public boolean advertisement;
    public String androidopenurlheader;
    public String badgeurl;
    public String bigHeadMd5 = "";
    public boolean bigHeadModelUsable;
    public String bigHeadName = "";
    public String bigHeadUrl = "";
    public int businessID;
    public String buttonbgcolor;
    public int category = 0;
    public int categoryId;
    public String categoryName;
    public int color;
    public String dgModelName;
    public String dgModelResmd5;
    public String dgModelResurl;
    public boolean dgModelUsable;
    public String dgStageName;
    public String dgStageResmd5;
    public String dgStageResurl;
    public boolean dgStageUsable;
    public ArrayList<PtvTemplateManager.DoodleInfo> doodleInfos;
    public boolean downloading;
    public String filtername;
    public int funcType;
    public String gestureType = "";
    public String gestureWording = "";
    public String iconurl;
    public String id;
    public boolean isAdvertise;
    public boolean isSelected;
    public boolean isshow = true;
    public int kind = 0;
    public String md5;
    public String name;
    public boolean needRedDot;
    public String openurl;
    public int platform;
    public boolean popup = true;
    public String popupbtn;
    public String popupbtn2;
    public String popupcontent;
    public String popupcontent2;
    public String popupimgurl;
    public boolean predownload;
    public boolean renderfirst = true;
    public String resurl;
    public double sizeFree;
    long startDownloadTime;
    public String storeurl;
    public int templateStyle;
    public long totalLen;
    public int type;
    public boolean usable;
    
    public static List<PtvTemplateInfo> convertFrom(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {}
      do
      {
        return null;
        try
        {
          paramString = convertFrom(new JSONArray(paramString));
          return paramString;
        }
        catch (JSONException paramString) {}
      } while (!QLog.isDevelopLevel());
      paramString.printStackTrace();
      return null;
    }
    
    public static List<PtvTemplateInfo> convertFrom(JSONArray paramJSONArray)
    {
      if (paramJSONArray == null) {
        return null;
      }
      for (;;)
      {
        ArrayList localArrayList;
        int i;
        try
        {
          int j = paramJSONArray.length();
          if (j <= 0) {
            return null;
          }
          localArrayList = new ArrayList(j);
          i = 0;
          if (i >= j) {
            break label188;
          }
          PtvTemplateInfo localPtvTemplateInfo = (PtvTemplateInfo)aqec.convertFrom(paramJSONArray.getJSONObject(i), PtvTemplateInfo.class);
          if (localPtvTemplateInfo == null) {
            break label193;
          }
          try
          {
            Long.parseLong(localPtvTemplateInfo.id);
            switch (localPtvTemplateInfo.kind)
            {
            case 2: 
              localArrayList.add(localPtvTemplateInfo);
            }
          }
          catch (Exception localException)
          {
            if (!QLog.isColorLevel()) {
              break label193;
            }
          }
          localArrayList.add(localPtvTemplateInfo);
        }
        catch (JSONException paramJSONArray)
        {
          if (!QLog.isDevelopLevel()) {
            continue;
          }
          paramJSONArray.printStackTrace();
          return null;
        }
        QLog.e("PtvTemplateManager", 1, "templateId must be a numeric string!");
        break label193;
        if (!PtvTemplateManager.cFi)
        {
          localArrayList.add(localException);
          break label193;
          localArrayList.add(localException);
          break label193;
          localArrayList.add(localException);
          break label193;
          label188:
          return localArrayList;
          continue;
        }
        label193:
        i += 1;
      }
    }
    
    public static boolean isFace(int paramInt)
    {
      return (paramInt == 2) || (paramInt == 0);
    }
    
    public static boolean isGesture(int paramInt)
    {
      return (paramInt == 2) || (paramInt == 1);
    }
    
    public void doDownloadDataReport()
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.startDownloadTime;
      HashMap localHashMap = new HashMap();
      localHashMap.put("MANUFACTURER", Build.MANUFACTURER);
      localHashMap.put("MODEL", Build.MODEL);
      localHashMap.put("SDK_INT", "" + Build.VERSION.SDK_INT);
      localHashMap.put("timems", "" + (l1 - l2));
      localHashMap.put("totalsize", "" + this.totalLen);
      localHashMap.put("success", "" + this.usable);
      anpc.a(VideoEnvironment.getContext()).collectPerformance(null, "sv_filter_download_time", true, 0L, 0L, localHashMap, "");
    }
    
    public String getLbsActivityType(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return "LBS_NORMAL_FILTER_" + paramInt;
      }
      return "LBS_MACDONALD_" + paramInt;
    }
    
    public boolean hasFace()
    {
      return isFace(this.category);
    }
    
    public boolean hasGesture()
    {
      return isGesture(this.category);
    }
    
    public String toString()
    {
      return "PtvTemplateInfo{id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", dooleInfos=" + this.doodleInfos + '\'' + ",usable=" + this.usable + '}';
    }
  }
  
  public static class a
  {
    public void bsj() {}
  }
  
  public static abstract interface b
  {
    public abstract void a(PtvTemplateManager.PtvTemplateInfo paramPtvTemplateInfo, int paramInt);
    
    public abstract void a(PtvTemplateManager.PtvTemplateInfo paramPtvTemplateInfo, boolean paramBoolean);
  }
  
  public static abstract interface c
  {
    public abstract void cwS();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes9.jar
 * Qualified Name:     com.tencent.mobileqq.shortvideo.PtvTemplateManager
 * JD-Core Version:    0.7.0.1
 */