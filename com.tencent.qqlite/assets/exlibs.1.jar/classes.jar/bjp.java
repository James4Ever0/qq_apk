import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.activity.ShortcutRouterActivity;

public class bjp
  implements DialogInterface.OnDismissListener
{
  public bjp(ShortcutRouterActivity paramShortcutRouterActivity) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bjp
 * JD-Core Version:    0.7.0.1
 */