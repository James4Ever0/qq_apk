package cooperation.weiyun.utils;

import com.tencent.mobileqq.transfile.RichMediaUtil;

public class PackageUtils
{
  private static int a;
  private static int b;
  private static int c;
  private static int d;
  
  public static int a()
  {
    a();
    return a;
  }
  
  private static void a()
  {
    String[] arrayOfString;
    if (c == 0)
    {
      arrayOfString = RichMediaUtil.a().split("\\.");
      if (arrayOfString.length >= 4) {}
    }
    else
    {
      return;
    }
    try
    {
      a = Integer.valueOf(arrayOfString[0]).intValue();
      b = Integer.valueOf(arrayOfString[1]).intValue();
      d = Integer.valueOf(arrayOfString[2]).intValue();
      c = Integer.valueOf(arrayOfString[3]).intValue();
      return;
    }
    catch (NumberFormatException localNumberFormatException) {}
  }
  
  public static int b()
  {
    a();
    return b;
  }
  
  public static int c()
  {
    a();
    return c;
  }
  
  public static int d()
  {
    a();
    return d;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     cooperation.weiyun.utils.PackageUtils
 * JD-Core Version:    0.7.0.1
 */