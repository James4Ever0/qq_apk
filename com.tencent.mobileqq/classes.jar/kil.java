import com.tencent.av.utils.PhoneStatusMonitor;
import com.tencent.av.utils.PhoneStatusMonitor.PhoneStatusListener;
import com.tencent.av.utils.PhoneStatusTools;
import com.tencent.qphone.base.util.QLog;

class kil
  implements Runnable
{
  kil(kik paramkik, String paramString) {}
  
  public void run()
  {
    boolean bool = PhoneStatusTools.d(this.jdField_a_of_type_Kik.a.jdField_a_of_type_AndroidContentContext);
    if (QLog.isColorLevel()) {
      QLog.d("PhoneStatusMonitor", 2, String.format("PhoneStatusReceiver, isCallingRunnable end, action[%s], mIsCalling[%s], isCalling[%s]", new Object[] { this.jdField_a_of_type_JavaLangString, Boolean.valueOf(this.jdField_a_of_type_Kik.a.jdField_a_of_type_Boolean), Boolean.valueOf(bool) }));
    }
    if ((this.jdField_a_of_type_Kik.a.jdField_a_of_type_Boolean) && (!bool))
    {
      this.jdField_a_of_type_Kik.a.jdField_a_of_type_Boolean = false;
      if (this.jdField_a_of_type_Kik.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor$PhoneStatusListener != null) {
        this.jdField_a_of_type_Kik.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor$PhoneStatusListener.a(false);
      }
    }
    do
    {
      do
      {
        return;
      } while ((this.jdField_a_of_type_Kik.a.jdField_a_of_type_Boolean) || (!bool));
      this.jdField_a_of_type_Kik.a.jdField_a_of_type_Boolean = true;
    } while (this.jdField_a_of_type_Kik.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor$PhoneStatusListener == null);
    this.jdField_a_of_type_Kik.a.jdField_a_of_type_ComTencentAvUtilsPhoneStatusMonitor$PhoneStatusListener.a(true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     kil
 * JD-Core Version:    0.7.0.1
 */