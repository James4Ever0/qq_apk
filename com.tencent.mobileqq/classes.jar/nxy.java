import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.tencent.biz.qqstory.storyHome.QQStoryBaseActivity;

public class nxy
  implements Animation.AnimationListener
{
  public nxy(QQStoryBaseActivity paramQQStoryBaseActivity) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (this.a.c != null)
    {
      this.a.c.clearAnimation();
      ((ViewGroup)((ViewGroup)this.a.findViewById(16908290)).getChildAt(0)).removeView(this.a.c);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nxy
 * JD-Core Version:    0.7.0.1
 */