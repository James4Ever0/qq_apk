import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mobileqq.webprocess.WebProcessManager;
import com.tencent.qphone.base.util.QLog;

public class exd
  extends BroadcastReceiver
{
  public exd(WebProcessManager paramWebProcessManager) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (paramContext == null) {}
    do
    {
      return;
      if (QLog.isColorLevel()) {
        QLog.d("WebProcessManager", 2, "action=" + paramContext);
      }
      if (paramContext.equals("com.tencent.mobileqq.webprocess.restart_web_process"))
      {
        this.a.h();
        return;
      }
    } while (!paramContext.equals("com.tencent.mobileqq.webprocess.report"));
    this.a.i();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     exd
 * JD-Core Version:    0.7.0.1
 */