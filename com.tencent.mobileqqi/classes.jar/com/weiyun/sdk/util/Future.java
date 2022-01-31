package com.weiyun.sdk.util;

public abstract interface Future<T>
{
  public abstract void cancel();
  
  public abstract T get();
  
  public abstract boolean isCancelled();
  
  public abstract boolean isDone();
  
  public abstract void waitDone();
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.weiyun.sdk.util.Future
 * JD-Core Version:    0.7.0.1
 */