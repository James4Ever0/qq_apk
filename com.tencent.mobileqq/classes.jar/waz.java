import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.mobileqq.activity.aio.rebuild.TroopChatPie;

public class waz
  implements ViewPager.OnPageChangeListener
{
  public waz(TroopChatPie paramTroopChatPie) {}
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt)
  {
    TroopChatPie.a(this.a, paramInt);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     waz
 * JD-Core Version:    0.7.0.1
 */