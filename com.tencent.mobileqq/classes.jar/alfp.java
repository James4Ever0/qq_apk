import com.tencent.open.business.base.OpenConfig;
import org.json.JSONException;
import org.json.JSONObject;

public class alfp
  implements Runnable
{
  public alfp(OpenConfig paramOpenConfig) {}
  
  public void run()
  {
    String str = this.a.a("com.tencent.open.config.json");
    try
    {
      this.a.a = new JSONObject(str);
      OpenConfig.a(this.a, true);
      return;
    }
    catch (JSONException localJSONException) {}
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     alfp
 * JD-Core Version:    0.7.0.1
 */