import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.biz.pubaccount.readinjoy.ugc.ReadInJoyDeliverVideoActivity;
import com.tencent.mobileqq.forward.ForwardSdkShareOption;

class mcd
  implements DialogInterface.OnClickListener
{
  mcd(mcc parammcc) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ForwardSdkShareOption.a(this.a.a, true, "shareToQQ", ReadInJoyDeliverVideoActivity.b(this.a.a));
    this.a.a.moveTaskToBack(true);
    this.a.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mcd
 * JD-Core Version:    0.7.0.1
 */