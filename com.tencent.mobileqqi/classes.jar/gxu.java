import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.troop.activity.TroopCreateBaseActivity;

public class gxu
  implements DialogInterface.OnDismissListener
{
  public gxu(TroopCreateBaseActivity paramTroopCreateBaseActivity) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (paramDialogInterface == this.a.a) {
      this.a.a = null;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     gxu
 * JD-Core Version:    0.7.0.1
 */