import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.activity.GroupManagerActivity;

public class aqq
  implements DialogInterface.OnDismissListener
{
  public aqq(GroupManagerActivity paramGroupManagerActivity) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    GroupManagerActivity.b(this.a, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     aqq
 * JD-Core Version:    0.7.0.1
 */