import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class mbb
  extends AnimatorListenerAdapter
{
  public mbb(View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.setAlpha(1.0F);
    this.a.setLayerType(0, null);
    this.a.setVisibility(8);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mbb
 * JD-Core Version:    0.7.0.1
 */