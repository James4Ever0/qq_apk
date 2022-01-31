package com.tencent.mobileqq.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Scroller;
import ezq;
import java.util.Timer;

public class WorkSpaceView
  extends FrameLayout
{
  private static final int jdField_b_of_type_Int = 500;
  private static final int d = -2;
  private static final int f = 0;
  private static final int g = 1;
  private float jdField_a_of_type_Float;
  public int a;
  private Handler jdField_a_of_type_AndroidOsHandler = new ezq(this);
  private VelocityTracker jdField_a_of_type_AndroidViewVelocityTracker;
  private Scroller jdField_a_of_type_AndroidWidgetScroller = new Scroller(getContext());
  private WorkSpaceView.OnScreenChangeListener jdField_a_of_type_ComTencentMobileqqWidgetWorkSpaceView$OnScreenChangeListener;
  private Timer jdField_a_of_type_JavaUtilTimer;
  boolean jdField_a_of_type_Boolean = true;
  private float jdField_b_of_type_Float;
  private boolean jdField_b_of_type_Boolean;
  private int c = 0;
  private int e = -2;
  private int h = 0;
  private int i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  
  public WorkSpaceView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public WorkSpaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public WorkSpaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.jdField_a_of_type_Int = this.c;
  }
  
  private boolean a(int paramInt)
  {
    return (paramInt >= 0) && (paramInt < getChildCount());
  }
  
  private void c()
  {
    int j = getWidth();
    a((getScrollX() + j / 2) / j);
  }
  
  public int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public void a()
  {
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(0);
  }
  
  public void a(int paramInt)
  {
    int j = 1;
    if (!this.jdField_a_of_type_Boolean) {
      a(paramInt, true);
    }
    while (!this.jdField_a_of_type_AndroidWidgetScroller.isFinished()) {
      return;
    }
    int k = Math.max(-1, Math.min(paramInt, getChildCount()));
    if (k != this.jdField_a_of_type_Int) {}
    for (paramInt = j;; paramInt = 0)
    {
      this.e = k;
      View localView = getFocusedChild();
      if ((localView != null) && (paramInt != 0) && (localView == getChildAt(this.jdField_a_of_type_Int))) {
        localView.clearFocus();
      }
      paramInt = getWidth() * k - getScrollX();
      this.jdField_a_of_type_AndroidWidgetScroller.startScroll(getScrollX(), 0, paramInt, 0, Math.abs(paramInt) * 2);
      if (this.jdField_a_of_type_ComTencentMobileqqWidgetWorkSpaceView$OnScreenChangeListener != null) {
        this.jdField_a_of_type_ComTencentMobileqqWidgetWorkSpaceView$OnScreenChangeListener.a(k);
      }
      invalidate();
      return;
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (!this.jdField_a_of_type_AndroidWidgetScroller.isFinished()) {
      return;
    }
    int j = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    if (j != this.jdField_a_of_type_Int) {}
    for (paramInt = 1;; paramInt = 0)
    {
      this.e = j;
      View localView = getFocusedChild();
      if ((localView != null) && (paramInt != 0) && (localView == getChildAt(this.jdField_a_of_type_Int))) {
        localView.clearFocus();
      }
      paramInt = getWidth() * j - getScrollX();
      this.jdField_a_of_type_AndroidWidgetScroller.startScroll(getScrollX(), 0, paramInt, 0, Math.abs(paramInt) * 2);
      if (this.jdField_a_of_type_ComTencentMobileqqWidgetWorkSpaceView$OnScreenChangeListener != null) {
        this.jdField_a_of_type_ComTencentMobileqqWidgetWorkSpaceView$OnScreenChangeListener.a(j);
      }
      invalidate();
      return;
    }
  }
  
  public void b()
  {
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
  }
  
  public void computeScroll()
  {
    if (this.jdField_a_of_type_AndroidWidgetScroller.computeScrollOffset())
    {
      scrollTo(this.jdField_a_of_type_AndroidWidgetScroller.getCurrX(), this.jdField_a_of_type_AndroidWidgetScroller.getCurrY());
      postInvalidate();
    }
    while (this.e == -2) {
      return;
    }
    if (this.e == -1)
    {
      this.jdField_a_of_type_Int = (getChildCount() - 1);
      scrollTo(this.jdField_a_of_type_Int * getWidth(), getScrollY());
    }
    for (;;)
    {
      this.e = -2;
      return;
      if (this.e == getChildCount())
      {
        this.jdField_a_of_type_Int = 0;
        scrollTo(0, getScrollY());
      }
      else
      {
        this.jdField_a_of_type_Int = Math.max(0, Math.min(this.e, getChildCount() - 1));
      }
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    int m = 0;
    if ((this.h != 1) && (this.e == -2)) {}
    for (int j = 1; j != 0; j = 0)
    {
      if ((paramCanvas != null) && (getChildAt(this.jdField_a_of_type_Int) != null)) {
        drawChild(paramCanvas, getChildAt(this.jdField_a_of_type_Int), getDrawingTime());
      }
      return;
    }
    long l = getDrawingTime();
    int n = getWidth();
    float f1 = getScrollX() / n;
    boolean bool = this.jdField_a_of_type_Boolean;
    int i1 = getChildCount();
    int k;
    if ((f1 < 0.0F) && (bool))
    {
      k = i1 - 1;
      j = 0;
    }
    label274:
    label289:
    label291:
    label305:
    for (;;)
    {
      if (a(k))
      {
        if ((j != 0) || (m != 0)) {
          break label274;
        }
        int i2 = i1 * n;
        paramCanvas.translate(-i2, 0.0F);
        drawChild(paramCanvas, getChildAt(k), l);
        paramCanvas.translate(i2, 0.0F);
      }
      for (;;)
      {
        if ((f1 == k) || (!a(j))) {
          break label289;
        }
        if ((!bool) || (j != 0) || (m == 0)) {
          break label291;
        }
        k = i1 * n;
        paramCanvas.translate(k, 0.0F);
        drawChild(paramCanvas, getChildAt(j), l);
        paramCanvas.translate(-k, 0.0F);
        return;
        k = Math.min((int)f1, i1 - 1);
        j = k + 1;
        if (!bool) {
          break label305;
        }
        m = 1;
        j %= i1;
        break;
        drawChild(paramCanvas, getChildAt(k), l);
      }
      break;
      drawChild(paramCanvas, getChildAt(j), l);
      return;
    }
  }
  
  public boolean dispatchUnhandledMove(View paramView, int paramInt)
  {
    if (paramInt == 17)
    {
      if (a() > 0)
      {
        a(a() - 1);
        return true;
      }
    }
    else if ((paramInt == 66) && (a() < getChildCount() - 1))
    {
      a(a() + 1);
      return true;
    }
    return super.dispatchUnhandledMove(paramView, paramInt);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int m = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (m)
    {
    default: 
      if (m == 0) {
        getParent().requestDisallowInterceptTouchEvent(true);
      }
      break;
    }
    for (;;)
    {
      if (this.h == 0) {
        break label248;
      }
      return true;
      int n = (int)Math.abs(f1 - this.jdField_a_of_type_Float);
      int i1 = (int)Math.abs(f2 - this.jdField_b_of_type_Float);
      int k = this.i;
      if (n > k)
      {
        j = 1;
        label114:
        if (i1 <= k) {
          break label156;
        }
      }
      label156:
      for (k = 1;; k = 0)
      {
        double d1 = i1 / n;
        if ((j == 0) && (k == 0)) {
          break label162;
        }
        this.h = 1;
        break;
        j = 0;
        break label114;
      }
      label162:
      this.h = 0;
      break;
      this.jdField_a_of_type_Float = f1;
      this.jdField_b_of_type_Float = f2;
      this.jdField_b_of_type_Boolean = true;
      if (this.jdField_a_of_type_AndroidWidgetScroller.isFinished()) {}
      for (int j = 0;; j = 1)
      {
        this.h = j;
        break;
      }
      this.h = 0;
      break;
      if ((m == 1) || (m == 3)) {
        getParent().requestDisallowInterceptTouchEvent(false);
      }
    }
    label248:
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt4 = getChildCount();
    paramInt1 = 0;
    for (paramInt2 = 0; paramInt1 < paramInt4; paramInt2 = paramInt3)
    {
      View localView = getChildAt(paramInt1);
      paramInt3 = paramInt2;
      if (localView.getVisibility() != 8)
      {
        paramInt3 = getMeasuredWidth();
        localView.layout(paramInt2, 0, paramInt2 + paramInt3, getMeasuredHeight());
        paramInt3 = paramInt2 + paramInt3;
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int k = getChildCount();
    int j = 0;
    while (j < k)
    {
      getChildAt(j).measure(paramInt1, paramInt2);
      j += 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.jdField_a_of_type_AndroidViewVelocityTracker == null) {
      this.jdField_a_of_type_AndroidViewVelocityTracker = VelocityTracker.obtain();
    }
    this.jdField_a_of_type_AndroidViewVelocityTracker.addMovement(paramMotionEvent);
    int k = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    label69:
    int m;
    switch (k)
    {
    default: 
    case 0: 
    case 2: 
      while (k == 0)
      {
        return true;
        if (!this.jdField_a_of_type_AndroidWidgetScroller.isFinished()) {
          this.jdField_a_of_type_AndroidWidgetScroller.abortAnimation();
        }
        this.jdField_a_of_type_Float = f1;
        this.h = 1;
        continue;
        if (this.h == 1)
        {
          m = (int)(this.jdField_a_of_type_Float - f1);
          this.jdField_a_of_type_Float = f1;
          j = getScrollX();
          if (m < 0)
          {
            if (j > 0) {
              scrollBy(Math.max(-j, m), 0);
            } else if (j > -getWidth()) {
              scrollBy(m, 0);
            }
          }
          else if (m > 0)
          {
            int n = getChildCount();
            if (n <= 0) {
              break label355;
            }
            paramMotionEvent = getChildAt(n - 1);
            if (paramMotionEvent == null) {
              break label355;
            }
          }
        }
      }
    }
    label303:
    label355:
    for (int j = paramMotionEvent.getRight() - j; j > 0; j = 0)
    {
      scrollBy(Math.min(j, m), 0);
      break;
      if (this.h == 1)
      {
        paramMotionEvent = this.jdField_a_of_type_AndroidViewVelocityTracker;
        paramMotionEvent.computeCurrentVelocity(1000);
        j = (int)paramMotionEvent.getXVelocity();
        if ((j <= 500) || (this.jdField_a_of_type_Int <= -1)) {
          break label303;
        }
        a(this.jdField_a_of_type_Int - 1);
      }
      for (;;)
      {
        if (this.jdField_a_of_type_AndroidViewVelocityTracker != null)
        {
          this.jdField_a_of_type_AndroidViewVelocityTracker.recycle();
          this.jdField_a_of_type_AndroidViewVelocityTracker = null;
        }
        this.h = 0;
        break;
        if ((j < -500) && (this.jdField_a_of_type_Int < getChildCount())) {
          a(this.jdField_a_of_type_Int + 1);
        } else {
          c();
        }
      }
      if ((k == 1) || (k != 3)) {
        break label69;
      }
      return true;
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    paramView1 = new Rect();
    paramView2.getDrawingRect(paramView1);
    paramView2.requestRectangleOnScreen(paramView1);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    int j = indexOfChild(paramView);
    if ((j != this.jdField_a_of_type_Int) || (!this.jdField_a_of_type_AndroidWidgetScroller.isFinished()))
    {
      a(j);
      return true;
    }
    return false;
  }
  
  public void setCircle(boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public void setOnScreenChangeListener(WorkSpaceView.OnScreenChangeListener paramOnScreenChangeListener)
  {
    this.jdField_a_of_type_ComTencentMobileqqWidgetWorkSpaceView$OnScreenChangeListener = paramOnScreenChangeListener;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.widget.WorkSpaceView
 * JD-Core Version:    0.7.0.1
 */