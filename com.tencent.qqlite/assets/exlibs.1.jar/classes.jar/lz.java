import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.eqq.EnterpriseDetailActivity;
import com.tencent.mobileqq.activity.QQMapActivity;
import com.tencent.mobileqq.data.EqqDetail;
import com.tencent.mobileqq.statistics.ReportController;

public class lz
  implements View.OnClickListener
{
  public lz(EnterpriseDetailActivity paramEnterpriseDetailActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, QQMapActivity.class);
    paramView.putExtra("lat", this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.latitude);
    paramView.putExtra("lon", this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.longitude);
    this.a.startActivity(paramView);
    ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "Biz_card", "Biz_card_map", 0, 0, this.a.b, "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     lz
 * JD-Core Version:    0.7.0.1
 */