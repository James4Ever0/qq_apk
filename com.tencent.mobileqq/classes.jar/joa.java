import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.tencent.av.redpacket.ui.RedPacketShareFragment;
import com.tencent.biz.qrcode.util.QRUtils;
import com.tencent.mobileqq.filemanager.data.ForwardFileInfo;
import com.tencent.mobileqq.forward.ForwardBaseOption;

class joa
  implements Runnable
{
  joa(jnz paramjnz, String paramString) {}
  
  public void run()
  {
    if ((this.jdField_a_of_type_Jnz.a.getActivity() == null) || (this.jdField_a_of_type_Jnz.a.getActivity().isFinishing())) {
      return;
    }
    if (TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString))
    {
      RedPacketShareFragment.a(this.jdField_a_of_type_Jnz.a);
      QRUtils.a(1, 2131430006);
      return;
    }
    this.jdField_a_of_type_Jnz.a.a(false);
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("forward_type", 1);
    ((Bundle)localObject).putString("forward_filepath", this.jdField_a_of_type_JavaLangString);
    ((Bundle)localObject).putString("forward_thumb", this.jdField_a_of_type_JavaLangString);
    ((Bundle)localObject).putString("forward_urldrawable_big_url", this.jdField_a_of_type_JavaLangString);
    ((Bundle)localObject).putString("forward_extra", this.jdField_a_of_type_JavaLangString);
    ((Bundle)localObject).putInt(ForwardBaseOption.e, 1);
    Intent localIntent = new Intent();
    localIntent.putExtra("isFromShare", false);
    localIntent.putExtras((Bundle)localObject);
    localObject = new ForwardFileInfo();
    ((ForwardFileInfo)localObject).b(10012);
    localIntent.putExtra("fileinfo", (Parcelable)localObject);
    ForwardBaseOption.a(this.jdField_a_of_type_Jnz.a.getActivity(), localIntent, 21);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     joa
 * JD-Core Version:    0.7.0.1
 */