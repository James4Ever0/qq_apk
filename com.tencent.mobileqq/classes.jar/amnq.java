import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cooperation.qzone.webviewplugin.personalize.QZoneCoverStoreJsPlugin;

public class amnq
  extends BroadcastReceiver
{
  public amnq(QZoneCoverStoreJsPlugin paramQZoneCoverStoreJsPlugin) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    QZoneCoverStoreJsPlugin.a(this.a, paramIntent);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amnq
 * JD-Core Version:    0.7.0.1
 */