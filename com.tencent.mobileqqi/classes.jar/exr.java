import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.voip.VoipAddressBookView;

public class exr
  implements DialogInterface.OnClickListener
{
  public exr(VoipAddressBookView paramVoipAddressBookView) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    VoipAddressBookView.l(this.a);
    this.a.n();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     exr
 * JD-Core Version:    0.7.0.1
 */