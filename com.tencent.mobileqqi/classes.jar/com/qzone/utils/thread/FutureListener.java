package com.qzone.utils.thread;

public abstract interface FutureListener<T>
{
  public abstract void onFutureBegin(Future<T> paramFuture);
  
  public abstract void onFutureDone(Future<T> paramFuture);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.qzone.utils.thread.FutureListener
 * JD-Core Version:    0.7.0.1
 */