import android.widget.EditText;
import com.tencent.mobileqq.activity.NearbyPeopleProfileActivity;
import com.tencent.mobileqq.conditionsearch.widget.IphonePickerView;
import com.tencent.mobileqq.conditionsearch.widget.IphonePickerView.IphonePickListener;
import com.tencent.mobileqq.conditionsearch.widget.IphonePickerView.PickerViewAdapter;
import com.tencent.widget.ActionSheet;

public class ayn
  implements IphonePickerView.IphonePickListener
{
  public ayn(NearbyPeopleProfileActivity paramNearbyPeopleProfileActivity, IphonePickerView paramIphonePickerView, ActionSheet paramActionSheet) {}
  
  public void a()
  {
    int i = this.jdField_a_of_type_ComTencentMobileqqConditionsearchWidgetIphonePickerView.a(0);
    NearbyPeopleProfileActivity.e(this.jdField_a_of_type_ComTencentMobileqqActivityNearbyPeopleProfileActivity).setTag(Byte.valueOf((byte)i));
    NearbyPeopleProfileActivity.e(this.jdField_a_of_type_ComTencentMobileqqActivityNearbyPeopleProfileActivity).setText(NearbyPeopleProfileActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityNearbyPeopleProfileActivity).a(0, i));
    if ((this.jdField_a_of_type_ComTencentWidgetActionSheet != null) && (this.jdField_a_of_type_ComTencentWidgetActionSheet.isShowing())) {
      this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
    }
  }
  
  public void a(int paramInt1, int paramInt2) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ayn
 * JD-Core Version:    0.7.0.1
 */