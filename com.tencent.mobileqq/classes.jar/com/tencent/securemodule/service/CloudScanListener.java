package com.tencent.securemodule.service;

import com.tencent.securemodule.impl.AppInfo;
import java.util.List;

public abstract interface CloudScanListener
{
  public abstract void onFinish(int paramInt);
  
  public abstract void onRiskFoud(List<AppInfo> paramList);
  
  public abstract void onRiskFound();
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.securemodule.service.CloudScanListener
 * JD-Core Version:    0.7.0.1
 */