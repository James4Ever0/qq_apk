import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.biz.qqstory.takevideo.doodle.ui.animation.AnimatorFactory.AnimatorListener;

public final class ont
  implements ValueAnimator.AnimatorUpdateListener
{
  public ont(AnimatorFactory.AnimatorListener paramAnimatorListener) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    if (this.a != null) {
      this.a.a(paramValueAnimator);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ont
 * JD-Core Version:    0.7.0.1
 */