import android.app.Activity;
import com.tencent.mobileqq.widget.QQToast;
import cooperation.qzone.QZoneVideoCommonUtils.onForwardVideoActivityFailedListener;
import cooperation.qzone.webviewplugin.personalize.QZoneCoverStoreJsPlugin;

public class andu
  implements QZoneVideoCommonUtils.onForwardVideoActivityFailedListener
{
  public andu(QZoneCoverStoreJsPlugin paramQZoneCoverStoreJsPlugin, int paramInt) {}
  
  public void onFail(Activity paramActivity, String paramString)
  {
    QQToast.a(paramActivity, paramString, 0).b(this.jdField_a_of_type_Int);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     andu
 * JD-Core Version:    0.7.0.1
 */