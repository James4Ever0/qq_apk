import com.tencent.mobileqq.activity.FriendProfileCardActivity;
import com.tencent.mobileqq.phonecontact.ContactBindObserver;
import com.tencent.mobileqq.widget.QQToast;

public class slw
  extends ContactBindObserver
{
  public slw(FriendProfileCardActivity paramFriendProfileCardActivity) {}
  
  protected void a(boolean paramBoolean)
  {
    this.a.H();
    if (paramBoolean) {
      return;
    }
    QQToast.a(this.a, 1, "当前网络不可用", 1000).a();
  }
  
  protected void a(boolean paramBoolean, int paramInt)
  {
    super.a(paramBoolean, paramInt);
    if ((this.a.j) && (paramBoolean)) {
      this.a.a(0L, null, null, false);
    }
    this.a.j = false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     slw
 * JD-Core Version:    0.7.0.1
 */