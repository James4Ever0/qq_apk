import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mobileqq.troop.activity.AbsPublishActivity;
import com.tencent.mobileqq.troop.utils.TroopBarUtils;

public class aifm
  extends BroadcastReceiver
{
  public aifm(AbsPublishActivity paramAbsPublishActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if ("key_photo_delete_action".equals(paramContext))
    {
      int i = paramIntent.getIntExtra("key_photo_delete_position", -1);
      this.a.a(i, 9);
    }
    do
    {
      return;
      if ("key_audio_delete_action".equals(paramContext))
      {
        this.a.a(0);
        this.a.a = null;
        TroopBarUtils.a(this.a.p, this.a.q, "del_record", this.a.r, this.a.c, "", "");
        return;
      }
    } while (!"key_audio_play_action".equals(paramContext));
    TroopBarUtils.a(this.a.p, this.a.q, "preview_record", this.a.r, this.a.c, "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aifm
 * JD-Core Version:    0.7.0.1
 */