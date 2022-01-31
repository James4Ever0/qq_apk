package com.tencent.mobileqq.app;

public class DeviceProfileManager$DPCConfigInfo
  implements Cloneable
{
  public String featureValue = "0";
  
  public Object clone()
  {
    try
    {
      DPCConfigInfo localDPCConfigInfo = (DPCConfigInfo)super.clone();
      if (localDPCConfigInfo == null) {
        return this;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      Object localObject;
      for (;;)
      {
        localCloneNotSupportedException.printStackTrace();
        localObject = null;
      }
      localObject.featureValue = this.featureValue;
      return localObject;
    }
  }
  
  public String toString()
  {
    return "DPCConfigInfo: featureValue=" + this.featureValue;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.DeviceProfileManager.DPCConfigInfo
 * JD-Core Version:    0.7.0.1
 */