import android.content.Context;
import android.widget.RadioButton;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.leba.view.LebaGridIndicator;

public class aejx
  extends RadioButton
{
  public aejx(LebaGridIndicator paramLebaGridIndicator, Context paramContext)
  {
    super(paramContext);
  }
  
  public boolean performClick()
  {
    if (AppSetting.b) {
      return super.performClick();
    }
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aejx
 * JD-Core Version:    0.7.0.1
 */