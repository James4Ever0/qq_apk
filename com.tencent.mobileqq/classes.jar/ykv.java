import android.support.v4.app.FragmentActivity;
import com.tencent.mobileqq.apollo.activity.HotChatCenterFragment;
import com.tencent.qphone.base.util.QLog;

public class ykv
  implements Runnable
{
  public ykv(HotChatCenterFragment paramHotChatCenterFragment) {}
  
  public void run()
  {
    try
    {
      HotChatCenterFragment.a(this.a);
      if (this.a.isAdded()) {
        this.a.getActivity().runOnUiThread(new ykw(this));
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      QLog.e("HotchatActivity", 1, localThrowable, new Object[] { "[update] failed" });
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ykv
 * JD-Core Version:    0.7.0.1
 */