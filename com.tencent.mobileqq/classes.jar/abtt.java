import android.os.Bundle;
import com.tencent.gdtad.net.GdtAdObserver;
import com.tencent.mobileqq.emosm.web.MessengerService;
import com.tencent.mobileqq.util.JSONUtils;
import org.json.JSONObject;

public class abtt
  extends GdtAdObserver
{
  public abtt(MessengerService paramMessengerService) {}
  
  public void a(Object paramObject)
  {
    if (this.a.a != null)
    {
      this.a.a.putString("data", JSONUtils.a(paramObject).toString());
      this.a.a(this.a.a);
      this.a.a = null;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abtt
 * JD-Core Version:    0.7.0.1
 */