import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.mobileqq.troop.activity.MediaPreviewActivity;

public class aizg
  implements Animation.AnimationListener
{
  public aizg(MediaPreviewActivity paramMediaPreviewActivity) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.b = false;
    paramAnimation.setAnimationListener(null);
    this.a.finish();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aizg
 * JD-Core Version:    0.7.0.1
 */