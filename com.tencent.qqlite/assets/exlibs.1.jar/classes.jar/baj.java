import com.tencent.mobileqq.activity.PermisionPrivacyActivity;
import com.tencent.mobileqq.app.QQAppInterface;

public class baj
  implements Runnable
{
  public baj(PermisionPrivacyActivity paramPermisionPrivacyActivity) {}
  
  public void run()
  {
    boolean bool = this.a.app.q();
    this.a.runOnUiThread(new bak(this, bool));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     baj
 * JD-Core Version:    0.7.0.1
 */