import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.mobileqq.richmedia.capture.fragment.EffectsCameraCaptureFragment;

public class ahiu
  implements Animation.AnimationListener
{
  public ahiu(EffectsCameraCaptureFragment paramEffectsCameraCaptureFragment) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (EffectsCameraCaptureFragment.d(this.a) != null)
    {
      EffectsCameraCaptureFragment.d(this.a).clearAnimation();
      EffectsCameraCaptureFragment.d(this.a).setVisibility(8);
    }
    this.a.h = false;
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.a.h = true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahiu
 * JD-Core Version:    0.7.0.1
 */