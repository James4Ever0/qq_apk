import com.tencent.mobileqq.activity.contact.addcontact.AddContactsActivity;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.widget.TabBarView.OnTabChangeListener;

public class wdy
  implements TabBarView.OnTabChangeListener
{
  public wdy(AddContactsActivity paramAddContactsActivity) {}
  
  public void onTabSelected(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    default: 
      return;
    case 0: 
      AddContactsActivity.a(this.a);
      ReportController.b(this.a.app, "CliOper", "", "", "0X8004BE9", "0X8004BE9", 0, 0, "", "", "", "");
      return;
    case 1: 
      AddContactsActivity.b(this.a);
      ReportController.b(this.a.app, "CliOper", "", "", "0X8004BEA", "0X8004BEA", 0, 0, "", "", "", "");
      ReportController.b(this.a.app, "P_CliOper", "Grp_find", "", "grptab", "exp", 0, 0, "", "", "", "");
      return;
    }
    AddContactsActivity.c(this.a);
    ReportController.b(this.a.app, "CliOper", "", "", "0X8004BEB", "0X8004BEB", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wdy
 * JD-Core Version:    0.7.0.1
 */