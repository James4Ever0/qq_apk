import android.view.animation.Animation;
import com.tencent.mobileqq.profile.view.ProfileHeaderView;
import com.tencent.util.AnimateUtils.AnimationAdapter;

public class agdc
  extends AnimateUtils.AnimationAdapter
{
  public agdc(ProfileHeaderView paramProfileHeaderView, boolean paramBoolean) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (!this.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentMobileqqProfileViewProfileHeaderView.jdField_a_of_type_Boolean = false;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     agdc
 * JD-Core Version:    0.7.0.1
 */