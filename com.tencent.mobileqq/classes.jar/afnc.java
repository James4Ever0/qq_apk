import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.nearby.NearbySPUtil;
import com.tencent.mobileqq.nearby.NearbyUtils;
import com.tencent.mobileqq.nearby.profilecard.NearbyPeopleProfileActivity;
import com.tencent.mobileqq.nearby.profilecard.NearbyProfileEditTribePanel;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.QQCustomDialog;

class afnc
  implements DialogInterface.OnClickListener
{
  afnc(afna paramafna, QQCustomDialog paramQQCustomDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.dismiss();
    this.jdField_a_of_type_Afna.a.a.c();
    paramInt = ((Integer)NearbySPUtil.a(this.jdField_a_of_type_Afna.a.a.app.getCurrentAccountUin(), "self_gender", Integer.valueOf(-1))).intValue();
    ReportController.b(this.jdField_a_of_type_Afna.a.a.app, "dc00899", "grp_lbs", "", "data_card", "return_no", 0, 0, NearbyUtils.a(this.jdField_a_of_type_Afna.a.a.j), paramInt + "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     afnc
 * JD-Core Version:    0.7.0.1
 */