import com.tencent.biz.pubaccount.readinjoy.ReadInJoyNaviController;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyNewBaseActivity;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyNewFeedsActivity;
import com.tencent.biz.pubaccount.readinjoy.view.ReadInJoyNavigationGridview.NaviMaskTouchListener;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;

public class leo
  implements ReadInJoyNavigationGridview.NaviMaskTouchListener
{
  private WeakReference a;
  
  public leo(ReadInJoyNewBaseActivity paramReadInJoyNewBaseActivity)
  {
    this.a = new WeakReference(paramReadInJoyNewBaseActivity);
  }
  
  public void a()
  {
    ReadInJoyNewFeedsActivity localReadInJoyNewFeedsActivity = (ReadInJoyNewFeedsActivity)this.a.get();
    if (localReadInJoyNewFeedsActivity == null) {
      if (QLog.isColorLevel()) {
        QLog.d("ReadInJoyNewFeedsActivity", 2, "NaviMaskTouchListenerImpl. activity has destoryed");
      }
    }
    while ((ReadInJoyNewFeedsActivity.a(localReadInJoyNewFeedsActivity) != 0) || (localReadInJoyNewFeedsActivity.a == null)) {
      return;
    }
    localReadInJoyNewFeedsActivity.a.a(null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     leo
 * JD-Core Version:    0.7.0.1
 */