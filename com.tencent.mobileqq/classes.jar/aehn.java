import android.os.Handler;
import com.tencent.qqlive.mediaplayer.api.TVK_SDKMgr.InstallListener;

public class aehn
  implements TVK_SDKMgr.InstallListener
{
  private Handler a;
  
  public aehn(Handler paramHandler)
  {
    this.a = paramHandler;
  }
  
  public void onInstallProgress(float paramFloat)
  {
    if (this.a != null) {
      this.a.sendEmptyMessage(2);
    }
  }
  
  public void onInstalledFailed(int paramInt)
  {
    if (this.a != null) {
      this.a.sendEmptyMessage(1);
    }
  }
  
  public void onInstalledSuccessed()
  {
    if (this.a != null) {
      this.a.sendEmptyMessage(0);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aehn
 * JD-Core Version:    0.7.0.1
 */