import com.tencent.mobileqq.activity.FriendProfileCardActivity;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.widget.ActionSheet.OnDismissListener;

class smt
  implements ActionSheet.OnDismissListener
{
  smt(smr paramsmr) {}
  
  public void onDismiss()
  {
    ReportController.b(this.a.a.app, "CliOper", "", "", "0X8008406", "0X8008406", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     smt
 * JD-Core Version:    0.7.0.1
 */