package com.tencent.mobileqq.troop.widget;

import ajfi;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.widget.SwipRightMenuBuilder;
import com.tencent.widget.SwipRightMenuBuilder.SwipItemBaseHolder;

public class TroopFileItemBuilder
{
  public static final int[] a;
  public static final int[] b = { 2130838679, 2130838679, 2130838678 };
  public static final int[] c = { 2131368305, 2131368306, 2131368307 };
  protected SwipRightMenuBuilder a;
  
  static
  {
    jdField_a_of_type_ArrayOfInt = new int[] { 2131429741, 2131429742, 2131429743 };
  }
  
  public final View a(Context paramContext, int paramInt, SwipRightMenuBuilder.SwipItemBaseHolder paramSwipItemBaseHolder)
  {
    View localView = LayoutInflater.from(paramContext).inflate(paramInt, null);
    if (this.jdField_a_of_type_ComTencentWidgetSwipRightMenuBuilder == null) {
      this.jdField_a_of_type_ComTencentWidgetSwipRightMenuBuilder = a(paramContext);
    }
    return this.jdField_a_of_type_ComTencentWidgetSwipRightMenuBuilder.a(paramContext, localView, paramSwipItemBaseHolder, -1);
  }
  
  public SwipRightMenuBuilder a(Context paramContext)
  {
    int i = paramContext.getResources().getDimensionPixelSize(2131558954);
    int j = paramContext.getResources().getDimensionPixelSize(2131558955);
    paramContext = c;
    int[] arrayOfInt1 = jdField_a_of_type_ArrayOfInt;
    int[] arrayOfInt2 = b;
    return new ajfi(this, 3, 2, new int[] { i, j }, -1, paramContext, arrayOfInt1, arrayOfInt2);
  }
  
  public void a(Context paramContext, View paramView, Object paramObject, SwipRightMenuBuilder.SwipItemBaseHolder paramSwipItemBaseHolder, View.OnClickListener paramOnClickListener)
  {
    if (this.jdField_a_of_type_ComTencentWidgetSwipRightMenuBuilder != null) {
      this.jdField_a_of_type_ComTencentWidgetSwipRightMenuBuilder.a(paramContext, paramView, 0, paramObject, paramSwipItemBaseHolder, paramOnClickListener);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\tmp2\com34.jar
 * Qualified Name:     com.tencent.mobileqq.troop.widget.TroopFileItemBuilder
 * JD-Core Version:    0.7.0.1
 */