import com.tencent.mobileqq.search.activity.VADActivity;
import mqq.os.MqqHandler;

public final class ahwy
  implements Runnable
{
  public ahwy(MqqHandler paramMqqHandler) {}
  
  public void run()
  {
    
    if (VADActivity.a())
    {
      this.a.sendEmptyMessage(0);
      return;
    }
    this.a.sendEmptyMessage(1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ahwy
 * JD-Core Version:    0.7.0.1
 */