import com.tencent.mobileqq.richmedia.capture.util.CaptureUtil;
import com.tencent.mobileqq.richmedia.capture.view.EffectsCameraCaptureView;
import com.tencent.mobileqq.richmedia.capture.view.EffectsCameraCaptureView.EffectListener;
import com.tencent.qphone.base.util.QLog;

public class ahqr
  implements Runnable
{
  public ahqr(EffectsCameraCaptureView paramEffectsCameraCaptureView) {}
  
  public void run()
  {
    EffectsCameraCaptureView.a(this.a, CaptureUtil.b());
    if (EffectsCameraCaptureView.a(this.a) != null) {
      EffectsCameraCaptureView.a(this.a).d_(EffectsCameraCaptureView.a(this.a));
    }
    if (QLog.isColorLevel()) {
      QLog.d("EffectsCameraCaptureView", 2, "onFirstFrameShownInternal soLoaded=" + EffectsCameraCaptureView.a(this.a));
    }
    this.a.t();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahqr
 * JD-Core Version:    0.7.0.1
 */