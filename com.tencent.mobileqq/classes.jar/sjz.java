import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.ContactBindedActivity;

public class sjz
  implements DialogInterface.OnClickListener
{
  public sjz(ContactBindedActivity paramContactBindedActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ContactBindedActivity.a(this.a, null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sjz
 * JD-Core Version:    0.7.0.1
 */