import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.widget.RotateableView;

public class hlr
  extends Handler
{
  public hlr(RotateableView paramRotateableView) {}
  
  public void handleMessage(Message paramMessage)
  {
    RotateableView.a(this.a, 8.0F);
    if (RotateableView.a(this.a) >= 360.0F) {
      RotateableView.b(this.a, 360.0F);
    }
    this.a.invalidate();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     hlr
 * JD-Core Version:    0.7.0.1
 */