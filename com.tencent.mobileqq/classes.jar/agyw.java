import com.tencent.mobileqq.qcall.QCallDetailActivity;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.widget.ActionSheet.OnDismissListener;

public class agyw
  implements ActionSheet.OnDismissListener
{
  public agyw(QCallDetailActivity paramQCallDetailActivity) {}
  
  public void onDismiss()
  {
    ReportController.b(this.a.app, "CliOper", "", "", "0X8004E70", "0X8004E70", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     agyw
 * JD-Core Version:    0.7.0.1
 */