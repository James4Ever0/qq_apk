import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.activateFriends.ActivateFriendsManager;
import com.tencent.mobileqq.app.activateFriends.ActivateFriendsObserver;

public class zmj
  implements Runnable
{
  public zmj(ActivateFriendsManager paramActivateFriendsManager) {}
  
  public void run()
  {
    ActivateFriendsManager.a(this.a).notifyObservers(ActivateFriendsObserver.class, 115, true, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zmj
 * JD-Core Version:    0.7.0.1
 */