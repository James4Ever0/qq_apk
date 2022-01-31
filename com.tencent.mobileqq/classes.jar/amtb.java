import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.qphone.base.util.QLog;
import cooperation.jtcode.JtcodePluginInstallActivity;

public class amtb
  extends BroadcastReceiver
{
  private amtb(JtcodePluginInstallActivity paramJtcodePluginInstallActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("JtcodePluginInstallActivity", 4, "JtcodePluginOnResumeReceiver->onReceive, intent:" + paramIntent);
    }
    if ((paramIntent == null) || (!"bridge.plugin.onresume.broadcast".equals(paramIntent.getAction()))) {
      return;
    }
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amtb
 * JD-Core Version:    0.7.0.1
 */