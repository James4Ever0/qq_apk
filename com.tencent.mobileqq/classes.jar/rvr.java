import android.os.Message;
import com.tencent.mobileqq.activity.ChatHistory;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import mqq.os.MqqHandler;

class rvr
  implements Runnable
{
  rvr(rvq paramrvq) {}
  
  public void run()
  {
    int i = this.a.a.app.a().a(this.a.a.b, this.a.a.jdField_a_of_type_Int);
    Message localMessage = this.a.a.jdField_a_of_type_MqqOsMqqHandler.obtainMessage(13);
    localMessage.arg1 = i;
    this.a.a.jdField_a_of_type_MqqOsMqqHandler.sendMessage(localMessage);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rvr
 * JD-Core Version:    0.7.0.1
 */