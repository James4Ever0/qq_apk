import android.view.ViewStub;
import com.tencent.mobileqq.activity.Leba;
import com.tencent.mobileqq.activity.main.CommonLoadingView;

public class asb
  implements Runnable
{
  public asb(Leba paramLeba) {}
  
  public void run()
  {
    ViewStub localViewStub = (ViewStub)this.a.a(2131297259);
    ((CommonLoadingView)this.a.a(2131296840)).setVisibility(8);
    localViewStub.setVisibility(0);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     asb
 * JD-Core Version:    0.7.0.1
 */