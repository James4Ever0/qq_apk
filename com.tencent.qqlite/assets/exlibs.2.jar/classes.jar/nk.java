import com.tencent.biz.lebasearch.SearchActivity;
import com.tencent.mobileqq.activity.leba.LebaShowListManager;
import com.tencent.mobileqq.observer.GameCenterObserver;

public class nk
  extends GameCenterObserver
{
  public nk(SearchActivity paramSearchActivity) {}
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    SearchActivity.a(this.a, LebaShowListManager.a().a());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     nk
 * JD-Core Version:    0.7.0.1
 */