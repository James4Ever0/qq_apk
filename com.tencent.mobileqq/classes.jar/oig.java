import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.biz.qqstory.takevideo.doodle.layer.FaceLayer.FaceAndTextItem;

public class oig
  implements Animator.AnimatorListener
{
  public oig(FaceLayer.FaceAndTextItem paramFaceAndTextItem) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.a.a = false;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.a = false;
  }
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    this.a.a = true;
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.a.a = true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     oig
 * JD-Core Version:    0.7.0.1
 */