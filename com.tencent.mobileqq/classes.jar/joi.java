import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.tencent.av.redpacket.ui.RedPacketShareFragment;
import com.tencent.biz.qrcode.util.QRUtils;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.widget.QQToast;

class joi
  implements Runnable
{
  joi(joh paramjoh, boolean paramBoolean, String paramString) {}
  
  public void run()
  {
    if (this.jdField_a_of_type_Joh.a.getActivity() == null) {
      return;
    }
    if (this.jdField_a_of_type_Boolean)
    {
      Intent localIntent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
      localIntent.setData(Uri.parse("file://" + this.jdField_a_of_type_JavaLangString));
      this.jdField_a_of_type_Joh.a.getActivity().sendBroadcast(localIntent);
      QQToast.a(BaseApplicationImpl.getContext(), 2, this.jdField_a_of_type_Joh.a.getString(2131430003, new Object[] { this.jdField_a_of_type_JavaLangString }), 1).b(this.jdField_a_of_type_Joh.a.getActivity().getTitleBarHeight());
    }
    for (;;)
    {
      this.jdField_a_of_type_Joh.a.jdField_a_of_type_Boolean = true;
      this.jdField_a_of_type_Joh.a.b = true;
      return;
      QRUtils.a(1, 2131430004);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     joi
 * JD-Core Version:    0.7.0.1
 */