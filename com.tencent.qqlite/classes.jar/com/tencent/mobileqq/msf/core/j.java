package com.tencent.mobileqq.msf.core;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.mobileqq.msf.core.net.h;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class j
{
  static final String b = "MSF.C.NetConnTag";
  MsfCore a;
  private volatile Handler c;
  
  public j(MsfCore paramMsfCore)
  {
    this.a = paramMsfCore;
  }
  
  public Runnable a(int paramInt, long paramLong)
  {
    a locala = new a(paramInt);
    this.c.postDelayed(locala, paramLong);
    return locala;
  }
  
  public Runnable a(h paramh, long paramLong)
  {
    if (paramh != null)
    {
      paramh = new c(paramh);
      this.c.postDelayed(paramh, paramLong);
      return paramh;
    }
    return null;
  }
  
  public Runnable a(ToServiceMsg paramToServiceMsg, long paramLong)
  {
    b localb = new b(paramToServiceMsg);
    if (paramToServiceMsg != null) {
      this.c.postDelayed(localb, paramLong);
    }
    return localb;
  }
  
  public void a()
  {
    HandlerThread localHandlerThread = new HandlerThread("MsfCoreTimeoutChecker", 5);
    localHandlerThread.start();
    this.c = new Handler(localHandlerThread.getLooper());
  }
  
  public void a(Runnable paramRunnable)
  {
    this.c.removeCallbacks(paramRunnable);
  }
  
  public Handler b()
  {
    return this.c;
  }
  
  class a
    implements Runnable
  {
    private int b = 0;
    
    public a(int paramInt)
    {
      this.b = paramInt;
    }
    
    public void run()
    {
      ArrayList localArrayList = (ArrayList)j.this.a.sender.f().remove(Integer.valueOf(this.b));
      if (localArrayList != null) {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "remove merged ssoseq list: " + localArrayList.toString() + " from SSO LoginMerge " + this.b);
        }
      }
      while (!QLog.isColorLevel()) {
        return;
      }
      QLog.d("MSF.C.NetConnTag", 2, "SSO LoginMerge's ssoseq " + this.b + "list has been removed by error code.");
    }
  }
  
  class b
    implements Runnable
  {
    private ToServiceMsg b;
    
    public b(ToServiceMsg paramToServiceMsg)
    {
      this.b = paramToServiceMsg;
    }
    
    public void run()
    {
      if (this.b == null) {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "req null, return.");
        }
      }
      for (;;)
      {
        return;
        try
        {
          ToServiceMsg localToServiceMsg = (ToServiceMsg)j.this.a.sender.e().get(Integer.valueOf(this.b.getRequestSsoSeq()));
          if ((localToServiceMsg != null) && (localToServiceMsg.isNeedCallback()))
          {
            localToServiceMsg = (ToServiceMsg)j.this.a.sender.e().remove(Integer.valueOf(this.b.getRequestSsoSeq()));
            if (localToServiceMsg == null)
            {
              if (!QLog.isColorLevel()) {
                continue;
              }
              QLog.d("MSF.C.NetConnTag", 2, "timeout msg " + localToServiceMsg + " also received resp, return.");
            }
          }
        }
        catch (Exception localException1)
        {
          QLog.d("MSF.C.NetConnTag", 1, "got fail msg. " + localException1, localException1);
          return;
        }
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.NetConnTag", 1, "netRecv ssoSeq:" + localException1.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(localException1.getUin()) + " cmd:" + localException1.getServiceCmd() + " len:" + 0 + " costTime:" + localException1.getTimeout() + NetConnInfoCenter.getSignalStrengthsLog() + " code:" + 1002 + " failMsg:" + "wait serverResp timeout");
      }
      for (;;)
      {
        FromServiceMsg localFromServiceMsg = k.a(localException1);
        localFromServiceMsg.setBusinessFail(1002, "wait serverResp timeout");
        boolean bool = j.this.a.sender.a(localException1, localFromServiceMsg);
        if (!bool) {
          break;
        }
        try
        {
          j.this.a.getSsoRespHandler().c(localException1, localFromServiceMsg);
          return;
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
          return;
        }
        QLog.d("MSF.C.NetConnTag", 1, "netRecv ssoSeq:" + localException2.getRequestSsoSeq() + " uin:" + MsfSdkUtils.getShortUin(localException2.getUin()) + " cmd:" + localException2.getServiceCmd().hashCode() + " len:" + 0 + " costTime:" + localException2.getTimeout() + NetConnInfoCenter.getSignalStrengthsLog() + " code:" + 1002 + " failMsg:" + "wait serverResp timeout");
      }
    }
  }
  
  class c
    implements Runnable
  {
    private h b;
    
    public c(h paramh)
    {
      this.b = paramh;
    }
    
    public void run()
    {
      if (this.b != null) {}
      try
      {
        this.b.d();
        return;
      }
      catch (Exception localException)
      {
        QLog.d("MSF.C.NetConnTag", 1, "call loginConnectTimeOut error " + localException);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.msf.core.j
 * JD-Core Version:    0.7.0.1
 */