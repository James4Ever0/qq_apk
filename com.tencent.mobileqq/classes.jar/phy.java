import android.os.Bundle;
import com.tencent.biz.webviewplugin.Share;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.protofile.getappinfo.GetAppInfoProto.GetAppinfoResponse;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.BusinessObserver;

public class phy
  implements BusinessObserver
{
  public phy(Share paramShare) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (!paramBoolean) {}
    byte[] arrayOfByte;
    do
    {
      return;
      arrayOfByte = paramBundle.getByteArray("data");
    } while (arrayOfByte == null);
    paramBundle = new GetAppInfoProto.GetAppinfoResponse();
    try
    {
      paramBundle.mergeFrom(arrayOfByte);
      ThreadManager.post(new phz(this, paramBundle), 5, null, true);
      return;
    }
    catch (InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.d(Share.a, 2, localInvalidProtocolBufferMicroException.getMessage());
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     phy
 * JD-Core Version:    0.7.0.1
 */