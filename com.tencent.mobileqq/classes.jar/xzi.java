import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.selectmember.PhoneContactSelectActivity;
import com.tencent.mobileqq.statistics.ReportController;

class xzi
  implements DialogInterface.OnClickListener
{
  xzi(xzg paramxzg) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    ReportController.b(this.a.a.app, "CliOper", "", "", "0X8006405", "0X8006405", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xzi
 * JD-Core Version:    0.7.0.1
 */