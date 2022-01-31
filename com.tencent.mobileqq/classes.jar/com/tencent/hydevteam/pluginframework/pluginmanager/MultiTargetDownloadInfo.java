package com.tencent.hydevteam.pluginframework.pluginmanager;

import com.tencent.hydevteam.common.annotation.API;
import java.util.Map;

@API
public class MultiTargetDownloadInfo
  extends TargetDownloadInfo
{
  @API
  public Map<String, TargetDownloadInfo> allSubTargets;
  @API
  public final String cgiVersion;
  
  public MultiTargetDownloadInfo(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    super(paramString2, paramString3, paramLong);
    this.cgiVersion = paramString1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.hydevteam.pluginframework.pluginmanager.MultiTargetDownloadInfo
 * JD-Core Version:    0.7.0.1
 */