import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.pubaccount.AccountDetail.activity.EqqAccountDetailActivity;
import com.tencent.biz.pubaccount.PaConfigAttr.PaConfigInfo;
import com.tencent.mobileqq.activity.QQMapActivity;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;

public class kpf
  implements View.OnClickListener
{
  public kpf(EqqAccountDetailActivity paramEqqAccountDetailActivity, PaConfigAttr.PaConfigInfo paramPaConfigInfo, String paramString) {}
  
  public void onClick(View paramView)
  {
    if ((TextUtils.isEmpty(this.jdField_a_of_type_ComTencentBizPubaccountPaConfigAttr$PaConfigInfo.g)) || (TextUtils.isEmpty(this.jdField_a_of_type_ComTencentBizPubaccountPaConfigAttr$PaConfigInfo.f)))
    {
      if (QLog.isColorLevel()) {
        QLog.d(this.jdField_a_of_type_ComTencentBizPubaccountAccountDetailActivityEqqAccountDetailActivity.jdField_a_of_type_JavaLangString, 2, "buildMapItemForEqq no lat or lng");
      }
      return;
    }
    paramView = new Intent(this.jdField_a_of_type_ComTencentBizPubaccountAccountDetailActivityEqqAccountDetailActivity, QQMapActivity.class);
    paramView.putExtra("lat", this.jdField_a_of_type_ComTencentBizPubaccountPaConfigAttr$PaConfigInfo.g);
    paramView.putExtra("lon", this.jdField_a_of_type_ComTencentBizPubaccountPaConfigAttr$PaConfigInfo.f);
    if (!TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString)) {
      paramView.putExtra("loc", this.jdField_a_of_type_JavaLangString);
    }
    this.jdField_a_of_type_ComTencentBizPubaccountAccountDetailActivityEqqAccountDetailActivity.startActivity(paramView);
    ReportController.b(EqqAccountDetailActivity.h(this.jdField_a_of_type_ComTencentBizPubaccountAccountDetailActivityEqqAccountDetailActivity), "CliOper", "", "", "Biz_card", "Biz_card_map", 0, 0, EqqAccountDetailActivity.h(this.jdField_a_of_type_ComTencentBizPubaccountAccountDetailActivityEqqAccountDetailActivity), "", "", "");
    EqqAccountDetailActivity.c(this.jdField_a_of_type_ComTencentBizPubaccountAccountDetailActivityEqqAccountDetailActivity, this.jdField_a_of_type_ComTencentBizPubaccountPaConfigAttr$PaConfigInfo.jdField_a_of_type_JavaLangString);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kpf
 * JD-Core Version:    0.7.0.1
 */