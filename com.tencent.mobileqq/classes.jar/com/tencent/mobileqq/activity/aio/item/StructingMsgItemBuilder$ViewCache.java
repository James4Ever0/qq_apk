package com.tencent.mobileqq.activity.aio.item;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import vnl;

public class StructingMsgItemBuilder$ViewCache
{
  private static final String jdField_a_of_type_JavaLangString = ViewCache.class.getSimpleName();
  private StructingMsgItemBuilder.CacheMap jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$CacheMap = new StructingMsgItemBuilder.CacheMap(null);
  private StructingMsgItemBuilder.CacheMap b = new StructingMsgItemBuilder.CacheMap(null);
  
  private vnl a(String paramString, ViewGroup paramViewGroup)
  {
    Iterator localIterator = this.b.get(paramString).iterator();
    while (localIterator.hasNext())
    {
      paramString = (vnl)localIterator.next();
      if (paramString != null) {
        paramString.a(paramViewGroup);
      }
    }
    for (;;)
    {
      this.b.remove(paramString);
      this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$CacheMap.add(paramString);
      return paramString;
      paramString = null;
    }
  }
  
  public View a(String paramString, ViewGroup paramViewGroup)
  {
    a(paramString, paramViewGroup);
    paramString = a(paramString, paramViewGroup);
    if (paramString != null) {
      return paramString.a();
    }
    return null;
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$CacheMap.clear();
    this.b.clear();
  }
  
  public void a(String paramString, View paramView, ViewGroup paramViewGroup)
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$CacheMap.add(new vnl(paramString, paramView, paramViewGroup));
  }
  
  public void a(String paramString, ViewGroup paramViewGroup)
  {
    if (paramViewGroup == null) {}
    vnl localvnl;
    do
    {
      return;
      while (!paramString.hasNext()) {
        paramString = this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$CacheMap.get(paramString).iterator();
      }
      localvnl = (vnl)paramString.next();
    } while ((localvnl == null) || (localvnl.a() == null) || (localvnl.a() != paramViewGroup));
    localvnl.a().removeAllViews();
    this.jdField_a_of_type_ComTencentMobileqqActivityAioItemStructingMsgItemBuilder$CacheMap.remove(localvnl);
    this.b.add(localvnl);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.mobileqq.activity.aio.item.StructingMsgItemBuilder.ViewCache
 * JD-Core Version:    0.7.0.1
 */