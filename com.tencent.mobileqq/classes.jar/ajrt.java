import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.utils.ShareActionSheetBuilder;
import com.tencent.widget.ActionSheet;

public class ajrt
  implements View.OnClickListener
{
  public ajrt(ShareActionSheetBuilder paramShareActionSheetBuilder) {}
  
  public void onClick(View paramView)
  {
    if (this.a.a.isShowing())
    {
      this.a.a.cancel();
      this.a.a.dismiss();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ajrt
 * JD-Core Version:    0.7.0.1
 */