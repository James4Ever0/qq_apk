package com.tencent.mobileqq.search.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.theme.ThemeUtil;

public class SearchResultGroupFooterView
  extends SearchResultGroupView
{
  public View a;
  public LinearLayout a;
  public TextView a;
  
  public SearchResultGroupFooterView(ViewGroup paramViewGroup)
  {
    this.b = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969022, paramViewGroup, false);
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)this.b.findViewById(2131364785));
    if (ThemeUtil.isInNightMode(BaseApplicationImpl.getApplication().getRuntime())) {
      this.jdField_a_of_type_AndroidWidgetLinearLayout.setBackgroundResource(2130838586);
    }
    for (;;)
    {
      this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)this.b.findViewById(2131364786));
      this.jdField_a_of_type_AndroidViewView = this.b.findViewById(2131363953);
      return;
      this.jdField_a_of_type_AndroidWidgetLinearLayout.setBackgroundResource(2130838585);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.search.view.SearchResultGroupFooterView
 * JD-Core Version:    0.7.0.1
 */