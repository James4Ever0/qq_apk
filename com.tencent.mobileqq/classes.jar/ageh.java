import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.mobileqq.now.enter.ConversationNowController;

public class ageh
  implements ValueAnimator.AnimatorUpdateListener
{
  public ageh(ConversationNowController paramConversationNowController, RelativeLayout.LayoutParams paramLayoutParams, View paramView1, View paramView2) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    if (paramValueAnimator.getAnimatedValue() == null) {}
    float f;
    do
    {
      return;
      f = ((Integer)paramValueAnimator.getAnimatedValue()).intValue() * 1.0F / 1000.0F;
      int i = (int)(-ConversationNowController.a(this.jdField_a_of_type_ComTencentMobileqqNowEnterConversationNowController) * f);
      this.jdField_a_of_type_AndroidWidgetRelativeLayout$LayoutParams.topMargin = i;
      this.jdField_a_of_type_AndroidViewView.setLayoutParams(this.jdField_a_of_type_AndroidWidgetRelativeLayout$LayoutParams);
    } while ((!this.jdField_a_of_type_ComTencentMobileqqNowEnterConversationNowController.d) || (this.b == null));
    this.b.setAlpha(1.0F - f);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ageh
 * JD-Core Version:    0.7.0.1
 */