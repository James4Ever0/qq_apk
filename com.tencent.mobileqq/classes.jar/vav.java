import com.tencent.mobileqq.activity.aio.item.QQWalletMsgItemBuilder;
import com.tencent.qphone.base.util.QLog;
import cooperation.qwallet.plugin.QWalletHelper;

public class vav
  implements Runnable
{
  public vav(QQWalletMsgItemBuilder paramQQWalletMsgItemBuilder, int paramInt) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityAioItemQQWalletMsgItemBuilder.jdField_a_of_type_AndroidContentContext == null) {}
    while (QWalletHelper.isQWalletProcessExist(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemQQWalletMsgItemBuilder.jdField_a_of_type_AndroidContentContext)) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d(QQWalletMsgItemBuilder.jdField_a_of_type_JavaLangString, 2, "preload qwallet process by qqWalletMsg isTroop=" + this.jdField_a_of_type_Int);
    }
    QWalletHelper.preloadQWallet(this.jdField_a_of_type_ComTencentMobileqqActivityAioItemQQWalletMsgItemBuilder.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, 0, "qwallet_red");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vav
 * JD-Core Version:    0.7.0.1
 */