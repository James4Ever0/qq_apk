import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.SoundAndVibrateActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.msf.sdk.SettingCloneUtil;
import com.tencent.mobileqq.theme.ThemeUtil;
import java.io.File;

public class tpz
  implements View.OnClickListener
{
  public tpz(SoundAndVibrateActivity paramSoundAndVibrateActivity) {}
  
  public void onClick(View paramView)
  {
    this.a.a(3);
    SettingCloneUtil.writeValueForInt(this.a, this.a.app.getCurrentAccountUin(), "sound_type", "qqsetting_notify_soundtype_key", SoundAndVibrateActivity.b);
    if (this.a.a().booleanValue())
    {
      this.a.b();
      paramView = ThemeUtil.getThemeVoiceRootPath();
      if (paramView != null)
      {
        paramView = new File(paramView + File.separatorChar + "message.mp3");
        if (paramView.exists())
        {
          this.a.b();
          this.a.a(Uri.fromFile(paramView));
        }
      }
    }
    else
    {
      return;
    }
    this.a.b();
    this.a.a(Uri.parse("android.resource://" + this.a.getApplicationContext().getPackageName() + "/" + 2131230721));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tpz
 * JD-Core Version:    0.7.0.1
 */