import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.statistics.ReportController;

public class rrn
  implements DialogInterface.OnClickListener
{
  public rrn(BaseChatPie paramBaseChatPie, boolean paramBoolean) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityBaseChatPie.a, "dc00898", "", "", "0X80081B9", "0X80081B9", 1, 0, "", "", "", "");
      return;
    }
    BaseChatPie.a(this.jdField_a_of_type_ComTencentMobileqqActivityBaseChatPie, this.jdField_a_of_type_Boolean);
    ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityBaseChatPie.a, "dc00898", "", "", "0X80081B9", "0X80081B9", 1, 1, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rrn
 * JD-Core Version:    0.7.0.1
 */