import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.ProfileLabelEditorActivity;
import com.tencent.mobileqq.profile.ProfileLabelInfo;
import com.tencent.mobileqq.statistics.ReportController;
import java.util.List;

class teg
  implements View.OnClickListener
{
  teg(tef paramtef) {}
  
  public void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView instanceof tee))
    {
      paramView = (tee)paramView;
      if ((paramView.a >= 0) && (paramView.a < this.a.a.a.size()))
      {
        paramView = (ProfileLabelInfo)this.a.a.a.remove(paramView.a);
        this.a.a.a(this.a.a.a.size());
        this.a.notifyDataSetChanged();
        tef.a(this.a, paramView);
        ReportController.b(this.a.a.app, "CliOper", "", "", "card_mall", "0X80066C7", 0, 0, "2", "", "", "");
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     teg
 * JD-Core Version:    0.7.0.1
 */