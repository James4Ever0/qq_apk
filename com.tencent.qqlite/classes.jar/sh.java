import android.graphics.Bitmap;
import com.tencent.biz.webviewplugin.Share;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.widget.QQProgressDialog;

class sh
  implements Runnable
{
  sh(sg paramsg, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap) {}
  
  public void run()
  {
    if ((this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.jdField_a_of_type_ComTencentMobileqqActivityQQBrowserActivity.isResume()) && (!this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.jdField_a_of_type_ComTencentMobileqqActivityQQBrowserActivity.isFinishing()))
    {
      if ((this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog != null) && (this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.isShowing())) {
        this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.dismiss();
      }
      this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.a(this.jdField_a_of_type_Sg.jdField_a_of_type_Int, this.jdField_a_of_type_Sg.jdField_a_of_type_ComTencentBizWebviewpluginShare.b, this.jdField_a_of_type_JavaLangString, this.b, this.c, this.jdField_a_of_type_AndroidGraphicsBitmap);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     sh
 * JD-Core Version:    0.7.0.1
 */