import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.biz.pubaccount.Advertisement.activity.PublicAccountAdvertisementActivity;

public class ktf
  implements ViewPager.OnPageChangeListener
{
  public ktf(PublicAccountAdvertisementActivity paramPublicAccountAdvertisementActivity) {}
  
  public void onPageScrollStateChanged(int paramInt)
  {
    PublicAccountAdvertisementActivity localPublicAccountAdvertisementActivity = this.a;
    if (paramInt != 0) {}
    for (boolean bool = true;; bool = false)
    {
      PublicAccountAdvertisementActivity.a(localPublicAccountAdvertisementActivity, bool);
      return;
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    PublicAccountAdvertisementActivity localPublicAccountAdvertisementActivity = this.a;
    if (paramInt2 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      PublicAccountAdvertisementActivity.a(localPublicAccountAdvertisementActivity, bool);
      return;
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    PublicAccountAdvertisementActivity.a(this.a, paramInt);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ktf
 * JD-Core Version:    0.7.0.1
 */