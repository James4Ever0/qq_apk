import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import dov.com.tencent.biz.qqstory.takevideo.doodle.layer.FaceLayer;
import dov.com.tencent.biz.qqstory.takevideo.doodle.layer.FaceLayer.FaceItem;

public class anha
  extends AnimatorListenerAdapter
{
  public anha(FaceLayer.FaceItem paramFaceItem) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.p = 12.0F;
    this.a.b.k();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anha
 * JD-Core Version:    0.7.0.1
 */