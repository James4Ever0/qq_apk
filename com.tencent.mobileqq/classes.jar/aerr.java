import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Card;
import com.tencent.mobileqq.nearby.profilecard.NearbyPeopleProfileActivity;
import com.tencent.mobileqq.nearby.profilecard.NearbyProfileDisplayTribePanel;

public class aerr
  implements Runnable
{
  public aerr(NearbyProfileDisplayTribePanel paramNearbyProfileDisplayTribePanel) {}
  
  public void run()
  {
    Object localObject = (FriendsManager)this.a.a.app.getManager(50);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((FriendsManager)localObject).a(this.a.a.getCurrentAccountUin()))
    {
      this.a.a.runOnUiThread(new aers(this, (Card)localObject));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aerr
 * JD-Core Version:    0.7.0.1
 */