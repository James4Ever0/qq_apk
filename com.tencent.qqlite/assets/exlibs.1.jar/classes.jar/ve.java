import com.tencent.mobileqq.activity.AccountManageActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.managers.MessageRecordManagerImpl;
import com.tencent.mobileqq.utils.DBUtils;

public class ve
  implements Runnable
{
  public ve(AccountManageActivity paramAccountManageActivity, boolean paramBoolean, String paramString, int paramInt) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_Boolean)
    {
      ProxyManager localProxyManager = this.jdField_a_of_type_ComTencentMobileqqActivityAccountManageActivity.app.a();
      if (localProxyManager != null)
      {
        localProxyManager.c();
        new MessageRecordManagerImpl().a(this.jdField_a_of_type_JavaLangString);
        DBUtils.a().a(this.jdField_a_of_type_ComTencentMobileqqActivityAccountManageActivity.app.a(), this.jdField_a_of_type_JavaLangString, false);
      }
    }
    this.jdField_a_of_type_ComTencentMobileqqActivityAccountManageActivity.runOnUiThread(new vf(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ve
 * JD-Core Version:    0.7.0.1
 */