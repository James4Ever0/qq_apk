import android.os.Handler;
import com.tencent.biz.pubaccount.PublicAccountManager.InitDoneObserver;
import com.tencent.mobileqq.activity.aio.rebuild.PublicAccountChatPie;

class wci
  implements PublicAccountManager.InitDoneObserver
{
  wci(wch paramwch) {}
  
  public void a()
  {
    PublicAccountChatPie.b(this.a.a, false);
    this.a.a.a.sendEmptyMessage(1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wci
 * JD-Core Version:    0.7.0.1
 */