package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class TbsLinuxToolsJni
{
  private static final String TAG = "TbsLinuxToolsJni";
  private static boolean gJniloaded = false;
  private static boolean mbIsInited = false;
  
  public TbsLinuxToolsJni(Context paramContext)
  {
    init(paramContext);
  }
  
  private native int ChmodInner(String paramString1, String paramString2);
  
  private void init(Context paramContext)
  {
    label37:
    label167:
    try
    {
      if (mbIsInited) {
        return;
      }
      mbIsInited = true;
    }
    finally {}
    try
    {
      if (TbsShareManager.isThirdPartyApp(paramContext))
      {
        localObject1 = TbsShareManager.getAvailableCorePath();
        if (localObject1 != null) {
          break label200;
        }
        localObject1 = TbsShareManager.getAvailableTbsCorePath(paramContext);
      }
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      gJniloaded = false;
      break label167;
      break label37;
    }
    for (Object localObject1 = new File((String)localObject1);; localObject1 = TbsInstaller.getInstance().getTbsCoreShareDir(paramContext))
    {
      if (localObject1 != null)
      {
        File localFile = new File(((File)localObject1).getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
        Object localObject2;
        if (localFile != null)
        {
          localObject2 = localObject1;
          if (localFile.exists()) {}
        }
        else
        {
          localObject2 = localObject1;
          if (!TbsShareManager.isThirdPartyApp(paramContext)) {
            localObject2 = TbsInstaller.getInstance().getCoreShareDecoupleDir(paramContext);
          }
        }
        if (localObject2 != null)
        {
          System.load(((File)localObject2).getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
          gJniloaded = true;
        }
      }
      ChmodInner("/checkChmodeExists", "700");
      return;
    }
  }
  
  public int Chmod(String paramString1, String paramString2)
  {
    if (!gJniloaded)
    {
      TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
      return -1;
    }
    return ChmodInner(paramString1, paramString2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsLinuxToolsJni
 * JD-Core Version:    0.7.0.1
 */