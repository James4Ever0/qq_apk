import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.PayBridgeActivity;
import com.tencent.mobileqq.activity.qwallet.RedPacketRecordFragment;

public class xgs
  implements View.OnClickListener
{
  public xgs(RedPacketRecordFragment paramRedPacketRecordFragment) {}
  
  public void onClick(View paramView)
  {
    if ((!this.a.a()) && (RedPacketRecordFragment.a(this.a) != null) && (paramView != null))
    {
      Intent localIntent = new Intent(paramView.getContext(), PayBridgeActivity.class);
      localIntent.putExtras(RedPacketRecordFragment.a(this.a));
      localIntent.putExtra("pay_requestcode", 5);
      paramView.getContext().startActivity(localIntent);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xgs
 * JD-Core Version:    0.7.0.1
 */