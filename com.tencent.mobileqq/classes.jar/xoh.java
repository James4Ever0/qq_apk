import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mobileqq.activity.richmedia.EditLocalVideoActivity;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import cooperation.qzone.QZoneHelper;
import cooperation.qzone.RDMEtraMsgCollector;
import cooperation.qzone.remote.logic.RemoteHandleManager;

public class xoh
  implements ActionSheet.OnButtonClickListener
{
  public xoh(EditLocalVideoActivity paramEditLocalVideoActivity, Bundle paramBundle) {}
  
  public void OnClick(View paramView, int paramInt)
  {
    paramView = new StringBuilder();
    paramView.append("[Actvity]").append(getClass().getSimpleName()).append(" QQCustomDialog click :").append("立即上传");
    RDMEtraMsgCollector.a().c(paramView.toString());
    EditLocalVideoActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity).dismiss();
    if (EditLocalVideoActivity.c(this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity) == 0) {
      RemoteHandleManager.a().a("cmd.publishVideoMood", this.jdField_a_of_type_AndroidOsBundle, false);
    }
    for (;;)
    {
      if (EditLocalVideoActivity.c(this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity) == 0) {
        this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity.setResult(-1);
      }
      this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity.finish();
      return;
      if (EditLocalVideoActivity.c(this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity) == 1)
      {
        paramView = new Intent(this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity.getIntent());
        paramView.putExtras(this.jdField_a_of_type_AndroidOsBundle);
        String str = paramView.getStringExtra("PhotoConst.PLUGIN_APK");
        boolean bool = paramView.getBooleanExtra("DirectBackToQzone", false);
        if (("qzone_plugin.apk".equals(str)) && (bool))
        {
          paramView.setFlags(603979776);
          QZoneHelper.a(this.jdField_a_of_type_ComTencentMobileqqActivityRichmediaEditLocalVideoActivity, "", paramView, -1);
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xoh
 * JD-Core Version:    0.7.0.1
 */