import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.mobileqq.nearby.now.utils.CommentsUtil;
import com.tencent.mobileqq.nearby.now.view.ShortVideoCommentsView;

public class aext
  implements TextWatcher
{
  public aext(ShortVideoCommentsView paramShortVideoCommentsView) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (ShortVideoCommentsView.a(this.a) == null) {}
    while (CommentsUtil.a(paramEditable.toString()) <= 140) {
      return;
    }
    int j = Selection.getSelectionEnd(paramEditable);
    paramEditable = CommentsUtil.a(paramEditable.toString(), 0, 140).toString();
    ShortVideoCommentsView.a(this.a).setText(paramEditable);
    paramEditable = ShortVideoCommentsView.a(this.a).getText();
    int i = j;
    if (j > paramEditable.length()) {
      i = paramEditable.length();
    }
    Selection.setSelection(paramEditable, i);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aext
 * JD-Core Version:    0.7.0.1
 */