import com.tencent.biz.pubaccount.PublicAccountManager;
import com.tencent.mobileqq.app.LBSHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import java.lang.ref.WeakReference;
import mqq.observer.BusinessObserver;

public class om
  implements Runnable
{
  public om(PublicAccountManager paramPublicAccountManager) {}
  
  public void run()
  {
    QQAppInterface localQQAppInterface = (QQAppInterface)this.a.jdField_a_of_type_JavaLangRefWeakReference.get();
    if ((this.a.jdField_a_of_type_AndroidContentContext != null) && (localQQAppInterface != null))
    {
      localQQAppInterface.a(this.a.jdField_a_of_type_ComTencentMobileqqAppLBSObserver);
      arrayOfByte = localQQAppInterface.b();
      ((LBSHandler)localQQAppInterface.a(3)).a(arrayOfByte);
    }
    while (localQQAppInterface == null)
    {
      byte[] arrayOfByte;
      return;
    }
    this.a.a(this.a.jdField_a_of_type_AndroidContentContext, localQQAppInterface, this.a.q, this.a.r, false, 0.0D, 0.0D, (BusinessObserver)PublicAccountManager.a(this.a).get());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     om
 * JD-Core Version:    0.7.0.1
 */