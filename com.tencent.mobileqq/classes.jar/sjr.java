import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mobileqq.activity.DialogActivity;

public class sjr
  implements DialogInterface.OnCancelListener
{
  public sjr(DialogActivity paramDialogActivity) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sjr
 * JD-Core Version:    0.7.0.1
 */