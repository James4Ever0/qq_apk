import android.os.Bundle;
import com.tencent.mobileqq.activity.Contacts;
import com.tencent.mobileqq.observer.GameCenterObserver;

public class sfr
  extends GameCenterObserver
{
  public sfr(Contacts paramContacts) {}
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (Contacts.a(this.a)) {
      Contacts.a(this.a);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     sfr
 * JD-Core Version:    0.7.0.1
 */