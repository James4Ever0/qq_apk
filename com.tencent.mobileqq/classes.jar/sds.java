import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.Conversation;
import com.tencent.mobileqq.activity.recent.cur.DragFrameLayout;
import com.tencent.mobileqq.portal.PortalManager;

public class sds
  implements View.OnClickListener
{
  public sds(Conversation paramConversation, PortalManager paramPortalManager) {}
  
  public void onClick(View paramView)
  {
    Conversation.a(this.jdField_a_of_type_ComTencentMobileqqActivityConversation).removeView(Conversation.a(this.jdField_a_of_type_ComTencentMobileqqActivityConversation));
    if (this.jdField_a_of_type_ComTencentMobileqqPortalPortalManager != null) {
      this.jdField_a_of_type_ComTencentMobileqqPortalPortalManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityConversation.a(), true);
    }
    Conversation.a(this.jdField_a_of_type_ComTencentMobileqqActivityConversation, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sds
 * JD-Core Version:    0.7.0.1
 */