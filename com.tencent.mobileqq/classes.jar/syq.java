import com.tencent.mobileqq.activity.LebaListMgrActivity;
import com.tencent.mobileqq.leba.header.LebaGridShowManager;
import com.tencent.mobileqq.observer.GameCenterObserver;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

public class syq
  extends GameCenterObserver
{
  public syq(LebaListMgrActivity paramLebaListMgrActivity) {}
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.i("Q.lebatab.mgr", 2, "onGameCenterMsgReceive. notifyData.");
    }
    if ((this.a.isResume()) && (paramBoolean1) && (paramInt != 2) && (LebaListMgrActivity.a(this.a) != null))
    {
      List localList = LebaGridShowManager.a().c(this.a.app);
      this.a.runOnUiThread(new syr(this, localList));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     syq
 * JD-Core Version:    0.7.0.1
 */