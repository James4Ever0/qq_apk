import android.os.Message;
import com.tencent.component.network.downloader.DownloadResult;
import com.tencent.component.network.downloader.Downloader.DownloadListener;
import com.tencent.component.network.downloader.handler.ReportHandler.DownloadReportObject;
import com.tencent.component.network.module.report.ImageDownloadReporter;
import com.tencent.mobileqq.msf.sdk.AppNetConnInfo;
import com.tencent.qphone.base.util.QLog;
import cooperation.qzone.plugin.QZonePluginDownloader;
import cooperation.qzone.plugin.QZonePluginUtils;
import java.io.File;

public class amhj
  implements Downloader.DownloadListener
{
  amhk jdField_a_of_type_Amhk;
  
  public amhj(QZonePluginDownloader paramQZonePluginDownloader, amhk paramamhk)
  {
    this.jdField_a_of_type_Amhk = paramamhk;
  }
  
  public void onDownloadCanceled(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QZonePluginManger", 1, "plugin download canceled, url=" + paramString);
    }
    paramString = Message.obtain(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader.a, 2);
    paramString.obj = this.jdField_a_of_type_Amhk;
    paramString.sendToTarget();
  }
  
  public void onDownloadFailed(String paramString, DownloadResult paramDownloadResult)
  {
    paramString = Message.obtain(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader.a, 3);
    paramString.obj = this.jdField_a_of_type_Amhk;
    paramString.arg1 = -9999;
    if ((paramDownloadResult != null) && (paramDownloadResult.getReport() != null)) {}
    for (;;)
    {
      try
      {
        paramDownloadResult = new ImageDownloadReporter().obtainReportObj(paramDownloadResult, paramDownloadResult.getReport());
        paramString.arg1 = paramDownloadResult.retCode;
        if (!AppNetConnInfo.isNetSupport()) {
          continue;
        }
        i = 1;
        paramString.arg2 = i;
        QLog.w("QZonePluginManger", 1, "plugin download failed, code=" + paramDownloadResult.retCode + ", arg2=" + paramString.arg2);
      }
      catch (Exception paramDownloadResult)
      {
        int i;
        QLog.w("QZonePluginManger", 1, "onDownloadFailed", paramDownloadResult);
        continue;
      }
      paramString.sendToTarget();
      return;
      i = 0;
    }
  }
  
  public void onDownloadProgress(String paramString, long paramLong, float paramFloat)
  {
    QZonePluginDownloader.a(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader, (int)(100.0F * paramFloat));
    if (QLog.isColorLevel()) {
      QLog.d("QZonePluginManger", 2, "onDownloadProgress, progress=" + QZonePluginDownloader.a(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader));
    }
    paramString = Message.obtain(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader.a, 5);
    amhk.a(this.jdField_a_of_type_Amhk).a = paramFloat;
    paramString.obj = this.jdField_a_of_type_Amhk;
    paramString.sendToTarget();
  }
  
  public void onDownloadSucceed(String paramString, DownloadResult paramDownloadResult)
  {
    if (QLog.isColorLevel())
    {
      QLog.d("QZonePluginManger", 2, "onDownloadSucceed, downloaded path:" + paramDownloadResult.getPath());
      paramString = QZonePluginUtils.e(QZonePluginDownloader.a(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader), amhk.a(this.jdField_a_of_type_Amhk));
      QLog.d("QZonePluginManger", 2, "onDownloadSucceed, saved path:" + paramString + ", exsit:" + paramString.exists());
    }
    paramString = Message.obtain(this.jdField_a_of_type_CooperationQzonePluginQZonePluginDownloader.a, 4);
    paramString.obj = this.jdField_a_of_type_Amhk;
    paramString.sendToTarget();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amhj
 * JD-Core Version:    0.7.0.1
 */