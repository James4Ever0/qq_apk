import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mobileqq.dinifly.LottieComposition;
import com.tencent.mobileqq.dinifly.LottieDrawable;
import com.tencent.mobileqq.dinifly.OnCompositionLoadedListener;
import com.tencent.mobileqq.worldcup.WorldCupShareFragment;

public class alfw
  implements OnCompositionLoadedListener
{
  public alfw(WorldCupShareFragment paramWorldCupShareFragment, String paramString, View paramView) {}
  
  public void onCompositionLoaded(@Nullable LottieComposition paramLottieComposition)
  {
    LottieDrawable localLottieDrawable = new LottieDrawable();
    localLottieDrawable.setImagesAssetsFolder(this.jdField_a_of_type_JavaLangString);
    localLottieDrawable.setImageAssetDelegate(new alfx(this));
    localLottieDrawable.setComposition(paramLottieComposition);
    localLottieDrawable.loop(true);
    localLottieDrawable.playAnimation();
    ((ImageView)this.jdField_a_of_type_AndroidViewView.findViewById(2131375534)).setImageDrawable(localLottieDrawable);
    WorldCupShareFragment.a(this.jdField_a_of_type_ComTencentMobileqqWorldcupWorldCupShareFragment, localLottieDrawable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     alfw
 * JD-Core Version:    0.7.0.1
 */