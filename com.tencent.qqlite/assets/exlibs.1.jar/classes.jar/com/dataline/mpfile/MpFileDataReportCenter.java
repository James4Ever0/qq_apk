package com.dataline.mpfile;

import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.qphone.base.util.BaseApplication;
import java.util.HashMap;

public class MpFileDataReportCenter
{
  public static final int a = 19;
  public static final String a = "workType";
  public static HashMap a = new HashMap();
  public static final int b = 0;
  public static final String b = "result";
  public static final int c = 1;
  public static final String c = "fileCount";
  public static final String d = "serverIp";
  public static final String e = "localIp";
  public static final String f = "serverPort";
  public static final String g = "fileSize";
  public static final String h = "startTime";
  public static final String i = "endTime";
  public static final String j = "reportterm";
  
  public static void a(QQAppInterface paramQQAppInterface, MpfileDataReportInfo paramMpfileDataReportInfo)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("workType", String.valueOf(paramMpfileDataReportInfo.jdField_a_of_type_Int));
    localHashMap.put("result", String.valueOf(paramMpfileDataReportInfo.jdField_b_of_type_Int));
    localHashMap.put("fileCount", String.valueOf(paramMpfileDataReportInfo.jdField_c_of_type_Int));
    localHashMap.put("serverIp", paramMpfileDataReportInfo.jdField_a_of_type_JavaLangString);
    localHashMap.put("localIp", paramMpfileDataReportInfo.jdField_b_of_type_JavaLangString);
    localHashMap.put("serverPort", String.valueOf(paramMpfileDataReportInfo.d));
    localHashMap.put("fileSize", String.valueOf(paramMpfileDataReportInfo.jdField_a_of_type_Long));
    localHashMap.put("startTime", String.valueOf(paramMpfileDataReportInfo.jdField_b_of_type_Long));
    localHashMap.put("endTime", String.valueOf(paramMpfileDataReportInfo.jdField_c_of_type_Long));
    localHashMap.put("reportterm", String.valueOf(19));
    StatisticCollector localStatisticCollector = StatisticCollector.a(BaseApplication.getContext());
    paramQQAppInterface = paramQQAppInterface.a();
    if (paramMpfileDataReportInfo.jdField_b_of_type_Int == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localStatisticCollector.a(paramQQAppInterface, "actFAFileConnection", bool, 0L, 0L, localHashMap, null);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.dataline.mpfile.MpFileDataReportCenter
 * JD-Core Version:    0.7.0.1
 */