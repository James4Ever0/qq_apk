import android.os.Bundle;
import com.tencent.mobileqq.activity.PublicAccountListActivity;
import com.tencent.mobileqq.observer.GameCenterObserver;

public class tmf
  extends GameCenterObserver
{
  public tmf(PublicAccountListActivity paramPublicAccountListActivity) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (PublicAccountListActivity.a(this.a)) {
      PublicAccountListActivity.a(this.a);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tmf
 * JD-Core Version:    0.7.0.1
 */