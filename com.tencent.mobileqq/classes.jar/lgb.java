import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyNewFeedsActivity;
import com.tencent.biz.pubaccount.readinjoy.skin.ReadInJoySkinHandler.ReadInJoySkinObserver;
import com.tencent.mobileqq.app.ThreadManager;
import tencent.im.oidb.cmd0x5bd.oidb_0x5bd.GuideInfo;
import tencent.im.oidb.cmd0x5bd.oidb_0x5bd.RefreshInfo;
import tencent.im.oidb.cmd0x5bd.oidb_0x5bd.SkinInfo;

public class lgb
  extends ReadInJoySkinHandler.ReadInJoySkinObserver
{
  public lgb(ReadInJoyNewFeedsActivity paramReadInJoyNewFeedsActivity) {}
  
  public void a(boolean paramBoolean, oidb_0x5bd.SkinInfo paramSkinInfo, oidb_0x5bd.GuideInfo paramGuideInfo1, oidb_0x5bd.GuideInfo paramGuideInfo2, oidb_0x5bd.RefreshInfo paramRefreshInfo)
  {
    if (paramBoolean) {
      ThreadManager.post(new lgc(this, paramGuideInfo2, paramRefreshInfo, paramSkinInfo, paramGuideInfo1), 5, null, true);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lgb
 * JD-Core Version:    0.7.0.1
 */