import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.data.Card;
import com.tencent.mobileqq.profile.ProfileCardInfo;
import com.tencent.mobileqq.profile.view.ProfileTagView;
import java.util.List;

public class agwg
  implements Runnable
{
  public agwg(ProfileTagView paramProfileTagView, ProfileCardInfo paramProfileCardInfo) {}
  
  public void run()
  {
    List localList = this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.a.getLabelList();
    this.jdField_a_of_type_ComTencentMobileqqProfileViewProfileTagView.a.runOnUiThread(new agwh(this, localList));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     agwg
 * JD-Core Version:    0.7.0.1
 */