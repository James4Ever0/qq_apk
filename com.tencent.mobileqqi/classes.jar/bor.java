import android.widget.ImageView;
import com.tencent.biz.eqq.EnterpriseDetailActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.EqqDetail;

public class bor
  extends FriendListObserver
{
  public bor(EnterpriseDetailActivity paramEnterpriseDetailActivity) {}
  
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


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     bor
 * JD-Core Version:    0.7.0.1
 */