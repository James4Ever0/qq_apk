import android.os.Message;
import com.tencent.mobileqq.activity.selectmember.PhoneContactTabView;
import mqq.os.MqqHandler;

public class ygb
  extends MqqHandler
{
  public ygb(PhoneContactTabView paramPhoneContactTabView) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    case 1: 
    case 2: 
    default: 
      return;
    }
    this.a.d();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ygb
 * JD-Core Version:    0.7.0.1
 */