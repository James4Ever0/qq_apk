import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.ChatSettingActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Friends;
import com.tencent.mobileqq.managers.ShieldMsgManger;
import com.tencent.mobileqq.model.FriendManager;
import com.tencent.mobileqq.utils.ContactUtils;

public class aen
  extends Handler
{
  public aen(ChatSettingActivity paramChatSettingActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
    case 18: 
    case 16711681: 
      do
      {
        do
        {
          return;
          paramMessage = (String)paramMessage.obj;
          ChatSettingActivity.a(this.a, paramMessage);
          return;
        } while (ChatSettingActivity.a(this.a) != 0);
        paramMessage = (String)paramMessage.obj;
      } while ((ChatSettingActivity.a(this.a) == null) || (paramMessage == null) || (!ChatSettingActivity.a(this.a).equals(paramMessage)));
      this.a.finish();
      return;
    case 32: 
      if (ChatSettingActivity.a(this.a) != 1001) {
        if (ChatSettingActivity.a(this.a) == 1006)
        {
          if (TextUtils.isEmpty(ChatSettingActivity.b(this.a))) {
            ChatSettingActivity.a(this.a, false);
          }
        }
        else
        {
          paramMessage = (ShieldMsgManger)this.a.app.getManager(15);
          if ((paramMessage != null) && (!TextUtils.isEmpty(ChatSettingActivity.c(this.a)))) {
            ChatSettingActivity.b(this.a, paramMessage.a(ChatSettingActivity.c(this.a)));
          }
        }
      }
      for (;;)
      {
        ChatSettingActivity.b(this.a);
        return;
        paramMessage = ContactUtils.d(this.a.app, ChatSettingActivity.b(this.a));
        if (TextUtils.isEmpty(paramMessage))
        {
          ChatSettingActivity.a(this.a, false);
          break;
        }
        ChatSettingActivity.a(this.a, true);
        ChatSettingActivity.a(this.a, paramMessage);
        break;
        paramMessage = (FriendManager)this.a.app.getManager(8);
        if (paramMessage != null)
        {
          paramMessage = paramMessage.c(ChatSettingActivity.c(this.a));
          if ((paramMessage != null) && (paramMessage.groupid == -1002)) {
            ChatSettingActivity.b(this.a, true);
          } else {
            ChatSettingActivity.b(this.a, false);
          }
        }
      }
    }
    ChatSettingActivity.c(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     aen
 * JD-Core Version:    0.7.0.1
 */