package com.tencent.mobileqq.earlydownload.xmldata;

public class PokeResData
  extends XmlData
{
  @saveInSP(a=true, b=true)
  public long SoLength;
  @saveInSP(a=true, b=true)
  public String SoMD5 = "";
  
  public String getSharedPreferencesName()
  {
    return "early_qq.android.poke.res_1228";
  }
  
  public String getStrResName()
  {
    return "qq.android.poke.res_1228";
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.mobileqq.earlydownload.xmldata.PokeResData
 * JD-Core Version:    0.7.0.1
 */