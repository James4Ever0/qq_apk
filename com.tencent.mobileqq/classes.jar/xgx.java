import android.support.v4.app.FragmentActivity;
import com.tencent.mobileqq.activity.qwallet.RedPacketRecordFragment;

public class xgx
  implements Runnable
{
  public xgx(RedPacketRecordFragment paramRedPacketRecordFragment) {}
  
  public void run()
  {
    if (!this.a.a()) {
      this.a.getActivity().runOnUiThread(new xgy(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xgx
 * JD-Core Version:    0.7.0.1
 */