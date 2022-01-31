import android.os.Handler;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.ChatSettingForTroop;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.troop.widget.AvatarWallViewPagerAdapter;
import com.tencent.mobileqq.troopinfo.TroopInfoData;
import com.tencent.mobileqq.widget.QQToast;
import java.util.Map;

public class sdq
  extends FriendListObserver
{
  public sdq(ChatSettingForTroop paramChatSettingForTroop) {}
  
  protected void onSetGenralSettingsTroopFilter(boolean paramBoolean, Map paramMap)
  {
    super.onSetGenralSettingsTroopFilter(paramBoolean, paramMap);
    if ((paramMap == null) || (this.a.jdField_a_of_type_ComTencentMobileqqDataTroopInfo == null)) {
      return;
    }
    if (!paramBoolean) {
      if (paramMap.get(this.a.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopuin) != null) {
        QQToast.a(this.a.app.getApp(), 1, this.a.getString(2131434514), 0).b(this.a.getTitleBarHeight());
      }
    }
    for (;;)
    {
      this.a.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(18);
      return;
      paramMap = (Integer)paramMap.get(this.a.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopuin);
      if (paramMap != null) {
        this.a.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopmask = paramMap.intValue();
      }
    }
  }
  
  protected void onUpdateCustomHead(boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) && (!TextUtils.isEmpty(paramString))) {}
    try
    {
      l = Long.valueOf(paramString).longValue();
      if (l != 0L)
      {
        this.a.a(l);
        this.a.b(l);
      }
      return;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        long l = 0L;
      }
    }
  }
  
  protected void onUpdateTroopHead(boolean paramBoolean, String paramString)
  {
    if (this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData == null) {}
    while ((!paramBoolean) || (!paramString.equals(this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopUin))) {
      return;
    }
    this.a.jdField_a_of_type_ComTencentMobileqqTroopWidgetAvatarWallViewPagerAdapter.notifyDataSetChanged();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sdq
 * JD-Core Version:    0.7.0.1
 */