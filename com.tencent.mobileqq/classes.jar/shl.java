import com.tencent.mobileqq.activity.ChatSettingForTroop;
import com.tencent.qphone.base.util.QLog;

public class shl
  implements Runnable
{
  public shl(ChatSettingForTroop paramChatSettingForTroop) {}
  
  public void run()
  {
    if (this.a.isFinishing()) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.w("Q.chatopttroop", 2, "-->preForward--fetch openid timeout");
    }
    this.a.n = true;
    this.a.s();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     shl
 * JD-Core Version:    0.7.0.1
 */