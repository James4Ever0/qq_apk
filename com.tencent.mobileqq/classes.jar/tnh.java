import android.os.Message;
import com.tencent.mobileqq.activity.RegisterSendUpSms;
import mqq.os.MqqHandler;

public class tnh
  extends MqqHandler
{
  public tnh(RegisterSendUpSms paramRegisterSendUpSms) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tnh
 * JD-Core Version:    0.7.0.1
 */