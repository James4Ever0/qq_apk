import android.app.Activity;
import android.os.Handler;
import com.tencent.mobileqq.app.ThreadManagerV2;
import com.tencent.mobileqq.jsp.UiApiPlugin;

public class aefu
  implements Runnable
{
  public aefu(UiApiPlugin paramUiApiPlugin, Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {}
  
  public void run()
  {
    boolean bool = UiApiPlugin.a(this.jdField_a_of_type_AndroidAppActivity, UiApiPlugin.a(this.jdField_a_of_type_AndroidAppActivity, null, this.jdField_a_of_type_JavaLangString, "qqbrowser_float_shortcut"), this.b, this.c);
    ThreadManagerV2.getUIHandlerV2().post(new aefv(this, bool));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aefu
 * JD-Core Version:    0.7.0.1
 */