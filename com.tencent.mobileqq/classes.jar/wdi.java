import com.tencent.mobileqq.activity.aio.AIOTipsController;
import com.tencent.mobileqq.activity.aio.tips.TipsManager;
import java.util.List;

public class wdi
  implements Runnable
{
  public wdi(TipsManager paramTipsManager) {}
  
  public void run()
  {
    if (TipsManager.a(this.a) != null) {
      TipsManager.a(this.a).a();
    }
    TipsManager.a(this.a, null);
    if (this.a.a != null) {
      this.a.a.clear();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wdi
 * JD-Core Version:    0.7.0.1
 */