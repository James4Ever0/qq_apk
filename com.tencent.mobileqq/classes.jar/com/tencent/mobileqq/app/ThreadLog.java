package com.tencent.mobileqq.app;

import android.os.Handler;
import android.os.Looper;

public class ThreadLog
{
  public static boolean isColorLevel()
  {
    return (ThreadManagerV2.sThreadWrapContext != null) && (ThreadManagerV2.sThreadWrapContext.isColorLevel());
  }
  
  public static boolean needRecordJob()
  {
    boolean bool = false;
    if (needReportRunOrBlocking()) {
      bool = true;
    }
    while (ThreadManagerV2.sThreadWrapContext == null) {
      return bool;
    }
    return ThreadManagerV2.sThreadWrapContext.isShotReportRejectedError();
  }
  
  public static boolean needReportRunOrBlocking()
  {
    return (!ThreadSetting.isPublicVersion) && (ThreadSetting.sProcessId == ThreadSetting.PROCESS_QQ);
  }
  
  public static void printQLog(String paramString1, String paramString2)
  {
    printQLog(paramString1, paramString2, null);
  }
  
  public static void printQLog(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (isColorLevel()) {
      ThreadManagerV2.sThreadWrapContext.d(paramString1, ThreadSetting.CLR, paramString2, paramThrowable);
    }
  }
  
  public static void trackException(String paramString1, final String paramString2)
  {
    paramString2 = new IllegalArgumentException(paramString2);
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        ThreadLog.printQLog(this.val$tag, "ExceptinTracker", paramString2);
        throw new IllegalArgumentException(paramString2);
      }
    });
    throw paramString2;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.ThreadLog
 * JD-Core Version:    0.7.0.1
 */