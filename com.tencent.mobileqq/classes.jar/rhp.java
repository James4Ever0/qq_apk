import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.AddRequestActivity;
import com.tencent.mobileqq.activity.AutoRemarkActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.ThreadManager;

public class rhp
  extends FriendListObserver
{
  public rhp(AddRequestActivity paramAddRequestActivity) {}
  
  protected void onUpdateAnswerAddedFriend(boolean paramBoolean, String paramString, int paramInt)
  {
    if (AddRequestActivity.a(this.a))
    {
      if (!paramBoolean) {
        this.a.a(2130838735, this.a.getString(2131434447));
      }
    }
    else {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("base_uin", paramString);
    String str = this.a.b;
    if (TextUtils.isEmpty(this.a.b)) {
      str = this.a.a;
    }
    localBundle.putString("base_nick", str);
    localBundle.putInt("verfy_type", AddRequestActivity.b(this.a));
    localBundle.putString("verfy_msg", AddRequestActivity.a(this.a));
    if (AddRequestActivity.a(this.a) != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localBundle.putBoolean("isFromWzry", paramBoolean);
      AutoRemarkActivity.a(this.a, 0, paramString, 0L, localBundle);
      return;
    }
  }
  
  protected void onUpdateFriendInfo(String paramString, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a.a != null) && (this.a.a.equals(paramString))) {
      ThreadManager.post(new rhq(this), 5, null, true);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     rhp
 * JD-Core Version:    0.7.0.1
 */