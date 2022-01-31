package AccostSvc;

import java.io.Serializable;

public final class ListType
  implements Serializable
{
  public static final ListType ListType_Only_Uin;
  public static final ListType ListType_SimpleInfo;
  public static final int _ListType_Only_Uin = 1;
  public static final int _ListType_SimpleInfo = 2;
  private static ListType[] a;
  private String __T = new String();
  private int __value;
  
  static
  {
    if (!ListType.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      a = new ListType[2];
      ListType_Only_Uin = new ListType(0, 1, "ListType_Only_Uin");
      ListType_SimpleInfo = new ListType(1, 2, "ListType_SimpleInfo");
      return;
    }
  }
  
  private ListType(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    a[paramInt1] = this;
  }
  
  public static ListType convert(int paramInt)
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
  
  public static ListType convert(String paramString)
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
 * Qualified Name:     AccostSvc.ListType
 * JD-Core Version:    0.7.0.1
 */