import SummaryCard.CondFitUser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mobileqq.conditionsearch.SearchResultActivity;
import java.util.List;

public class dcq
  extends BaseAdapter
{
  private dcq(SearchResultActivity paramSearchResultActivity) {}
  
  public int getCount()
  {
    int j = this.a.a.size();
    if (this.a.b != 0) {}
    for (int i = 1;; i = 0) {
      return i + j;
    }
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    if (paramInt < this.a.a.size()) {
      return 0;
    }
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (getItemViewType(paramInt) == 0)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = this.a.getLayoutInflater().inflate(2130903476, null);
        paramViewGroup.setOnClickListener(this.a);
        paramView = new dcr();
        paramView.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramViewGroup.findViewById(2131298097));
        paramView.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramViewGroup.findViewById(2131298098));
        paramView.d = ((TextView)paramViewGroup.findViewById(2131298101));
        paramView.b = ((TextView)paramViewGroup.findViewById(2131298099));
        paramView.c = ((TextView)paramViewGroup.findViewById(2131298100));
        paramViewGroup.setTag(paramView);
      }
      paramView = (dcr)paramViewGroup.getTag();
      localObject = (CondFitUser)this.a.a.get(paramInt);
      paramViewGroup.setContentDescription(this.a.a(paramView, (CondFitUser)localObject));
      paramView = paramViewGroup;
    }
    do
    {
      return paramView;
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = this.a.getLayoutInflater().inflate(2130903239, null);
        paramViewGroup.setOnClickListener(this.a);
        paramView = new dcs();
        paramViewGroup.setTag(paramView);
        paramView.jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)paramViewGroup.findViewById(2131296561));
        paramViewGroup.findViewById(2131297310).setVisibility(8);
        paramView.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramViewGroup.findViewById(2131297311));
      }
      if (this.a.b == 1)
      {
        this.a.b = 2;
        this.a.c();
      }
      localObject = (dcs)paramViewGroup.getTag();
      if (this.a.b == 3)
      {
        ((dcs)localObject).jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(8);
        ((dcs)localObject).jdField_a_of_type_AndroidWidgetTextView.setText("获取失败，请稍后再试");
        return paramViewGroup;
      }
      if (this.a.b == 2)
      {
        ((dcs)localObject).jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
        ((dcs)localObject).jdField_a_of_type_AndroidWidgetTextView.setText("载入中，请稍候...");
        return paramViewGroup;
      }
      paramView = paramViewGroup;
    } while (this.a.b != 4);
    ((dcs)localObject).jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(8);
    ((dcs)localObject).jdField_a_of_type_AndroidWidgetTextView.setText("获取失败，请检查网络连接");
    return paramViewGroup;
  }
  
  public int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     dcq
 * JD-Core Version:    0.7.0.1
 */