import com.tencent.biz.common.offline.OfflineExpire.OfflineExpireCheckUpdate;
import com.tencent.biz.webviewplugin.OfflineWebResManager;
import com.tencent.common.app.AppInterface;
import com.tencent.common.app.BaseApplicationImpl;
import mqq.app.AppRuntime;

public class kme
  implements Runnable
{
  public kme(OfflineExpire.OfflineExpireCheckUpdate paramOfflineExpireCheckUpdate) {}
  
  public void run()
  {
    AppRuntime localAppRuntime = BaseApplicationImpl.getApplication().getRuntime();
    if ((localAppRuntime instanceof AppInterface)) {
      new OfflineWebResManager((AppInterface)localAppRuntime).a();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kme
 * JD-Core Version:    0.7.0.1
 */