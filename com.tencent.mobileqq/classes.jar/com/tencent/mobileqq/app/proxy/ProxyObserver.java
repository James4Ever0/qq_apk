package com.tencent.mobileqq.app.proxy;

public class ProxyObserver
{
  public void a() {}
  
  public void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1000: 
      a();
      return;
    }
    b();
  }
  
  public void b() {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.proxy.ProxyObserver
 * JD-Core Version:    0.7.0.1
 */