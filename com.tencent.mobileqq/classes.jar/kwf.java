import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.biz.pubaccount.CustomWebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsResult;

public class kwf
  implements DialogInterface.OnClickListener
{
  public kwf(CustomWebChromeClient paramCustomWebChromeClient, JsResult paramJsResult) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jdField_a_of_type_ComTencentSmttExportExternalInterfacesJsResult.cancel();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kwf
 * JD-Core Version:    0.7.0.1
 */