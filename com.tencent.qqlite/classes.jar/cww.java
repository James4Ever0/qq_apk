import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.automator.step.CheckFriendsLastLoginInfo;

public class cww
  extends FriendListObserver
{
  private cww(CheckFriendsLastLoginInfo paramCheckFriendsLastLoginInfo) {}
  
  protected void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    if (!paramBoolean1) {
      this.a.a(6);
    }
    for (;;)
    {
      if (i != 0) {
        this.a.a(7);
      }
      return;
      if (paramBoolean2) {
        i = 1;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     cww
 * JD-Core Version:    0.7.0.1
 */