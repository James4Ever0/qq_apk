import android.net.Uri;
import com.tencent.biz.webviewbase.AbsBaseWebViewActivity;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebView;

public class oys
  extends ozb
{
  public oys(AbsBaseWebViewActivity paramAbsBaseWebViewActivity)
  {
    super(paramAbsBaseWebViewActivity, null);
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    return a(paramWebView, paramWebResourceRequest.getUrl().toString());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     oys
 * JD-Core Version:    0.7.0.1
 */