import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.mobileqq.hotpic.HotPicMainPanel;
import com.tencent.widget.XPanelContainer;

public class adfr
  implements ValueAnimator.AnimatorUpdateListener
{
  public adfr(HotPicMainPanel paramHotPicMainPanel) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    XPanelContainer.a = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    this.a.a.requestLayout();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     adfr
 * JD-Core Version:    0.7.0.1
 */