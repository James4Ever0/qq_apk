import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.mobileqq.troop.widget.NearbyTroopsMapView;

public class hdm
  implements Animation.AnimationListener
{
  public hdm(NearbyTroopsMapView paramNearbyTroopsMapView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.showNearestPopView();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     hdm
 * JD-Core Version:    0.7.0.1
 */