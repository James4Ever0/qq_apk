import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.tencent.mobileqq.bubble.BubbleInterActiveAnim;

public class abdz
  extends Handler
{
  public abdz(BubbleInterActiveAnim paramBubbleInterActiveAnim, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    paramMessage = (Pair)paramMessage.obj;
    this.a.b(((Long)paramMessage.first).longValue(), ((Long)paramMessage.second).longValue());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abdz
 * JD-Core Version:    0.7.0.1
 */