import com.tencent.mobileqq.activity.FriendProfileMoreInfoActivity;
import com.tencent.mobileqq.activity.ProfileActivity.AllInOne;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Friends;

public class sqg
  extends FriendListObserver
{
  public sqg(FriendProfileMoreInfoActivity paramFriendProfileMoreInfoActivity) {}
  
  protected void onSetComment(boolean paramBoolean, String paramString1, String paramString2, byte paramByte)
  {
    if ((!this.a.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.a.equals(paramString1)) || (!ProfileActivity.AllInOne.b(this.a.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne))) {}
    for (;;)
    {
      return;
      if (paramBoolean)
      {
        this.a.jdField_a_of_type_ComTencentMobileqqBusinessCardDataBusinessCard.cardName = paramString2;
        return;
      }
      paramString1 = (FriendsManager)this.a.app.getManager(50);
      if (paramString1 == null) {}
      for (paramString1 = null; (paramString1 != null) && (paramString1.remark != null) && (paramString1.isRemark == 1); paramString1 = paramString1.c(this.a.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.a))
      {
        this.a.jdField_a_of_type_ComTencentMobileqqBusinessCardDataBusinessCard.cardName = paramString1.remark;
        return;
      }
    }
  }
  
  protected void onUpdateFriendList(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2) && (this.a.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.a != null) && (ProfileActivity.AllInOne.b(this.a.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne)))
    {
      localObject = (FriendsManager)this.a.app.getManager(50);
      if (localObject != null) {
        break label90;
      }
    }
    label90:
    for (Object localObject = null;; localObject = ((FriendsManager)localObject).c(this.a.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.a))
    {
      if ((localObject != null) && (((Friends)localObject).remark != null) && (((Friends)localObject).isRemark == 1)) {
        this.a.jdField_a_of_type_ComTencentMobileqqBusinessCardDataBusinessCard.cardName = ((Friends)localObject).remark;
      }
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sqg
 * JD-Core Version:    0.7.0.1
 */