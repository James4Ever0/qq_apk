import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.av.ui.PSTNC2CActivity;
import com.tencent.av.utils.PstnUtils;
import com.tencent.mobileqq.statistics.ReportController;

public class jzb
  implements DialogInterface.OnClickListener
{
  public jzb(PSTNC2CActivity paramPSTNC2CActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    PstnUtils.a(this.a.app, this.a, 2, 12);
    ReportController.b(this.a.app, "CliOper", "", "", "0X80063F9", "0X80063F9", 5, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jzb
 * JD-Core Version:    0.7.0.1
 */