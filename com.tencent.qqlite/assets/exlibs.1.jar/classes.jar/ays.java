import com.tencent.mobileqq.activity.NearbyPeopleProfileActivity;
import com.tencent.mobileqq.app.ConditionSearchManager;
import com.tencent.mobileqq.app.ConditionSearchManager.IConfigListener;
import com.tencent.mobileqq.widget.QQToast;

public class ays
  implements ConditionSearchManager.IConfigListener
{
  public ays(NearbyPeopleProfileActivity paramNearbyPeopleProfileActivity) {}
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.a.c();
    NearbyPeopleProfileActivity.a(this.a).d(this);
    if (!paramBoolean) {
      QQToast.a(this.a, 2131364412, 0).b(this.a.getTitleBarHeight());
    }
    while (paramInt != 2) {
      return;
    }
    this.a.d();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ays
 * JD-Core Version:    0.7.0.1
 */