import com.tencent.mobileqq.msf.sdk.handler.INetInfoHandler;
import com.tencent.mobileqq.shortvideo.ShortVideoResourceManager;

public class aief
  implements INetInfoHandler
{
  public aief(ShortVideoResourceManager paramShortVideoResourceManager) {}
  
  public void onNetMobile2None()
  {
    ShortVideoResourceManager.a(this.a);
  }
  
  public void onNetMobile2Wifi(String paramString) {}
  
  public void onNetNone2Mobile(String paramString) {}
  
  public void onNetNone2Wifi(String paramString) {}
  
  public void onNetWifi2Mobile(String paramString) {}
  
  public void onNetWifi2None()
  {
    ShortVideoResourceManager.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     aief
 * JD-Core Version:    0.7.0.1
 */