package com.tencent.component.media.image;

import java.util.LinkedList;
import pek;

public abstract class BucketPool
  implements Releaser
{
  private static int[] jdField_a_of_type_ArrayOfInt = new int[30];
  private int jdField_a_of_type_Int = 0;
  private pek[] jdField_a_of_type_ArrayOfPek;
  
  public BucketPool(PoolParams paramPoolParams)
  {
    this.jdField_a_of_type_Int = paramPoolParams.getBucketPoolSize();
    if (this.jdField_a_of_type_Int <= 0) {
      throw new RuntimeException("bucket size <= 0 !!");
    }
    this.jdField_a_of_type_ArrayOfPek = new pek[this.jdField_a_of_type_Int];
    PoolParams.BucketParams localBucketParams;
    for (Object localObject = null; i < this.jdField_a_of_type_Int; localObject = localBucketParams)
    {
      localBucketParams = paramPoolParams.getBucketParams(i);
      a(localBucketParams, (PoolParams.BucketParams)localObject);
      this.jdField_a_of_type_ArrayOfPek[i] = getBuck(localBucketParams);
      i += 1;
    }
  }
  
  private static void a(PoolParams.BucketParams paramBucketParams1, PoolParams.BucketParams paramBucketParams2)
  {
    if ((paramBucketParams1.arraysSize <= 0) || (paramBucketParams1.bucketMinSize <= 0)) {
      throw new RuntimeException("byteArrayParams is wrong ");
    }
    int i = 0;
    if (paramBucketParams2 != null) {
      i = paramBucketParams2.bucketMinSize;
    }
    if (i >= paramBucketParams1.bucketMinSize) {
      throw new RuntimeException("byteArrayParams.minSize can not smaller than pre " + i + ", bucketMinSize " + paramBucketParams1.bucketMinSize);
    }
  }
  
  protected abstract Object allocData(int paramInt);
  
  public Object get(int paramInt)
  {
    Object localObject1 = null;
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= this.jdField_a_of_type_Int) {
          break label96;
        }
        pek localpek = this.jdField_a_of_type_ArrayOfPek[i];
        if (localpek.b >= paramInt)
        {
          localObject1 = localpek.jdField_a_of_type_JavaUtilLinkedList.poll();
          if (localObject1 != null) {
            break label91;
          }
          i = handleBucketListEmpty(localpek);
          if (localObject1 == null)
          {
            localObject1 = allocData(i);
            miss(paramInt);
            return localObject1;
          }
        }
        else
        {
          i += 1;
          continue;
        }
        hit(paramInt, localObject1);
        continue;
        i = paramInt;
      }
      finally {}
      label91:
      continue;
      label96:
      i = paramInt;
    }
  }
  
  protected pek getBuck(PoolParams.BucketParams paramBucketParams)
  {
    pek localpek = new pek(this);
    localpek.jdField_a_of_type_Int = paramBucketParams.arraysSize;
    localpek.b = paramBucketParams.bucketMinSize;
    localpek.c = localpek.jdField_a_of_type_Int;
    localpek.jdField_a_of_type_JavaUtilLinkedList = new LinkedList();
    int i = 0;
    while (i < localpek.jdField_a_of_type_Int)
    {
      localpek.jdField_a_of_type_JavaUtilLinkedList.add(allocData(localpek.b));
      i += 1;
    }
    return localpek;
  }
  
  protected abstract int getSizeForData(Object paramObject);
  
  protected abstract int handleBucketListEmpty(pek parampek);
  
  protected abstract boolean handleRecyleData(pek parampek, Object paramObject);
  
  protected void hit(int paramInt, Object paramObject) {}
  
  protected void miss(int paramInt) {}
  
  public void release(Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    for (;;)
    {
      int j;
      int i;
      boolean bool1;
      pek localpek;
      try
      {
        j = getSizeForData(paramObject);
        boolean bool2 = true;
        i = this.jdField_a_of_type_Int - 1;
        bool1 = bool2;
        if (i < 0) {
          break label85;
        }
        localpek = this.jdField_a_of_type_ArrayOfPek[i];
        if (j > localpek.b + 2500)
        {
          releaseData(paramObject);
          break;
        }
      }
      finally {}
      if (j >= localpek.b)
      {
        bool1 = handleRecyleData(localpek, paramObject);
        label85:
        if (!bool1) {
          break;
        }
        releaseData(paramObject);
        break;
      }
      i -= 1;
    }
  }
  
  protected abstract void releaseData(Object paramObject);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.component.media.image.BucketPool
 * JD-Core Version:    0.7.0.1
 */