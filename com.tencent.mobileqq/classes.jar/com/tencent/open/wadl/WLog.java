package com.tencent.open.wadl;

import android.text.TextUtils;
import com.tencent.qphone.base.util.QLog;

public class WLog
{
  private static String a(String paramString)
  {
    String str = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      str = paramString;
      if (!paramString.startsWith("##@")) {
        str = "##@" + paramString;
      }
    }
    return str;
  }
  
  public static void a(String paramString1, int paramInt, String paramString2)
  {
    paramString2 = "step" + paramInt + "-->" + paramString2;
    QLog.d("WadlStep." + paramString1, 2, paramString2);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    QLog.e(paramString1, 1, a(paramString2));
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    QLog.e(paramString1, 1, a(paramString2), paramThrowable);
  }
  
  public static void b(String paramString1, String paramString2)
  {
    QLog.d(paramString1, 1, a(paramString2));
  }
  
  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    QLog.d(paramString1, 1, a(paramString2), paramThrowable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.open.wadl.WLog
 * JD-Core Version:    0.7.0.1
 */