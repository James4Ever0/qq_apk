import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.av.ui.AVActivity;
import com.tencent.av.ui.BeautySettingUi;
import com.tencent.av.utils.UITools;

public class jst
  implements DialogInterface.OnClickListener
{
  public jst(BeautySettingUi paramBeautySettingUi, AVActivity paramAVActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    UITools.a(this.jdField_a_of_type_ComTencentAvUiAVActivity);
    paramDialogInterface.dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     jst
 * JD-Core Version:    0.7.0.1
 */