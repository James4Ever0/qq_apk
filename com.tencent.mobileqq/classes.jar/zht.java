import com.tencent.biz.pubaccount.Advertisement.manager.AdvertisementVideoPreloadManager;
import com.tencent.mobileqq.app.QQAppInterface;

public class zht
  implements Runnable
{
  public zht(QQAppInterface paramQQAppInterface) {}
  
  public void run()
  {
    AdvertisementVideoPreloadManager localAdvertisementVideoPreloadManager = (AdvertisementVideoPreloadManager)this.a.getManager(237);
    if (localAdvertisementVideoPreloadManager != null) {
      localAdvertisementVideoPreloadManager.a(1);
    }
    this.a.D();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zht
 * JD-Core Version:    0.7.0.1
 */