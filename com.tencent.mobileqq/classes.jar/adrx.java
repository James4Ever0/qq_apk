import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.managers.TimJumpLoginManager;
import com.tencent.mobileqq.statistics.ReportController;

public class adrx
  implements DialogInterface.OnClickListener
{
  public adrx(TimJumpLoginManager paramTimJumpLoginManager) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    ReportController.b(TimJumpLoginManager.a(this.a), "dc00898", "", "", "0X80085DB", "0X80085DB", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     adrx
 * JD-Core Version:    0.7.0.1
 */