import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.selectmember.TroopMemberListInnerFrame;
import com.tencent.qphone.base.util.QLog;

public class cnm
  implements Runnable
{
  public cnm(TroopMemberListInnerFrame paramTroopMemberListInnerFrame) {}
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopMemberListInnerFrame", 2, "read troop members from database before updating data from server");
    }
    Object localObject = TroopMemberListInnerFrame.a(this.a, this.a.b);
    localObject = this.a.a.obtainMessage(1, localObject);
    this.a.a.sendMessage((Message)localObject);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     cnm
 * JD-Core Version:    0.7.0.1
 */