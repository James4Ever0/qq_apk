import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.PublicAccountChatActivity;

public class dgj
  extends Handler
{
  public dgj(PublicAccountChatActivity paramPublicAccountChatActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
    } while (this.a.isFinishing());
    try
    {
      PublicAccountChatActivity.a(this.a);
      return;
    }
    catch (Exception paramMessage) {}
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     dgj
 * JD-Core Version:    0.7.0.1
 */