import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.tencent.mobileqq.activity.phone.ContactListView;

public class cgq
  implements DialogInterface.OnDismissListener
{
  public cgq(ContactListView paramContactListView, int paramInt, TranslateAnimation paramTranslateAnimation) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityPhoneContactListView.b.offsetTopAndBottom(-this.jdField_a_of_type_Int);
    this.jdField_a_of_type_ComTencentMobileqqActivityPhoneContactListView.a.setVisibility(0);
    this.jdField_a_of_type_ComTencentMobileqqActivityPhoneContactListView.b.startAnimation(this.jdField_a_of_type_AndroidViewAnimationTranslateAnimation);
    ContactListView.a(this.jdField_a_of_type_ComTencentMobileqqActivityPhoneContactListView, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     cgq
 * JD-Core Version:    0.7.0.1
 */