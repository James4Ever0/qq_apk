import android.app.Activity;
import com.tencent.gdtad.jsbridge.GdtAdWebPlugin;
import com.tencent.gdtad.jsbridge.GdtJsCallHandler;
import com.tencent.gdtad.log.GdtLog;
import com.tencent.gdtad.net.GdtNetUtil;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import org.json.JSONException;
import org.json.JSONObject;

public class qjf
  implements GdtJsCallHandler
{
  public boolean a(GdtAdWebPlugin paramGdtAdWebPlugin, String paramString, String... paramVarArgs)
  {
    if ((paramGdtAdWebPlugin == null) || (paramGdtAdWebPlugin.mRuntime == null) || (paramGdtAdWebPlugin.mRuntime.a() == null))
    {
      GdtLog.d("GdtNetTypeJsCallHandler", "handleJsCallRequest error");
      return true;
    }
    Activity localActivity = paramGdtAdWebPlugin.mRuntime.a();
    paramVarArgs = new JSONObject();
    try
    {
      paramVarArgs.put("netType", GdtNetUtil.a(localActivity));
      try
      {
        paramGdtAdWebPlugin.callJs(paramString, new String[] { paramVarArgs.toString() });
        return true;
      }
      catch (Throwable paramGdtAdWebPlugin)
      {
        GdtLog.d("GdtNetTypeJsCallHandler", "handleJsCallRequest error", paramGdtAdWebPlugin);
        return true;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        GdtLog.d("GdtNetTypeJsCallHandler", "handleJsCallRequest error", localJSONException);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     qjf
 * JD-Core Version:    0.7.0.1
 */