import com.tencent.mobileqq.activity.FriendProfileMoreInfoActivity;
import com.tencent.mobileqq.app.ConditionSearchManager.IConfigListener;
import com.tencent.mobileqq.widget.QQToast;

public class sqh
  implements ConditionSearchManager.IConfigListener
{
  public sqh(FriendProfileMoreInfoActivity paramFriendProfileMoreInfoActivity) {}
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if ((this.a.a == 1) || (this.a.a == 2))
    {
      if (paramBoolean) {
        break label55;
      }
      FriendProfileMoreInfoActivity.a(this.a);
      QQToast.a(this.a, 2131437281, 0).b(this.a.getTitleBarHeight());
    }
    label55:
    while (paramInt != 2) {
      return;
    }
    FriendProfileMoreInfoActivity.a(this.a);
    FriendProfileMoreInfoActivity.a(this.a, this.a.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sqh
 * JD-Core Version:    0.7.0.1
 */