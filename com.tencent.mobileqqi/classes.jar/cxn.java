import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.LbsBaseActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.BaseApplication;

public class cxn
  implements View.OnClickListener
{
  public cxn(LbsBaseActivity paramLbsBaseActivity, Runnable paramRunnable) {}
  
  public void onClick(View paramView)
  {
    if (NetworkUtil.e(BaseApplication.getContext()))
    {
      this.jdField_a_of_type_JavaLangRunnable.run();
      this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity.b.d(false);
      if ((LbsBaseActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity) != null) && (LbsBaseActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity).isShowing())) {
        LbsBaseActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity).dismiss();
      }
    }
    do
    {
      return;
      this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity.a(1, 2131562451);
    } while ((LbsBaseActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity) == null) || (!LbsBaseActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity).isShowing()));
    LbsBaseActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityLbsBaseActivity).dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     cxn
 * JD-Core Version:    0.7.0.1
 */