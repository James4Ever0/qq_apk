import android.view.View;
import android.widget.RelativeLayout;
import dov.com.qq.im.QIMEffectCameraCaptureUnit;
import dov.com.qq.im.capture.QIMCaptureController;
import dov.com.qq.im.capture.QIMManager;
import dov.com.qq.im.capture.banner.QIMCaptureBannerManager;

public class anrk
  implements Runnable
{
  public anrk(QIMEffectCameraCaptureUnit paramQIMEffectCameraCaptureUnit) {}
  
  public void run()
  {
    this.a.jdField_a_of_type_DovComQqImCaptureQIMCaptureController.c();
    if (this.a.k) {}
    QIMCaptureBannerManager localQIMCaptureBannerManager;
    View localView;
    do
    {
      do
      {
        do
        {
          return;
        } while (this.a.jdField_a_of_type_DovComQqImCaptureQIMCaptureController == null);
        localQIMCaptureBannerManager = (QIMCaptureBannerManager)QIMManager.a(9);
      } while ((!localQIMCaptureBannerManager.a()) || (localQIMCaptureBannerManager.b()));
      localView = this.a.jdField_a_of_type_AndroidViewView.findViewById(2131369016);
    } while ((localView == null) || (localView.getVisibility() != 0));
    localQIMCaptureBannerManager.b(true);
    this.a.jdField_a_of_type_DovComQqImCaptureQIMCaptureController.a((RelativeLayout)this.a.jdField_a_of_type_AndroidViewView.findViewById(2131365916), this.a.jdField_a_of_type_AndroidViewView.getContext());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anrk
 * JD-Core Version:    0.7.0.1
 */