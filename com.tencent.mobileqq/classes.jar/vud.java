import android.os.Bundle;
import android.os.Handler;
import com.tencent.mobileqq.activity.aio.rebuild.PublicAccountChatPie;
import mqq.observer.BusinessObserver;

public class vud
  implements BusinessObserver
{
  public vud(PublicAccountChatPie paramPublicAccountChatPie) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramInt = paramBundle.getInt("update_type");
      if (paramInt != 2) {}
    }
    else
    {
      return;
    }
    if (paramInt == 1) {}
    this.a.a.sendEmptyMessage(2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vud
 * JD-Core Version:    0.7.0.1
 */