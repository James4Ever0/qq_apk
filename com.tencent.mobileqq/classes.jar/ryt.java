import android.view.View;
import android.view.ViewGroup;
import com.tencent.mobileqq.activity.BaseChatPie;

class ryt
  implements Runnable
{
  ryt(rys paramrys) {}
  
  public void run()
  {
    if ((BaseChatPie.b(this.a.a.a) != null) && (BaseChatPie.b(this.a.a.a).getParent() != null)) {
      ((ViewGroup)BaseChatPie.b(this.a.a.a).getParent()).removeView(BaseChatPie.b(this.a.a.a));
    }
    BaseChatPie.b(this.a.a.a, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ryt
 * JD-Core Version:    0.7.0.1
 */