import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout.LayoutParams;

class bbu
  implements Animation.AnimationListener
{
  bbu(bbt parambbt, View paramView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = (FrameLayout.LayoutParams)this.jdField_a_of_type_AndroidViewView.getLayoutParams();
    paramAnimation.leftMargin = this.jdField_a_of_type_Bbt.jdField_a_of_type_Int;
    paramAnimation.topMargin = this.jdField_a_of_type_Bbt.b;
    this.jdField_a_of_type_AndroidViewView.setLayoutParams(paramAnimation);
    this.jdField_a_of_type_AndroidViewView.clearAnimation();
    this.jdField_a_of_type_AndroidViewView.setVisibility(0);
    this.jdField_a_of_type_Bbt.jdField_a_of_type_Boolean = false;
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bbu
 * JD-Core Version:    0.7.0.1
 */