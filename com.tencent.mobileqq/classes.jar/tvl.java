import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.TroopInfoActivity;
import com.tencent.widget.XListView;

public class tvl
  implements View.OnClickListener
{
  public tvl(TroopInfoActivity paramTroopInfoActivity, XListView paramXListView) {}
  
  public void onClick(View paramView)
  {
    this.jdField_a_of_type_ComTencentWidgetXListView.removeHeaderView(this.jdField_a_of_type_ComTencentMobileqqActivityTroopInfoActivity.b);
    this.jdField_a_of_type_ComTencentMobileqqActivityTroopInfoActivity.b = null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tvl
 * JD-Core Version:    0.7.0.1
 */