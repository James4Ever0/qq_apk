import android.os.Bundle;
import com.tencent.av.app.QQServiceProxy;
import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.camera.QavCameraUsage;
import com.tencent.av.service.IQQServiceCallback.Stub;
import com.tencent.av.service.RecvGVideoLevelInfo;
import com.tencent.av.service.RecvMsg;
import com.tencent.qphone.base.util.QLog;

public class jew
  extends IQQServiceCallback.Stub
{
  public jew(QQServiceProxy paramQQServiceProxy) {}
  
  public Bundle a(String paramString, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQServiceProxy", 2, "getDataFromVideoProcess cmd = " + paramInt1 + ",subCmd = " + paramInt2 + ",request = " + paramBundle + ",callbackCookie = " + paramString);
    }
    switch (paramInt1)
    {
    default: 
      return null;
    }
    paramString = new Bundle();
    paramString.putBoolean("AV_isUsingCamera", QavCameraUsage.a);
    return paramString;
  }
  
  public void a(RecvMsg paramRecvMsg)
  {
    if (paramRecvMsg != null) {
      this.a.a.a(new Object[] { Integer.valueOf(12), paramRecvMsg });
    }
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfByte) {}
  
  public void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    this.a.a.a(new Object[] { Integer.valueOf(47), Boolean.valueOf(paramBoolean), paramString1, paramString2, paramString3 });
  }
  
  public void a(RecvGVideoLevelInfo[] paramArrayOfRecvGVideoLevelInfo)
  {
    if ((paramArrayOfRecvGVideoLevelInfo != null) && (paramArrayOfRecvGVideoLevelInfo.length > 0)) {
      this.a.a.a(new Object[] { Integer.valueOf(501), paramArrayOfRecvGVideoLevelInfo });
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jew
 * JD-Core Version:    0.7.0.1
 */