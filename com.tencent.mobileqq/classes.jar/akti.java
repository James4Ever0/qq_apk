import android.content.Context;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.mobileqq.widget.ContainerView.SelectableTextView;
import com.tencent.qphone.base.util.QLog;

public class akti
  implements View.OnClickListener
{
  private String jdField_a_of_type_JavaLangString = "popupClickListener";
  
  public akti(ContainerView.SelectableTextView paramSelectableTextView) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 2131375573) {}
    try
    {
      ((ClipboardManager)ContainerView.SelectableTextView.a(this.jdField_a_of_type_ComTencentMobileqqWidgetContainerView$SelectableTextView).getSystemService("clipboard")).setText(ContainerView.SelectableTextView.a(this.jdField_a_of_type_ComTencentMobileqqWidgetContainerView$SelectableTextView).getText());
      Toast.makeText(this.jdField_a_of_type_ComTencentMobileqqWidgetContainerView$SelectableTextView.getContext(), "已经复制到剪贴板", 0).show();
      return;
    }
    catch (Exception paramView)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e(this.jdField_a_of_type_JavaLangString, 2, paramView.toString());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     akti
 * JD-Core Version:    0.7.0.1
 */