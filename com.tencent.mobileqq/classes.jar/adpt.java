import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.widget.PopupWindow;
import com.tencent.mobileqq.hotpic.HotPicMainPanel;

public class adpt
  implements Animator.AnimatorListener
{
  public adpt(HotPicMainPanel paramHotPicMainPanel) {}
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if ((this.a.a != null) && (this.a.a.isShowing())) {
      this.a.a.dismiss();
    }
    this.a.b.setVisibility(8);
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     adpt
 * JD-Core Version:    0.7.0.1
 */