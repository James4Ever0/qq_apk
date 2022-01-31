package com.tencent.mobileqq.troop.data;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.statistics.ReportController;

public class GroupAreaWrapper$ActivityInfo
  extends GroupAreaWrapper.BaseInfo
{
  public GroupAreaWrapper$ActivityInfo(QQAppInterface paramQQAppInterface)
  {
    this.a = paramQQAppInterface;
  }
  
  protected void a(View paramView)
  {
    ((NearbyTroops.ActivityAndTopicViewHolder)paramView.getTag()).a.setTextColor(paramView.getContext().getResources().getColor(2131361932));
    paramView.findViewById(2131232391).setBackgroundResource(2130838386);
  }
  
  protected void a(TextView paramTextView)
  {
    paramTextView.setText(paramTextView.getContext().getString(2131559303, new Object[] { Integer.valueOf(this.b) }));
    paramTextView.setCompoundDrawablePadding(8);
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(2130838461, 0, 0, 0);
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    int i = paramView.getId();
    if (i == 2131232385) {
      ReportController.b(this.a, "P_CliOper", "Grp_nearby", "", "ac", "Clk_list", 0, 0, "", "", "", "");
    }
    while (i != 2131232389) {
      return;
    }
    ReportController.b(this.a, "P_CliOper", "Grp_nearby", "", "ac", "Clk_detail", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.tencent.mobileqq.troop.data.GroupAreaWrapper.ActivityInfo
 * JD-Core Version:    0.7.0.1
 */