import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import com.tencent.biz.pubaccount.readinjoy.view.pullrefresh.ReadInJoySkinAnimManager;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;

public class mrd
  implements SoundPool.OnLoadCompleteListener
{
  public mrd(ReadInJoySkinAnimManager paramReadInJoySkinAnimManager, long paramLong) {}
  
  public void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2)
  {
    long l = System.currentTimeMillis();
    if (QLog.isColorLevel()) {
      QLog.d("ReadInJoySkinAnimManager", 1, "setSoundPool onLoadComplete time = " + (l - this.jdField_a_of_type_Long));
    }
    ReportController.b(null, "dc00899", "BizTechReport", "", "kan_dian_skin_pull_refresh", "sound_load_time", 0, 0, ReadInJoySkinAnimManager.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewPullrefreshReadInJoySkinAnimManager), String.valueOf(l - this.jdField_a_of_type_Long), null, null);
    ReadInJoySkinAnimManager.a(this.jdField_a_of_type_ComTencentBizPubaccountReadinjoyViewPullrefreshReadInJoySkinAnimManager, true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mrd
 * JD-Core Version:    0.7.0.1
 */