import com.tencent.mobileqq.activity.DevlockQuickLoginActivity;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import mqq.observer.WtloginObserver;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;

public class sgn
  extends WtloginObserver
{
  public sgn(DevlockQuickLoginActivity paramDevlockQuickLoginActivity) {}
  
  public void OnCloseCode(String paramString, byte[] paramArrayOfByte1, long paramLong, WUserSigInfo paramWUserSigInfo, byte[] paramArrayOfByte2, int paramInt, ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel())
    {
      QLog.d("DevlockQuickLoginActivity", 2, "OnCloseCode userAccount=" + paramString + " ret=" + paramInt + " time=" + paramLong);
      if (paramArrayOfByte2 == null) {}
    }
    try
    {
      paramString = new String(paramArrayOfByte2, "utf-8");
      QLog.d("DevlockQuickLoginActivity", 2, "OnCloseCode errMsg=" + paramString);
      this.a.c();
      if (DevlockQuickLoginActivity.a(this.a)) {
        return;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
      if (paramInt == 0)
      {
        QQToast.a(this.a.getApplicationContext(), 2, 2131436577, 0).b(DevlockQuickLoginActivity.a(this.a));
        DevlockQuickLoginActivity.a(this.a);
        DevlockQuickLoginActivity.a(this.a, 0, 2131034135);
        return;
      }
      if (paramInt == 21)
      {
        paramString = this.a.getString(2131436582);
        paramArrayOfByte1 = this.a.getString(2131436303);
        this.a.a(null, paramString, paramArrayOfByte1, new sgo(this));
        return;
      }
      paramString = DevlockQuickLoginActivity.a(this.a, 2131436578);
      QQToast.a(this.a.getApplicationContext(), 1, paramString, 0).b(DevlockQuickLoginActivity.b(this.a));
    }
  }
  
  public void OnException(String paramString, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.d("DevlockQuickLoginActivity", 2, "OnException e=" + paramString);
    }
    this.a.c();
    QQToast.a(DevlockQuickLoginActivity.b(this.a), 1, this.a.getString(2131436581), 0).b(DevlockQuickLoginActivity.d(this.a));
  }
  
  public void OnVerifyCode(String paramString, byte[] paramArrayOfByte1, long paramLong, ArrayList paramArrayList, byte[] paramArrayOfByte2, int paramInt, ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel()) {
      QLog.d("DevlockQuickLoginActivity", 2, "OnVerifyCode userAccount=" + paramString + " ret=" + paramInt);
    }
    if (DevlockQuickLoginActivity.b(this.a))
    {
      this.a.c();
      return;
    }
    if (paramInt == 0)
    {
      this.a.b();
      return;
    }
    this.a.c();
    if (paramInt == 21)
    {
      paramString = this.a.getString(2131436582);
      paramArrayOfByte1 = this.a.getString(2131436303);
      this.a.a(null, paramString, paramArrayOfByte1, new sgp(this));
      return;
    }
    paramString = this.a.getString(2131436578);
    QQToast.a(DevlockQuickLoginActivity.a(this.a), 1, paramString, 0).b(DevlockQuickLoginActivity.c(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sgn
 * JD-Core Version:    0.7.0.1
 */