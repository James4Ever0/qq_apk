import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mobileqq.worldcup.WorldCupShareFragment;
import com.tencent.qphone.base.util.QLog;

public class algm
  extends BroadcastReceiver
{
  public algm(WorldCupShareFragment paramWorldCupShareFragment) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    QLog.d("WorldCupShareFragment", 1, "WL_DEBUG onReceive action = " + paramContext + ", mIsRecordSuccess = " + WorldCupShareFragment.a(this.a));
    if ((paramContext.equals("tencent.ar.worldcup.record")) && (!WorldCupShareFragment.b(this.a)))
    {
      WorldCupShareFragment.a(this.a, paramIntent.getBooleanExtra("key_result", false));
      WorldCupShareFragment.d(this.a, paramIntent.getStringExtra("key_cover_pic"));
      WorldCupShareFragment.e(this.a, paramIntent.getStringExtra("key_video"));
      WorldCupShareFragment.a(this.a, true, this.a.getView());
      WorldCupShareFragment.c(this.a);
      QLog.d("WorldCupShareFragment", 1, "WL_DEBUG onReceive mCoverPath = " + WorldCupShareFragment.d(this.a) + ", mVideoPath = " + WorldCupShareFragment.a(this.a) + ", mIsMergeFinish = " + WorldCupShareFragment.b(this.a) + ", mIsRecordSuccess = " + WorldCupShareFragment.a(this.a));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     algm
 * JD-Core Version:    0.7.0.1
 */