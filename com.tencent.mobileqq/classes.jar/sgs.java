import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.DialogActivity;

public class sgs
  implements DialogInterface.OnClickListener
{
  public sgs(DialogActivity paramDialogActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sgs
 * JD-Core Version:    0.7.0.1
 */