package com.sixgod.pluginsdk.log;

public abstract interface ISixGodReporter
{
  public abstract String getHostVersion();
  
  public abstract void report(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, String paramString6, String paramString7, String paramString8, String paramString9);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.sixgod.pluginsdk.log.ISixGodReporter
 * JD-Core Version:    0.7.0.1
 */