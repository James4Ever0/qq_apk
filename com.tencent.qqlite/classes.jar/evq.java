import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.utils.QQUtils;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.BaseApplication;

public final class evq
  implements Runnable
{
  public evq(QQAppInterface paramQQAppInterface, String paramString, int paramInt) {}
  
  public void run()
  {
    String str = null;
    if (QQUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), new String[] { this.jdField_a_of_type_JavaLangString })) {
      str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getString(2131363665);
    }
    if (str != null) {
      QQToast.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), 2, str, 0).b(this.jdField_a_of_type_Int);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     evq
 * JD-Core Version:    0.7.0.1
 */