import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.biz.pubaccount.AccountDetail.view.AccountDetailBannerIndicator;
import com.tencent.biz.pubaccount.AccountDetail.view.AccountDetailBannerViewPager;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.List;

public class krg
  implements ViewPager.OnPageChangeListener
{
  public krg(AccountDetailBannerViewPager paramAccountDetailBannerViewPager) {}
  
  public void onPageScrollStateChanged(int paramInt)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("AccountDetailBannerViewPager", 2, "onPageScrollStateChanged->" + paramInt);
    }
    AccountDetailBannerViewPager.a(this.a, paramInt);
    if (AccountDetailBannerViewPager.a(this.a) != null)
    {
      Iterator localIterator = AccountDetailBannerViewPager.a(this.a).iterator();
      while (localIterator.hasNext()) {
        ((ViewPager.OnPageChangeListener)localIterator.next()).onPageScrollStateChanged(paramInt);
      }
    }
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (AccountDetailBannerViewPager.a(this.a) != null)
    {
      Iterator localIterator = AccountDetailBannerViewPager.a(this.a).iterator();
      while (localIterator.hasNext()) {
        ((ViewPager.OnPageChangeListener)localIterator.next()).onPageScrolled(paramInt1, paramFloat, paramInt2);
      }
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("AccountDetailBannerViewPager", 2, "onPageSelected->" + paramInt);
    }
    if (AccountDetailBannerViewPager.a(this.a) != null)
    {
      Iterator localIterator = AccountDetailBannerViewPager.a(this.a).iterator();
      while (localIterator.hasNext()) {
        ((ViewPager.OnPageChangeListener)localIterator.next()).onPageSelected(paramInt);
      }
    }
    if (AccountDetailBannerViewPager.a(this.a) != null) {
      AccountDetailBannerViewPager.a(this.a).a(paramInt);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     krg
 * JD-Core Version:    0.7.0.1
 */