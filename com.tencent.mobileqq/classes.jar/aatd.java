import android.app.Activity;
import android.text.TextUtils;
import com.tencent.biz.qrcode.util.QRUtils;
import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.arcard.ARCardShareHelper;
import com.tencent.mobileqq.olympic.activity.ScanTorchActivity;
import com.tencent.mobileqq.statistics.ReportController;
import cooperation.qzone.QZoneHelper;
import cooperation.qzone.QZoneHelper.UserInfo;

class aatd
  implements Runnable
{
  aatd(aatc paramaatc, boolean paramBoolean, String paramString) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_Aatc.a.a.jdField_a_of_type_AndroidAppActivity.isFinishing()) {
      return;
    }
    if (!this.jdField_a_of_type_Boolean)
    {
      QRUtils.a(1, 2131433149);
      return;
    }
    if (TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString))
    {
      QRUtils.a(1, 2131430006);
      return;
    }
    String str = ARCardShareHelper.a(this.jdField_a_of_type_Aatc.a.a);
    QZoneHelper.UserInfo localUserInfo = QZoneHelper.UserInfo.a();
    localUserInfo.jdField_a_of_type_JavaLangString = this.jdField_a_of_type_Aatc.a.a.jdField_a_of_type_ComTencentCommonAppAppInterface.getAccount();
    localUserInfo.b = ((ScanTorchActivity)this.jdField_a_of_type_Aatc.a.a.jdField_a_of_type_AndroidAppActivity).e();
    if (this.jdField_a_of_type_Aatc.a.a.jdField_a_of_type_Boolean) {
      ReportController.b(null, "dc00898", "", "", "0X8008F1B", "0X8008F1B", 3, 0, "", "", "", "");
    }
    for (;;)
    {
      QZoneHelper.a(this.jdField_a_of_type_Aatc.a.a.jdField_a_of_type_AndroidAppActivity, localUserInfo, this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Aatc.a.a.jdField_a_of_type_AndroidAppActivity.getString(2131429970), str, 1);
      return;
      ReportController.b(null, "dc00898", "", "", "0X8008F27", "0X8008F27", 3, 0, "", "", "", "");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aatd
 * JD-Core Version:    0.7.0.1
 */