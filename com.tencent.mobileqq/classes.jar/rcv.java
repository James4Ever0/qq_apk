import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.AboutActivity;
import com.tencent.mobileqq.config.AboutConfig;
import com.tencent.mobileqq.data.ResourcePluginInfo;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.widget.FormSimpleItem;

public class rcv
  implements View.OnClickListener
{
  public rcv(AboutActivity paramAboutActivity, ResourcePluginInfo paramResourcePluginInfo, FormSimpleItem paramFormSimpleItem) {}
  
  public void onClick(View paramView)
  {
    AboutConfig.a(this.jdField_a_of_type_ComTencentMobileqqActivityAboutActivity.app, this.jdField_a_of_type_ComTencentMobileqqActivityAboutActivity, this.jdField_a_of_type_ComTencentMobileqqDataResourcePluginInfo);
    if (this.jdField_a_of_type_ComTencentMobileqqDataResourcePluginInfo.strPkgName.equals("com.tencent.Feedback_5_8")) {
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityAboutActivity.app, "CliOper", "", "", "0X8005742", "0X8005742", 0, 0, "", "", "", "");
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetFormSimpleItem.setRightIcon(null);
      return;
      if (this.jdField_a_of_type_ComTencentMobileqqDataResourcePluginInfo.strPkgName.equals("com.tencent.help_5_8")) {
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityAboutActivity.app, "CliOper", "", "", "0X8005741", "0X8005741", 0, 0, "", "", "", "");
      } else if (this.jdField_a_of_type_ComTencentMobileqqDataResourcePluginInfo.strPkgName.equals("com.tx.aboutfunction")) {
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityAboutActivity.app, "CliOper", "", "", "0X8005744", "0X8005744", 0, 0, "", "", "", "");
      } else if (this.jdField_a_of_type_ComTencentMobileqqDataResourcePluginInfo.strPkgName.equals("com.tx.aboutimage")) {
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityAboutActivity.app, "CliOper", "", "", "0X8005743", "0X8005743", 0, 0, "", "", "", "");
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rcv
 * JD-Core Version:    0.7.0.1
 */