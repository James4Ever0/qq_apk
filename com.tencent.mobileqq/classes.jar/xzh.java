import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mobileqq.activity.selectmember.SelectMemberActivity;
import com.tencent.mobileqq.activity.selectmember.TroopMemberListInnerFrame;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

class xzh
  implements Runnable
{
  xzh(xzg paramxzg, List paramList) {}
  
  public void run()
  {
    int i = 0;
    try
    {
      StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder().append("onUpdateTroopGetMemberList:");
        if (this.jdField_a_of_type_JavaUtilList != null) {
          break label159;
        }
      }
      for (;;)
      {
        QLog.d("TroopMemberListInnerFrame", 2, i);
        this.jdField_a_of_type_Xzg.a.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberSelectMemberActivity.getSharedPreferences("last_update_time" + this.jdField_a_of_type_Xzg.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getCurrentAccountUin(), 0).edit().putLong("key_last_update_time" + this.jdField_a_of_type_Xzg.a.b, System.currentTimeMillis()).commit();
        TroopMemberListInnerFrame.a(this.jdField_a_of_type_Xzg.a, this.jdField_a_of_type_Xzg.a.b, this.jdField_a_of_type_JavaUtilList);
        return;
        label159:
        i = this.jdField_a_of_type_JavaUtilList.size();
      }
      return;
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.e("TroopMemberListInnerFrame", 2, "onUpdateTroopGetMemberList:" + localException.toString());
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xzh
 * JD-Core Version:    0.7.0.1
 */