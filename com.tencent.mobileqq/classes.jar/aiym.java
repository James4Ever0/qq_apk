import android.view.View;
import com.tencent.mobileqq.troop.troop_apps.entry.ui.BulkSendMessageFragment;
import com.tencent.mobileqq.widget.ClearableEditText;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import java.util.List;

public class aiym
  implements ActionSheet.OnButtonClickListener
{
  public aiym(BulkSendMessageFragment paramBulkSendMessageFragment, ActionSheet paramActionSheet) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    if (paramInt < this.jdField_a_of_type_ComTencentMobileqqTroopTroop_appsEntryUiBulkSendMessageFragment.jdField_a_of_type_JavaUtilList.size())
    {
      paramView = (String)this.jdField_a_of_type_ComTencentMobileqqTroopTroop_appsEntryUiBulkSendMessageFragment.jdField_a_of_type_JavaUtilList.get(paramInt);
      this.jdField_a_of_type_ComTencentMobileqqTroopTroop_appsEntryUiBulkSendMessageFragment.jdField_a_of_type_ComTencentMobileqqWidgetClearableEditText.setText(paramView);
    }
    this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aiym
 * JD-Core Version:    0.7.0.1
 */