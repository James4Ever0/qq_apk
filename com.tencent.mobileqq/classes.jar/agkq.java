import com.tencent.mobileqq.olympic.activity.ScanTorchActivity;
import com.tencent.mobileqq.widget.QQToast;

public class agkq
  implements Runnable
{
  public agkq(ScanTorchActivity paramScanTorchActivity) {}
  
  public void run()
  {
    QQToast.a(this.a.getApplicationContext(), "你已经参加过抽奖啦，不要太贪心哦。", 1).b(this.a.getTitleBarHeight());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     agkq
 * JD-Core Version:    0.7.0.1
 */