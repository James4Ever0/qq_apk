package com.tencent.token.ui.base;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

public class MyViewPaper
  extends ViewPager
{
  public MyViewPaper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
      paramMotionEvent.getX();
      paramMotionEvent.getY();
      getParent().requestDisallowInterceptTouchEvent(true);
      continue;
      if (Math.abs(paramMotionEvent.getX() - 0.0F) > Math.abs(paramMotionEvent.getY() - 0.0F))
      {
        getParent().requestDisallowInterceptTouchEvent(true);
      }
      else
      {
        getParent().requestDisallowInterceptTouchEvent(false);
        continue;
        getParent().requestDisallowInterceptTouchEvent(false);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     com.tencent.token.ui.base.MyViewPaper
 * JD-Core Version:    0.7.0.1
 */