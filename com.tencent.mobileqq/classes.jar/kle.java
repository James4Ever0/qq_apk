import android.os.Handler;
import android.os.Message;
import com.tencent.biz.JoinGroupHandler;
import com.tencent.biz.JoinGroupTransitActivity;
import java.lang.ref.WeakReference;

public class kle
  extends Handler
{
  private WeakReference a;
  
  public kle(JoinGroupTransitActivity paramJoinGroupTransitActivity)
  {
    this.a = new WeakReference(paramJoinGroupTransitActivity);
  }
  
  public void handleMessage(Message paramMessage)
  {
    JoinGroupTransitActivity localJoinGroupTransitActivity = (JoinGroupTransitActivity)this.a.get();
    if ((paramMessage == null) || (localJoinGroupTransitActivity == null) || (localJoinGroupTransitActivity.isFinishing())) {
      return;
    }
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      JoinGroupTransitActivity.a(localJoinGroupTransitActivity).a(JoinGroupTransitActivity.a(localJoinGroupTransitActivity));
      return;
    }
    localJoinGroupTransitActivity.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kle
 * JD-Core Version:    0.7.0.1
 */