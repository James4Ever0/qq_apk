package com.tencent.mobileqq.highway.segment;

public abstract interface IRequestListener
{
  public abstract void handleConnClosed();
  
  public abstract void handleError(int paramInt);
  
  public abstract void handleResponse(HwResponse paramHwResponse);
  
  public abstract void handleSendBegin(int paramInt);
  
  public abstract void handleSendEnd(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void handleSendTimeOut();
  
  public abstract void handleTimeOut();
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.highway.segment.IRequestListener
 * JD-Core Version:    0.7.0.1
 */