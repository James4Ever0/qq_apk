import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.biz.pubaccount.readinjoy.view.ReadinjoyTabFrame;
import com.tencent.util.AnimateUtils.AnimationAdapter;

public class mio
  extends AnimateUtils.AnimationAdapter
{
  public mio(ReadinjoyTabFrame paramReadinjoyTabFrame, View paramView1, View paramView2) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = new ScaleAnimation(1.1F, 1.0F, 1.1F, 1.0F, 1, 0.5F, 1, 0.5F);
    paramAnimation.setDuration(166L);
    ReadinjoyTabFrame.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadinjoyTabFrame).startAnimation(paramAnimation);
    paramAnimation.setAnimationListener(new mip(this));
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.jdField_a_of_type_AndroidViewView.setAlpha(1.0F);
    this.b.setAlpha(1.0F);
    ReadinjoyTabFrame.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewReadinjoyTabFrame).setAlpha(1.0F);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mio
 * JD-Core Version:    0.7.0.1
 */