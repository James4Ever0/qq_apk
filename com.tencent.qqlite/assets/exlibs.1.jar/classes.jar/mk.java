import android.widget.ImageView;
import com.tencent.biz.eqq.EnterpriseDetailActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.EqqDetail;

public class mk
  extends FriendListObserver
{
  public mk(EnterpriseDetailActivity paramEnterpriseDetailActivity) {}
  
  protected void a(boolean paramBoolean, Object paramObject)
  {
    if ((paramBoolean) && (this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail != null) && ((paramObject + "").equals(this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.uin))) {
      EnterpriseDetailActivity.d(this.a);
    }
  }
  
  protected void a(boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) && (paramString.equals(this.a.b))) {
      this.a.jdField_a_of_type_AndroidWidgetImageView.setBackgroundDrawable(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.b(paramString));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     mk
 * JD-Core Version:    0.7.0.1
 */