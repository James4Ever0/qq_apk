import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.activity.PeopleAroundBaseActivity;
import com.tencent.widget.ActionSheet;

public class dem
  implements DialogInterface.OnDismissListener
{
  public dem(PeopleAroundBaseActivity paramPeopleAroundBaseActivity) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    try
    {
      PeopleAroundBaseActivity.a(this.a).dismiss();
      return;
    }
    catch (Exception paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     dem
 * JD-Core Version:    0.7.0.1
 */