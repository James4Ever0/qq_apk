import com.tencent.mobileqq.activity.QQSettingSettingActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;

public class tkn
  extends FriendListObserver
{
  public tkn(QQSettingSettingActivity paramQQSettingSettingActivity) {}
  
  protected void onUpdateFriendInfo(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) || (paramString == null)) {
      return;
    }
    this.a.a(this.a.app.getCurrentAccountUin());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tkn
 * JD-Core Version:    0.7.0.1
 */