import QQService.TagInfo;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mobileqq.activity.EditTagActivity;
import com.tencent.mobileqq.activity.ProfileActivity;
import java.util.ArrayList;

public class cqm
  extends BaseAdapter
{
  private View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener = new cqn(this);
  ArrayList jdField_a_of_type_JavaUtilArrayList;
  
  public cqm(EditTagActivity paramEditTagActivity, ArrayList paramArrayList)
  {
    this.jdField_a_of_type_JavaUtilArrayList = paramArrayList;
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_JavaUtilArrayList.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.jdField_a_of_type_JavaUtilArrayList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.jdField_a_of_type_ComTencentMobileqqActivityEditTagActivity.getLayoutInflater().inflate(2130904009, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (int)(32.0F * this.jdField_a_of_type_ComTencentMobileqqActivityEditTagActivity.a)));
      paramViewGroup = new cqo(this, null);
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131234582));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_Int = paramInt;
      Resources localResources = this.jdField_a_of_type_ComTencentMobileqqActivityEditTagActivity.getResources();
      int i = paramInt % ProfileActivity.a.length;
      paramView.setBackgroundDrawable(localResources.getDrawable(ProfileActivity.a[i][0]));
      paramView.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
      i = ProfileActivity.a[i][1];
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setTextColor(localResources.getColor(i));
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(((TagInfo)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt)).strContent);
      return paramView;
      paramViewGroup = (cqo)paramView.getTag();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     cqm
 * JD-Core Version:    0.7.0.1
 */