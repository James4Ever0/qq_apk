package com.tencent.tmassistantbase.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class f
{
  public static Map<g, Handler> a = new ConcurrentHashMap();
  private static Handler b;
  
  public static Handler a()
  {
    if (b == null) {
      b = b(g.a);
    }
    return b;
  }
  
  public static Looper a(g paramg)
  {
    return b(paramg).getLooper();
  }
  
  private static Handler b(g paramg)
  {
    if (a.containsKey(paramg)) {
      return (Handler)a.get(paramg);
    }
    Object localObject = new HandlerThread(paramg.name());
    ((HandlerThread)localObject).start();
    localObject = new Handler(((HandlerThread)localObject).getLooper());
    a.put(paramg, localObject);
    return localObject;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.tmassistantbase.util.f
 * JD-Core Version:    0.7.0.1
 */