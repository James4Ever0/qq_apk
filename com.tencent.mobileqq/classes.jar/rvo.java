import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mobileqq.activity.ChatHistory;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.TipsBar;
import com.tencent.qphone.base.util.BaseApplication;

public class rvo
  implements View.OnClickListener
{
  public rvo(ChatHistory paramChatHistory) {}
  
  public void onClick(View paramView)
  {
    if (NetworkUtil.d(BaseApplication.getContext()))
    {
      this.a.jdField_a_of_type_ComTencentMobileqqWidgetTipsBar.setVisibility(8);
      if (this.a.jdField_a_of_type_Int == 0) {
        this.a.l();
      }
      return;
    }
    this.a.jdField_a_of_type_AndroidWidgetTextView.setEnabled(true);
    if (this.a.jdField_a_of_type_AndroidAppDialog != null) {
      this.a.jdField_a_of_type_AndroidAppDialog.dismiss();
    }
    this.a.jdField_a_of_type_ComTencentMobileqqWidgetTipsBar.setVisibility(0);
    this.a.c.setText(this.a.getString(2131432992));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rvo
 * JD-Core Version:    0.7.0.1
 */