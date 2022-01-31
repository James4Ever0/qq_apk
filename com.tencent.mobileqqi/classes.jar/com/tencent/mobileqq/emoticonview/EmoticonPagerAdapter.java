package com.tencent.mobileqq.emoticonview;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.List;

public class EmoticonPagerAdapter
  extends PagerAdapter
{
  private static final String jdField_a_of_type_JavaLangString = "EmoticonPagerAdapter";
  private List jdField_a_of_type_JavaUtilList;
  private boolean jdField_a_of_type_Boolean = true;
  
  public void a()
  {
    if (this.jdField_a_of_type_JavaUtilList != null)
    {
      Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
      while (localIterator.hasNext()) {
        ((EmoticonViewBinder)localIterator.next()).a();
      }
      this.jdField_a_of_type_JavaUtilList = null;
    }
    EmoticonPanelViewBinder.e();
  }
  
  public void a(List paramList)
  {
    a(paramList, true);
  }
  
  public void a(List paramList, boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = false;
    this.jdField_a_of_type_JavaUtilList = paramList;
    if (paramBoolean) {
      notifyDataSetChanged();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    if (QLog.isColorLevel()) {
      QLog.d("EmoticonPagerAdapter", 2, "[RecycleView] destroyItem, position=" + paramInt + ", viewRecycleable=" + this.jdField_a_of_type_Boolean);
    }
    ((ViewGroup)paramView).removeView((View)paramObject);
    if (!this.jdField_a_of_type_Boolean) {}
    for (;;)
    {
      return;
      paramView = this.jdField_a_of_type_JavaUtilList.iterator();
      int i;
      for (int j = 0; paramView.hasNext(); j = i)
      {
        paramObject = (EmoticonViewBinder)paramView.next();
        i = j;
        if (paramObject != null)
        {
          i = j;
          if ((paramObject instanceof EmoticonPanelViewBinder))
          {
            paramObject = (EmoticonPanelViewBinder)paramObject;
            int k = paramObject.b();
            j += k;
            i = j;
            if (paramInt + 1 <= j)
            {
              i = k - (j - paramInt);
              if (QLog.isColorLevel()) {
                QLog.d("EmoticonPagerAdapter", 2, "[RecycleView] destroyItem, position=" + paramInt + ", viewBinder=" + paramObject + ", innerIndex=" + i);
              }
              paramObject.b(i);
              return;
            }
          }
        }
      }
    }
  }
  
  public int getCount()
  {
    long l = System.currentTimeMillis();
    int j;
    if ((this.jdField_a_of_type_JavaUtilList == null) || (this.jdField_a_of_type_JavaUtilList.size() == 0))
    {
      j = 0;
      return j;
    }
    Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
    int i = 0;
    label40:
    if (localIterator.hasNext())
    {
      EmoticonViewBinder localEmoticonViewBinder = (EmoticonViewBinder)localIterator.next();
      if ((localEmoticonViewBinder == null) || (!(localEmoticonViewBinder instanceof EmoticonPanelViewBinder))) {
        break label137;
      }
      i += ((EmoticonPanelViewBinder)localEmoticonViewBinder).b();
    }
    label137:
    for (;;)
    {
      break label40;
      j = i;
      if (!QLog.isColorLevel()) {
        break;
      }
      QLog.d("EmoticonPagerAdapter", 2, "[Performance] getCount, count=" + i + ", duration=" + (System.currentTimeMillis() - l));
      return i;
    }
  }
  
  public Object instantiateItem(View paramView, int paramInt)
  {
    long l = System.currentTimeMillis();
    Object localObject1 = this.jdField_a_of_type_JavaUtilList.iterator();
    int j = 0;
    Object localObject2;
    int i;
    int k;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (EmoticonViewBinder)((Iterator)localObject1).next();
      i = j;
      if (localObject2 != null)
      {
        i = j;
        if ((localObject2 instanceof EmoticonPanelViewBinder))
        {
          localObject2 = (EmoticonPanelViewBinder)localObject2;
          k = ((EmoticonPanelViewBinder)localObject2).b();
          j += k;
          i = j;
          if (paramInt + 1 > j) {}
        }
      }
    }
    for (localObject1 = ((EmoticonPanelViewBinder)localObject2).b(k - (j - paramInt));; localObject1 = null)
    {
      if ((localObject1 != null) && (((View)localObject1).getParent() != paramView) && (paramInt < getCount())) {
        ((ViewGroup)paramView).addView((View)localObject1);
      }
      if (QLog.isColorLevel()) {
        QLog.d("EmoticonPagerAdapter", 2, "[Performance] instantiateItem, position=" + paramInt + ", duration=" + (System.currentTimeMillis() - l));
      }
      return localObject1;
      j = i;
      break;
    }
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.emoticonview.EmoticonPagerAdapter
 * JD-Core Version:    0.7.0.1
 */