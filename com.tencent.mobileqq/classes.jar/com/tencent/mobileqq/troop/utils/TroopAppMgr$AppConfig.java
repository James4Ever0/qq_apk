package com.tencent.mobileqq.troop.utils;

import org.json.JSONException;
import org.json.JSONObject;

public class TroopAppMgr$AppConfig
{
  public static AppConfig[] a;
  public String a;
  
  static
  {
    jdField_a_of_type_ArrayOfComTencentMobileqqTroopUtilsTroopAppMgr$AppConfig = new AppConfig[] { new AppConfig("BulkChatMessageConfig") };
  }
  
  public TroopAppMgr$AppConfig(String paramString)
  {
    this.jdField_a_of_type_JavaLangString = paramString;
  }
  
  final JSONObject a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      return a(paramString);
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString = new JSONObject();
      }
    }
  }
  
  JSONObject a(JSONObject paramJSONObject)
  {
    return paramJSONObject;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\b.jar
 * Qualified Name:     com.tencent.mobileqq.troop.utils.TroopAppMgr.AppConfig
 * JD-Core Version:    0.7.0.1
 */