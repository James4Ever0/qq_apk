import android.app.Activity;
import dov.com.qq.im.QIMCameraCaptureUnit;
import dov.com.qq.im.QIMCameraUtil;
import dov.com.qq.im.setting.IQIMCameraContainer;

public class amsq
  implements Runnable
{
  public amsq(QIMCameraCaptureUnit paramQIMCameraCaptureUnit) {}
  
  public void run()
  {
    try
    {
      QIMCameraCaptureUnit.a(this.a, QIMCameraUtil.a(this.a.a.a(), true));
      this.a.a.a().runOnUiThread(new amsr(this));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     amsq
 * JD-Core Version:    0.7.0.1
 */