import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;
import com.tencent.mobileqq.activity.richmedia.NewFlowEditVideoActivity;

public class xyx
  implements DialogInterface.OnClickListener
{
  public xyx(NewFlowEditVideoActivity paramNewFlowEditVideoActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    NewFlowEditVideoActivity.b(this.a, false);
    NewFlowEditVideoActivity.b(this.a).setSelected(false);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xyx
 * JD-Core Version:    0.7.0.1
 */