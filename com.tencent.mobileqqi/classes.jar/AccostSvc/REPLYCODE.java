package AccostSvc;

import java.io.Serializable;

public final class REPLYCODE
  implements Serializable
{
  public static final REPLYCODE REPLYCODE_ERROR_BINDERROR;
  public static final REPLYCODE REPLYCODE_ERROR_EXCEPTION;
  public static final REPLYCODE REPLYCODE_ERROR_FUNCNAME;
  public static final REPLYCODE REPLYCODE_SUCC;
  public static final int _REPLYCODE_ERROR_BINDERROR = 3;
  public static final int _REPLYCODE_ERROR_EXCEPTION = 1;
  public static final int _REPLYCODE_ERROR_FUNCNAME = 2;
  public static final int _REPLYCODE_SUCC = 0;
  private static REPLYCODE[] a;
  private String __T = new String();
  private int __value;
  
  static
  {
    if (!REPLYCODE.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      a = new REPLYCODE[4];
      REPLYCODE_SUCC = new REPLYCODE(0, 0, "REPLYCODE_SUCC");
      REPLYCODE_ERROR_EXCEPTION = new REPLYCODE(1, 1, "REPLYCODE_ERROR_EXCEPTION");
      REPLYCODE_ERROR_FUNCNAME = new REPLYCODE(2, 2, "REPLYCODE_ERROR_FUNCNAME");
      REPLYCODE_ERROR_BINDERROR = new REPLYCODE(3, 3, "REPLYCODE_ERROR_BINDERROR");
      return;
    }
  }
  
  private REPLYCODE(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    a[paramInt1] = this;
  }
  
  public static REPLYCODE convert(int paramInt)
  {
    int i = 0;
    while (i < a.length)
    {
      if (a[i].value() == paramInt) {
        return a[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public static REPLYCODE convert(String paramString)
  {
    int i = 0;
    while (i < a.length)
    {
      if (a[i].toString().equals(paramString)) {
        return a[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public String toString()
  {
    return this.__T;
  }
  
  public int value()
  {
    return this.__value;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     AccostSvc.REPLYCODE
 * JD-Core Version:    0.7.0.1
 */