import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.SendMultiPictureHelper;
import com.tencent.mobileqq.utils.QQCustomDialog;

public class dnj
  implements DialogInterface.OnClickListener
{
  public dnj(SendMultiPictureHelper paramSendMultiPictureHelper) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a.show();
    this.a.b = false;
    SendMultiPictureHelper.c(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     dnj
 * JD-Core Version:    0.7.0.1
 */