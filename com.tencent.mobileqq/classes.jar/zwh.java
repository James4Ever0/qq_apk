import com.tencent.biz.bmqq.util.BmqqSegmentUtil;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.automator.step.AfterSyncMsg;
import java.util.concurrent.atomic.AtomicBoolean;

public class zwh
  implements Runnable
{
  public zwh(AfterSyncMsg paramAfterSyncMsg) {}
  
  public void run()
  {
    if (!BmqqSegmentUtil.a.get()) {
      BmqqSegmentUtil.a(BaseApplicationImpl.getContext());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zwh
 * JD-Core Version:    0.7.0.1
 */