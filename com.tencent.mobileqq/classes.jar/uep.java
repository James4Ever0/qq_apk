import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.VisitorsActivity;
import com.tencent.mobileqq.data.CardProfile;
import com.tencent.mobileqq.statistics.ReportController;

public class uep
  implements View.OnClickListener
{
  public uep(VisitorsActivity paramVisitorsActivity) {}
  
  public void onClick(View paramView)
  {
    if ((paramView.getTag() instanceof ufl))
    {
      paramView = (ufl)paramView.getTag();
      ReportController.a(this.a.app, "CliOper", "", "", "0X800444A", "0X800444A", 0, 0, "", "", "", "");
      VisitorsActivity.a(this.a, (CardProfile)paramView.a);
    }
    while (!(paramView.getTag() instanceof ufn)) {
      return;
    }
    this.a.a();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     uep
 * JD-Core Version:    0.7.0.1
 */