import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import cooperation.smartdevice.SmartDevicePluginLoader;

public class amof
  implements DialogInterface.OnDismissListener
{
  public amof(SmartDevicePluginLoader paramSmartDevicePluginLoader, DialogInterface.OnDismissListener paramOnDismissListener) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (this.jdField_a_of_type_AndroidContentDialogInterface$OnDismissListener != null) {
      this.jdField_a_of_type_AndroidContentDialogInterface$OnDismissListener.onDismiss(paramDialogInterface);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     amof
 * JD-Core Version:    0.7.0.1
 */