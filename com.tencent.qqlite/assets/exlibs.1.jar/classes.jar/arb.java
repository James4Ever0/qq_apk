import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.IndividuationSetActivity;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.theme.NightModeLogic;

public class arb
  implements CompoundButton.OnCheckedChangeListener
{
  public arb(IndividuationSetActivity paramIndividuationSetActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (!BaseApplicationImpl.a)
    {
      Toast.makeText(this.a, this.a.getString(2131363264), 0).show();
      return;
    }
    if (IndividuationSetActivity.a(this.a))
    {
      IndividuationSetActivity.a(this.a).startNightMode(this.a);
      ReportController.b(this.a.app, "CliOper", "", "", "QQLite_Trends_tab", "Neight_theme", 0, 0, "", "", "", "");
    }
    IndividuationSetActivity.a(this.a, true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     arb
 * JD-Core Version:    0.7.0.1
 */