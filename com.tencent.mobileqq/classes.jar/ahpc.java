import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.shortvideo.redbag.RedBagVideoManager;

public class ahpc
  implements View.OnClickListener
{
  public ahpc(RedBagVideoManager paramRedBagVideoManager) {}
  
  public void onClick(View paramView)
  {
    RedBagVideoManager.a(this.a, RedBagVideoManager.a(this.a));
    RedBagVideoManager.b(this.a, System.currentTimeMillis());
    if (RedBagVideoManager.a(this.a) - RedBagVideoManager.b(this.a) < 300L) {
      return;
    }
    RedBagVideoManager.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahpc
 * JD-Core Version:    0.7.0.1
 */