import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.tencent.util.AnimateUtils.AnimationAdapter;

class mir
  extends AnimateUtils.AnimationAdapter
{
  mir(miq parammiq) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = new ScaleAnimation(0.72F, 1.05F, 0.72F, 1.05F, 1, 0.5F, 1, 0.5F);
    paramAnimation.setDuration(120L);
    paramAnimation.setAnimationListener(new mis(this));
    this.a.a.startAnimation(paramAnimation);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mir
 * JD-Core Version:    0.7.0.1
 */