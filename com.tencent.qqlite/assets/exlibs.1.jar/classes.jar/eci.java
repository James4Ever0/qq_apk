import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.richstatus.SameStatusActivity;

public class eci
  implements Runnable
{
  public eci(SameStatusActivity paramSameStatusActivity) {}
  
  public void run()
  {
    this.a.app.c(false, false);
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     eci
 * JD-Core Version:    0.7.0.1
 */