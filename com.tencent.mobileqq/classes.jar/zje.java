import com.tencent.litetransfersdk.Session;
import com.tencent.mobileqq.app.DataLineHandler;

public class zje
  implements Runnable
{
  public zje(DataLineHandler paramDataLineHandler, long paramLong) {}
  
  public void run()
  {
    Session localSession = this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler.a(this.jdField_a_of_type_Long);
    DataLineHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppDataLineHandler, localSession, null, null, true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zje
 * JD-Core Version:    0.7.0.1
 */