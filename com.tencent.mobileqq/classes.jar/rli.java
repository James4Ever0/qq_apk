import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.AuthDevVerifyCodeActivity;

public class rli
  extends Handler
{
  public rli(AuthDevVerifyCodeActivity paramAuthDevVerifyCodeActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    this.a.c();
    String str = paramMessage.obj.toString();
    paramMessage = str;
    if (str == null) {
      paramMessage = this.a.getString(2131434824);
    }
    this.a.a(paramMessage, 1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rli
 * JD-Core Version:    0.7.0.1
 */