import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.nearby.NearbyUtils;
import com.tencent.mobileqq.nearby.now.view.ShortVideoCommentsView;
import com.tencent.qphone.base.util.QLog;

public class afca
  implements DialogInterface.OnClickListener
{
  public afca(ShortVideoCommentsView paramShortVideoCommentsView, Activity paramActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    NearbyUtils.a(this.jdField_a_of_type_AndroidAppActivity, 302);
    if (QLog.isColorLevel()) {
      QLog.d("nearby.bindphone", 2, "openBindPhonePage");
    }
    this.jdField_a_of_type_ComTencentMobileqqNearbyNowViewShortVideoCommentsView.a(this.jdField_a_of_type_ComTencentMobileqqNearbyNowViewShortVideoCommentsView.a, "playpage_phone_clk");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     afca
 * JD-Core Version:    0.7.0.1
 */