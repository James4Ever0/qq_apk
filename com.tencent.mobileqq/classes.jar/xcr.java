import Wallet.RspWalletConfig;
import android.os.Bundle;
import com.tencent.mobileqq.activity.qwallet.config.QWalletConfig;
import com.tencent.mobileqq.activity.qwallet.config.QWalletConfigManager;
import com.tencent.mobileqq.activity.qwallet.config.QWalletConfigManager.ConfigListener;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import mqq.observer.BusinessObserver;

public class xcr
  implements BusinessObserver
{
  public xcr(QWalletConfigManager paramQWalletConfigManager, long paramLong, QWalletConfigManager.ConfigListener paramConfigListener, WeakReference paramWeakReference) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (paramInt == 10)
    {
      if (!paramBoolean) {}
      try
      {
        if (!QLog.isColorLevel()) {
          return;
        }
        QLog.d("QWalletConfigManager", 2, "fail get rsp:" + this.jdField_a_of_type_Long);
        return;
      }
      catch (Exception paramBundle)
      {
        paramBundle.printStackTrace();
      }
      paramBundle = (RspWalletConfig)paramBundle.getSerializable("rsp");
      if (QLog.isColorLevel()) {
        QLog.d("QWalletConfigManager", 2, "RspWalletConfig|" + paramBundle);
      }
      QWalletConfigManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityQwalletConfigQWalletConfigManager).handleRsp(paramBundle, this.jdField_a_of_type_Long, this.jdField_a_of_type_ComTencentMobileqqActivityQwalletConfigQWalletConfigManager$ConfigListener, (QWalletConfigManager)this.jdField_a_of_type_JavaLangRefWeakReference.get());
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xcr
 * JD-Core Version:    0.7.0.1
 */