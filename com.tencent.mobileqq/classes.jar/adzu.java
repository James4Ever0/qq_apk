import com.tencent.mobileqq.app.ThreadManager;

public class adzu
  implements Runnable
{
  public int a;
  public long a;
  public String a;
  public int b;
  public long b;
  public long c;
  public long d;
  
  public void run()
  {
    try
    {
      this.d = System.currentTimeMillis();
      ThreadManager.post(new adzv(this), 5, null, false);
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     adzu
 * JD-Core Version:    0.7.0.1
 */