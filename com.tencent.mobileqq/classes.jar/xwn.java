import com.tencent.mobileqq.activity.richmedia.NewFlowCameraActivity;
import com.tencent.mobileqq.activity.richmedia.VideoFilterTools;
import com.tencent.mobileqq.activity.richmedia.VideoFilterTools.OnResourceDownloadListener;
import com.tencent.qphone.base.util.QLog;

class xwn
  implements VideoFilterTools.OnResourceDownloadListener
{
  xwn(xwm paramxwm, VideoFilterTools paramVideoFilterTools) {}
  
  public void a(boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("PTV.NewFlowCameraActivity", 2, "onResourceDownload isOnlineRes: " + paramBoolean);
    }
    if (this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaVideoFilterTools.a())
    {
      this.jdField_a_of_type_Xwm.a.runOnUiThread(new xwo(this));
      return;
    }
    QLog.w("PTV.NewFlowCameraActivity", 2, "has not valid video filter!");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xwn
 * JD-Core Version:    0.7.0.1
 */