import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.doutu.DoutuManager;

public final class abro
  implements Runnable
{
  public void run()
  {
    DoutuManager.a(BaseApplicationImpl.getApplication().getBaseContext());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     abro
 * JD-Core Version:    0.7.0.1
 */