package com.tencent.mobileqq.troop.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.mobileqq.app.ThreadManager;

public class TroopMemberThreadManager
{
  private static Handler a;
  
  public static void a(Runnable paramRunnable)
  {
    if (a == null)
    {
      HandlerThread localHandlerThread = ThreadManager.newFreeHandlerThread("TroopMemberDBThread", 0);
      localHandlerThread.start();
      a = new Handler(localHandlerThread.getLooper());
    }
    a.post(paramRunnable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\b.jar
 * Qualified Name:     com.tencent.mobileqq.troop.utils.TroopMemberThreadManager
 * JD-Core Version:    0.7.0.1
 */