import com.tencent.biz.pubaccount.AccountDetail.model.AccountDetailVideoManager;
import com.tencent.biz.pubaccount.AccountDetail.model.AccountDetailVideoManager.OnVideoPlayListener;
import com.tencent.qphone.base.util.QLog;

class kqz
  implements Runnable
{
  kqz(kqy paramkqy) {}
  
  public void run()
  {
    if (this.a.a.a.a != null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("AccountDetailVideoManager", 2, "onPlayStart time=" + System.currentTimeMillis());
      }
      this.a.a.a.a.f();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kqz
 * JD-Core Version:    0.7.0.1
 */