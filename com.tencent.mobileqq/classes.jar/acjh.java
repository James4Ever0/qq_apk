import android.os.Bundle;
import com.tencent.mobileqq.emosm.web.MessengerService;
import com.tencent.mobileqq.vas.VasQuickUpdateManager;
import com.tencent.mobileqq.vas.VasQuickUpdateManager.CallBacker;
import java.lang.ref.WeakReference;

class acjh
  extends VasQuickUpdateManager.CallBacker
{
  acjh(acjg paramacjg) {}
  
  public void callback(long paramLong, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, VasQuickUpdateManager paramVasQuickUpdateManager)
  {
    if ((paramLong == 15L) && (paramString1.startsWith("card.")))
    {
      paramString1 = new Bundle();
      if ((this != null) && (this.a.a.get() != null)) {
        break label43;
      }
    }
    label43:
    do
    {
      return;
      paramString2 = (MessengerService)this.a.a.get();
    } while (paramString2.d == null);
    paramString2.d.putString("cmd", "card_download");
    paramString1.putInt("result", paramInt1);
    paramString1.putString("message", paramString3);
    paramString2.d.putBundle("response", paramString1);
    paramString2.a(paramString2.d);
    paramString2.d = null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acjh
 * JD-Core Version:    0.7.0.1
 */