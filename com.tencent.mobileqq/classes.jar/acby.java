import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.filemanager.activity.FMActivity;

public class acby
  implements DialogInterface.OnClickListener
{
  public acby(FMActivity paramFMActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    this.a.setResult(8001);
    this.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acby
 * JD-Core Version:    0.7.0.1
 */