import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.mobileqq.activity.ChatActivityUtils;
import com.tencent.mobileqq.activity.aio.rebuild.BusinessCmrTmpChatPie;
import com.tencent.mobileqq.app.EnterpriseQQHandler;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.mp.mobileqq_mp.FollowResponse;
import com.tencent.mobileqq.mp.mobileqq_mp.RetInfo;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.BusinessObserver;

public class vrp
  implements BusinessObserver
{
  public vrp(BusinessCmrTmpChatPie paramBusinessCmrTmpChatPie) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d("BusinessChatPie", 2, "success:" + String.valueOf(paramBoolean));
    }
    if (!paramBoolean) {
      this.a.v(2131430033);
    }
    for (;;)
    {
      ChatActivityUtils.b();
      return;
      try
      {
        paramBundle = paramBundle.getByteArray("data");
        if (paramBundle != null)
        {
          mobileqq_mp.FollowResponse localFollowResponse = new mobileqq_mp.FollowResponse();
          localFollowResponse.mergeFrom(paramBundle);
          paramInt = ((mobileqq_mp.RetInfo)localFollowResponse.ret_info.get()).ret_code.get();
          if (paramInt == 0)
          {
            ((FriendListHandler)this.a.a.a(1)).a(true, false);
            paramBundle = (EnterpriseQQHandler)this.a.a.a(21);
            if (paramBundle != null) {
              paramBundle.a(SystemClock.uptimeMillis());
            }
          }
          else if (paramInt == 58)
          {
            this.a.v(2131430041);
          }
          else if (paramInt == 65)
          {
            this.a.v(2131430042);
          }
          else if (paramInt == 20)
          {
            this.a.v(2131430043);
          }
          else
          {
            this.a.v(2131430033);
          }
        }
      }
      catch (Exception paramBundle) {}
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vrp
 * JD-Core Version:    0.7.0.1
 */