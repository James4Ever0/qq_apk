import android.app.Activity;
import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.activity.TeamWorkDocEditBrowserActivity;
import com.tencent.mobileqq.activity.TeamWorkDocEditBrowserActivity.TeamWorkDocEditBrowserFragment;
import com.tencent.mobileqq.jsp.DocxApiPlugin;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.ArrayList;
import mqq.manager.TicketManager;

public class admd
  implements Runnable
{
  public admd(DocxApiPlugin paramDocxApiPlugin, Activity paramActivity, String paramString1, String paramString2) {}
  
  public void run()
  {
    Object localObject = (TeamWorkDocEditBrowserActivity.TeamWorkDocEditBrowserFragment)((TeamWorkDocEditBrowserActivity)this.jdField_a_of_type_AndroidAppActivity).b();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.jdField_a_of_type_JavaLangString);
    String str1 = new File(this.jdField_a_of_type_JavaLangString).getName();
    String str2 = ((TicketManager)((TeamWorkDocEditBrowserActivity)this.jdField_a_of_type_AndroidAppActivity).a.getManager(2)).getSkey(((TeamWorkDocEditBrowserActivity)this.jdField_a_of_type_AndroidAppActivity).a.getAccount());
    localObject = ((TeamWorkDocEditBrowserActivity)this.jdField_a_of_type_AndroidAppActivity).a(localArrayList, ((TeamWorkDocEditBrowserActivity.TeamWorkDocEditBrowserFragment)localObject).b, str2, "1", ((TeamWorkDocEditBrowserActivity.TeamWorkDocEditBrowserFragment)localObject).jdField_c_of_type_JavaLangString, ((TeamWorkDocEditBrowserActivity.TeamWorkDocEditBrowserFragment)localObject).jdField_c_of_type_Int);
    if ((localObject != null) && (((ArrayList)localObject).size() != 0))
    {
      localObject = (String)((ArrayList)localObject).get(0);
      if (QLog.isColorLevel()) {
        QLog.i("TeamWorkDocEditBrowserActivity", 2, " url = " + (String)localObject + " fileName = " + str1);
      }
      this.jdField_a_of_type_ComTencentMobileqqJspDocxApiPlugin.callJs("insertImageForNativeJSBridge('" + (String)localObject + "','" + this.b + "','" + str1 + "')");
    }
    do
    {
      return;
      this.jdField_a_of_type_ComTencentMobileqqJspDocxApiPlugin.callJs("insertImageForNativeJSBridge('" + null + "','" + this.b + "','" + str1 + "')");
    } while (!QLog.isColorLevel());
    QLog.i("TeamWorkDocEditBrowserActivity", 2, "picture upload fail");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     admd
 * JD-Core Version:    0.7.0.1
 */