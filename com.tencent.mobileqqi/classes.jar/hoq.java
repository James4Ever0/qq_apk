import android.text.TextUtils;
import com.tencent.open.appcommon.js.AppInterface;
import com.tencent.open.appcommon.js.BaseInterface;
import com.tencent.open.base.LogUtility;
import com.tencent.smtt.sdk.WebView;

class hoq
  implements Runnable
{
  hoq(hop paramhop, String paramString) {}
  
  public void run()
  {
    try
    {
      if ((this.jdField_a_of_type_Hop.a.webView != null) && (!TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString))) {
        this.jdField_a_of_type_Hop.a.webView.loadUrl(this.jdField_a_of_type_JavaLangString);
      }
      return;
    }
    catch (Exception localException)
    {
      LogUtility.a(BaseInterface.TAG, "webview loadUrl>>> ", localException);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     hoq
 * JD-Core Version:    0.7.0.1
 */