import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mobileqq.app.ThreadManager;
import cooperation.qzone.share.QZoneShareActivity;

public class amje
  extends BroadcastReceiver
{
  public amje(QZoneShareActivity paramQZoneShareActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.tencent.qq.shareupdate".equals(paramIntent.getAction())) {
      ThreadManager.postImmediately(new amjf(this), null, true);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amje
 * JD-Core Version:    0.7.0.1
 */