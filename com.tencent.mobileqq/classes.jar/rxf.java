import com.tencent.biz.anonymous.AnonymousChatHelper;
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.panel.AIOPanelUtiles;
import com.tencent.mobileqq.activity.aio.panel.PanelIconLinearLayout;
import com.tencent.mobileqq.activity.aio.photo.PhotoListPanel.ImageCountChangedListener;

public class rxf
  implements PhotoListPanel.ImageCountChangedListener
{
  public rxf(BaseChatPie paramBaseChatPie) {}
  
  public boolean a(int paramInt)
  {
    PanelIconLinearLayout localPanelIconLinearLayout;
    if ((this.a.jdField_a_of_type_ComTencentMobileqqActivityAioPanelPanelIconLinearLayout != null) && (!this.a.G))
    {
      boolean bool = AnonymousChatHelper.a().a(this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.a);
      localPanelIconLinearLayout = this.a.jdField_a_of_type_ComTencentMobileqqActivityAioPanelPanelIconLinearLayout;
      if (!bool) {
        break label63;
      }
    }
    label63:
    for (int[] arrayOfInt = AIOPanelUtiles.h;; arrayOfInt = AIOPanelUtiles.g)
    {
      localPanelIconLinearLayout.a(arrayOfInt, paramInt);
      return false;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rxf
 * JD-Core Version:    0.7.0.1
 */