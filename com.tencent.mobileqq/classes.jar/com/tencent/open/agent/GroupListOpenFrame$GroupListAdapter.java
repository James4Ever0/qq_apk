package com.tencent.open.agent;

import alju;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.open.agent.datamodel.AgentBaseAdapter;
import com.tencent.open.agent.datamodel.FriendDataManager;

public class GroupListOpenFrame$GroupListAdapter
  extends AgentBaseAdapter
{
  protected GroupListOpenFrame$GroupListAdapter(GroupListOpenFrame paramGroupListOpenFrame) {}
  
  public int getCount()
  {
    return this.a.jdField_a_of_type_ComTencentOpenAgentDatamodelFriendDataManager.b();
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str;
    int i;
    if (paramView == null)
    {
      paramViewGroup = new GroupListOpenFrame.GroupListAdapter.ViewHolder(this);
      paramView = this.a.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130969260, this.a.jdField_a_of_type_ComTencentWidgetXListView, false);
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131365815));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131365816));
      paramViewGroup.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)paramView.findViewById(2131365814));
      paramView.setTag(paramViewGroup);
      str = this.a.jdField_a_of_type_ComTencentOpenAgentDatamodelFriendDataManager.a(paramInt);
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText(str);
      paramViewGroup.b.setText(String.valueOf(this.a.jdField_a_of_type_ComTencentOpenAgentDatamodelFriendDataManager.a(paramInt)));
      i = (int)(10.0F * this.a.jdField_a_of_type_ComTencentOpenAgentFriendChooser.a);
      if (paramInt != 0) {
        break label194;
      }
      paramViewGroup.jdField_a_of_type_AndroidWidgetRelativeLayout.setBackgroundResource(2130838641);
    }
    for (;;)
    {
      paramViewGroup.jdField_a_of_type_AndroidWidgetRelativeLayout.setPadding(i, 0, i, 0);
      paramViewGroup.jdField_a_of_type_AndroidWidgetRelativeLayout.setOnClickListener(new alju(this, paramInt, str));
      return paramView;
      paramViewGroup = (GroupListOpenFrame.GroupListAdapter.ViewHolder)paramView.getTag();
      break;
      label194:
      if (paramInt == getCount() - 1) {
        paramViewGroup.jdField_a_of_type_AndroidWidgetRelativeLayout.setBackgroundResource(2130838636);
      } else {
        paramViewGroup.jdField_a_of_type_AndroidWidgetRelativeLayout.setBackgroundResource(2130838639);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.open.agent.GroupListOpenFrame.GroupListAdapter
 * JD-Core Version:    0.7.0.1
 */