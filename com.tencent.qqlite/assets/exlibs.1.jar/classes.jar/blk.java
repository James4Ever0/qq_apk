import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.activity.ThemeSwitchDlgActivity;

public class blk
  implements DialogInterface.OnDismissListener
{
  public blk(ThemeSwitchDlgActivity paramThemeSwitchDlgActivity) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (ThemeSwitchDlgActivity.a(this.a)) {
      return;
    }
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     blk
 * JD-Core Version:    0.7.0.1
 */