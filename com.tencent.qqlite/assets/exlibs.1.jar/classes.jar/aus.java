import android.content.Intent;
import android.os.Bundle;
import com.tencent.mobileqq.activity.LoginVerifyCodeActivity2;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.SSOAccountObserver;

public class aus
  extends SSOAccountObserver
{
  public aus(LoginVerifyCodeActivity2 paramLoginVerifyCodeActivity2) {}
  
  public void onFailed(String paramString, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.a.g();
  }
  
  public void onGetTicketNoPasswd(String paramString, byte[] paramArrayOfByte, int paramInt, Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d("SSOAccountObserver", 2, "onGetTicketNoPasswd wtTicket=" + paramArrayOfByte);
    }
    String str = null;
    if (paramInt == 4096) {
      str = new String(paramArrayOfByte);
    }
    paramArrayOfByte = new Intent();
    paramArrayOfByte.putExtra("last_account", paramString);
    paramArrayOfByte.putExtra("wtTicket", str);
    paramArrayOfByte.putExtra("ssobundle", paramBundle);
    this.a.setResult(-1, paramArrayOfByte);
    this.a.finish();
  }
  
  public void onUserCancel(String paramString, int paramInt, Bundle paramBundle)
  {
    this.a.g();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     aus
 * JD-Core Version:    0.7.0.1
 */