import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mobileqq.theme.ThemeSwitchManager;
import java.util.concurrent.atomic.AtomicBoolean;

public class aith
  implements Runnable
{
  public aith(ThemeSwitchManager paramThemeSwitchManager) {}
  
  public void run()
  {
    if (this.a.jdField_a_of_type_AndroidWidgetImageView == null) {
      return;
    }
    ViewGroup localViewGroup = (ViewGroup)this.a.jdField_a_of_type_AndroidWidgetImageView.getParent();
    if (localViewGroup != null)
    {
      localViewGroup.removeView(this.a.jdField_a_of_type_AndroidWidgetImageView);
      localViewGroup.clearDisappearingChildren();
    }
    this.a.jdField_a_of_type_AndroidGraphicsBitmap.recycle();
    this.a.jdField_a_of_type_AndroidGraphicsBitmap = null;
    this.a.b.set(false);
    this.a.jdField_a_of_type_AndroidWidgetImageView = null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aith
 * JD-Core Version:    0.7.0.1
 */