package com.tencent.mobileqq.activity.qwallet;

import Wallet.IdiomRedPackMatchRsp;
import android.os.Bundle;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.BusinessObserver;

class PasswdRedBagManager$5$1
  implements BusinessObserver
{
  PasswdRedBagManager$5$1(PasswdRedBagManager.5 param5) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (paramInt == 26)
    {
      paramBundle = (IdiomRedPackMatchRsp)paramBundle.getSerializable("rsp");
      if ((QLog.isColorLevel()) && (paramBundle != null)) {
        QLog.d("PasswdRedBagManager", 2, "openSolitaireRedBagByIdiom reportObserver: " + paramBoolean + "|status: " + paramBundle.status + " |hbIdiom： " + paramBundle.hbIdiom + " |hbIdiomLastPY: " + paramBundle.hbIdiomLastPY + " |idiomSeq: " + paramBundle.idiomSeq + " |subchannel: " + paramBundle.subchannel);
      }
      if ((paramBoolean) && (paramBundle != null))
      {
        if (paramBundle.status != 0) {
          break label163;
        }
        this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagManager.a(this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagInfo.jdField_a_of_type_JavaLangString, paramBundle.hbIdiom, paramBundle.hbIdiomLastPY, paramBundle.idiomSeq, paramBundle.hbPoemRule);
      }
    }
    label163:
    do
    {
      return;
      if (paramBundle.status == 1)
      {
        if (QLog.isColorLevel()) {
          QLog.i("PasswdRedBagManager", 2, "sessionInfo.curType: " + this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int);
        }
        if (this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int == 0) {
          this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagManager.a(this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagInfo.jdField_a_of_type_JavaLangString, this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int);
        }
        Bundle localBundle = new Bundle();
        localBundle.putString("answer", this.a.jdField_a_of_type_JavaLangString);
        localBundle.putInt("subchannel", paramBundle.subchannel);
        this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagManager.a(this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo, this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagInfo, this.a.jdField_a_of_type_Long, this.a.jdField_a_of_type_Int, localBundle);
        return;
      }
    } while (paramBundle.status != 2);
    long l = NetConnInfoCenter.getServerTime();
    QWalletSetting.a(PasswdRedBagManager.a(this.a.jdField_a_of_type_ComTencentMobileqqActivityQwalletPasswdRedBagManager).getCurrentAccountUin(), "idiom_match_in_phone", l + paramBundle.timeInterval);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.mobileqq.activity.qwallet.PasswdRedBagManager.5.1
 * JD-Core Version:    0.7.0.1
 */