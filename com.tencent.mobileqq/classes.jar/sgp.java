import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.ChatSettingActivity;

public class sgp
  implements DialogInterface.OnClickListener
{
  public sgp(ChatSettingActivity paramChatSettingActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.finish();
    if ((ChatSettingActivity.a(this.a) != null) && (ChatSettingActivity.a(this.a).isShowing())) {
      ChatSettingActivity.a(this.a).dismiss();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sgp
 * JD-Core Version:    0.7.0.1
 */