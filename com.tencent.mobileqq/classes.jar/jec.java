import com.tencent.av.VideoController;
import com.tencent.av.utils.PhoneStatusMonitor;

public class jec
  implements Runnable
{
  public jec(VideoController paramVideoController) {}
  
  public void run()
  {
    this.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor$PhoneStatusListener = new jen(this.a);
    this.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor = new PhoneStatusMonitor(this.a.jdField_a_of_type_AndroidContentContext, this.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor$PhoneStatusListener);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jec
 * JD-Core Version:    0.7.0.1
 */