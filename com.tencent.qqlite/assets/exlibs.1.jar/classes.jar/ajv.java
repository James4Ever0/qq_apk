import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.DoodleActivity;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;

public class ajv
  implements View.OnClickListener
{
  public ajv(DoodleActivity paramDoodleActivity) {}
  
  public void onClick(View paramView)
  {
    DialogUtil.a(this.a, this.a.getString(2131363453), 2131362794, 2131363454, new ajw(this), new ajx(this)).show();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ajv
 * JD-Core Version:    0.7.0.1
 */