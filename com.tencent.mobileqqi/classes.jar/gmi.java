import android.os.Bundle;
import com.tencent.biz.pubaccount.PublicAccountManager;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.PublicAccountHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.AccountDetail;
import com.tencent.mobileqq.mp.mobileqq_mp.FollowResponse;
import com.tencent.mobileqq.mp.mobileqq_mp.RetInfo;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.richstatus.StatusJsHandler;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import mqq.observer.BusinessObserver;

public class gmi
  implements BusinessObserver
{
  public gmi(StatusJsHandler paramStatusJsHandler) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    BaseActivity localBaseActivity = (BaseActivity)this.a.jdField_a_of_type_JavaLangRefWeakReference.get();
    if ((localBaseActivity == null) || (localBaseActivity.isFinishing())) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.", 2, "success:" + String.valueOf(paramBoolean));
    }
    if (!paramBoolean)
    {
      this.a.a(2131560545);
      this.a.a(this.a.c, "false");
      return;
    }
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        paramBundle = paramBundle.getByteArray("data");
        if (paramBundle == null) {
          break;
        }
        mobileqq_mp.FollowResponse localFollowResponse = new mobileqq_mp.FollowResponse();
        localFollowResponse.mergeFrom(paramBundle);
        if ((!localFollowResponse.ret_info.has()) || (!((mobileqq_mp.RetInfo)localFollowResponse.ret_info.get()).ret_code.has())) {
          break label319;
        }
        paramInt = ((mobileqq_mp.RetInfo)localFollowResponse.ret_info.get()).ret_code.get();
        if (paramInt == 0)
        {
          this.a.jdField_a_of_type_ComTencentMobileqqDataAccountDetail.followType = 1;
          this.a.a(localBaseActivity, this.a.jdField_a_of_type_ComTencentMobileqqDataAccountDetail);
          ((PublicAccountHandler)localBaseActivity.b.a(10)).a(this.a.jdField_a_of_type_ComTencentMobileqqDataAccountDetail);
          PublicAccountManager.a().a(localBaseActivity.getApplicationContext(), localBaseActivity.b, this.a.jdField_a_of_type_ComTencentMobileqqDataAccountDetail.uin, null, true);
          this.a.a(this.a.c, "true");
          return;
        }
        if (paramInt == 58)
        {
          this.a.a(2131560549);
          break;
        }
        this.a.a(2131560545);
      }
      catch (Exception paramBundle) {}
      this.a.a(2131560545);
      break;
      break;
      label319:
      paramInt = -1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     gmi
 * JD-Core Version:    0.7.0.1
 */