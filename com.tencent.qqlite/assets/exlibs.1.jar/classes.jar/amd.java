import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.ForceLogoutActivity;
import com.tencent.mobileqq.activity.LoginActivity;

public class amd
  implements View.OnClickListener
{
  public amd(ForceLogoutActivity paramForceLogoutActivity) {}
  
  public void onClick(View paramView)
  {
    this.a.finish();
    this.a.startActivity(new Intent(this.a, LoginActivity.class).addFlags(67108864));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     amd
 * JD-Core Version:    0.7.0.1
 */