import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.DialogActivity;
import com.tencent.qphone.base.util.QLog;

public class son
  implements DialogInterface.OnClickListener
{
  public son(DialogActivity paramDialogActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    QLog.d("qqBaseActivity", 1, "checkBackgroundRestricWhilteList cancel.");
    paramDialogInterface.dismiss();
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     son
 * JD-Core Version:    0.7.0.1
 */