import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.mobileqq.armap.wealthgod.ARMapSplashEntryView;

public class abpr
  implements ValueAnimator.AnimatorUpdateListener
{
  public abpr(ARMapSplashEntryView paramARMapSplashEntryView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    ARMapSplashEntryView.a(this.a, ((Float)paramValueAnimator.getAnimatedValue()).floatValue());
    ARMapSplashEntryView.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abpr
 * JD-Core Version:    0.7.0.1
 */