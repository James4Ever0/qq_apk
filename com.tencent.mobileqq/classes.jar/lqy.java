import com.tencent.biz.pubaccount.readinjoy.logic.DiandianTopConfigManager;
import com.tencent.common.app.AppInterface;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.util.UiThreadUtil;

public class lqy
  implements Runnable
{
  public lqy(DiandianTopConfigManager paramDiandianTopConfigManager) {}
  
  public void run()
  {
    synchronized (this.a.a)
    {
      AppInterface localAppInterface = (AppInterface)BaseApplicationImpl.getApplication().getRuntime();
      UiThreadUtil.a(new lqz(this, FileUtils.a(BaseApplication.getContext().getFileStreamPath("file_readinjoy_diandian_top_config" + localAppInterface.getCurrentAccountUin()))));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lqy
 * JD-Core Version:    0.7.0.1
 */