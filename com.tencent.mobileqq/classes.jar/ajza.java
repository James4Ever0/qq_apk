import android.view.View;
import com.tencent.biz.ui.TouchWebView;
import com.tencent.mobileqq.webview.swift.WebViewFragment;
import com.tencent.qphone.base.util.QLog;

public class ajza
  implements Runnable
{
  public ajza(WebViewFragment paramWebViewFragment, int paramInt) {}
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d("WebLog_WebViewFragment", 2, "banner scroll to " + this.jdField_a_of_type_Int + " !");
    }
    if (!this.jdField_a_of_type_ComTencentMobileqqWebviewSwiftWebViewFragment.a.a) {
      this.jdField_a_of_type_ComTencentMobileqqWebviewSwiftWebViewFragment.a.getView().scrollTo(0, this.jdField_a_of_type_Int);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     ajza
 * JD-Core Version:    0.7.0.1
 */