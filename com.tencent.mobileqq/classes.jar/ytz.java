import com.tencent.mobileqq.apollo.activity.HotChatCenterFragment;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;

public class ytz
  extends FriendListObserver
{
  public ytz(HotChatCenterFragment paramHotChatCenterFragment) {}
  
  void a(String paramString)
  {
    if (!paramString.equals(HotChatCenterFragment.a(this.a).getAccount())) {}
  }
  
  protected void onSetComment(boolean paramBoolean, String paramString1, String paramString2, byte paramByte) {}
  
  protected void onUpdateFriendInfo(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    while ((HotChatCenterFragment.a(this.a).getCurrentAccountUin() == null) || (!HotChatCenterFragment.a(this.a).getCurrentAccountUin().equals(paramString))) {
      return;
    }
    ThreadManager.post(new yua(this, paramString), 8, null, true);
  }
  
  protected void onUpdateOnlineFriend(boolean paramBoolean, String[] paramArrayOfString) {}
  
  protected void onUpdateRecentList()
  {
    this.a.b();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ytz
 * JD-Core Version:    0.7.0.1
 */