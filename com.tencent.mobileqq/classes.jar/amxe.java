import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import cooperation.qqfav.widget.QfavJumpActivity;

public class amxe
  implements DialogInterface.OnClickListener
{
  public amxe(QfavJumpActivity paramQfavJumpActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    QfavJumpActivity.a(this.a, false);
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     amxe
 * JD-Core Version:    0.7.0.1
 */