import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.troop.browser.TroopWebviewPlugin;

public class ajfv
  implements DialogInterface.OnDismissListener
{
  public ajfv(TroopWebviewPlugin paramTroopWebviewPlugin) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (paramDialogInterface == this.a.a) {
      this.a.a = null;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ajfv
 * JD-Core Version:    0.7.0.1
 */