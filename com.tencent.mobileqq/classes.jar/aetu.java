import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.mobileqq.nearby.ImgDownloadListener;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;

public class aetu
  implements Runnable
{
  public aetu(ImgDownloadListener paramImgDownloadListener, int paramInt) {}
  
  public void run()
  {
    long l = SystemClock.elapsedRealtime() - ImgDownloadListener.a(this.jdField_a_of_type_ComTencentMobileqqNearbyImgDownloadListener);
    Object localObject2 = NetworkUtil.a(ImgDownloadListener.a(this.jdField_a_of_type_ComTencentMobileqqNearbyImgDownloadListener));
    Object localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = "wifi";
    }
    localObject2 = new HashMap();
    ((HashMap)localObject2).put("errorCode", String.valueOf(this.jdField_a_of_type_Int));
    ((HashMap)localObject2).put("costTime", String.valueOf(l));
    ((HashMap)localObject2).put("apn", localObject1);
    ((HashMap)localObject2).put("param_NetType", NetworkUtil.a(null) + "");
    StatisticCollector.a(ImgDownloadListener.a(this.jdField_a_of_type_ComTencentMobileqqNearbyImgDownloadListener)).a("", ImgDownloadListener.a(this.jdField_a_of_type_ComTencentMobileqqNearbyImgDownloadListener), false, l, 0L, (HashMap)localObject2, "", true);
    if (QLog.isColorLevel()) {
      QLog.d("ImgDownloadListener", 2, "onFileDownloadFailed, errorCode=" + this.jdField_a_of_type_Int);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aetu
 * JD-Core Version:    0.7.0.1
 */