import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.av.guild.GuildMultiActivity;
import com.tencent.av.smallscreen.SmallScreenActivityPlugin;

public class jla
  extends BroadcastReceiver
{
  public jla(GuildMultiActivity paramGuildMultiActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS"))
    {
      paramContext = paramIntent.getStringExtra("reason");
      if ((paramContext != null) && (this.a.a != null) && (paramContext.equals("homekey")) && (GuildMultiActivity.a(this.a) != null)) {
        GuildMultiActivity.a(this.a).b(this.a.isResume());
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     jla
 * JD-Core Version:    0.7.0.1
 */