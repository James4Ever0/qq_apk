import android.content.Context;
import android.content.Intent;
import com.tencent.qphone.base.util.QLog;

public final class adxb
  implements Runnable
{
  public adxb(Context paramContext) {}
  
  public void run()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("mqq.intent.action.QQ_BACKGROUND");
    try
    {
      this.a.sendBroadcast(localIntent);
      return;
    }
    catch (Exception localException)
    {
      QLog.i("GESTUREPWDUTILS", 1, localException.toString(), localException);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     adxb
 * JD-Core Version:    0.7.0.1
 */