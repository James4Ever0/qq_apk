import android.os.Bundle;
import com.tencent.mobileqq.apollo.aioChannel.ApolloCmdChannel;
import com.tencent.mobileqq.apollo.process.CmGameUtil;
import eipc.EIPCResult;
import eipc.EIPCResultCallback;

public final class yxq
  implements EIPCResultCallback
{
  public yxq(long paramLong) {}
  
  public void onCallback(EIPCResult paramEIPCResult)
  {
    paramEIPCResult = paramEIPCResult.data.getString("respData");
    CmGameUtil.a().callbackFromRequest(this.a, 0, "cs.on_get_open_key.local", paramEIPCResult);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     yxq
 * JD-Core Version:    0.7.0.1
 */