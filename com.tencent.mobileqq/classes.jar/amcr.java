import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import cooperation.qzone.LocalMultiProcConfig;

public final class amcr
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (LocalMultiProcConfig.getBool("qz_safe_mode_no_tip", false)) {
      LocalMultiProcConfig.putBool("comboqz_protect_enable", false);
    }
    paramDialogInterface.dismiss();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amcr
 * JD-Core Version:    0.7.0.1
 */