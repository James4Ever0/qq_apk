import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpic.HotPicPageView.MyVideoViewHolder;
import com.tencent.qphone.base.util.QLog;

class adgj
  implements DialogInterface.OnClickListener
{
  adgj(adgi paramadgi) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a.jdField_a_of_type_ComTencentMobileqqHotpicHotPicPageView.d = false;
    if (this.a.a.jdField_a_of_type_ComTencentMobileqqHotpicHotPicPageView$MyVideoViewHolder.a == 1) {
      this.a.a.jdField_a_of_type_ComTencentMobileqqHotpicHotPicPageView$MyVideoViewHolder.a(0);
    }
    QLog.d("HotPicManagerHotPicPageView", 2, "user click button");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     adgj
 * JD-Core Version:    0.7.0.1
 */