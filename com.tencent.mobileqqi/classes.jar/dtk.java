import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.SubaccountUgActivity;
import com.tencent.mobileqq.subaccount.SubAccountAssistantManager;

class dtk
  implements DialogInterface.OnClickListener
{
  dtk(dtj paramdtj) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == 1)
    {
      this.a.a.d();
      this.a.a.f = true;
      SubAccountAssistantManager.a().a(this.a.a.b);
      this.a.a.f();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     dtk
 * JD-Core Version:    0.7.0.1
 */