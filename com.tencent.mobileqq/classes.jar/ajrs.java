import com.tencent.mobileqq.utils.SendMessageHandler;
import com.tencent.mobileqq.utils.SendMessageHandler.SendMessageRunnable;
import java.util.List;

public class ajrs
  implements Runnable
{
  public ajrs(SendMessageHandler paramSendMessageHandler, long paramLong, String paramString) {}
  
  public void run()
  {
    if (SendMessageHandler.a(this.jdField_a_of_type_ComTencentMobileqqUtilsSendMessageHandler) >= SendMessageHandler.a(this.jdField_a_of_type_ComTencentMobileqqUtilsSendMessageHandler).size()) {
      return;
    }
    int i = SendMessageHandler.b(this.jdField_a_of_type_ComTencentMobileqqUtilsSendMessageHandler);
    SendMessageHandler.SendMessageRunnable localSendMessageRunnable = (SendMessageHandler.SendMessageRunnable)SendMessageHandler.a(this.jdField_a_of_type_ComTencentMobileqqUtilsSendMessageHandler).get(i);
    localSendMessageRunnable.b = i;
    localSendMessageRunnable.g = System.currentTimeMillis();
    localSendMessageRunnable.c = this.jdField_a_of_type_Long;
    localSendMessageRunnable.jdField_a_of_type_JavaLangString = this.jdField_a_of_type_JavaLangString;
    localSendMessageRunnable.run();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ajrs
 * JD-Core Version:    0.7.0.1
 */