package com.tencent.mobileqq.search.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NetSearchTemplateBannerTitleView
  extends NetSearchTemplateBaseView
{
  public ImageView a;
  public RelativeLayout a;
  public TextView a;
  public ImageView b;
  public TextView b;
  public TextView c;
  public TextView d;
  
  public NetSearchTemplateBannerTitleView(ViewGroup paramViewGroup, int paramInt)
  {
    super(paramViewGroup, paramInt);
  }
  
  protected void a()
  {
    super.a();
    View localView = a(this.jdField_b_of_type_Int);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(2131363397));
    this.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)localView.findViewById(2131366377));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)localView.findViewById(2131362772));
    this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)localView.findViewById(2131366378));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)localView.findViewById(2131364472));
    this.c = ((TextView)localView.findViewById(2131366379));
    this.d = ((TextView)localView.findViewById(2131365664));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.search.view.NetSearchTemplateBannerTitleView
 * JD-Core Version:    0.7.0.1
 */