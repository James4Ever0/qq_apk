import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.utils.JumpAction;
import com.tencent.qphone.base.util.QLog;
import java.util.Hashtable;

public class etv
  extends FriendListObserver
{
  private final JumpAction b;
  
  public etv(JumpAction paramJumpAction1, JumpAction paramJumpAction2)
  {
    this.b = paramJumpAction2;
  }
  
  protected void a(boolean paramBoolean, String paramString)
  {
    if ((!paramBoolean) || (JumpAction.a(this.a) == null) || (!JumpAction.a(this.a).containsKey(paramString))) {}
    do
    {
      return;
      JumpAction.a(this.a).remove(paramString);
      if (JumpAction.a(this.a).size() == 0) {
        JumpAction.a(this.a).c(JumpAction.a(this.a));
      }
      Object localObject = Uri.parse(JumpAction.a(this.a) + "&uin=" + paramString);
      localObject = new Intent(this.b.ck, (Uri)localObject);
      JumpAction.a(this.a).sendBroadcast((Intent)localObject, "com.tencent.msg.permission.pushnotify");
    } while (!QLog.isColorLevel());
    QLog.i("JumpAction", 2, "download head " + paramString + " success. Send broadcast to " + this.b.ck);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     etv
 * JD-Core Version:    0.7.0.1
 */