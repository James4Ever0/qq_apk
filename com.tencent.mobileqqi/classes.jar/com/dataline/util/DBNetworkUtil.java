package com.dataline.util;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.BaseApplication;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class DBNetworkUtil
{
  public static int a(String paramString)
  {
    try
    {
      paramString = InetAddress.getByName(a()).getAddress();
      int i = paramString[3];
      int j = paramString[2];
      int k = paramString[1];
      int m = paramString[0];
      return (m & 0xFF) + (((i & 0xFF) << 24) + ((j & 0xFF) << 16) + ((k & 0xFF) << 8)) & 0xFFFFFFFF;
    }
    catch (Exception paramString) {}
    return 0;
  }
  
  public static String a()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      try
      {
        InetAddress localInetAddress;
        do
        {
          localObject1 = NetworkInterface.getNetworkInterfaces();
          Object localObject2;
          while (!((Enumeration)localObject2).hasMoreElements())
          {
            do
            {
              if (!((Enumeration)localObject1).hasMoreElements()) {
                break;
              }
              localObject2 = (NetworkInterface)((Enumeration)localObject1).nextElement();
              ((NetworkInterface)localObject2).getHardwareAddress();
            } while (!((NetworkInterface)localObject2).getName().contains("wlan"));
            localObject2 = ((NetworkInterface)localObject2).getInetAddresses();
          }
          localInetAddress = (InetAddress)((Enumeration)localObject2).nextElement();
        } while ((localInetAddress.isLoopbackAddress()) || (localInetAddress.getAddress().length != 4));
        Object localObject1 = localInetAddress.getHostAddress();
        return localObject1;
      }
      catch (SocketException localSocketException)
      {
        localSocketException.printStackTrace();
      }
      return "";
    }
    WifiManager localWifiManager = (WifiManager)BaseApplication.getContext().getSystemService("wifi");
    if (!localWifiManager.isWifiEnabled()) {
      return "";
    }
    return a(localWifiManager.getConnectionInfo().getIpAddress());
  }
  
  public static String a(int paramInt)
  {
    return (paramInt & 0xFF) + "." + (paramInt >> 8 & 0xFF) + "." + (paramInt >> 16 & 0xFF) + "." + (paramInt >> 24 & 0xFF);
  }
  
  public static boolean a()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      try
      {
        int i;
        do
        {
          InetAddress localInetAddress;
          do
          {
            Enumeration localEnumeration = NetworkInterface.getNetworkInterfaces();
            Object localObject;
            while (!((Enumeration)localObject).hasMoreElements())
            {
              do
              {
                if (!localEnumeration.hasMoreElements()) {
                  break;
                }
                localObject = (NetworkInterface)localEnumeration.nextElement();
                ((NetworkInterface)localObject).getHardwareAddress();
              } while (!((NetworkInterface)localObject).getName().contains("wlan"));
              localObject = ((NetworkInterface)localObject).getInetAddresses();
            }
            localInetAddress = (InetAddress)((Enumeration)localObject).nextElement();
          } while (localInetAddress.isLoopbackAddress());
          i = localInetAddress.getAddress().length;
        } while (i != 4);
        return true;
      }
      catch (SocketException localSocketException)
      {
        localSocketException.printStackTrace();
      }
      return false;
    }
    return NetworkUtil.g(BaseApplication.getContext());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     com.dataline.util.DBNetworkUtil
 * JD-Core Version:    0.7.0.1
 */