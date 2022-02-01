package com.tencent.mobileqq.teamworkforgroup;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.rely.SwipRightMenuBuilder.SwipRightMenuItem;
import com.tencent.mobileqq.rely.SwipTextViewMenuBuilder;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

class BaseMenuCloudFileItemBuilder$2
  extends SwipTextViewMenuBuilder
{
  BaseMenuCloudFileItemBuilder$2(BaseMenuCloudFileItemBuilder paramBaseMenuCloudFileItemBuilder, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int paramInt3, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, List paramList, int[] paramArrayOfInt5)
  {
    super(paramInt1, paramInt2, paramArrayOfInt1, paramInt3, paramArrayOfInt2, paramArrayOfInt3, paramArrayOfInt4);
  }
  
  public View a(int paramInt, Object paramObject, SwipRightMenuBuilder.SwipRightMenuItem paramSwipRightMenuItem, View.OnClickListener paramOnClickListener)
  {
    paramSwipRightMenuItem = super.a(paramInt, paramObject, paramSwipRightMenuItem, paramOnClickListener);
    if (paramSwipRightMenuItem != null) {
      paramSwipRightMenuItem.setTag(-10, paramObject);
    }
    return paramSwipRightMenuItem;
  }
  
  public void a(int paramInt, Object paramObject, SwipRightMenuBuilder.SwipRightMenuItem[] paramArrayOfSwipRightMenuItem)
  {
    Object localObject = this.jdField_a_of_type_ComTencentMobileqqTeamworkforgroupBaseMenuCloudFileItemBuilder.a((ICloudFile)paramObject);
    int i = ((List)localObject).size();
    paramInt = 0;
    paramObject = localObject;
    if (i > 3)
    {
      paramObject = ((List)localObject).subList(i - 2, i);
      paramObject.add(0, BaseMenuCloudFileItemBuilder.a);
    }
    i = Math.min(paramObject.size(), 3);
    while (paramInt < paramArrayOfSwipRightMenuItem.length)
    {
      if (paramInt < i)
      {
        localObject = (MenuItem)paramObject.get(paramInt);
        int j = this.jdField_a_of_type_JavaUtilList.indexOf(localObject);
        if (j < 0)
        {
          if (QLog.isColorLevel())
          {
            String str = this.jdField_a_of_type_JavaLangString;
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("getRightMenuItemInfo error, can not find the menu， menuId[");
            localStringBuilder.append(((MenuItem)localObject).b());
            localStringBuilder.append("]");
            QLog.i(str, 1, localStringBuilder.toString());
          }
          paramArrayOfSwipRightMenuItem[paramInt].b = -1;
          paramArrayOfSwipRightMenuItem[paramInt].a = -1;
        }
        else
        {
          paramArrayOfSwipRightMenuItem[paramInt].b = j;
          paramArrayOfSwipRightMenuItem[paramInt].a = this.e[j];
        }
      }
      else
      {
        paramArrayOfSwipRightMenuItem[paramInt].b = -1;
        paramArrayOfSwipRightMenuItem[paramInt].a = -1;
      }
      paramInt += 1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\tmp\classes8.jar
 * Qualified Name:     com.tencent.mobileqq.teamworkforgroup.BaseMenuCloudFileItemBuilder.2
 * JD-Core Version:    0.7.0.1
 */