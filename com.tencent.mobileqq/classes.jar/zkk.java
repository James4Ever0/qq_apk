import android.os.Handler;
import com.tencent.mobileqq.app.FrameHelperActivity;
import com.tencent.mobileqq.flashchat.FlashChatObserver;

public class zkk
  extends FlashChatObserver
{
  public zkk(FrameHelperActivity paramFrameHelperActivity) {}
  
  public void b()
  {
    if (this.a.a.hasMessages(17)) {
      this.a.a.removeMessages(17);
    }
    this.a.a.sendEmptyMessage(17);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zkk
 * JD-Core Version:    0.7.0.1
 */