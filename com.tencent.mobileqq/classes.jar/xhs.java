import android.content.res.Resources;
import com.tencent.mobileqq.troop.widget.RedDotImageView;
import java.lang.ref.WeakReference;

class xhs
  implements Runnable
{
  xhs(xhr paramxhr) {}
  
  public void run()
  {
    RedDotImageView localRedDotImageView = (RedDotImageView)this.a.b.get();
    if (localRedDotImageView != null)
    {
      localRedDotImageView.setReddotXOffsetDp(15);
      localRedDotImageView.setRedDotDrawable(localRedDotImageView.getResources().getDrawable(2130846052));
      localRedDotImageView.a(true);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xhs
 * JD-Core Version:    0.7.0.1
 */