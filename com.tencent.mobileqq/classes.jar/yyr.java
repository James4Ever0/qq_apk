import com.tencent.mobileqq.activity.aio.anim.AioAnimationConfigHelper;
import com.tencent.mobileqq.app.ConfigHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;
import com.tencent.mobileqq.utils.HttpDownloadUtil;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import mqq.app.MobileQQ;
import protocol.KQQConfig.GetResourceRespInfo;

public class yyr
  implements Runnable
{
  public yyr(ConfigHandler paramConfigHandler, GetResourceRespInfo paramGetResourceRespInfo, String paramString, long paramLong) {}
  
  public void run()
  {
    if (!ConfigHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppConfigHandler, this.jdField_a_of_type_ProtocolKQQConfigGetResourceRespInfo.strPkgName, 10000L)) {
      if (QLog.isColorLevel()) {
        QLog.d("eggs", 2, "handleUpdateEggsActions dpc aio_eggs is false");
      }
    }
    do
    {
      return;
      File localFile = new File(this.jdField_a_of_type_ComTencentMobileqqAppConfigHandler.b.getApplication().getFilesDir(), "eggs_config.zip");
      String str = MsfSdkUtils.insertMtype("ConfigCheck", this.jdField_a_of_type_JavaLangString);
      int i = HttpDownloadUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppConfigHandler.b, str, localFile);
      if (QLog.isColorLevel()) {
        QLog.d("eggs", 2, "handleUpdateEggsActions download: " + i);
      }
      if (i == 0)
      {
        AioAnimationConfigHelper.a().a(this.jdField_a_of_type_ComTencentMobileqqAppConfigHandler.b, this.jdField_a_of_type_Long, localFile.getAbsolutePath());
        return;
      }
    } while (AioAnimationConfigHelper.a().a() != null);
    AioAnimationConfigHelper.a().a(this.jdField_a_of_type_ComTencentMobileqqAppConfigHandler.b.getApplication());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     yyr
 * JD-Core Version:    0.7.0.1
 */