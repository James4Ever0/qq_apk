import com.tencent.mobileqq.activity.RegisterChooseLoginActivity;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.AccountObserver;

public class tuc
  extends AccountObserver
{
  public tuc(RegisterChooseLoginActivity paramRegisterChooseLoginActivity) {}
  
  protected void onLoginFailed(String paramString1, String paramString2, String paramString3, int paramInt, byte[] paramArrayOfByte)
  {
    super.onLoginFailed(paramString1, paramString2, paramString3, paramInt, paramArrayOfByte);
    if (QLog.isColorLevel()) {
      QLog.d("Login_Optimize_RegisterNewQQActivity", 2, "AccountObserver ,onLoginFailed ");
    }
    RegisterChooseLoginActivity.a(this.a);
  }
  
  public void onLoginSuccess(String paramString1, String paramString2)
  {
    super.onLoginSuccess(paramString1, paramString2);
    if (QLog.isColorLevel()) {
      QLog.d("Login_Optimize_RegisterNewQQActivity", 2, "AccountObserver ,onLoginSuccess ");
    }
  }
  
  protected void onLoginTimeout(String paramString)
  {
    super.onLoginTimeout(paramString);
    if (QLog.isColorLevel()) {
      QLog.d("Login_Optimize_RegisterNewQQActivity", 2, "AccountObserver ,onLoginTimeout ");
    }
    RegisterChooseLoginActivity.a(this.a);
  }
  
  protected void onUserCancel(String paramString)
  {
    super.onUserCancel(paramString);
    if (QLog.isColorLevel()) {
      QLog.d("Login_Optimize_RegisterNewQQActivity", 2, "AccountObserver ,onUserCancel ");
    }
    RegisterChooseLoginActivity.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tuc
 * JD-Core Version:    0.7.0.1
 */