import com.tencent.mobileqq.activity.qwallet.red.QWRedConfig;
import com.tencent.mobileqq.activity.qwallet.utils.QWalletTools;

public class xmi
  implements Runnable
{
  public xmi(QWRedConfig paramQWRedConfig) {}
  
  public void run()
  {
    synchronized (QWRedConfig.access$000(this.a))
    {
      QWalletTools.a(this.a, QWRedConfig.access$100(this.a));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xmi
 * JD-Core Version:    0.7.0.1
 */