import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.utils.JumpAction;

public class hgh
  implements Handler.Callback
{
  public hgh(JumpAction paramJumpAction) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    ((BaseActivity)JumpAction.a(this.a)).finish();
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     hgh
 * JD-Core Version:    0.7.0.1
 */