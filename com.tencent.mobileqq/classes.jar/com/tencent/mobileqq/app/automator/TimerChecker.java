package com.tencent.mobileqq.app.automator;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class TimerChecker
  extends LinearGroup
{
  public void a()
  {
    long l = System.currentTimeMillis();
    Object localObject = StepFactory.jdField_a_of_type_ArrayOfInt;
    StringBuilder localStringBuilder = new StringBuilder("{");
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      if ((Math.abs(l - this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.a.getLong("LAST_UPDATE_TIME_PRE_" + localObject[i], 0L)) >= localObject[i] * 60 * 60 * 1000) && (StepFactory.jdField_a_of_type_ArrayOfJavaLangString[i].length() > 2))
      {
        localStringBuilder.append(StepFactory.jdField_a_of_type_ArrayOfJavaLangString[i]).append(',');
        this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.a.edit().putLong("LAST_UPDATE_TIME_PRE_" + localObject[i], l).commit();
      }
      i += 1;
    }
    localObject = localStringBuilder.toString();
    this.jdField_a_of_type_JavaLangString = (((String)localObject).substring(0, ((String)localObject).length() - 1) + "}");
    super.a();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.automator.TimerChecker
 * JD-Core Version:    0.7.0.1
 */