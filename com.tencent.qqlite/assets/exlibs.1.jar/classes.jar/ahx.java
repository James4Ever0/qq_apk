import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.DetailProfileActivity;
import com.tencent.mobileqq.statistics.ReportController;

public class ahx
  implements View.OnClickListener
{
  public ahx(DetailProfileActivity paramDetailProfileActivity) {}
  
  public void onClick(View paramView)
  {
    if ((this.a.a != null) && (this.a.a.isShowing()) && (this.a.a.getWindow() != null)) {
      this.a.a.dismiss();
    }
    ReportController.b(this.a.app, "CliOper", "", "", "0X8004920", "0X8004920", 0, 0, "", "", "", "");
    this.a.finish();
    this.a.overridePendingTransition(0, 2130968584);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ahx
 * JD-Core Version:    0.7.0.1
 */