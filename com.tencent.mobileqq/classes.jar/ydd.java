import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mobileqq.activity.specialcare.VipSpecialCareHandler;
import com.tencent.mobileqq.app.ThreadManager;

public class ydd
  implements Runnable
{
  public ydd(VipSpecialCareHandler paramVipSpecialCareHandler) {}
  
  public void run()
  {
    VipSpecialCareHandler.a(this.a, ThreadManager.newFreeHandlerThread("special-timer", 0));
    VipSpecialCareHandler.a(this.a).start();
    Looper localLooper = VipSpecialCareHandler.a(this.a).getLooper();
    if (localLooper == null) {
      return;
    }
    VipSpecialCareHandler.a(this.a, new yde(this, localLooper));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ydd
 * JD-Core Version:    0.7.0.1
 */