import com.tencent.mobileqq.activity.contacts.adapter.ContactsTroopAdapter;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopManager;

public class wrn
  implements Runnable
{
  public wrn(ContactsTroopAdapter paramContactsTroopAdapter) {}
  
  public void run()
  {
    ((TroopManager)this.a.a.getManager(51)).a();
    this.a.a.runOnUiThread(new wro(this));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wrn
 * JD-Core Version:    0.7.0.1
 */