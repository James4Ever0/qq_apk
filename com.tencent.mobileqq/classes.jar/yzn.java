import com.tencent.mobileqq.apollo.store.ApolloGameActivity;
import com.tencent.qphone.base.util.QLog;

public class yzn
  implements Runnable
{
  public yzn(ApolloGameActivity paramApolloGameActivity) {}
  
  public void run()
  {
    try
    {
      this.a.b();
      return;
    }
    catch (Throwable localThrowable)
    {
      QLog.e("cmgame_process.ApolloGameActivity", 1, localThrowable, new Object[0]);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     yzn
 * JD-Core Version:    0.7.0.1
 */