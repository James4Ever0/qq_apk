import android.os.Handler;
import com.tencent.biz.common.util.OpenIdObserver;
import com.tencent.mobileqq.activity.AddFriendLogicActivity;
import com.tencent.mobileqq.data.OpenID;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.qphone.base.util.QLog;

public class rii
  extends OpenIdObserver
{
  public rii(AddFriendLogicActivity paramAddFriendLogicActivity) {}
  
  protected void a(boolean paramBoolean, OpenID paramOpenID)
  {
    if ((this.a.isFinishing()) || (this.a.jdField_a_of_type_Boolean)) {}
    do
    {
      do
      {
        return;
        AddFriendLogicActivity.a(this.a).hide();
        if (this.a.jdField_a_of_type_AndroidOsHandler != null) {
          this.a.jdField_a_of_type_AndroidOsHandler.removeCallbacksAndMessages(null);
        }
        if ((!paramBoolean) || (paramOpenID == null) || (paramOpenID.openID == null)) {
          break;
        }
        if (QLog.isColorLevel()) {
          QLog.d("qqBaseActivity", 2, "openIdObserver success");
        }
      } while (paramOpenID.openID.equals(AddFriendLogicActivity.jdField_a_of_type_JavaLangString));
      this.a.a();
      return;
    } while (!QLog.isColorLevel());
    QLog.d("qqBaseActivity", 2, "openIdObserver fail");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rii
 * JD-Core Version:    0.7.0.1
 */