package cooperation.qqpim;

import android.content.Context;
import android.text.TextUtils;

public class QQPimTipsInfoHelper
{
  public static void a(Context paramContext, QQPimTipsInfo paramQQPimTipsInfo)
  {
    if (paramQQPimTipsInfo == null)
    {
      QQPimSharedPrefrenceUtil.a(paramContext, "QQPIM_TIPS_CLICK", System.currentTimeMillis());
      return;
    }
    QQPimSharedPrefrenceUtil.a(paramContext, "QQPIM_TIPS_CLICK" + paramQQPimTipsInfo.jdField_a_of_type_Int, paramQQPimTipsInfo.jdField_a_of_type_JavaLangString + ";" + paramQQPimTipsInfo.b + ";" + System.currentTimeMillis());
  }
  
  public static void b(Context paramContext, QQPimTipsInfo paramQQPimTipsInfo)
  {
    if (paramQQPimTipsInfo == null) {}
    while (TextUtils.isEmpty(QQPimSharedPrefrenceUtil.a(paramContext, "QQPIM_TIPS_CLICK" + paramQQPimTipsInfo.jdField_a_of_type_Int))) {
      return;
    }
    switch (paramQQPimTipsInfo.jdField_a_of_type_Int)
    {
    case 3: 
    default: 
      return;
    case 1: 
      paramQQPimTipsInfo.jdField_a_of_type_Byte = 0;
      return;
    case 2: 
      paramQQPimTipsInfo.jdField_a_of_type_Byte = 0;
      return;
    }
    paramQQPimTipsInfo.jdField_a_of_type_Byte = 0;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     cooperation.qqpim.QQPimTipsInfoHelper
 * JD-Core Version:    0.7.0.1
 */