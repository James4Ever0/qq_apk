package com.tencent.beacon.a.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.g.a;
import java.io.File;

public final class c
  extends SQLiteOpenHelper
{
  public static final Object a = new Object();
  private static SQLiteDatabase c = null;
  private Context b;
  
  private c(Context paramContext)
  {
    super(paramContext, "beacon_db", null, b.a);
    this.b = paramContext;
  }
  
  public static c a(Context paramContext)
  {
    try
    {
      paramContext = new c(paramContext);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    if (b(paramSQLiteDatabase))
    {
      a.g("[db] drop all success recreate!", new Object[0]);
      onCreate(paramSQLiteDatabase);
    }
    do
    {
      return;
      a.c("[db] drop all fail try deleted file,may next time will success!", new Object[0]);
      paramSQLiteDatabase = this.b.getDatabasePath("beacon_db");
    } while ((paramSQLiteDatabase == null) || (!paramSQLiteDatabase.canWrite()));
    paramSQLiteDatabase.delete();
  }
  
  /* Error */
  private boolean b(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 76	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 77	java/util/ArrayList:<init>	()V
    //   9: astore 5
    //   11: aload_1
    //   12: ldc 79
    //   14: iconst_1
    //   15: anewarray 81	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc 83
    //   22: aastore
    //   23: ldc 85
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: invokevirtual 91	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore 4
    //   34: aload 4
    //   36: ifnull +74 -> 110
    //   39: aload 4
    //   41: astore_3
    //   42: aload 4
    //   44: invokeinterface 96 1 0
    //   49: ifeq +61 -> 110
    //   52: aload 4
    //   54: astore_3
    //   55: aload 5
    //   57: aload 4
    //   59: iconst_0
    //   60: invokeinterface 100 2 0
    //   65: invokeinterface 106 2 0
    //   70: pop
    //   71: goto -32 -> 39
    //   74: astore_1
    //   75: aload 4
    //   77: astore_3
    //   78: aload_1
    //   79: invokestatic 109	com/tencent/beacon/a/g/a:a	(Ljava/lang/Throwable;)V
    //   82: aload 4
    //   84: ifnull +20 -> 104
    //   87: aload 4
    //   89: invokeinterface 112 1 0
    //   94: ifne +10 -> 104
    //   97: aload 4
    //   99: invokeinterface 115 1 0
    //   104: iconst_0
    //   105: istore_2
    //   106: aload_0
    //   107: monitorexit
    //   108: iload_2
    //   109: ireturn
    //   110: aload 4
    //   112: astore_3
    //   113: aload 5
    //   115: invokeinterface 119 1 0
    //   120: ifle +140 -> 260
    //   123: aload 4
    //   125: astore_3
    //   126: aload 5
    //   128: invokeinterface 123 1 0
    //   133: astore 5
    //   135: aload 4
    //   137: astore_3
    //   138: aload 5
    //   140: invokeinterface 128 1 0
    //   145: ifeq +115 -> 260
    //   148: aload 4
    //   150: astore_3
    //   151: aload 5
    //   153: invokeinterface 132 1 0
    //   158: checkcast 81	java/lang/String
    //   161: astore 6
    //   163: aload 4
    //   165: astore_3
    //   166: aload 6
    //   168: ldc 134
    //   170: invokevirtual 137	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   173: ifne -38 -> 135
    //   176: aload 4
    //   178: astore_3
    //   179: aload 6
    //   181: ldc 139
    //   183: invokevirtual 137	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifne -51 -> 135
    //   189: aload 4
    //   191: astore_3
    //   192: aload_1
    //   193: getstatic 145	java/util/Locale:US	Ljava/util/Locale;
    //   196: ldc 147
    //   198: iconst_1
    //   199: anewarray 14	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: aload 6
    //   206: aastore
    //   207: invokestatic 151	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   210: invokevirtual 155	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   213: aload 4
    //   215: astore_3
    //   216: ldc 157
    //   218: iconst_1
    //   219: anewarray 14	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload 6
    //   226: aastore
    //   227: invokestatic 50	com/tencent/beacon/a/g/a:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: goto -95 -> 135
    //   233: astore_1
    //   234: aload_3
    //   235: ifnull +18 -> 253
    //   238: aload_3
    //   239: invokeinterface 112 1 0
    //   244: ifne +9 -> 253
    //   247: aload_3
    //   248: invokeinterface 115 1 0
    //   253: aload_1
    //   254: athrow
    //   255: astore_1
    //   256: aload_0
    //   257: monitorexit
    //   258: aload_1
    //   259: athrow
    //   260: aload 4
    //   262: ifnull +20 -> 282
    //   265: aload 4
    //   267: invokeinterface 112 1 0
    //   272: ifne +10 -> 282
    //   275: aload 4
    //   277: invokeinterface 115 1 0
    //   282: iconst_1
    //   283: istore_2
    //   284: goto -178 -> 106
    //   287: astore_1
    //   288: aconst_null
    //   289: astore_3
    //   290: goto -56 -> 234
    //   293: astore_1
    //   294: aconst_null
    //   295: astore 4
    //   297: goto -222 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	c
    //   0	300	1	paramSQLiteDatabase	SQLiteDatabase
    //   105	179	2	bool	boolean
    //   41	249	3	localCursor1	android.database.Cursor
    //   32	264	4	localCursor2	android.database.Cursor
    //   9	143	5	localObject	Object
    //   161	64	6	str	String
    // Exception table:
    //   from	to	target	type
    //   42	52	74	java/lang/Throwable
    //   55	71	74	java/lang/Throwable
    //   113	123	74	java/lang/Throwable
    //   126	135	74	java/lang/Throwable
    //   138	148	74	java/lang/Throwable
    //   151	163	74	java/lang/Throwable
    //   166	176	74	java/lang/Throwable
    //   179	189	74	java/lang/Throwable
    //   192	213	74	java/lang/Throwable
    //   216	230	74	java/lang/Throwable
    //   42	52	233	finally
    //   55	71	233	finally
    //   78	82	233	finally
    //   113	123	233	finally
    //   126	135	233	finally
    //   138	148	233	finally
    //   151	163	233	finally
    //   166	176	233	finally
    //   179	189	233	finally
    //   192	213	233	finally
    //   216	230	233	finally
    //   87	104	255	finally
    //   238	253	255	finally
    //   253	255	255	finally
    //   265	282	255	finally
    //   2	34	287	finally
    //   2	34	293	java/lang/Throwable
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    int i = 0;
    label70:
    for (;;)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase1 = c;
        if ((localSQLiteDatabase1 != null) || (i >= 5)) {
          break;
        }
        i += 1;
        try
        {
          c = super.getWritableDatabase();
        }
        catch (Exception localException)
        {
          a.c("[db] getWritableDatabase error count %d", new Object[] { Integer.valueOf(i) });
          if (i != 5) {
            break label70;
          }
        }
        a.d("[db] error get DB failed", new Object[0]);
        continue;
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
          a.a(localInterruptedException);
        }
      }
      finally {}
    }
    SQLiteDatabase localSQLiteDatabase2 = c;
    return localSQLiteDatabase2;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    if (paramSQLiteDatabase != null) {}
    try
    {
      String[][] arrayOfString = b.b;
      arrayOfString = b.b;
      while (i < 7)
      {
        String[] arrayOfString1 = arrayOfString[i];
        a.g("[db] Table:%s", new Object[] { arrayOfString1[0] });
        paramSQLiteDatabase.execSQL(arrayOfString1[1]);
        i += 1;
      }
      return;
    }
    finally {}
  }
  
  @TargetApi(11)
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      e.a(this.b);
      if (Integer.parseInt(e.c()) >= 11)
      {
        a.g("[db] Downgrade a db  [%s] from v %d to  v%d , deleted all tables!", new Object[] { "beacon_db", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        a(paramSQLiteDatabase);
      }
      return;
    }
    finally
    {
      paramSQLiteDatabase = finally;
      throw paramSQLiteDatabase;
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      a.g("[db] Upgrade a db  [%s] from v %d to v %d , deleted all tables!", new Object[] { "beacon_db", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      a(paramSQLiteDatabase);
      return;
    }
    finally
    {
      paramSQLiteDatabase = finally;
      throw paramSQLiteDatabase;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.beacon.a.a.a.c
 * JD-Core Version:    0.7.0.1
 */