import android.os.Bundle;
import com.tencent.biz.pubaccount.CustomWebView;
import com.tencent.mobileqq.webview.swift.component.SwiftBrowserCookieMonster.SetCookiesCallback;

public class kwl
  implements SwiftBrowserCookieMonster.SetCookiesCallback
{
  public kwl(CustomWebView paramCustomWebView, kwp paramkwp) {}
  
  public void a(String paramString, Bundle paramBundle, long paramLong)
  {
    switch (this.jdField_a_of_type_Kwp.a)
    {
    default: 
      return;
    case 1: 
      this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.loadUrl(paramString);
      return;
    case 2: 
      this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.a(paramString);
      return;
    case 3: 
      this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.loadData(paramString, this.jdField_a_of_type_Kwp.c, this.jdField_a_of_type_Kwp.d);
      return;
    }
    this.jdField_a_of_type_ComTencentBizPubaccountCustomWebView.loadDataWithBaseURL(paramString, this.jdField_a_of_type_Kwp.b, this.jdField_a_of_type_Kwp.c, this.jdField_a_of_type_Kwp.d, this.jdField_a_of_type_Kwp.e);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kwl
 * JD-Core Version:    0.7.0.1
 */