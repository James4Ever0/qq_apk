import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.qqstory.takevideo.permission.PermissionListAdapter;
import com.tencent.biz.qqstory.takevideo.permission.PermissionSettingActivity;

public class ojx
  implements View.OnClickListener
{
  public ojx(PermissionSettingActivity paramPermissionSettingActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = PermissionSettingActivity.a(this.a).a();
    if (paramView != null)
    {
      PermissionSettingActivity.a(this.a, paramView);
      this.a.finish();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ojx
 * JD-Core Version:    0.7.0.1
 */