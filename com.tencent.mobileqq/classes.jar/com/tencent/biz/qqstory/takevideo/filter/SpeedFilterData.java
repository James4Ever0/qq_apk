package com.tencent.biz.qqstory.takevideo.filter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import ojd;

public class SpeedFilterData
  extends FilterData
{
  private int c;
  
  @NonNull
  public FilterData.FilterPageItem a(@NonNull Context paramContext, ViewGroup paramViewGroup)
  {
    return new ojd(this, paramContext, paramViewGroup);
  }
  
  @NonNull
  public Class a()
  {
    return ojd.class;
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.takevideo.filter.SpeedFilterData
 * JD-Core Version:    0.7.0.1
 */