import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Xml;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.ar.FaceScanDownloadManager.1;
import com.tencent.mobileqq.ar.FaceScanDownloadManager.2;
import com.tencent.mobileqq.earlydownload.xmldata.XmlData;
import com.tencent.qphone.base.util.QLog;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class alcm
{
  public static Handler a;
  private static ArrayList<alcn> a;
  
  static
  {
    jdField_a_of_type_AndroidOsHandler = new Handler(Looper.getMainLooper());
    jdField_a_of_type_JavaUtilArrayList = new ArrayList(2);
  }
  
  public static int a(QQAppInterface paramQQAppInterface)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramQQAppInterface.getApp()).getInt("key_download_cfg_version" + paramQQAppInterface.getLongAccountUin(), 0);
  }
  
  public static void a()
  {
    if (jdField_a_of_type_JavaUtilArrayList != null) {
      jdField_a_of_type_JavaUtilArrayList.clear();
    }
    if (QLog.isColorLevel()) {
      QLog.d("FaceScanDownloadManager", 2, "clearCallback");
    }
  }
  
  public static void a(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = jdField_a_of_type_JavaUtilArrayList.toArray();
        if ((arrayOfObject == null) || (arrayOfObject.length <= 0)) {
          return;
        }
      }
      finally {}
      int i = 0;
      while (i < localObject.length)
      {
        alcn localalcn = (alcn)localObject[i];
        jdField_a_of_type_AndroidOsHandler.post(new FaceScanDownloadManager.1(localalcn, paramInt1, paramInt2));
        i += 1;
      }
    }
  }
  
  public static void a(int paramInt, QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("FaceScanDownloadManager", 2, "downloadFaceRes app is null");
      }
      return;
    }
    paramQQAppInterface = (anox)paramQQAppInterface.getManager(77);
    boolean bool;
    switch (paramInt)
    {
    default: 
      bool = false;
      paramQQAppInterface = null;
    }
    while (paramQQAppInterface != null)
    {
      paramInt = paramQQAppInterface.b();
      if (QLog.isColorLevel()) {
        QLog.d("FaceScanDownloadManager", 2, "initAr version=" + paramQQAppInterface.b());
      }
      if ((bool) && (paramQQAppInterface.g()) && (paramInt > 1)) {
        break;
      }
      paramQQAppInterface.a(true);
      return;
      paramQQAppInterface = paramQQAppInterface.a("qq.android.ar.face.models_v8.2.0");
      bool = alco.a();
      continue;
      paramQQAppInterface = paramQQAppInterface.a(anpk.a);
      bool = alcp.a();
      if (paramQQAppInterface != null) {
        BaseApplicationImpl.sApplication.getSharedPreferences("mobileQQ", 0).edit().putInt("ar_native_so_version", paramQQAppInterface.b()).commit();
      }
    }
  }
  
  public static void a(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = jdField_a_of_type_JavaUtilArrayList.toArray();
        if ((arrayOfObject == null) || (arrayOfObject.length <= 0)) {
          return;
        }
      }
      finally {}
      int i = 0;
      while (i < localObject.length)
      {
        alcn localalcn = (alcn)localObject[i];
        jdField_a_of_type_AndroidOsHandler.post(new FaceScanDownloadManager.2(localalcn, paramInt, paramBoolean));
        i += 1;
      }
    }
  }
  
  public static void a(alcn paramalcn)
  {
    if (paramalcn != null) {}
    try
    {
      if (!jdField_a_of_type_JavaUtilArrayList.contains(paramalcn))
      {
        if (QLog.isColorLevel()) {
          QLog.i("FaceScanDownloadManager", 2, "addDownloadCallback");
        }
        jdField_a_of_type_JavaUtilArrayList.add(paramalcn);
      }
      return;
    }
    finally {}
  }
  
  public static void a(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      do
      {
        do
        {
          return;
          paramQQAppInterface = (anox)paramQQAppInterface.getManager(77);
        } while (paramQQAppInterface == null);
        anpk localanpk = (anpk)paramQQAppInterface.a(anpk.a);
        if ((localanpk != null) && (localanpk.g()) && (!alcp.a()))
        {
          localanpk.g();
          if (QLog.isColorLevel()) {
            QLog.d("FaceScanDownloadManager", 2, "reset native so download state");
          }
        }
        paramQQAppInterface = (anpj)paramQQAppInterface.a("qq.android.ar.face.models_v8.2.0");
      } while ((paramQQAppInterface == null) || (!paramQQAppInterface.g()) || (alco.a()));
      paramQQAppInterface.a();
    } while (!QLog.isColorLevel());
    QLog.d("FaceScanDownloadManager", 2, "reset modules so download state");
  }
  
  public static void a(QQAppInterface paramQQAppInterface, int paramInt)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramQQAppInterface.getApp()).edit();
    localEditor.putInt("key_download_cfg_version" + paramQQAppInterface.getLongAccountUin(), paramInt);
    localEditor.commit();
  }
  
  public static void a(QQAppInterface paramQQAppInterface, String paramString, int paramInt)
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    for (;;)
    {
      try
      {
        localXmlPullParser.setInput(new ByteArrayInputStream(paramString.getBytes()), "UTF-8");
        i = localXmlPullParser.getEventType();
        bool2 = false;
      }
      catch (Exception paramQQAppInterface)
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e("FaceScanDownloadManager", 2, paramString, paramQQAppInterface);
        return;
      }
      int i = localXmlPullParser.next();
      boolean bool2 = bool1;
      break label171;
      boolean bool1 = bool2;
      if (localXmlPullParser.getName().equalsIgnoreCase("PreDownload"))
      {
        bool1 = bool2;
        if (Integer.valueOf(localXmlPullParser.nextText()).intValue() == 1)
        {
          bool1 = true;
          continue;
          if (QLog.isColorLevel()) {
            QLog.d("FaceScanDownloadManager", 2, "handleResp_GetArScanFacePreDownConfig success：isPreDownload|version=" + bool2 + "|" + paramInt);
          }
          a(paramQQAppInterface, paramInt);
          a(paramQQAppInterface, bool2);
          return;
          label171:
          if (i != 1)
          {
            bool1 = bool2;
            switch (i)
            {
            }
            bool1 = bool2;
          }
        }
      }
    }
  }
  
  public static void a(QQAppInterface paramQQAppInterface, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramQQAppInterface.getApp()).edit();
    localEditor.putBoolean("key_download_cfg_enable" + paramQQAppInterface.getLongAccountUin(), paramBoolean);
    localEditor.commit();
  }
  
  public static boolean a()
  {
    return (alcp.a()) && (alco.a());
  }
  
  private static boolean a(anpi paramanpi)
  {
    if (paramanpi == null) {}
    do
    {
      do
      {
        return false;
        paramanpi = paramanpi.a();
      } while (paramanpi == null);
      if ((!TextUtils.isEmpty(paramanpi.strPkgName)) && (!TextUtils.isEmpty(paramanpi.strResURL_big))) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d("FaceScanDownloadManager", 2, "strPkgName is empty:" + TextUtils.isEmpty(paramanpi.strPkgName) + " strResURL_big is empty:" + TextUtils.isEmpty(paramanpi.strResURL_big) + " loadState :" + paramanpi.loadState);
    return false;
    return true;
  }
  
  public static boolean a(QQAppInterface paramQQAppInterface)
  {
    boolean bool3 = true;
    if (paramQQAppInterface == null) {}
    do
    {
      return false;
      paramQQAppInterface = (anox)paramQQAppInterface.getManager(77);
    } while (paramQQAppInterface == null);
    anpk localanpk = (anpk)paramQQAppInterface.a(anpk.a);
    boolean bool2 = a(localanpk);
    boolean bool1 = bool2;
    if (!bool2)
    {
      bool1 = bool2;
      if (localanpk != null)
      {
        bool1 = bool2;
        if (localanpk.g())
        {
          bool1 = bool2;
          if (alcp.a()) {
            bool1 = true;
          }
        }
      }
    }
    if (bool1) {
      localanpk.a();
    }
    if (QLog.isColorLevel()) {
      QLog.d("FaceScanDownloadManager", 2, "native so config is exist :" + bool1);
    }
    paramQQAppInterface = (anpj)paramQQAppInterface.a("qq.android.ar.face.models_v8.2.0");
    bool2 = a(paramQQAppInterface);
    if ((!bool2) && (paramQQAppInterface != null) && (paramQQAppInterface.g()) && (alco.a())) {
      bool2 = true;
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("FaceScanDownloadManager", 2, "models config is exist :" + bool2);
      }
      if ((bool1) && (bool2)) {}
      for (bool1 = bool3;; bool1 = false) {
        return bool1;
      }
    }
  }
  
  public static void b(QQAppInterface paramQQAppInterface)
  {
    a(paramQQAppInterface, 0);
    a(paramQQAppInterface, false);
  }
  
  public static boolean b(QQAppInterface paramQQAppInterface)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramQQAppInterface.getApp()).getBoolean("key_download_cfg_enable" + paramQQAppInterface.getLongAccountUin(), false);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes8.jar
 * Qualified Name:     alcm
 * JD-Core Version:    0.7.0.1
 */