import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.mobileqq.activity.ForwardRecentActivity;

public class ctc
  implements Animation.AnimationListener
{
  public ctc(ForwardRecentActivity paramForwardRecentActivity, int paramInt) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityForwardRecentActivity.a.setAnimation(null);
    this.jdField_a_of_type_ComTencentMobileqqActivityForwardRecentActivity.a.offsetTopAndBottom(this.jdField_a_of_type_Int);
    this.jdField_a_of_type_ComTencentMobileqqActivityForwardRecentActivity.a.requestLayout();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     ctc
 * JD-Core Version:    0.7.0.1
 */