import android.content.Context;
import android.content.IntentFilter;
import com.tencent.av.utils.SensorReport;
import com.tencent.qphone.base.util.QLog;

public final class khl
  implements Runnable
{
  public khl(Context paramContext, IntentFilter paramIntentFilter) {}
  
  public void run()
  {
    try
    {
      this.jdField_a_of_type_AndroidContentContext.registerReceiver(SensorReport.a(), this.jdField_a_of_type_AndroidContentIntentFilter);
      return;
    }
    catch (Exception localException)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d("SensorReport", 2, "registonUserActionReceiver e = " + localException);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     khl
 * JD-Core Version:    0.7.0.1
 */