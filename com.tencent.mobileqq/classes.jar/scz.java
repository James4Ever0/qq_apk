import android.view.View;
import com.tencent.mobileqq.activity.ChatSettingForTroop;
import com.tencent.mobileqq.troopinfo.TroopInfoData;
import com.tencent.mobileqq.util.TroopReportor;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class scz
  implements ActionSheet.OnButtonClickListener
{
  public scz(ChatSettingForTroop paramChatSettingForTroop, int paramInt, ActionSheet paramActionSheet) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    int i = 3;
    switch (paramInt)
    {
    default: 
      i = 0;
      paramInt = -1;
    }
    for (;;)
    {
      if (paramInt != this.jdField_a_of_type_Int) {
        ChatSettingForTroop.a(this.jdField_a_of_type_ComTencentMobileqqActivityChatSettingForTroop, paramInt);
      }
      try
      {
        this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
        TroopReportor.a("Grp_msg", "grpData_admin", "Close_setmsg", 0, 0, new String[] { this.jdField_a_of_type_ComTencentMobileqqActivityChatSettingForTroop.a.troopUin, TroopReportor.a(this.jdField_a_of_type_ComTencentMobileqqActivityChatSettingForTroop.a), String.valueOf(i) });
        return;
        i = 3;
        paramInt = 4;
        continue;
        i = 1;
        paramInt = 2;
        continue;
        int j = 2;
        paramInt = i;
        i = j;
      }
      catch (Exception paramView)
      {
        while (!QLog.isColorLevel()) {}
        QLog.i("Q.chatopttroop", 2, paramView.toString());
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     scz
 * JD-Core Version:    0.7.0.1
 */