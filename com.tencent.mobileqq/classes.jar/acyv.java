import android.content.SharedPreferences;
import com.tencent.mobileqq.filemanager.activity.fileassistant.QfileFileAssistantActivity;
import com.tencent.mobileqq.utils.QQUtils;

public class acyv
  implements Runnable
{
  public acyv(QfileFileAssistantActivity paramQfileFileAssistantActivity, String paramString) {}
  
  public void run()
  {
    boolean bool = this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityFileassistantQfileFileAssistantActivity.getSharedPreferences("Offline_Flags", 0).getBoolean("TMPFLAG", false);
    if ((!QQUtils.a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityFileassistantQfileFileAssistantActivity, new String[] { this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityFileassistantQfileFileAssistantActivity.getString(2131428093) })) && (!bool)) {
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityFileassistantQfileFileAssistantActivity.runOnUiThread(new acyw(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acyv
 * JD-Core Version:    0.7.0.1
 */