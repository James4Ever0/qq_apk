import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mobileqq.activity.MainFragment;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.forward.ForwardSdkBaseOption;

public class adbh
  implements DialogInterface.OnClickListener
{
  public adbh(ForwardSdkBaseOption paramForwardSdkBaseOption) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    com.tencent.mobileqq.app.PhoneContactManagerImp.g = false;
    paramDialogInterface = new Intent(this.a.a, SplashActivity.class);
    paramDialogInterface.putExtra("tab_index", MainFragment.a);
    paramDialogInterface.putExtra("fragment_id", 1);
    paramDialogInterface.setFlags(67108864);
    paramDialogInterface.setFlags(268435456);
    this.a.a.startActivity(paramDialogInterface);
    this.a.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     adbh
 * JD-Core Version:    0.7.0.1
 */