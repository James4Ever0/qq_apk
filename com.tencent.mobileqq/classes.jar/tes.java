import QQService.SvcDevLoginInfo;
import com.tencent.mobileqq.activity.LoginInfoActivity;
import com.tencent.mobileqq.equipmentlock.EquipmentLockImpl;
import com.tencent.mobileqq.utils.HexUtil;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.SubAccountObserver;
import mqq.os.MqqHandler;

class tes
  extends SubAccountObserver
{
  tes(ter paramter, SvcDevLoginInfo paramSvcDevLoginInfo) {}
  
  protected void onGetKeyBack(String paramString1, String paramString2, String paramString3)
  {
    if (QLog.isColorLevel()) {
      QLog.d("LoginInfoActivity.AccDevSec", 2, "onGetKeyBack mainAccount=" + paramString1 + " subAccount=" + paramString2 + " key=" + paramString3);
    }
    if ((paramString3 == null) || (paramString3.length() > 0))
    {
      if (QLog.isColorLevel()) {
        QLog.d("LoginInfoActivity.AccDevSec", 2, "onGetKeyBack begin to kickOutDev");
      }
      if (EquipmentLockImpl.a().a(this.jdField_a_of_type_Ter.jdField_a_of_type_ComTencentMobileqqActivityLoginInfoActivity.app, this.jdField_a_of_type_QQServiceSvcDevLoginInfo.iAppId, (byte)1, HexUtil.a(paramString3), this.jdField_a_of_type_Ter.jdField_a_of_type_Int))
      {
        LoginInfoActivity.a(this.jdField_a_of_type_Ter.jdField_a_of_type_ComTencentMobileqqActivityLoginInfoActivity, 1);
        return;
      }
      LoginInfoActivity.a(this.jdField_a_of_type_Ter.jdField_a_of_type_ComTencentMobileqqActivityLoginInfoActivity).post(new tet(this));
      return;
    }
    LoginInfoActivity.a(this.jdField_a_of_type_Ter.jdField_a_of_type_ComTencentMobileqqActivityLoginInfoActivity).post(new teu(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tes
 * JD-Core Version:    0.7.0.1
 */