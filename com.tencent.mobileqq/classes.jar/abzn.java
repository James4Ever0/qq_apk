import android.text.TextUtils;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.campuscircle.CampusCircleIpcClient;
import com.tencent.mobileqq.confess.ConfessPlugin;
import java.util.ArrayList;
import java.util.List;
import mqq.os.MqqHandler;

public class abzn
  implements Runnable
{
  public abzn(ConfessPlugin paramConfessPlugin) {}
  
  public void run()
  {
    String str = this.a.c;
    if (TextUtils.isEmpty(str)) {
      ThreadManager.getUIHandler().post(new abzo(this));
    }
    Object localObject;
    boolean bool1;
    do
    {
      return;
      localObject = CampusCircleIpcClient.a().a(str);
      ThreadManager.getUIHandler().post(new abzp(this));
      if ((localObject == null) || (localObject.length != 3)) {
        break;
      }
      bool1 = ((Boolean)localObject[0]).booleanValue();
      boolean bool2 = ((Boolean)localObject[1]).booleanValue();
      if (localObject[2] == null) {}
      for (localObject = null; !bool2; localObject = (List)localObject[2])
      {
        this.a.callJs(this.a.d, new String[] { "本群成员不能向好友发起加群邀请。" });
        return;
      }
      if ((localObject == null) || (((List)localObject).size() == 0))
      {
        this.a.callJs(this.a.d, new String[] { "获取群成员失败，请重试。" });
        return;
      }
    } while (ConfessPlugin.a(this.a, str, bool1, (ArrayList)localObject));
    this.a.callJs(this.a.d, new String[] { "邀请群成员异常。" });
    return;
    this.a.callJs(this.a.d, new String[] { "邀请群成员异常。" });
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     abzn
 * JD-Core Version:    0.7.0.1
 */