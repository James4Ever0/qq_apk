import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import dov.com.tencent.biz.qqstory.takevideo.doodle.ui.EditTextDialog;

public class aogs
  implements View.OnClickListener
{
  public aogs(EditTextDialog paramEditTextDialog) {}
  
  public void onClick(View paramView)
  {
    this.a.a.setSelectAllOnFocus(false);
    this.a.a.setSelection(this.a.a.length());
    this.a.a.setOnClickListener(null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aogs
 * JD-Core Version:    0.7.0.1
 */