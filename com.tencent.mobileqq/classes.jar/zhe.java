import com.tencent.mobileqq.app.QIMNewFriendManager;
import com.tencent.mobileqq.data.QIMNotifyAddFriend;
import java.util.Comparator;

public class zhe
  implements Comparator
{
  public zhe(QIMNewFriendManager paramQIMNewFriendManager) {}
  
  public int a(QIMNotifyAddFriend paramQIMNotifyAddFriend1, QIMNotifyAddFriend paramQIMNotifyAddFriend2)
  {
    return (int)(paramQIMNotifyAddFriend2.pushTime - paramQIMNotifyAddFriend1.pushTime);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zhe
 * JD-Core Version:    0.7.0.1
 */