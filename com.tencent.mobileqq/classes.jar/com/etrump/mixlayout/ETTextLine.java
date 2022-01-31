package com.etrump.mixlayout;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;

public class ETTextLine
{
  private int jdField_a_of_type_Int;
  private ArrayList jdField_a_of_type_JavaUtilArrayList = new ArrayList(4);
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  
  public int a()
  {
    return this.d;
  }
  
  public ETFragment a(int paramInt)
  {
    int i = this.jdField_a_of_type_Int;
    int n = this.jdField_a_of_type_JavaUtilArrayList.size();
    int j = i;
    int m = 0;
    int k = j;
    j = m;
    while (j < n)
    {
      ETFragment localETFragment = (ETFragment)this.jdField_a_of_type_JavaUtilArrayList.get(j);
      k += localETFragment.a();
      if ((i <= paramInt) && (paramInt < k)) {
        return localETFragment;
      }
      j += 1;
      i = k;
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i = 0;
    this.jdField_a_of_type_Int = paramInt1;
    this.b = paramInt2;
    this.c = 0;
    this.d = 0;
    paramInt2 = this.jdField_a_of_type_JavaUtilArrayList.size();
    paramInt1 = 0;
    ETFragment localETFragment;
    int j;
    while (paramInt1 < paramInt2)
    {
      localETFragment = (ETFragment)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt1);
      if (localETFragment.b() > this.d) {
        this.d = localETFragment.b();
      }
      j = this.c;
      this.c = (localETFragment.a() + j);
      paramInt1 += 1;
    }
    this.e = 0;
    this.f = 0;
    paramInt1 = i;
    while (paramInt1 < paramInt2)
    {
      localETFragment = (ETFragment)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt1);
      if (localETFragment.d() == 0)
      {
        i = localETFragment.e();
        j = localETFragment.b();
        if (i > this.e) {
          this.e = i;
        }
        if (j > this.f) {
          this.f = j;
        }
      }
      paramInt1 += 1;
    }
  }
  
  public void a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int k = this.jdField_a_of_type_JavaUtilArrayList.size();
    int j = 0;
    int i = paramInt1;
    paramInt1 = j;
    while (paramInt1 < k)
    {
      ETFragment localETFragment = (ETFragment)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt1);
      if (localETFragment.d() == 0) {
        localETFragment.a(paramBitmap, i, this.e + paramInt2 - localETFragment.e() + this.d - this.f);
      }
      i += localETFragment.a();
      paramInt1 += 1;
    }
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    int k = this.jdField_a_of_type_JavaUtilArrayList.size();
    int j = 0;
    int i = paramInt1;
    paramInt1 = j;
    while (paramInt1 < k)
    {
      ETFragment localETFragment = (ETFragment)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt1);
      localETFragment.a(paramCanvas, i, paramInt2, this.d);
      i += localETFragment.a();
      paramInt1 += 1;
    }
  }
  
  public void a(ETFragment paramETFragment)
  {
    this.jdField_a_of_type_JavaUtilArrayList.add(paramETFragment);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public int d()
  {
    return this.b;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.etrump.mixlayout.ETTextLine
 * JD-Core Version:    0.7.0.1
 */