import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.qqconnect.wtlogin.Login;

public class fgc
  implements View.OnFocusChangeListener
{
  public fgc(Login paramLogin) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramView == this.a.jdField_b_of_type_AndroidWidgetEditText)
    {
      if (true == paramBoolean) {
        this.a.jdField_b_of_type_AndroidWidgetEditText.selectAll();
      }
      if (!paramBoolean) {
        this.a.jdField_b_of_type_AndroidViewView.setVisibility(4);
      }
    }
    while ((paramView != this.a.jdField_a_of_type_AndroidWidgetEditText) || (paramBoolean)) {
      return;
    }
    this.a.jdField_a_of_type_AndroidViewView.setVisibility(4);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     fgc
 * JD-Core Version:    0.7.0.1
 */