import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.mobileqq.activity.ChatHistory;
import com.tencent.mobileqq.activity.ChatHistory.ChatHistoryAdapter;

public class adw
  implements View.OnClickListener
{
  public adw(ChatHistory paramChatHistory) {}
  
  public void onClick(View paramView)
  {
    if (this.a.c > 1)
    {
      this.a.jdField_b_of_type_AndroidWidgetImageView.setEnabled(true);
      this.a.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130837680);
      paramView = this.a;
      paramView.c -= 1;
      if (this.a.c <= 1)
      {
        this.a.jdField_a_of_type_AndroidWidgetImageView.setEnabled(false);
        this.a.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130838096);
      }
      this.a.e = ((this.a.c - 1) * 8);
      this.a.jdField_a_of_type_ComTencentMobileqqActivityChatHistory$ChatHistoryAdapter.a(this.a.jdField_b_of_type_JavaLangString, this.a.jdField_a_of_type_Int, this.a.e);
      this.a.jdField_a_of_type_AndroidWidgetEditText.setText(String.valueOf(this.a.c));
      this.a.jdField_a_of_type_AndroidWidgetEditText.setSelection(this.a.jdField_a_of_type_AndroidWidgetEditText.getText().length());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     adw
 * JD-Core Version:    0.7.0.1
 */