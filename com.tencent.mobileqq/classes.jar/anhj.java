import com.tencent.mobileqq.filemanager.core.WeiYunLogicCenter.WeiyunCallback;
import mqq.os.MqqHandler;

public class anhj
  implements WeiYunLogicCenter.WeiyunCallback
{
  public MqqHandler a;
  
  public anhj(MqqHandler paramMqqHandler)
  {
    this.a = paramMqqHandler;
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a.sendEmptyMessageDelayed(100, 1500L);
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    if (this.a != null) {
      this.a.sendMessageDelayed(this.a.obtainMessage(101, paramInt, 0, paramString), 1500L);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     anhj
 * JD-Core Version:    0.7.0.1
 */