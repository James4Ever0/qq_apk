package com.tencent.biz.pubaccount.readinjoy.engine;

import android.widget.ListAdapter;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.widget.AbsListView;

public class ReadinjoySPEventReport$ScrollReport
{
  static int jdField_a_of_type_Int = -1;
  static long jdField_a_of_type_Long;
  static int jdField_b_of_type_Int = -1;
  static long jdField_b_of_type_Long;
  
  static int a()
  {
    if (jdField_a_of_type_Int > jdField_b_of_type_Int) {
      return 0;
    }
    return 1;
  }
  
  static void a(AbsListView paramAbsListView)
  {
    ReadinjoySPEventReport.ScrollStep localScrollStep = new ReadinjoySPEventReport.ScrollStep();
    int i = paramAbsListView.getLastVisiblePosition();
    int j = ((ListAdapter)paramAbsListView.getAdapter()).getCount();
    localScrollStep.jdField_a_of_type_Int = a();
    localScrollStep.jdField_b_of_type_Int = Math.abs(jdField_b_of_type_Int - jdField_a_of_type_Int);
    localScrollStep.jdField_a_of_type_Long = (jdField_b_of_type_Long - jdField_a_of_type_Long);
    localScrollStep.c = (j - i);
    localScrollStep.jdField_b_of_type_Long = jdField_b_of_type_Long;
    localScrollStep.d = j;
    ReadinjoySPEventReport.ScrollReportUtil.a(localScrollStep);
  }
  
  public static void a(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramAbsListView == null) || (paramAbsListView.getChildCount() == 0) || (paramAbsListView.getAdapter() == null)) {}
    do
    {
      do
      {
        return;
      } while ((ReadinjoySPEventReport.ScrollReportUtil.jdField_a_of_type_Long < 0L) || (ReadinjoySPEventReport.ScrollReportUtil.jdField_b_of_type_Long < 0L));
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((jdField_b_of_type_Int >= 0) || (jdField_b_of_type_Long >= 0L));
    jdField_b_of_type_Int = paramAbsListView.getFirstVisiblePosition();
    jdField_b_of_type_Long = NetConnInfoCenter.getServerTimeMillis();
    a(paramAbsListView);
    return;
    jdField_a_of_type_Int = paramAbsListView.getFirstVisiblePosition();
    jdField_a_of_type_Long = NetConnInfoCenter.getServerTimeMillis();
    jdField_b_of_type_Int = -1;
    jdField_b_of_type_Long = -1L;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.pubaccount.readinjoy.engine.ReadinjoySPEventReport.ScrollReport
 * JD-Core Version:    0.7.0.1
 */