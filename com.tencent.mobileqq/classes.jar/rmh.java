import android.view.View;
import com.tencent.mobileqq.activity.AssociatedAccountActivity;
import com.tencent.mobileqq.widget.PullRefreshHeader;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ListView;
import com.tencent.widget.OverScrollViewListener;
import mqq.os.MqqHandler;

public class rmh
  implements OverScrollViewListener
{
  public rmh(AssociatedAccountActivity paramAssociatedAccountActivity) {}
  
  public void a(int paramInt, View paramView, ListView paramListView)
  {
    if (this.a.jdField_a_of_type_Boolean)
    {
      this.a.jdField_a_of_type_ComTencentMobileqqWidgetPullRefreshHeader.Y_();
      return;
    }
    this.a.jdField_a_of_type_ComTencentMobileqqWidgetPullRefreshHeader.c(0L);
  }
  
  public boolean a(int paramInt, View paramView, ListView paramListView)
  {
    if (this.a.jdField_a_of_type_Boolean) {
      return true;
    }
    if (QLog.isColorLevel()) {
      QLog.d("AssociatedAccountActivity", 2, "onViewCompleteVisableAndReleased begin refresh");
    }
    if (this.a.b())
    {
      this.a.jdField_a_of_type_ComTencentMobileqqWidgetPullRefreshHeader.a(0L);
      this.a.b = true;
      AssociatedAccountActivity.b(this.a, false, true);
      return true;
    }
    this.a.jdField_a_of_type_ComTencentMobileqqWidgetPullRefreshHeader.a(1);
    this.a.jdField_a_of_type_MqqOsMqqHandler.postDelayed(new rmi(this), 800L);
    return true;
  }
  
  public void b(int paramInt, View paramView, ListView paramListView)
  {
    if (this.a.jdField_a_of_type_Boolean) {
      return;
    }
    this.a.jdField_a_of_type_ComTencentMobileqqWidgetPullRefreshHeader.b(0L);
  }
  
  public void c(int paramInt, View paramView, ListView paramListView) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rmh
 * JD-Core Version:    0.7.0.1
 */