import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import com.tencent.mobileqq.activity.recent.BannerManager;
import com.tencent.open.agent.datamodel.ImageLoader.ImageLoadListener;
import mqq.os.MqqHandler;

public class xfu
  implements ImageLoader.ImageLoadListener
{
  public xfu(BannerManager paramBannerManager, Bundle paramBundle, Message paramMessage) {}
  
  public void a(String paramString1, Bitmap paramBitmap, String paramString2)
  {
    this.jdField_a_of_type_AndroidOsBundle.putParcelable("iconURLBitmap", paramBitmap);
    BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager).post(new xfv(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xfu
 * JD-Core Version:    0.7.0.1
 */