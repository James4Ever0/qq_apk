import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.managers.TroopAssistantManager;
import com.tencent.mobileqq.utils.SharedPreferencesHandler;
import com.tencent.qphone.base.util.BaseApplication;
import java.util.Set;

public class dxi
  implements Runnable
{
  public dxi(TroopAssistantManager paramTroopAssistantManager, QQAppInterface paramQQAppInterface) {}
  
  public void run()
  {
    synchronized (TroopAssistantManager.a(this.jdField_a_of_type_ComTencentMobileqqManagersTroopAssistantManager))
    {
      Object[] arrayOfObject = TroopAssistantManager.a(this.jdField_a_of_type_ComTencentMobileqqManagersTroopAssistantManager).toArray();
      SharedPreferencesHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount(), 0).edit(), "troop_assis_new_unread_list", arrayOfObject).commit();
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     dxi
 * JD-Core Version:    0.7.0.1
 */