import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.TroopDisbandActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopHandler;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.widget.QQProgressNotifier;

public class bmg
  implements DialogInterface.OnClickListener
{
  public bmg(TroopDisbandActivity paramTroopDisbandActivity, QQCustomDialog paramQQCustomDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.a == null) {
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.a = new QQProgressNotifier(this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity);
    }
    if (NetworkUtil.e(this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity))
    {
      paramDialogInterface = (TroopHandler)this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.app.a(17);
      if (paramDialogInterface != null)
      {
        if ((this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.d & 0x1) == 0)
        {
          TroopDisbandActivity localTroopDisbandActivity = this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity;
          localTroopDisbandActivity.d |= 0x1;
          paramDialogInterface.i(this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.b);
        }
        this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.a.a(0, 2131363672, 1000);
      }
    }
    for (;;)
    {
      if ((this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog != null) && (this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.isShowing())) {
        this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.cancel();
      }
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.app, "CliOper", "", "", "Grp", "Dismiss_grp_OK", 0, 0, "", "", "", "");
      return;
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.a.a(2, 2131363675, 1500);
      continue;
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity.a.a(2, 2131363450, 1500);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bmg
 * JD-Core Version:    0.7.0.1
 */