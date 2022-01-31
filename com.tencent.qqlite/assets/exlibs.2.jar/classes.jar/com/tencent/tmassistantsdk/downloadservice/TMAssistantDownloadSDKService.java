package com.tencent.tmassistantsdk.downloadservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.tmassistantsdk.c.d;
import com.tencent.tmassistantsdk.downloadservice.a.c;
import com.tencent.tmassistantsdk.f.f;
import com.tencent.tmassistantsdk.f.k;
import java.util.HashMap;

public class TMAssistantDownloadSDKService
  extends Service
  implements com.tencent.tmassistantsdk.downloadservice.a.a
{
  protected final RemoteCallbackList a = new RemoteCallbackList();
  protected final HashMap b = new HashMap();
  c c = null;
  private p d = new p(this);
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    try
    {
      int j = this.a.beginBroadcast();
      int i = 0;
      for (;;)
      {
        if (i < j) {}
        try
        {
          com.tencent.tmassistantsdk.a.a locala = (com.tencent.tmassistantsdk.a.a)this.a.getBroadcastItem(i);
          String str = (String)this.b.get(locala);
          if ((str != null) && (str.equals(paramString1) == true))
          {
            k.b("TMAssistantDownloadSDKService", "OnDownloadStateChanged,clientKey:" + paramString1 + ",state:" + paramInt1 + ",url:" + paramString2);
            locala.a(paramString1, paramString2, paramInt1, paramInt2, paramString3);
            this.a.finishBroadcast();
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          i += 1;
        }
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public final void a(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    try
    {
      int j = this.a.beginBroadcast();
      int i = 0;
      for (;;)
      {
        if (i < j) {}
        try
        {
          com.tencent.tmassistantsdk.a.a locala = (com.tencent.tmassistantsdk.a.a)this.a.getBroadcastItem(i);
          String str = (String)this.b.get(locala);
          if ((str != null) && (str.equals(paramString1) == true))
          {
            k.b("TMAssistantDownloadSDKService", "OnDownloadProgressChanged,clientKey:" + paramString1 + ",receivedLen:" + paramLong1 + ",url:" + paramString2);
            locala.a(paramString1, paramString2, paramLong1, paramLong2);
            this.a.finishBroadcast();
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          i += 1;
        }
      }
      return;
    }
    catch (Throwable paramString1) {}
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    k.b("TMAssistantDownloadSDKService", "onBind ,intent:" + paramIntent);
    return this.d;
  }
  
  public void onCreate()
  {
    super.onCreate();
    f.a().a(this);
    NetworkMonitorReceiver.a().b();
    com.tencent.tmassistantsdk.e.a.a();
    this.c = new c(com.tencent.tmassistantsdk.e.a.c());
    this.c.a(this);
    c localc = this.c;
    if (localc != null)
    {
      a.a();
      a.a(localc);
    }
    a.a().b();
    new Thread(new o(this)).start();
    k.b("TMAssistantDownloadSDKService", "onCreate");
  }
  
  public void onDestroy()
  {
    k.b("TMAssistantDownloadSDKService", "onDestroy");
    super.onDestroy();
    a.a().c();
    d.a();
    d.d();
    d.a().b();
    c localc = this.c;
    if (localc != null)
    {
      a.a();
      a.b(localc);
    }
    this.c.a(null);
    this.c = null;
    NetworkMonitorReceiver.a().c();
    f.a().c();
    SystemClock.sleep(300L);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    k.b("TMAssistantDownloadSDKService", "onUnbind ,intent:" + paramIntent);
    return super.onUnbind(paramIntent);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService
 * JD-Core Version:    0.7.0.1
 */