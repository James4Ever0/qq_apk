import android.app.Activity;
import dov.com.tencent.mobileqq.activity.richmedia.FlowSendTask;

public class aopb
  implements Runnable
{
  public aopb(FlowSendTask paramFlowSendTask) {}
  
  public void run()
  {
    this.a.a.setResult(1001);
    this.a.a.finish();
    this.a.a = null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aopb
 * JD-Core Version:    0.7.0.1
 */