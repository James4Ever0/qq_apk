import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.adapter.ShowExternalTroopListAdapter;
import com.tencent.mobileqq.adapter.ShowExternalTroopListAdapter.OnTroopListClickListener;
import com.tencent.mobileqq.troop.data.NearbyTroops.CustomViewHolder;

public class yom
  implements View.OnClickListener
{
  public yom(ShowExternalTroopListAdapter paramShowExternalTroopListAdapter) {}
  
  public void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if (!(paramView instanceof NearbyTroops.CustomViewHolder)) {
      return;
    }
    paramView = (NearbyTroops.CustomViewHolder)paramView;
    this.a.a.a(paramView.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     yom
 * JD-Core Version:    0.7.0.1
 */