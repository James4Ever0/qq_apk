import com.tencent.av.gaudio.AVNotifyCenter;
import com.tencent.av.utils.PhoneStatusMonitor;
import com.tencent.mobileqq.app.QQAppInterface;

public class jik
  implements Runnable
{
  public jik(AVNotifyCenter paramAVNotifyCenter) {}
  
  public void run()
  {
    if (this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface != null) {
      this.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor = new PhoneStatusMonitor(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApp(), null);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     jik
 * JD-Core Version:    0.7.0.1
 */