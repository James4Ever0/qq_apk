import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

public final class zbv
  implements DialogInterface.OnDismissListener
{
  public zbv(Activity paramActivity, int paramInt) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.jdField_a_of_type_AndroidAppActivity.setRequestedOrientation(this.jdField_a_of_type_Int);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zbv
 * JD-Core Version:    0.7.0.1
 */