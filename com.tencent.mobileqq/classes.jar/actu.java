import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.mobileqq.facetoface.Face2FaceFriendBubbleView;

public class actu
  implements Animation.AnimationListener
{
  public actu(Face2FaceFriendBubbleView paramFace2FaceFriendBubbleView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Face2FaceFriendBubbleView.a(this.a).setVisibility(0);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (Face2FaceFriendBubbleView.a(this.a) == 1)
    {
      Face2FaceFriendBubbleView.a(this.a).setVisibility(8);
      Face2FaceFriendBubbleView.a(this.a).setVisibility(8);
    }
    for (;;)
    {
      Face2FaceFriendBubbleView.a(this.a).setVisibility(4);
      return;
      if (Face2FaceFriendBubbleView.a(this.a) == 2)
      {
        Face2FaceFriendBubbleView.a(this.a).setImageResource(2130839074);
        Face2FaceFriendBubbleView.a(this.a).setVisibility(0);
        Face2FaceFriendBubbleView.a(this.a).setVisibility(8);
      }
      else if (Face2FaceFriendBubbleView.a(this.a) == 3)
      {
        Face2FaceFriendBubbleView.a(this.a).setImageResource(2130839075);
        Face2FaceFriendBubbleView.a(this.a).setVisibility(0);
        Face2FaceFriendBubbleView.a(this.a).setVisibility(8);
      }
      else if (Face2FaceFriendBubbleView.a(this.a) == 4)
      {
        Face2FaceFriendBubbleView.a(this.a).setImageResource(2130839076);
        Face2FaceFriendBubbleView.a(this.a).setVisibility(0);
        Face2FaceFriendBubbleView.a(this.a).setVisibility(0);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     actu
 * JD-Core Version:    0.7.0.1
 */