import com.tencent.mobileqq.app.LBSHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.enterpriseqq.EnterpriseQQManager;
import java.util.ArrayList;
import java.util.Iterator;

public class ftq
  implements Runnable
{
  public ftq(EnterpriseQQManager paramEnterpriseQQManager) {}
  
  public void run()
  {
    if ((EnterpriseQQManager.a(this.a) != null) && (EnterpriseQQManager.a(this.a) != null))
    {
      EnterpriseQQManager.a(this.a).a(this.a.a);
      ??? = EnterpriseQQManager.a(this.a).b();
      ((LBSHandler)EnterpriseQQManager.a(this.a).a(3)).a(???);
      return;
    }
    synchronized (EnterpriseQQManager.a())
    {
      if ((EnterpriseQQManager.a(this.a) == null) || (EnterpriseQQManager.a(this.a).size() <= 0)) {
        break label180;
      }
      Iterator localIterator = EnterpriseQQManager.a(this.a).iterator();
      while (localIterator.hasNext())
      {
        fts localfts = (fts)localIterator.next();
        if (localfts != null) {
          this.a.a(EnterpriseQQManager.a(this.a), EnterpriseQQManager.a(this.a), localfts.a, localfts.b, false, 0.0D, 0.0D);
        }
      }
    }
    EnterpriseQQManager.a(this.a).clear();
    label180:
    EnterpriseQQManager.a(this.a, null);
    EnterpriseQQManager.a(this.a, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     ftq
 * JD-Core Version:    0.7.0.1
 */