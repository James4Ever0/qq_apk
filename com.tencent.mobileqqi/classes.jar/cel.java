import android.widget.TextView;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.data.TroopMemberCardInfo;
import com.tencent.mobileqq.model.FriendManager;
import java.util.ArrayList;

public class cel
  extends TroopObserver
{
  public cel(ChatActivity paramChatActivity) {}
  
  protected void a(boolean paramBoolean, long paramLong, int paramInt, TroopInfo paramTroopInfo)
  {
    if ((paramBoolean) && (this.a.a.jdField_a_of_type_Int == 1) && (paramTroopInfo != null) && (this.a.a.jdField_a_of_type_JavaLangString.equals(paramTroopInfo.troopuin)))
    {
      this.a.a.d = paramTroopInfo.troopname;
      this.a.a.d = this.a.a.d;
      this.a.jdField_b_of_type_AndroidWidgetTextView.setText(this.a.a.d);
    }
  }
  
  protected void a(boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) && (this.a.a.jdField_a_of_type_Int == 1) && (this.a.a.jdField_a_of_type_JavaLangString.equals(paramString)))
    {
      paramString = ((FriendManager)this.a.jdField_b_of_type_ComTencentMobileqqAppQQAppInterface.getManager(8)).a(this.a.a.jdField_a_of_type_JavaLangString);
      if (paramString != null)
      {
        this.a.a.d = paramString.troopname;
        this.a.jdField_b_of_type_AndroidWidgetTextView.setText(this.a.a.d);
      }
    }
  }
  
  protected void a(boolean paramBoolean, ArrayList paramArrayList)
  {
    if ((!paramBoolean) || (paramArrayList == null) || (paramArrayList.size() == 0)) {}
    label50:
    label191:
    label192:
    for (;;)
    {
      return;
      if ((this.a.a.jdField_a_of_type_Int == 1000) || (this.a.a.jdField_a_of_type_Int == 1020))
      {
        int i = 0;
        if (i < paramArrayList.size())
        {
          TroopMemberCardInfo localTroopMemberCardInfo = (TroopMemberCardInfo)paramArrayList.get(i);
          if ((localTroopMemberCardInfo != null) && (this.a.a.jdField_a_of_type_JavaLangString.equals(localTroopMemberCardInfo.memberuin)))
          {
            paramArrayList = localTroopMemberCardInfo.name;
            if ((paramArrayList != null) && (!"".equals(paramArrayList))) {
              break label191;
            }
            paramArrayList = localTroopMemberCardInfo.nick;
          }
        }
        for (;;)
        {
          if ((paramArrayList == null) || ("".equals(paramArrayList))) {
            break label192;
          }
          this.a.a.d = paramArrayList;
          this.a.a.d = this.a.a.d;
          this.a.jdField_b_of_type_AndroidWidgetTextView.setText(this.a.a.d);
          return;
          i += 1;
          break label50;
          break;
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     cel
 * JD-Core Version:    0.7.0.1
 */