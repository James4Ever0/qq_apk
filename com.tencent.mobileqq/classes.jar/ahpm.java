import android.view.inputmethod.InputMethodManager;
import com.tencent.mobileqq.richstatus.EditActivity;
import com.tencent.mobileqq.richstatus.RichStatusEditText;

public class ahpm
  implements Runnable
{
  public ahpm(EditActivity paramEditActivity) {}
  
  public void run()
  {
    EditActivity.a(this.a).requestFocus();
    ((InputMethodManager)this.a.getSystemService("input_method")).showSoftInput(EditActivity.a(this.a), 2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahpm
 * JD-Core Version:    0.7.0.1
 */