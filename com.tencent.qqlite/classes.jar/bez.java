import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mobileqq.activity.QQSettingMe;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.VipInfoObserver;

public class bez
  extends VipInfoObserver
{
  public bez(QQSettingMe paramQQSettingMe) {}
  
  protected void a(boolean paramBoolean, int paramInt)
  {
    if ((paramBoolean) && (paramInt >= 0) && (this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface != null))
    {
      SharedPreferences localSharedPreferences = this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getPreferences();
      if (localSharedPreferences != null) {
        localSharedPreferences.edit().putInt("key_selfvip_growthvalue", paramInt).commit();
      }
      this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.runOnUiThread(new bfa(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     bez
 * JD-Core Version:    0.7.0.1
 */