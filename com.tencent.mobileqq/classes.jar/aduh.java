import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.activity.DirectForwardActivity;
import com.tencent.mobileqq.forward.ForwardSdkShareOption;

public class aduh
  implements DialogInterface.OnDismissListener
{
  public aduh(ForwardSdkShareOption paramForwardSdkShareOption) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((this.a.a instanceof DirectForwardActivity)) {
      this.a.a.finish();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aduh
 * JD-Core Version:    0.7.0.1
 */