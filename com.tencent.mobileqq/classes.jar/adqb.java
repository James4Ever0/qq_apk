import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.mobileqq.activity.aio.item.MarketFaceItemBuilder.Holder;
import com.tencent.mobileqq.magicface.drawable.PngFrameManager;
import com.tencent.mobileqq.magicface.drawable.PngFrameManager.RandomDrawableParam;

public class adqb
  implements Runnable
{
  public adqb(PngFrameManager paramPngFrameManager, PngFrameManager.RandomDrawableParam paramRandomDrawableParam) {}
  
  public void run()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.a.jdField_a_of_type_AndroidWidgetProgressBar.getVisibility() != 0) && (this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.a.jdField_a_of_type_AndroidWidgetImageView.getVisibility() == 0)) {
      this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.a.jdField_a_of_type_AndroidWidgetFrameLayout.setOnClickListener(new adqc(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     adqb
 * JD-Core Version:    0.7.0.1
 */