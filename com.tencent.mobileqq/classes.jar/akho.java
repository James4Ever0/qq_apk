import android.text.TextUtils;
import com.tencent.biz.troop.feeds.TroopNewGuidePopWindow;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.widget.ProfileCardMoreInfoView;

public class akho
  implements Runnable
{
  public akho(ProfileCardMoreInfoView paramProfileCardMoreInfoView) {}
  
  public void run()
  {
    Object localObject = this.a.a();
    if (localObject != null) {}
    for (localObject = "最近发言于" + TroopNewGuidePopWindow.a(((MessageRecord)localObject).time, true, false, true).toString();; localObject = null)
    {
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        this.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.e = ((String)localObject);
      }
      this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.runOnUiThread(new akhp(this));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     akho
 * JD-Core Version:    0.7.0.1
 */