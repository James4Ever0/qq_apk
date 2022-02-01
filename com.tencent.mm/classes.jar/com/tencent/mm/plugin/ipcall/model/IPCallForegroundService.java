package com.tencent.mm.plugin.ipcall.model;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.s.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ax;
import com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI;
import com.tencent.mm.plugin.voip.b.m;
import com.tencent.mm.plugin.voip.widget.b;
import com.tencent.mm.sdk.platformtools.Log;
import com.tencent.mm.sdk.platformtools.MMApplicationContext;
import kotlin.g.b.p;
import kotlin.l;

@l(hxD={1, 1, 16}, hxE={""}, hxF={"Lcom/tencent/mm/plugin/ipcall/model/IPCallForegroundService;", "Landroid/app/Service;", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "setNotificationBind", "Companion", "app_release"})
public final class IPCallForegroundService
  extends Service
{
  private static final String TAG = "MicroMsg.IPCallForegroundService";
  public static final IPCallForegroundService.a yoG;
  
  static
  {
    AppMethodBeat.i(39607);
    yoG = new IPCallForegroundService.a((byte)0);
    TAG = "MicroMsg.IPCallForegroundService";
    AppMethodBeat.o(39607);
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(39606);
    p.h(paramIntent, "intent");
    Log.i(TAG, "onBind");
    AppMethodBeat.o(39606);
    return null;
  }
  
  public final void onCreate()
  {
    AppMethodBeat.i(39604);
    Log.i(TAG, "IPCallForegroundService onCreate");
    super.onCreate();
    if (!g.aAf().azp())
    {
      stopSelf();
      AppMethodBeat.o(39604);
      return;
    }
    if (d.oD(26))
    {
      Notification localNotification = m.e(com.tencent.mm.bq.a.cd(MMApplicationContext.getContext(), "reminder_channel_id").i(System.currentTimeMillis()).as(b.ezb()).et());
      try
      {
        if (MMApplicationContext.isMMProcessExist()) {
          Log.i(TAG, "current mmprocess is exits");
        }
        startForeground(42, localNotification);
        AppMethodBeat.o(39604);
        return;
      }
      catch (Exception localException)
      {
        Log.i(TAG, "start foreground service happened error %s", new Object[] { localException.getMessage() });
      }
    }
    AppMethodBeat.o(39604);
  }
  
  public final void onDestroy()
  {
    AppMethodBeat.i(39605);
    Log.i(TAG, "IPCallForegroundService onDestroy");
    try
    {
      stopForeground(true);
      com.tencent.mm.kernel.b.a locala = g.ah(com.tencent.mm.plugin.notification.b.a.class);
      p.g(locala, "MMKernel.plugin(IPluginNotification::class.java)");
      ((com.tencent.mm.plugin.notification.b.a)locala).getNotification().cancel(42);
      super.onDestroy();
      AppMethodBeat.o(39605);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e(TAG, "onDestroy happened error %s", new Object[] { localException });
      }
    }
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39603);
    if (!g.aAf().azp())
    {
      Log.e(TAG, "error called ipcall foreground service in onStartCommand process");
      stopSelf();
      AppMethodBeat.o(39603);
      return 2;
    }
    Object localObject;
    if ((d.oD(26)) && (paramIntent != null))
    {
      Log.i(TAG, "foreground service is on bind ");
      p.h(paramIntent, "intent");
      Log.i(TAG, "setNotificationBind");
      paramIntent.setClass(MMApplicationContext.getContext(), IPCallTalkUI.class);
      paramIntent.setFlags(268435456);
      paramIntent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
      localObject = MMApplicationContext.getContext().getString(2131761903);
      p.g(localObject, "MMApplicationContext.get…ip_call_minimize_wording)");
      Log.i(TAG, "IPCallForegroundService notification type is 42");
      if (g.aAf().azp()) {
        break label145;
      }
      Log.e(TAG, "error called ipcall foreground service in setNotification process");
      stopSelf();
    }
    for (;;)
    {
      AppMethodBeat.o(39603);
      return 3;
      label145:
      paramIntent = PendingIntent.getActivity(MMApplicationContext.getContext(), 42, paramIntent, 134217728);
      paramIntent = m.e(com.tencent.mm.bq.a.cd(MMApplicationContext.getContext(), "reminder_channel_id").i((CharSequence)localObject).i(System.currentTimeMillis()).f((CharSequence)MMApplicationContext.getContext().getString(2131761893)).g((CharSequence)localObject).as(b.ezb()).a(paramIntent).et());
      paramIntent.flags |= 0x20;
      localObject = g.ah(com.tencent.mm.plugin.notification.b.a.class);
      p.g(localObject, "MMKernel.plugin(IPluginNotification::class.java)");
      ((com.tencent.mm.plugin.notification.b.a)localObject).getNotification().a(42, paramIntent, false);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes4.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.model.IPCallForegroundService
 * JD-Core Version:    0.7.0.1
 */