import android.content.Context;
import android.view.View;
import com.tencent.mobileqq.nearby.now.view.viewmodel.PlayOperationViewModel;
import com.tencent.mobileqq.nearby.profilecard.moment.NearbyMomentProtocol;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class aemv
  implements ActionSheet.OnButtonClickListener
{
  public aemv(PlayOperationViewModel paramPlayOperationViewModel, String paramString1, String[] paramArrayOfString, String paramString2, Context paramContext, ActionSheet paramActionSheet) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    NearbyMomentProtocol.a(this.jdField_a_of_type_ComTencentMobileqqNearbyNowViewViewmodelPlayOperationViewModel.a, this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ArrayOfJavaLangString[paramInt], this.b, new aemw(this));
    this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aemv
 * JD-Core Version:    0.7.0.1
 */