import cooperation.groupvideo.GVideoPluginInstallerActivity;
import cooperation.plugin.IPluginManager;

public class alvf
  implements Runnable
{
  public alvf(GVideoPluginInstallerActivity paramGVideoPluginInstallerActivity) {}
  
  public void run()
  {
    if (this.a.a == null) {
      return;
    }
    this.a.a.a("group_video_plugin.apk", false, GVideoPluginInstallerActivity.a(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     alvf
 * JD-Core Version:    0.7.0.1
 */