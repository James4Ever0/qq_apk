import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.tencent.mobileqq.activity.recent.AnonymousEntranceView;

public class xnz
  implements Animation.AnimationListener
{
  public xnz(AnonymousEntranceView paramAnonymousEntranceView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (AnonymousEntranceView.a(this.a) != null) {
      AnonymousEntranceView.a(this.a).setVisibility(4);
    }
    if (AnonymousEntranceView.b(this.a) != null)
    {
      AnonymousEntranceView.b(this.a).clearAnimation();
      AnonymousEntranceView.b(this.a).startAnimation(AnonymousEntranceView.a(this.a));
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (AnonymousEntranceView.a(this.a) != null) {
      AnonymousEntranceView.a(this.a).setVisibility(0);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xnz
 * JD-Core Version:    0.7.0.1
 */