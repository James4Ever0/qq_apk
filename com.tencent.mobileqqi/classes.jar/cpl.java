import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.DoodleActivity;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;

public class cpl
  implements View.OnClickListener
{
  public cpl(DoodleActivity paramDoodleActivity) {}
  
  public void onClick(View paramView)
  {
    DialogUtil.a(this.a, 230, this.a.getString(2131561832), this.a.getString(2131561823), 2131561746, 2131561915, new cpm(this), new cpn(this)).show();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     cpl
 * JD-Core Version:    0.7.0.1
 */