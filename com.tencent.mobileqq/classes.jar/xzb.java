import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.mobileqq.activity.selectmember.TroopMemberListInnerFrame;

public class xzb
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public xzb(TroopMemberListInnerFrame paramTroopMemberListInnerFrame, ViewGroup paramViewGroup) {}
  
  public void onGlobalLayout()
  {
    this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    this.jdField_a_of_type_AndroidViewViewGroup.removeView(this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame.b);
    Bitmap localBitmap = TroopMemberListInnerFrame.a(this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame, this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame.b);
    if (localBitmap == null) {}
    do
    {
      return;
      this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame.b.setTag(localBitmap);
    } while (this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame.a == null);
    this.jdField_a_of_type_ComTencentMobileqqActivitySelectmemberTroopMemberListInnerFrame.a.notifyDataSetChanged();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xzb
 * JD-Core Version:    0.7.0.1
 */