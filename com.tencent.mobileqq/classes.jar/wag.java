import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.tips.TipsManager;
import com.tencent.mobileqq.activity.aio.tips.TroopAssistTipsBar;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.managers.TroopAssistantManager;
import com.tencent.mobileqq.statistics.ReportController;

public class wag
  implements View.OnClickListener
{
  public wag(TroopAssistTipsBar paramTroopAssistTipsBar) {}
  
  public void onClick(View paramView)
  {
    QQAppInterface localQQAppInterface;
    String str;
    if (this.a.a())
    {
      TroopAssistantManager.a().a(TroopAssistTipsBar.a(this.a), TroopAssistTipsBar.a(this.a).a);
      TroopAssistTipsBar.a(this.a).a();
      localQQAppInterface = TroopAssistTipsBar.a(this.a);
      str = TroopAssistTipsBar.a(this.a).a;
      if (TroopAssistTipsBar.a(this.a).b(TroopAssistTipsBar.a(this.a).a) != 3) {
        break label112;
      }
    }
    label112:
    for (paramView = "1";; paramView = "0")
    {
      ReportController.b(localQQAppInterface, "dc00899", "Grp_msg", "", "aio-topbar", "Clk_close", 0, 0, str, paramView, "", "");
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wag
 * JD-Core Version:    0.7.0.1
 */