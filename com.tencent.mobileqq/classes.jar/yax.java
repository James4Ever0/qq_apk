import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.activity.selectmember.SelectMemberActivity;

public class yax
  implements View.OnClickListener
{
  public yax(SelectMemberActivity paramSelectMemberActivity) {}
  
  public void onClick(View paramView)
  {
    this.a.onBackEvent();
    if (AppSetting.b) {
      this.a.c.post(new yay(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     yax
 * JD-Core Version:    0.7.0.1
 */