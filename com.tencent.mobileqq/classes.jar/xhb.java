import com.tencent.mobileqq.activity.bless.BlessManager;
import com.tencent.mobileqq.activity.recent.RecentAdapter;
import com.tencent.mobileqq.app.QQAppInterface;

public class xhb
  implements Runnable
{
  public xhb(RecentAdapter paramRecentAdapter) {}
  
  public void run()
  {
    ((BlessManager)this.a.a.getManager(137)).b(true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xhb
 * JD-Core Version:    0.7.0.1
 */