import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.search.activity.BaseSearchActivity;
import com.tencent.mobileqq.search.view.QuickPinyinEditText;

public class ahdr
  implements View.OnClickListener
{
  public ahdr(BaseSearchActivity paramBaseSearchActivity) {}
  
  public void onClick(View paramView)
  {
    BaseSearchActivity.b = 1;
    this.a.a.setText("");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ahdr
 * JD-Core Version:    0.7.0.1
 */