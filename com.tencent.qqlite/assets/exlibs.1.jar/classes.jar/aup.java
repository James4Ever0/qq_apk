import com.tencent.mobileqq.activity.LoginVerifyCodeActivity;
import com.tencent.mobileqq.widget.QQProgressDialog;

public class aup
  implements Runnable
{
  public aup(LoginVerifyCodeActivity paramLoginVerifyCodeActivity) {}
  
  public void run()
  {
    try
    {
      if ((LoginVerifyCodeActivity.a(this.a) == null) && (!this.a.isFinishing()))
      {
        LoginVerifyCodeActivity.a(this.a, new QQProgressDialog(this.a.getActivity(), this.a.getTitleBarHeight()));
        LoginVerifyCodeActivity.a(this.a).b(2131363558);
      }
      if ((LoginVerifyCodeActivity.a(this.a) != null) && (!LoginVerifyCodeActivity.a(this.a).isShowing())) {
        LoginVerifyCodeActivity.a(this.a).show();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        localThrowable.printStackTrace();
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     aup
 * JD-Core Version:    0.7.0.1
 */