import com.tencent.mobileqq.activity.AssociatedAccountActivity;
import com.tencent.qphone.base.util.QLog;

public class rjo
  implements Runnable
{
  public rjo(AssociatedAccountActivity paramAssociatedAccountActivity) {}
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d("AssociatedAccountActivity", 2, "refreshAllData isFinishing() = " + this.a.isFinishing());
    }
    if (this.a.isFinishing()) {
      return;
    }
    AssociatedAccountActivity.a(this.a);
    AssociatedAccountActivity.b(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rjo
 * JD-Core Version:    0.7.0.1
 */