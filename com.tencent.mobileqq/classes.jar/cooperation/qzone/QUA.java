package cooperation.qzone;

public class QUA
{
  private static String a;
  private static String b;
  
  public static String a()
  {
    return "V1_AND_SQ_7.6.8_872_YYB_D";
  }
  
  public static String b()
  {
    if (a == null) {
      a = d();
    }
    return a;
  }
  
  public static String c()
  {
    if (b == null) {
      b = d();
    }
    return b;
  }
  
  private static String d()
  {
    int i = "V1_AND_SQ_7.6.8_872_YYB_D".indexOf("_");
    int k = "V1_AND_SQ_7.6.8_872_YYB_D".lastIndexOf("_");
    if (i < 0) {
      i = 0;
    }
    for (;;)
    {
      int j = k;
      if (k < 0) {
        j = "V1_AND_SQ_7.6.8_872_YYB_D".length();
      }
      return "V1_AND_SQ_7.6.8_872_YYB_D".substring(i, j);
      i += 1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     cooperation.qzone.QUA
 * JD-Core Version:    0.7.0.1
 */