import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mobileqq.activity.ChatActivityUtils.StartVideoListener;
import com.tencent.mobileqq.statistics.ReportController;

public final class rwl
  implements DialogInterface.OnCancelListener
{
  public rwl(boolean paramBoolean, ChatActivityUtils.StartVideoListener paramStartVideoListener) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.jdField_a_of_type_Boolean) {
      ReportController.b(null, "CliOper", "", "", "Two_call", "Clk_shield_btn", 0, 0, "3", "", "", "");
    }
    if (this.jdField_a_of_type_ComTencentMobileqqActivityChatActivityUtils$StartVideoListener != null) {
      this.jdField_a_of_type_ComTencentMobileqqActivityChatActivityUtils$StartVideoListener.a();
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rwl
 * JD-Core Version:    0.7.0.1
 */