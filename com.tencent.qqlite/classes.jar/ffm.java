import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.open.base.LogUtility;
import com.tencent.open.base.TicketUtils;
import com.tencent.open.base.TicketUtils.TicketCallback;
import com.tencent.open.downloadnew.MyAppApi;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam;

public class ffm
  implements TicketUtils.TicketCallback
{
  public ffm(MyAppApi paramMyAppApi, TicketUtils paramTicketUtils, TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, Bundle paramBundle, long paramLong, Context paramContext, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void a()
  {
    ThreadManager.b().post(new ffp(this));
  }
  
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    LogUtility.c("TIME-STATISTIC", "onGetA1");
    ThreadManager.b().post(new ffn(this, paramArrayOfByte, paramString));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     ffm
 * JD-Core Version:    0.7.0.1
 */