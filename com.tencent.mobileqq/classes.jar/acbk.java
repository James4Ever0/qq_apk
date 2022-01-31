import android.os.Bundle;
import com.tencent.mobileqq.emosm.web.MessengerService;
import com.tencent.mobileqq.video.VipVideoManager;
import com.tencent.qqlive.mediaplayer.api.TVK_SDKMgr.InstallListener;

class acbk
  implements TVK_SDKMgr.InstallListener
{
  acbk(acbg paramacbg, Bundle paramBundle, MessengerService paramMessengerService) {}
  
  public void onInstallProgress(float paramFloat)
  {
    int i = (int)Math.floor(100.0F * paramFloat);
    if (i > VipVideoManager.a)
    {
      VipVideoManager.a = i;
      Bundle localBundle = new Bundle();
      localBundle.putInt("status", 1);
      localBundle.putFloat("progress", i);
      this.jdField_a_of_type_AndroidOsBundle.putBundle("response", localBundle);
      this.jdField_a_of_type_ComTencentMobileqqEmosmWebMessengerService.a(this.jdField_a_of_type_AndroidOsBundle);
    }
  }
  
  public void onInstalledFailed(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("status", 2);
    localBundle.putInt("errCode", paramInt);
    this.jdField_a_of_type_AndroidOsBundle.putBundle("response", localBundle);
    this.jdField_a_of_type_ComTencentMobileqqEmosmWebMessengerService.a(this.jdField_a_of_type_AndroidOsBundle);
  }
  
  public void onInstalledSuccessed()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("status", 3);
    localBundle.putBoolean("result", true);
    this.jdField_a_of_type_AndroidOsBundle.putBundle("response", localBundle);
    this.jdField_a_of_type_ComTencentMobileqqEmosmWebMessengerService.a(this.jdField_a_of_type_AndroidOsBundle);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acbk
 * JD-Core Version:    0.7.0.1
 */