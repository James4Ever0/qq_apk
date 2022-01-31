package cooperation.qlink;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.qq.jce.wup.BasicClassTypeUtil;
import com.tencent.common.app.AppInterface;
import com.tencent.common.app.BaseApplicationImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QlinkHelper
{
  public static final String a = "com.tencent.qq.syncQunMsg";
  public static final String b = "com.tencent.qq.unreadcount";
  private static final String c = "com.tencent.qlink.app.QlinkAppInterface";
  private static final String d = "com.tencent.qlink.activity.QlinkDiscoverActivity";
  private static final String e = "com.tencent.qlink.activity.QlinkApGuidelineActivity";
  private static final String f = "com.tencent.qlink.activity.QlinkProxyActivity";
  private static final String g = "com.tencent.qlink.activity.QlinkAdjudicationActivity";
  
  public static Intent a()
  {
    Intent localIntent = new Intent();
    QlinkPluginProxyActivity.a(localIntent, "com.tencent.qlink.activity.QlinkDiscoverActivity");
    return localIntent;
  }
  
  public static AppInterface a(BaseApplicationImpl paramBaseApplicationImpl, String paramString)
  {
    if ((paramBaseApplicationImpl == null) || (paramString == null)) {
      return null;
    }
    try
    {
      Class localClass1 = Class.forName("com.tencent.qlink.app.QlinkAppInterface");
      if (localClass1 == null) {
        return null;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Class localClass2;
      try
      {
        ClassLoader localClassLoader = QlinkPluginProxyActivity.a(paramBaseApplicationImpl);
        localClass2 = localClassLoader.loadClass("com.tencent.qlink.app.QlinkAppInterface");
        BasicClassTypeUtil.setClassLoader(true, localClassLoader);
      }
      catch (ClassNotFoundException paramBaseApplicationImpl)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
      do
      {
        return null;
        paramBaseApplicationImpl = localClass2.getDeclaredConstructor(new Class[] { paramBaseApplicationImpl.getClass(), paramString.getClass() }).newInstance(new Object[] { paramBaseApplicationImpl, paramString });
      } while ((paramBaseApplicationImpl == null) || (!(paramBaseApplicationImpl instanceof AppInterface)));
      paramBaseApplicationImpl = (AppInterface)paramBaseApplicationImpl;
      return paramBaseApplicationImpl;
    }
    catch (IllegalArgumentException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (IllegalAccessException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (InstantiationException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (InvocationTargetException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (NoSuchMethodException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (Exception paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent("com.tencent.qq.syncQunMsg");
    Bundle localBundle = new Bundle();
    localBundle.putInt("com.tencent.qq.unreadcount", paramInt);
    localIntent.putExtras(localBundle);
    paramContext.sendBroadcast(localIntent);
  }
  
  public static boolean a()
  {
    try
    {
      WifiManager localWifiManager = (WifiManager)BaseApplicationImpl.getContext().getSystemService("wifi");
      Method localMethod = localWifiManager.getClass().getMethod("isWifiApEnabled", new Class[0]);
      localMethod.setAccessible(true);
      boolean bool = ((Boolean)localMethod.invoke(localWifiManager, new Object[0])).booleanValue();
      return bool;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.printStackTrace();
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public static Intent b()
  {
    Intent localIntent = new Intent();
    QlinkPluginProxyActivity.a(localIntent, "com.tencent.qlink.activity.QlinkApGuidelineActivity");
    return localIntent;
  }
  
  public static Intent c()
  {
    Intent localIntent = new Intent();
    QlinkPluginProxyActivity.a(localIntent, "com.tencent.qlink.activity.QlinkProxyActivity");
    return localIntent;
  }
  
  public static Intent d()
  {
    Intent localIntent = new Intent();
    QlinkPluginProxyActivity.a(localIntent, "com.tencent.qlink.activity.QlinkAdjudicationActivity");
    return localIntent;
  }
  
  public void a(Intent paramIntent, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    if (paramIntent == null) {
      return;
    }
    paramIntent.putExtra("uin", paramString1);
    paramIntent.putExtra("nickname", paramString2);
    paramIntent.putExtra("sid", paramString3);
    paramIntent.putExtra("ha3", paramArrayOfByte);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     cooperation.qlink.QlinkHelper
 * JD-Core Version:    0.7.0.1
 */