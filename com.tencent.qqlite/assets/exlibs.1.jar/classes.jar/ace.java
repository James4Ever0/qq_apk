import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.mobileqq.activity.ChatBackgroundSettingActivity;
import com.tencent.mobileqq.data.ChatBackgroundInfo;

class ace
  implements DialogInterface.OnClickListener
{
  ace(acc paramacc, ChatBackgroundInfo paramChatBackgroundInfo, View paramView, int paramInt) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jdField_a_of_type_Acc.a.b = this.jdField_a_of_type_ComTencentMobileqqDataChatBackgroundInfo;
    this.jdField_a_of_type_Acc.a.jdField_a_of_type_AndroidViewView = this.jdField_a_of_type_AndroidViewView;
    this.jdField_a_of_type_Acc.a.k = this.jdField_a_of_type_Int;
    ChatBackgroundSettingActivity.a(this.jdField_a_of_type_Acc.a, "OPENVIP_SET", 3);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ace
 * JD-Core Version:    0.7.0.1
 */