import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mobileqq.model.TroopInfoManager;

public class ggy
  extends Handler
{
  public ggy(TroopInfoManager paramTroopInfoManager, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    TroopInfoManager.a(this.a);
    TroopInfoManager.b(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     ggy
 * JD-Core Version:    0.7.0.1
 */