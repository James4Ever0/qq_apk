import com.tencent.mobileqq.pluginsdk.PluginInterface;
import com.tencent.mobileqq.pluginsdk.PluginInterfaceHelper.OnPluginInterfaceLoadedListener;
import com.tencent.mobileqq.vashealth.PathTraceManager;

public class akrg
  implements PluginInterfaceHelper.OnPluginInterfaceLoadedListener
{
  public akrg(PathTraceManager paramPathTraceManager) {}
  
  public void onPluginInterfaceLoaded(PluginInterface paramPluginInterface)
  {
    PathTraceManager.a(this.a, paramPluginInterface);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     akrg
 * JD-Core Version:    0.7.0.1
 */