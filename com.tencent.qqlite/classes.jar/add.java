import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.ChatHistory;
import com.tencent.mobileqq.widget.QQProgressDialog;

public class add
  extends Handler
{
  public add(ChatHistory paramChatHistory) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      if ((this.a.a != null) && (this.a.a.isShowing())) {
        this.a.a.dismiss();
      }
      this.a.a = new QQProgressDialog(this.a, this.a.getTitleBarHeight());
      this.a.a.setCancelable(false);
      this.a.a.b(2131363263);
      this.a.a.show();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     add
 * JD-Core Version:    0.7.0.1
 */