import com.tencent.mobileqq.activity.contacts.fragment.PhoneContactFragment;
import com.tencent.mobileqq.app.PhoneContactManagerImp;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.widget.XListView;

public class wsz
  implements Runnable
{
  public wsz(PhoneContactFragment paramPhoneContactFragment) {}
  
  public void run()
  {
    if (PhoneContactFragment.a(this.a) == null) {
      PhoneContactFragment.a(this.a, (PhoneContactManagerImp)this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(10));
    }
    boolean bool = PhoneContactFragment.a(this.a).f();
    this.a.jdField_a_of_type_ComTencentWidgetXListView.post(new wta(this, bool));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wsz
 * JD-Core Version:    0.7.0.1
 */