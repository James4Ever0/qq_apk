import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.managers.ShieldMsgManger;
import com.tencent.mobileqq.qcall.LightalkSwitchHanlder;
import com.tencent.mobileqq.qcall.QCallDetailActivity;
import com.tencent.mobileqq.utils.QQCustomDialog;
import java.util.ArrayList;

class agza
  implements DialogInterface.OnClickListener
{
  agza(agyx paramagyx, QQCustomDialog paramQQCustomDialog, ShieldMsgManger paramShieldMsgManger, ArrayList paramArrayList) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == 0) {
      this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.dismiss();
    }
    while (paramInt != 1) {
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqManagersShieldMsgManger.b(this.jdField_a_of_type_Agyx.jdField_a_of_type_Int, this.jdField_a_of_type_JavaUtilArrayList);
    QCallDetailActivity.a(this.jdField_a_of_type_Agyx.jdField_a_of_type_ComTencentMobileqqQcallQCallDetailActivity).a((byte)0);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     agza
 * JD-Core Version:    0.7.0.1
 */