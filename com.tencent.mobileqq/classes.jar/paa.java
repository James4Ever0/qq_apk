import com.tencent.biz.tribe.TribeVideoPlugin;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.NetworkUtil;
import java.lang.ref.WeakReference;

public class paa
  implements Runnable
{
  private WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  private boolean jdField_a_of_type_Boolean;
  
  public paa(TribeVideoPlugin paramTribeVideoPlugin, boolean paramBoolean)
  {
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramTribeVideoPlugin);
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public void run()
  {
    TribeVideoPlugin localTribeVideoPlugin = (TribeVideoPlugin)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if ((localTribeVideoPlugin == null) || (TribeVideoPlugin.a(localTribeVideoPlugin) == null)) {
      return;
    }
    String str = ((BaseActivity)TribeVideoPlugin.a(localTribeVideoPlugin)).getCurrentAccountUin();
    if (this.jdField_a_of_type_Boolean) {}
    for (int i = 1;; i = 0)
    {
      ReportController.b(null, "dc00899", "BizTechReport", str, "tribe_video", "play", 0, 0, Integer.toString(i), Integer.toString(NetworkUtil.b(TribeVideoPlugin.a(localTribeVideoPlugin))), "", "");
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     paa
 * JD-Core Version:    0.7.0.1
 */