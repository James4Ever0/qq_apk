import android.view.View;
import android.widget.ExpandableListAdapter;
import com.tencent.mobileqq.activity.TroopAssisSettingActivity;
import com.tencent.mobileqq.adapter.TroopMessageSettingAdapter;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.statistics.StatisticTroopAssist;
import com.tencent.widget.ExpandableListView;
import com.tencent.widget.ExpandableListView.OnChildClickListener;

public class blm
  implements ExpandableListView.OnChildClickListener
{
  public blm(TroopAssisSettingActivity paramTroopAssisSettingActivity) {}
  
  public boolean a(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    if (((TroopMessageSettingAdapter)paramExpandableListView.a()).getChildType(paramInt1, paramInt2) == 1) {
      return true;
    }
    StatisticTroopAssist.c(this.a.getActivity(), this.a.app.a());
    paramExpandableListView = (TroopInfo)paramExpandableListView.a().getChild(paramInt1, paramInt2);
    this.a.a(paramExpandableListView);
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     blm
 * JD-Core Version:    0.7.0.1
 */