import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cooperation.qzone.webviewplugin.QzoneQunFeedJsPlugin;

public class ankw
  extends BroadcastReceiver
{
  public ankw(QzoneQunFeedJsPlugin paramQzoneQunFeedJsPlugin) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("com.tencent.qq.syncQunMsg"))
    {
      int i = paramIntent.getIntExtra("com.tencent.qq.unreadcount", 0);
      QzoneQunFeedJsPlugin.a(this.a, i);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ankw
 * JD-Core Version:    0.7.0.1
 */