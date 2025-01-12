package com.tencent.mm.booter.notification.queue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.k.h;
import com.tencent.mm.sdk.platformtools.Log;
import com.tencent.mm.sdk.platformtools.Util;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements Serializable, Iterable<a>
{
  LinkedList<a> lus;
  
  private void sz()
  {
    try
    {
      AppMethodBeat.i(20005);
      if (this.lus == null) {
        AppMethodBeat.o(20005);
      }
      for (;;)
      {
        return;
        Log.d("MicroMsg.NotificationAppMsgQueue", "save: size: %d", new Object[] { Integer.valueOf(this.lus.size()) });
        if (this.lus.isEmpty())
        {
          h.aQD().edit().putString("com.tencent.preference.notification.key.queue", "").apply();
          Log.i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", new Object[] { Integer.valueOf(this.lus.size()), toString() });
          AppMethodBeat.o(20005);
          continue;
        }
        try
        {
          LinkedList localLinkedList = new LinkedList(this.lus);
          h.aQD().edit().putString("com.tencent.preference.notification.key.queue", c.a(localLinkedList)).apply();
          Log.i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", new Object[] { Integer.valueOf(this.lus.size()), toString() });
          AppMethodBeat.o(20005);
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Log.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", localIOException, "", new Object[0]);
          }
        }
      }
    }
    finally {}
  }
  
  public final void c(NotificationItem paramNotificationItem)
  {
    int i = 1;
    try
    {
      AppMethodBeat.i(20006);
      if (this.lus == null) {
        restore();
      }
      remove(paramNotificationItem.id);
      Object localObject;
      if ((paramNotificationItem.lun) && (!Util.isNullOrNil(paramNotificationItem.luk))) {
        localObject = this.lus.iterator();
      }
      for (;;)
      {
        if (((Iterator)localObject).hasNext())
        {
          a locala = (a)((Iterator)localObject).next();
          if (locala.userName.equals(paramNotificationItem.luk))
          {
            locala.a(paramNotificationItem.id, paramNotificationItem.lul, paramNotificationItem.luk, paramNotificationItem.lum, paramNotificationItem.lun, paramNotificationItem.luo);
            i = 0;
          }
        }
        else
        {
          if (i != 0)
          {
            localObject = new a(paramNotificationItem.id, paramNotificationItem.lul, paramNotificationItem.luk, paramNotificationItem.lum, paramNotificationItem.lun, paramNotificationItem.luo);
            this.lus.add(localObject);
            Log.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
          }
          for (;;)
          {
            sz();
            AppMethodBeat.o(20006);
            return;
            this.lus.add(new a(paramNotificationItem.id, paramNotificationItem.lun));
            Log.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
          }
        }
      }
    }
    finally {}
  }
  
  public final Iterator<a> iterator()
  {
    AppMethodBeat.i(20010);
    if (this.lus == null) {
      restore();
    }
    Iterator localIterator = this.lus.iterator();
    AppMethodBeat.o(20010);
    return localIterator;
  }
  
  public final List<Integer> qk(int paramInt)
  {
    try
    {
      AppMethodBeat.i(20007);
      if (this.lus == null) {
        restore();
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (((locala.lut & paramInt) != 0) && (!localArrayList.contains(Integer.valueOf(locala.notificationId)))) {
          localArrayList.add(Integer.valueOf(locala.notificationId));
        }
      }
      AppMethodBeat.o(20007);
    }
    finally {}
    return localList;
  }
  
  public final boolean remove(int paramInt)
  {
    for (;;)
    {
      boolean bool;
      int i;
      try
      {
        AppMethodBeat.i(20008);
        if (paramInt == -1)
        {
          AppMethodBeat.o(20008);
          bool = false;
          return bool;
        }
        if (this.lus == null) {
          restore();
        }
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = this.lus.iterator();
        i = 0;
        if (!localIterator.hasNext()) {
          break label110;
        }
        a locala = (a)localIterator.next();
        if (locala.notificationId != paramInt)
        {
          localLinkedList.add(locala);
          continue;
        }
        i = 1;
      }
      finally {}
      continue;
      label110:
      if (i != 0)
      {
        this.lus = localObject;
        sz();
        AppMethodBeat.o(20008);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(20008);
        bool = false;
      }
    }
  }
  
  /* Error */
  public final boolean remove(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 20009
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 36
    //   10: ldc 208
    //   12: iconst_1
    //   13: anewarray 5	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_1
    //   19: aastore
    //   20: invokestatic 93	com/tencent/mm/sdk/platformtools/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: aload_1
    //   24: invokestatic 136	com/tencent/mm/sdk/platformtools/Util:isNullOrNil	(Ljava/lang/String;)Z
    //   27: ifeq +15 -> 42
    //   30: sipush 20009
    //   33: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: iconst_0
    //   37: istore_2
    //   38: aload_0
    //   39: monitorexit
    //   40: iload_2
    //   41: ireturn
    //   42: aload_0
    //   43: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   46: ifnonnull +7 -> 53
    //   49: aload_0
    //   50: invokevirtual 112	com/tencent/mm/booter/notification/queue/a:restore	()V
    //   53: aload_0
    //   54: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   57: invokevirtual 140	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   60: astore_3
    //   61: aload_3
    //   62: invokeinterface 145 1 0
    //   67: ifeq +51 -> 118
    //   70: aload_3
    //   71: invokeinterface 149 1 0
    //   76: checkcast 11	com/tencent/mm/booter/notification/queue/a$a
    //   79: astore 4
    //   81: aload_1
    //   82: aload 4
    //   84: getfield 152	com/tencent/mm/booter/notification/queue/a$a:userName	Ljava/lang/String;
    //   87: invokevirtual 158	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: ifeq -29 -> 61
    //   93: aload_0
    //   94: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   97: aload 4
    //   99: invokevirtual 210	java/util/LinkedList:remove	(Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_0
    //   104: invokespecial 181	com/tencent/mm/booter/notification/queue/a:sz	()V
    //   107: sipush 20009
    //   110: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: iconst_1
    //   114: istore_2
    //   115: goto -77 -> 38
    //   118: sipush 20009
    //   121: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: iconst_0
    //   125: istore_2
    //   126: goto -88 -> 38
    //   129: astore_1
    //   130: aload_0
    //   131: monitorexit
    //   132: aload_1
    //   133: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	this	a
    //   0	134	1	paramString	String
    //   37	89	2	bool	boolean
    //   60	11	3	localIterator	Iterator
    //   79	19	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	36	129	finally
    //   42	53	129	finally
    //   53	61	129	finally
    //   61	113	129	finally
    //   118	124	129	finally
  }
  
  /* Error */
  public final void restore()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 20004
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 66	com/tencent/mm/k/h:aQD	()Landroid/content/SharedPreferences;
    //   11: ldc 74
    //   13: ldc 76
    //   15: invokeinterface 216 3 0
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokestatic 220	com/tencent/mm/booter/notification/queue/c:Cz	(Ljava/lang/String;)Ljava/io/Serializable;
    //   26: checkcast 40	java/util/LinkedList
    //   29: putfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   32: aload_0
    //   33: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   36: ifnonnull +14 -> 50
    //   39: aload_0
    //   40: new 40	java/util/LinkedList
    //   43: dup
    //   44: invokespecial 206	java/util/LinkedList:<init>	()V
    //   47: putfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   50: ldc 36
    //   52: ldc 222
    //   54: iconst_2
    //   55: anewarray 5	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_0
    //   61: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   64: invokevirtual 44	java/util/LinkedList:size	()I
    //   67: invokestatic 50	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: aload_0
    //   74: invokevirtual 91	com/tencent/mm/booter/notification/queue/a:toString	()Ljava/lang/String;
    //   77: aastore
    //   78: invokestatic 93	com/tencent/mm/sdk/platformtools/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: sipush 20004
    //   84: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_0
    //   88: monitorexit
    //   89: return
    //   90: astore_1
    //   91: ldc 36
    //   93: aload_1
    //   94: ldc 76
    //   96: iconst_0
    //   97: anewarray 5	java/lang/Object
    //   100: invokestatic 107	com/tencent/mm/sdk/platformtools/Log:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_0
    //   104: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   107: ifnonnull -57 -> 50
    //   110: aload_0
    //   111: new 40	java/util/LinkedList
    //   114: dup
    //   115: invokespecial 206	java/util/LinkedList:<init>	()V
    //   118: putfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   121: goto -71 -> 50
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    //   129: astore_1
    //   130: aload_0
    //   131: getfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   134: ifnonnull +14 -> 148
    //   137: aload_0
    //   138: new 40	java/util/LinkedList
    //   141: dup
    //   142: invokespecial 206	java/util/LinkedList:<init>	()V
    //   145: putfield 31	com/tencent/mm/booter/notification/queue/a:lus	Ljava/util/LinkedList;
    //   148: sipush 20004
    //   151: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_1
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	a
    //   20	3	1	str	String
    //   90	4	1	localException	java.lang.Exception
    //   124	4	1	localObject1	Object
    //   129	26	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   21	32	90	java/lang/Exception
    //   2	21	124	finally
    //   32	50	124	finally
    //   50	87	124	finally
    //   103	121	124	finally
    //   130	148	124	finally
    //   148	156	124	finally
    //   21	32	129	finally
    //   91	103	129	finally
  }
  
  public final String toString()
  {
    AppMethodBeat.i(20003);
    Object localObject = new StringBuilder("");
    Iterator localIterator = this.lus.iterator();
    while (localIterator.hasNext()) {
      ((StringBuilder)localObject).append(((a)localIterator.next()).toString()).append(";  ");
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(20003);
    return localObject;
  }
  
  public static final class a
    implements Serializable
  {
    public int hND;
    public boolean lun;
    public int lut;
    public long msgId;
    public int notificationId;
    public String userName;
    
    public a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      AppMethodBeat.i(20001);
      this.msgId = -1L;
      this.userName = "";
      this.lun = false;
      this.lut = 0;
      a(paramInt1, paramLong, paramString, paramInt2, paramBoolean, paramInt3);
      AppMethodBeat.o(20001);
    }
    
    public a(int paramInt, boolean paramBoolean)
    {
      this.msgId = -1L;
      this.userName = "";
      this.lun = false;
      this.lut = 0;
      this.notificationId = paramInt;
      this.lun = paramBoolean;
    }
    
    public final void a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      this.notificationId = paramInt1;
      this.msgId = paramLong;
      this.userName = paramString;
      this.hND = paramInt2;
      this.lun = paramBoolean;
      this.lut = paramInt3;
    }
    
    public final String toString()
    {
      AppMethodBeat.i(20002);
      String str = this.userName + " id:" + this.msgId + " unReadCount:" + this.hND + "　notificationId:" + this.notificationId;
      AppMethodBeat.o(20002);
      return str;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mm\classes4.jar
 * Qualified Name:     com.tencent.mm.booter.notification.queue.a
 * JD-Core Version:    0.7.0.1
 */