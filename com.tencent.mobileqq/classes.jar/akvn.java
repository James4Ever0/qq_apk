import android.net.Uri;
import com.tencent.mobileqq.webview.swift.WebViewWrapper;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebView;

public class akvn
  extends akvq
{
  public akvn(WebViewWrapper paramWebViewWrapper)
  {
    super(paramWebViewWrapper);
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    return a(paramWebView, paramWebResourceRequest.getUrl().toString());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     akvn
 * JD-Core Version:    0.7.0.1
 */