import com.tencent.mobileqq.activity.TroopMemberListActivity;
import com.tencent.mobileqq.activity.TroopMemberListActivity.ATroopMember;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.TroopMemberInfo;
import com.tencent.mobileqq.utils.DBUtils;
import mqq.os.MqqHandler;

class tyr
  implements Runnable
{
  tyr(typ paramtyp, String paramString) {}
  
  public void run()
  {
    Object localObject = (FriendsManager)this.jdField_a_of_type_Typ.a.app.getManager(50);
    TroopMemberInfo localTroopMemberInfo = DBUtils.a().a(this.jdField_a_of_type_Typ.a.app, this.jdField_a_of_type_Typ.a.b, this.jdField_a_of_type_JavaLangString);
    if ((localTroopMemberInfo != null) && (localObject != null))
    {
      localObject = this.jdField_a_of_type_Typ.a.a(localTroopMemberInfo, (FriendsManager)localObject);
      ThreadManager.getUIHandler().post(new tys(this, (TroopMemberListActivity.ATroopMember)localObject));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tyr
 * JD-Core Version:    0.7.0.1
 */