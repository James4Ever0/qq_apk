import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.biz.ui.CustomMenuBar;
import com.tencent.mobileqq.activity.aio.rebuild.BusinessCmrTmpChatPie;

public class bzb
  implements View.OnClickListener
{
  public bzb(BusinessCmrTmpChatPie paramBusinessCmrTmpChatPie) {}
  
  public void onClick(View paramView)
  {
    BusinessCmrTmpChatPie.a(this.a).setVisibility(8);
    BusinessCmrTmpChatPie.a(this.a).setVisibility(0);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bzb
 * JD-Core Version:    0.7.0.1
 */