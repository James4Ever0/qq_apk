import com.tencent.mobileqq.app.GroupIconHelper;
import com.tencent.mobileqq.utils.DeviceInfoUtil;

public class zll
  implements Runnable
{
  public zll(GroupIconHelper paramGroupIconHelper) {}
  
  public void run()
  {
    long l = DeviceInfoUtil.a();
    int i = DeviceInfoUtil.b();
    if ((l != 0L) && (l < 1024L) && (i <= 1)) {
      GroupIconHelper.a(true);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zll
 * JD-Core Version:    0.7.0.1
 */