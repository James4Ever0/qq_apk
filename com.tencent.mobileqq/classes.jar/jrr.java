import android.content.IntentFilter;
import com.tencent.av.ui.AVActivity;
import com.tencent.qphone.base.util.QLog;

public class jrr
  implements Runnable
{
  public jrr(AVActivity paramAVActivity) {}
  
  public void run()
  {
    try
    {
      this.a.a = new jsb(this.a);
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
      this.a.registerReceiver(this.a.a, localIntentFilter);
      return;
    }
    catch (Exception localException)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d(this.a.b, 2, "Exception", localException);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     jrr
 * JD-Core Version:    0.7.0.1
 */