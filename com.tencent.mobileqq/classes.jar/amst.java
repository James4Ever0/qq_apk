import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;
import cooperation.groupvideo.GVideoPluginInstallerActivity;

public class amst
  extends Handler
{
  public amst(GVideoPluginInstallerActivity paramGVideoPluginInstallerActivity, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void dispatchMessage(Message paramMessage)
  {
    if (paramMessage == null) {}
    do
    {
      return;
      switch (paramMessage.what)
      {
      default: 
        return;
      case 1: 
        GVideoPluginInstallerActivity.a(this.a);
        return;
      }
    } while ((!(paramMessage.obj instanceof String)) || (this.a.a == null));
    this.a.a.setText((String)paramMessage.obj);
    return;
    GVideoPluginInstallerActivity.b(this.a);
    return;
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amst
 * JD-Core Version:    0.7.0.1
 */