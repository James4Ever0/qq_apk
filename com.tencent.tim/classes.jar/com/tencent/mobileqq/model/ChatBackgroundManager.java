package com.tencent.mobileqq.model;

import acbn;
import ajdc;
import ajdd;
import ajde;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.util.LruCache;
import android.support.v4.util.MQLruCache;
import android.text.TextUtils;
import anot;
import anpc;
import aqgz;
import aqhq;
import aqhu;
import aqiw;
import aqnl;
import aqra;
import aqrh;
import aqri;
import aqrk;
import aqrk.a;
import aqva;
import aqvd;
import aqwu;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.ChatActivityUtils;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.app.DeviceProfileManager;
import com.tencent.mobileqq.app.DeviceProfileManager.DpcNames;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.ChatBackgroundInfo;
import com.tencent.mobileqq.theme.ThemeUtil;
import com.tencent.mobileqq.theme.diy.DIYThemeUtils;
import com.tencent.mobileqq.theme.diy.ResData;
import com.tencent.mobileqq.theme.diy.ResSuitData;
import com.tencent.mobileqq.theme.diy.ThemeBackground;
import com.tencent.mobileqq.theme.diy.ThemeDIYData;
import com.tencent.mobileqq.theme.diy.ThemeDiyStyleLogic;
import com.tencent.mobileqq.theme.diy.ThemeDiyStyleLogic.DarkBrightnessTask;
import com.tencent.mobileqq.vas.VasQuickUpdateEngine;
import com.tencent.mobileqq.vas.VasQuickUpdateManager;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mqq.app.MobileQQ;
import mqq.manager.Manager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wkj;

public class ChatBackgroundManager
  implements Manager
{
  public static int NEW_VERSION;
  public static int OLD_VERSION = 1;
  public static final String bQK = acbn.bne + "ChatBgJson.txt";
  static String bQL;
  static Handler reportHandler = new b(BaseApplication.getContext().getMainLooper());
  static int reportTimes;
  Map<String, aqra> Q = new ConcurrentHashMap();
  private aqva a;
  boolean cnz;
  Map<String, aqvd> lL = new ConcurrentHashMap();
  public QQAppInterface mApp = null;
  String uin;
  LruCache<String, Vector<Integer>> y;
  
  public ChatBackgroundManager(QQAppInterface paramQQAppInterface)
  {
    this.mApp = paramQQAppInterface;
    this.uin = paramQQAppInterface.getAccount();
    this.a = ((aqva)paramQQAppInterface.getManager(47));
  }
  
  public static int Gg()
  {
    int j = 0;
    Object localObject = DeviceProfileManager.a().jf(DeviceProfileManager.DpcNames.vip_individuation.name());
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = ((String)localObject).split("\\|");
      if (localObject.length >= 6)
      {
        if ("1".equals(localObject[4])) {}
        for (int i = 1;; i = 0)
        {
          if ("1".equals(localObject[5])) {
            j = 2;
          }
          i = i | 0x0 | j;
          if (QLog.isColorLevel()) {
            QLog.d("ChatBackground", 2, "dynamic background DPC value = " + i);
          }
          return i;
        }
      }
    }
    if (QLog.isColorLevel()) {
      QLog.d("ChatBackground", 2, "dynamic background DPC default value = 3");
    }
    return 3;
  }
  
  public static void Mk(String paramString)
  {
    aqri.a(BaseApplicationImpl.getApplication().getRuntime(), "individual_v2_background_play_fail", "0", paramString, Build.MODEL, Build.VERSION.RELEASE, Long.toString(aqgz.getSystemTotalMemory()), 0.0F, 0.0F);
    aqrh.is("individual_v2_background_play_fail", Build.MODEL + " " + Build.VERSION.RELEASE + " " + Long.toString(aqgz.getSystemTotalMemory()));
  }
  
  public static int a(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (paramSharedPreferences == null) {
      return 0;
    }
    int i = paramSharedPreferences.getInt(paramString + "_chat_bg_effect", -1);
    if (i == -1) {
      return paramSharedPreferences.getInt("_chat_bg_effect", 0);
    }
    return i;
  }
  
  private Vector<Integer> a(Context paramContext, SessionInfo paramSessionInfo, String paramString)
  {
    if (this.y == null) {
      this.y = new LruCache(20);
    }
    while (paramSessionInfo.a.img == null)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("ChatBackgroundManager", 4, "SessionInfo.chatBg.img == null");
      }
      return null;
      localObject = (Vector)this.y.get(paramString);
      if (localObject != null) {
        return localObject;
      }
    }
    this.y.put(paramString, new Vector(5));
    Object localObject = new ajdd(this, paramContext);
    if (QLog.isColorLevel()) {
      QLog.d("ChatBackgroundManager", 2, "Background Path=" + paramString + ", start extract background theme color.");
    }
    boolean bool2 = false;
    boolean bool1;
    if (paramSessionInfo.a.img != null) {
      if ((paramSessionInfo.a.img instanceof BitmapDrawable))
      {
        paramSessionInfo = ((BitmapDrawable)paramSessionInfo.a.img).getBitmap();
        paramContext = paramSessionInfo;
        bool1 = bool2;
        if (QLog.isDevelopLevel())
        {
          QLog.d("ChatBackgroundManager", 4, "SessionInfo.chatBg.img is BitmapDrawable");
          bool1 = bool2;
          paramContext = paramSessionInfo;
        }
      }
    }
    for (;;)
    {
      ThreadManager.executeOnFileThread(new BgColorExtractJob(paramString, paramContext, bool1, (a)localObject));
      return null;
      paramSessionInfo = aqhu.getDrawableBitmap(paramSessionInfo.a.img);
      bool2 = true;
      paramContext = paramSessionInfo;
      bool1 = bool2;
      if (QLog.isDevelopLevel())
      {
        QLog.d("ChatBackgroundManager", 4, "SessionInfo.chatBg.img is not BitmapDrawable");
        paramContext = paramSessionInfo;
        bool1 = bool2;
        continue;
        paramContext = null;
        bool1 = bool2;
      }
    }
  }
  
  static void a(QQAppInterface paramQQAppInterface, String paramString, anpc paramanpc)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(bQL, Integer.valueOf(1));
    if (QLog.isColorLevel()) {
      QLog.d("ThemeDownloadTrace", 2, "initCurrChatBgNameForReport is:" + bQL);
    }
    try
    {
      paramanpc.b(paramQQAppInterface, paramString, localHashMap);
      return;
    }
    catch (NoClassDefFoundError paramQQAppInterface)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e("ThemeDownloadTrace", 2, "realReportCurrChatBgName reportOnOff exception:" + paramQQAppInterface.getMessage());
    }
  }
  
  public static boolean aqr()
  {
    boolean bool = true;
    if ((Gg() & 0x1) != 0)
    {
      long l = gm();
      if ((l <= 10485760L) || (aqnl.qR()))
      {
        QLog.d("ChatBackground", 1, "availableMemory is " + l + ", too low to play dynamic background");
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public static String c(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return lV(paramString) + File.separatorChar + "aioImage";
    }
    return ThemeDiyStyleLogic.getDataDIYDir() + paramString;
  }
  
  public static void destroy()
  {
    bQL = null;
    reportTimes = 0;
    reportHandler.removeMessages(1);
    if (QLog.isColorLevel()) {
      QLog.d("ThemeDownloadTrace", 2, "ChatBackground destroy() is called");
    }
  }
  
  public static int e(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getSharedPreferences("chat_background_path_" + paramString1, 4);
    if (TextUtils.isEmpty(paramString2)) {
      return paramContext.getInt("_chat_bg_effect", 0);
    }
    return a(paramContext, paramString2);
  }
  
  public static String g(Context paramContext, String paramString1, String paramString2)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("chat_background_path_" + paramString1, 4);
    if (TextUtils.isEmpty(paramString2))
    {
      paramContext = localSharedPreferences.getString("chat_uniform_bg", null);
      if (TextUtils.isEmpty(paramContext)) {
        return "null";
      }
      return ThemeDiyStyleLogic.getDiyVFSPath(paramContext);
    }
    paramString1 = localSharedPreferences.getString(paramString2, null);
    paramContext = paramString1;
    if (paramString1 == null)
    {
      paramString1 = localSharedPreferences.getString("chat_uniform_bg", null);
      paramContext = paramString1;
      if (paramString1 == null) {
        paramContext = "null";
      }
    }
    if ((paramContext == null) || (paramContext.trim().length() == 0) || (paramContext.equals("null"))) {
      return "null";
    }
    if (paramContext.equals("none")) {
      return "null";
    }
    return ThemeDiyStyleLogic.getDiyVFSPath(paramContext);
  }
  
  private void gG(String paramString1, String paramString2)
  {
    int i;
    if (paramString1.equals(ThemeBackground.getThemeBackgroundId(this.mApp.getApp(), "theme_bg_setting_path_png", this.mApp.getCurrentAccountUin()))) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0) {
        BaseApplicationImpl.sImageCache.evictAll();
      }
      Object localObject = ThemeBackground.getThemeBackgroundId(this.mApp.getApp(), "theme_bg_message_path_png", this.mApp.getCurrentAccountUin());
      if ((ThemeUtil.isNowThemeIsDIY()) && (paramString1.equals(localObject)))
      {
        localObject = new ThemeDIYData(2130848338, "theme_bg_message_path", 2131166855, "theme_bg_message_path_png", 50, 1);
        ((ThemeDIYData)localObject).tryOnBgBigOrgRD = new ResData();
        ResSuitData localResSuitData = new ResSuitData();
        localResSuitData.id = paramString1;
        localResSuitData.name = "";
        localResSuitData.typeStr = "item";
        localResSuitData.appStr = "chatBg";
        paramString1 = DIYThemeUtils.getResData(this.mApp, localResSuitData, 116, localResSuitData.name);
        new ThemeDiyStyleLogic.DarkBrightnessTask(this.mApp.getApp(), this.mApp, paramString2, paramString1.path, (ThemeDIYData)localObject, null, new ajde(this)).execute(new Object[0]);
      }
      return;
      if (paramString1.equals(ThemeBackground.getThemeBackgroundId(this.mApp.getApp(), "theme_bg_aio_path", this.mApp.getCurrentAccountUin()))) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public static long gm()
  {
    Runtime localRuntime = Runtime.getRuntime();
    long l1 = localRuntime.maxMemory();
    long l2 = localRuntime.totalMemory();
    return localRuntime.freeMemory() + (l1 - l2);
  }
  
  public static boolean i(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = wkj.g(paramContext, paramString1, paramString2);
    if (paramContext.contains("aioImage")) {
      return new File(paramContext.replace("aioImage", "main.json")).exists();
    }
    return false;
  }
  
  /* Error */
  public static boolean isApngFile(File paramFile)
  {
    // Byte code:
    //   0: bipush 8
    //   2: newarray byte
    //   4: astore 5
    //   6: aload 5
    //   8: dup
    //   9: iconst_0
    //   10: ldc_w 542
    //   13: bastore
    //   14: dup
    //   15: iconst_1
    //   16: ldc_w 543
    //   19: bastore
    //   20: dup
    //   21: iconst_2
    //   22: ldc_w 544
    //   25: bastore
    //   26: dup
    //   27: iconst_3
    //   28: ldc_w 545
    //   31: bastore
    //   32: dup
    //   33: iconst_4
    //   34: ldc_w 546
    //   37: bastore
    //   38: dup
    //   39: iconst_5
    //   40: ldc_w 547
    //   43: bastore
    //   44: dup
    //   45: bipush 6
    //   47: ldc_w 548
    //   50: bastore
    //   51: dup
    //   52: bipush 7
    //   54: ldc_w 547
    //   57: bastore
    //   58: pop
    //   59: aload_0
    //   60: invokevirtual 537	java/io/File:exists	()Z
    //   63: ifne +5 -> 68
    //   66: iconst_0
    //   67: ireturn
    //   68: new 550	java/io/RandomAccessFile
    //   71: dup
    //   72: aload_0
    //   73: ldc_w 552
    //   76: invokespecial 555	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   79: astore 4
    //   81: aload 4
    //   83: astore_0
    //   84: aload 5
    //   86: arraylength
    //   87: newarray byte
    //   89: astore 6
    //   91: aload 4
    //   93: astore_0
    //   94: aload 4
    //   96: aload 6
    //   98: invokevirtual 559	java/io/RandomAccessFile:read	([B)I
    //   101: pop
    //   102: iconst_0
    //   103: istore_1
    //   104: aload 4
    //   106: astore_0
    //   107: iload_1
    //   108: aload 5
    //   110: arraylength
    //   111: if_icmpge +50 -> 161
    //   114: aload 6
    //   116: iload_1
    //   117: baload
    //   118: istore_2
    //   119: aload 5
    //   121: iload_1
    //   122: baload
    //   123: istore_3
    //   124: iload_2
    //   125: iload_3
    //   126: if_icmpeq +28 -> 154
    //   129: aload 4
    //   131: ifnull -65 -> 66
    //   134: aload 4
    //   136: invokevirtual 562	java/io/RandomAccessFile:close	()V
    //   139: iconst_0
    //   140: ireturn
    //   141: astore_0
    //   142: ldc 154
    //   144: iconst_1
    //   145: ldc_w 468
    //   148: aload_0
    //   149: invokestatic 565	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   152: iconst_0
    //   153: ireturn
    //   154: iload_1
    //   155: iconst_1
    //   156: iadd
    //   157: istore_1
    //   158: goto -54 -> 104
    //   161: aload 4
    //   163: ifnull +8 -> 171
    //   166: aload 4
    //   168: invokevirtual 562	java/io/RandomAccessFile:close	()V
    //   171: iconst_1
    //   172: ireturn
    //   173: astore_0
    //   174: ldc 154
    //   176: iconst_1
    //   177: ldc_w 468
    //   180: aload_0
    //   181: invokestatic 565	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   184: goto -13 -> 171
    //   187: astore 5
    //   189: aconst_null
    //   190: astore 4
    //   192: aload 4
    //   194: astore_0
    //   195: ldc 154
    //   197: iconst_1
    //   198: ldc_w 468
    //   201: aload 5
    //   203: invokestatic 565	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   206: aload 4
    //   208: ifnull -142 -> 66
    //   211: aload 4
    //   213: invokevirtual 562	java/io/RandomAccessFile:close	()V
    //   216: iconst_0
    //   217: ireturn
    //   218: astore_0
    //   219: ldc 154
    //   221: iconst_1
    //   222: ldc_w 468
    //   225: aload_0
    //   226: invokestatic 565	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   229: iconst_0
    //   230: ireturn
    //   231: astore 4
    //   233: aconst_null
    //   234: astore_0
    //   235: aload_0
    //   236: ifnull +7 -> 243
    //   239: aload_0
    //   240: invokevirtual 562	java/io/RandomAccessFile:close	()V
    //   243: aload 4
    //   245: athrow
    //   246: astore_0
    //   247: ldc 154
    //   249: iconst_1
    //   250: ldc_w 468
    //   253: aload_0
    //   254: invokestatic 565	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   257: goto -14 -> 243
    //   260: astore 4
    //   262: goto -27 -> 235
    //   265: astore 5
    //   267: goto -75 -> 192
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	paramFile	File
    //   103	55	1	i	int
    //   118	9	2	j	int
    //   123	4	3	k	int
    //   79	133	4	localRandomAccessFile	java.io.RandomAccessFile
    //   231	13	4	localObject1	Object
    //   260	1	4	localObject2	Object
    //   4	116	5	arrayOfByte1	byte[]
    //   187	15	5	localIOException1	java.io.IOException
    //   265	1	5	localIOException2	java.io.IOException
    //   89	26	6	arrayOfByte2	byte[]
    // Exception table:
    //   from	to	target	type
    //   134	139	141	java/io/IOException
    //   166	171	173	java/io/IOException
    //   68	81	187	java/io/IOException
    //   211	216	218	java/io/IOException
    //   68	81	231	finally
    //   239	243	246	java/io/IOException
    //   84	91	260	finally
    //   94	102	260	finally
    //   107	114	260	finally
    //   195	206	260	finally
    //   84	91	265	java/io/IOException
    //   94	102	265	java/io/IOException
    //   107	114	265	java/io/IOException
  }
  
  public static String lS(String paramString)
  {
    String str;
    if ((paramString == null) || (paramString.trim().length() == 0) || (paramString.equals("null"))) {
      str = "null";
    }
    do
    {
      return str;
      if (paramString.equals("none")) {
        return "null";
      }
      int i = paramString.lastIndexOf(File.separatorChar);
      if ((i < 0) || (i >= paramString.length() - 1)) {
        break label210;
      }
      paramString = paramString.substring(0, i);
      i = paramString.lastIndexOf(File.separatorChar);
      if ((i < 0) || (i >= paramString.length() - 1)) {
        break label182;
      }
      str = paramString.substring(0, i + 1);
      if (!acbn.bne.equals(str)) {
        break;
      }
      str = paramString.substring(i + 1);
      i = str.lastIndexOf('.');
      paramString = str;
      if (i >= 0) {
        paramString = str.substring(0, i);
      }
      str = paramString;
    } while (!QLog.isColorLevel());
    QLog.d("ChatBackgroundManager", 2, "resName is:" + paramString);
    return paramString;
    return "custom";
    label182:
    throw new IllegalStateException("parentPath is illegal,parentPath is:" + paramString);
    label210:
    throw new IllegalStateException("picPath is illegal,picPath is:" + paramString);
  }
  
  public static String lV(String paramString)
  {
    return acbn.bne + paramString;
  }
  
  public static boolean z(File paramFile)
  {
    if ((isApngFile(paramFile)) && ((Gg() & 0x1) != 0))
    {
      long l = gm();
      if (l <= 10485760L) {
        QLog.d("ChatBackground", 1, "availableMemory is " + l + ", too low to play dynamic background");
      }
    }
    else
    {
      return false;
    }
    return true;
  }
  
  public int B(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences("mobileQQ", 4).getInt(lT(paramString), 0);
  }
  
  public String B(Context paramContext, String paramString)
  {
    String str = "none";
    paramContext = a(paramContext, paramString);
    if (paramContext != null)
    {
      paramString = paramContext.thumbUrl;
      paramContext = paramString;
      if (paramString != null)
      {
        paramContext = paramString;
        if (!"none".equals(paramString)) {
          paramContext = paramString + "&isOldVersion=" + NEW_VERSION;
        }
      }
    }
    do
    {
      do
      {
        return paramContext;
        paramContext = str;
      } while (!new File(bQK).exists());
      paramString = lP(paramString);
      paramContext = paramString;
    } while ("none".equals(paramString));
    return paramString + "?isOldVersion=" + OLD_VERSION;
  }
  
  public HashMap<String, Integer> M()
  {
    Object localObject = wkj.getSharedPreferences(this.mApp.getApplication().getApplicationContext(), this.mApp.getCurrentAccountUin(), 4);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = ((SharedPreferences)localObject).getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      if (Pattern.compile("[0-9]*").matcher(str2).matches())
      {
        String str1 = lS(((SharedPreferences)localObject).getString(str2, "null"));
        if ((str1 != null) && (!str1.equals("null")) && (!str1.equals("custom"))) {
          try
          {
            int i = ((SharedPreferences)localObject).getInt(str2 + "_uinType", -1);
            localHashMap.put(str2 + "_" + i, Integer.valueOf(str1));
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            localNumberFormatException2.printStackTrace();
            QLog.e("ChatBackgroundManager", 2, "getAllBgId id not number bgId:" + str1, localNumberFormatException2);
          }
        }
      }
    }
    localObject = lS(((SharedPreferences)localObject).getString("chat_uniform_bg", "null"));
    if ((localObject != null) && (!((String)localObject).equals("null")) && (!((String)localObject).equals("custom"))) {}
    try
    {
      localHashMap.put("null", Integer.valueOf((String)localObject));
      return localHashMap;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      localNumberFormatException1.printStackTrace();
      QLog.e("ChatBackgroundManager", 2, "getAllBgId id not number bgId:" + (String)localObject, localNumberFormatException1);
    }
    return localHashMap;
  }
  
  public HashMap<String, Integer> N()
  {
    Object localObject1 = this.mApp.getApplication().getApplicationContext();
    Object localObject2 = this.mApp.getCurrentAccountUin();
    localObject1 = ((Context)localObject1).getSharedPreferences("chat_background_path_" + (String)localObject2, 4);
    localObject2 = new HashMap();
    SharedPreferences.Editor localEditor = ((SharedPreferences)localObject1).edit();
    Iterator localIterator = ((SharedPreferences)localObject1).getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((Pattern.compile("[0-9]*").matcher(str).matches()) && (a((SharedPreferences)localObject1, str) > 0))
      {
        localEditor.remove(str + "_uinType");
        localEditor.remove(str + "_chat_bg_effect");
      }
    }
    if (a((SharedPreferences)localObject1, "") > 0) {
      localEditor.remove("null");
    }
    return localObject2;
  }
  
  public HashMap<String, Integer> O()
  {
    Object localObject1 = this.mApp.getApplication().getApplicationContext();
    Object localObject2 = this.mApp.getCurrentAccountUin();
    localObject1 = ((Context)localObject1).getSharedPreferences("chat_background_path_" + (String)localObject2, 4);
    localObject2 = new HashMap();
    Iterator localIterator = ((SharedPreferences)localObject1).getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (Pattern.compile("[0-9]*").matcher(str).matches())
      {
        i = a((SharedPreferences)localObject1, str);
        if (i > 0)
        {
          int j = ((SharedPreferences)localObject1).getInt(str + "_uinType", -1);
          ((HashMap)localObject2).put(str + "_" + j, Integer.valueOf(i));
        }
      }
    }
    int i = a((SharedPreferences)localObject1, "");
    if (i > 0) {
      ((HashMap)localObject2).put("null", Integer.valueOf(i));
    }
    return localObject2;
  }
  
  public HashMap<String, String> P()
  {
    SharedPreferences localSharedPreferences = wkj.getSharedPreferences(this.mApp.getApplication().getApplicationContext(), this.mApp.getCurrentAccountUin(), 4);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localSharedPreferences.getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (Pattern.compile("[0-9]*").matcher(str).matches()) {
        localHashMap.put(str, lS(localSharedPreferences.getString(str, "null")));
      }
    }
    localHashMap.put("chat_uniform_bg", lS(localSharedPreferences.getString("chat_uniform_bg", "null")));
    return localHashMap;
  }
  
  public HashMap<String, Integer> Q()
  {
    Object localObject1 = this.mApp.getApplication().getApplicationContext();
    Object localObject2 = this.mApp.getCurrentAccountUin();
    localObject2 = ((Context)localObject1).getSharedPreferences("chat_background_path_" + (String)localObject2, 4);
    localObject1 = new HashMap();
    localObject2 = ((SharedPreferences)localObject2).getAll().keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (Pattern.compile("[0-9]*").matcher(str).matches()) {
        ((HashMap)localObject1).put(str, Integer.valueOf(e(this.mApp.getApp(), this.uin, str)));
      }
    }
    ((HashMap)localObject1).put("_chat_bg_effect", Integer.valueOf(e(this.mApp.getApp(), this.uin, "")));
    return localObject1;
  }
  
  public int a(Context paramContext, SessionInfo paramSessionInfo, int paramInt, double paramDouble)
  {
    int i = 0;
    int j = 0;
    String str;
    if ((paramSessionInfo != null) && (paramSessionInfo.a != null) && (paramSessionInfo.a.img != null))
    {
      str = paramSessionInfo.a.path;
      if ((!TextUtils.isEmpty(str)) && (!"null".equals(str)) && (!"none".equals(str))) {
        break label366;
      }
      str = ThemeUtil.getCurrentThemeId();
      if ("1000".equals(str))
      {
        if (QLog.isDevelopLevel()) {
          QLog.d("ChatBackgroundManager", 4, "No Chat Background(Default Theme).");
        }
        paramInt = 2;
        return paramInt;
      }
      str = "theme_background_" + str;
    }
    label366:
    for (;;)
    {
      paramContext = a(paramContext, paramSessionInfo, str);
      if (paramContext == null)
      {
        if (QLog.isDevelopLevel()) {
          QLog.d("ChatBackgroundManager", 4, "Background Path=" + str + ", background color not in cache.");
        }
        return -1;
      }
      if (paramContext.isEmpty())
      {
        paramInt = j;
        if (!QLog.isDevelopLevel()) {
          break;
        }
        QLog.d("ChatBackgroundManager", 4, "Background Path=" + str + ", background color is extracting.");
        return 0;
      }
      do
      {
        i += 1;
        if (i >= paramContext.size()) {
          break;
        }
      } while (!b(((Integer)paramContext.get(i)).intValue(), paramInt, paramDouble));
      if (QLog.isColorLevel()) {
        QLog.d("ChatBackgroundManager", 4, "Background Path=" + str + ", background color is similar to font color.");
      }
      return 1;
      if (QLog.isDevelopLevel()) {
        QLog.d("ChatBackgroundManager", 4, "Background Path=" + str + ", background color is not similar to font color.");
      }
      for (;;)
      {
        return 2;
        if (QLog.isDevelopLevel()) {
          QLog.d("ChatBackgroundManager", 4, "No Chat Background.");
        }
      }
    }
  }
  
  public ChatBackgroundInfo a(Context paramContext, String paramString)
  {
    paramContext = paramContext.getSharedPreferences("userChatbgInfo", 4).getString("userChatbgKey", "");
    if (QLog.isColorLevel()) {
      QLog.d("ChatBackgroundManager", 2, " getchatbgInfo chatbgInfo=" + paramContext);
    }
    if (paramContext != null)
    {
      try
      {
        if (paramContext.length() <= 0) {
          break label147;
        }
        paramContext = new JSONObject(paramContext);
        if (!paramContext.has(paramString)) {
          break label147;
        }
        JSONObject localJSONObject = paramContext.getJSONObject(paramString);
        paramContext = new ChatBackgroundInfo();
        paramString.printStackTrace();
      }
      catch (JSONException paramString)
      {
        try
        {
          paramContext.id = paramString;
          paramContext.name = localJSONObject.optString("name");
          paramContext.url = localJSONObject.optString("url");
          paramContext.thumbUrl = localJSONObject.optString("thumbUrl");
          return paramContext;
        }
        catch (JSONException paramString)
        {
          break label137;
        }
        paramString = paramString;
        paramContext = null;
      }
      label137:
      return paramContext;
    }
    label147:
    return null;
  }
  
  public Vector<Integer> a(Bitmap paramBitmap)
  {
    int j = 0;
    Object localObject = aqrk.a(paramBitmap);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      paramBitmap = ((List)localObject).iterator();
      for (int i = 0; paramBitmap.hasNext(); i = ((aqrk.a)paramBitmap.next()).count + i) {}
      paramBitmap = new Vector();
      float f = ((aqrk.a)((List)localObject).get(0)).Mo();
      localObject = ((List)localObject).iterator();
      int k;
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        aqrk.a locala = (aqrk.a)((Iterator)localObject).next();
        if (locala.Mo() / f <= 0.2F) {
          break;
        }
        paramBitmap.add(Integer.valueOf(locala.Mo()));
        k = j + locala.count;
        j = k;
      } while (k / i <= 0.800000011920929D);
      return paramBitmap;
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3)
  {
    QLog.d("ChatBackgroundManager", 1, "setBgByScid  bgId:" + paramInt1 + " effectId:" + paramInt2 + " friendUin:" + paramString1 + " from:" + paramString2 + " uinType:" + paramInt3);
    if ("99".equals(String.valueOf(paramInt1)))
    {
      wkj.a(this.mApp.getApp().getApplicationContext(), this.mApp.getCurrentUin(), paramString1, wkj.g(this.mApp.getApp().getApplicationContext(), this.mApp.getCurrentUin(), paramString1), paramInt2, paramInt3);
      return;
    }
    if (("100".equals(String.valueOf(paramInt1))) || ("0".equals(String.valueOf(paramInt1))))
    {
      wkj.a(this.mApp.getApp().getApplicationContext(), this.mApp.getCurrentUin(), paramString1, "null", paramInt2, paramInt3);
      return;
    }
    paramString2 = "callback_" + paramInt1;
    ChatBackgroundInfo localChatBackgroundInfo = new ChatBackgroundInfo();
    String str = c(true, String.valueOf(paramInt1));
    if (new File(str).exists())
    {
      wkj.a(this.mApp.getApp().getApplicationContext(), this.mApp.getCurrentUin(), paramString1, str, paramInt2, paramInt3);
      return;
    }
    localChatBackgroundInfo.id = String.valueOf(paramInt1);
    a(paramString2 + "_" + paramInt1, new ajdc(this, paramString1, paramInt2, paramInt3));
    a(this.mApp, localChatBackgroundInfo, paramString2);
  }
  
  public void a(long paramLong, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, VasQuickUpdateManager paramVasQuickUpdateManager)
  {
    paramString2 = paramString1.substring("chatbg.".length(), paramString1.length());
    paramString1 = (aqra)this.Q.get(paramString2);
    if (paramString1 == null)
    {
      paramString1 = new aqra();
      paramString1.mId = paramString2;
    }
    for (;;)
    {
      paramString1.mFrom = paramString3;
      boolean bool;
      label92:
      File localFile;
      if (paramInt1 == 0)
      {
        bool = true;
        paramString1.mResult = bool;
        paramString1.mErrorCode = paramInt1;
        paramString1.mEndTime = System.currentTimeMillis();
        if (!paramString1.mResult) {
          break label362;
        }
        paramInt2 = 0;
        paramLong = paramString1.mEndTime;
        long l = paramString1.mStartTime;
        if (QLog.isColorLevel()) {
          QLog.d("ChatBackgroundManager", 2, "endDownload  id=" + paramString1.mResult + "result =" + paramInt2);
        }
        if (!paramString1.mResult) {
          break label368;
        }
        h(0, paramString1.mId, paramLong - l);
        label169:
        if (paramInt1 != 0) {
          break label576;
        }
        paramString3 = lU(paramString2);
        paramVasQuickUpdateManager = lV(paramString2);
        localFile = new File(paramString3);
        if (localFile.exists()) {
          break label421;
        }
        QLog.e("ChatBackgroundManager", 1, "unzip file is missing " + localFile.getAbsolutePath());
      }
      for (;;)
      {
        if ((!this.lL.isEmpty()) && (paramString1.mParams != null) && (paramString1.mParams.containsKey("callbackId")))
        {
          paramString3 = paramString1.mParams.getString("callbackId") + "_" + paramString1.mParams.getInt("id");
          paramString3 = (aqvd)this.lL.remove(paramString3);
          if (paramString3 == null) {}
        }
        try
        {
          paramString3.a(Integer.valueOf(paramString2).intValue(), paramInt2, paramString1.mParams);
          return;
        }
        catch (NumberFormatException paramString1)
        {
          QLog.e("ChatBackgroundManager", 2, "onDownloadCompleted parse id faild, id = " + paramString2);
          return;
        }
        bool = false;
        break;
        label362:
        paramInt2 = 1;
        break label92;
        label368:
        h(1, paramString1.mId, 0L);
        QLog.d("ChatBackgroundManager", 1, "chatbg downloadfail:id = " + paramString1.mId + ";result =" + paramInt2);
        break label169;
        try
        {
          label421:
          aqhq.W(localFile.getAbsolutePath(), paramVasQuickUpdateManager, false);
          VasQuickUpdateEngine.safeDeleteFile(localFile);
          gG(paramString2, c(true, paramString2));
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.d("ChatBackgroundManager", 2, "onDownloadComplete, dstDir= " + paramVasQuickUpdateManager);
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          for (;;)
          {
            QLog.e("ChatBackgroundManager", 1, "failed to unzip " + paramString3 + " dstDir = " + paramVasQuickUpdateManager, localOutOfMemoryError);
          }
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            QLog.e("ChatBackgroundManager", 1, "failed to unzip " + paramString3 + " dstDir = " + paramVasQuickUpdateManager, localThrowable);
          }
        }
        label576:
        if (QLog.isColorLevel()) {
          QLog.d("ChatBackgroundManager", 2, "onDownloadComplete failed, chatbg id = " + paramString2 + " errorCode = " + paramInt1);
        }
      }
    }
  }
  
  public void a(QQAppInterface paramQQAppInterface, long paramLong, String paramString, int paramInt)
  {
    String str = paramString.substring("chatbg.".length(), paramString.length());
    paramString = (aqra)this.Q.get(str);
    paramQQAppInterface = paramString;
    if (paramString == null)
    {
      paramQQAppInterface = new aqra();
      paramQQAppInterface.mId = str;
      this.Q.put(str, paramQQAppInterface);
    }
    paramQQAppInterface.mProgress = paramInt;
  }
  
  public void a(QQAppInterface paramQQAppInterface, ChatBackgroundInfo paramChatBackgroundInfo, String paramString)
  {
    if ((this.mApp == null) || ((paramString == null) && (!aqva.ci(this.mApp.getApp().getApplicationContext()))) || (paramChatBackgroundInfo == null)) {
      QLog.d("ChatBackgroundManager", 2, "startDownload error mApp=" + this.mApp);
    }
    for (;;)
    {
      return;
      String str = paramChatBackgroundInfo.id;
      Bundle localBundle = new Bundle();
      if (!TextUtils.isEmpty(paramString)) {
        localBundle.putString("callbackId", paramString);
      }
      try
      {
        localBundle.putInt("id", Integer.valueOf(str).intValue());
        if (a(this.mApp.getApplication().getApplicationContext(), paramChatBackgroundInfo.id) == null) {
          a(this.mApp.getApplication().getApplicationContext(), paramChatBackgroundInfo);
        }
        localBundle.putSerializable("chatbgInfo", paramChatBackgroundInfo);
        if (!this.cnz)
        {
          this.cnz = aqwu.f(this.mApp.getApplication(), "ChatBackgroundManager", false);
          if ((QLog.isColorLevel()) || (!this.cnz)) {
            QLog.d("ChatBackgroundManager", 2, "startDownload mhaveSDCard:" + this.cnz);
          }
        }
        paramString = new aqra();
        paramString.mId = str;
        paramString.mStartTime = System.currentTimeMillis();
        paramString.mParams = localBundle;
        this.Q.put(paramChatBackgroundInfo.id, paramString);
        ((VasQuickUpdateManager)paramQQAppInterface.getManager(184)).downloadItem(8L, "chatbg." + paramChatBackgroundInfo.id, "ChatBackgroundRes");
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("ChatBackgroundManager", 2, "startDownload  id=" + str);
        return;
      }
      catch (NumberFormatException paramString)
      {
        for (;;)
        {
          QLog.e("ChatBackgroundManager", 2, "startDownload parse id faild, id = " + str);
        }
      }
    }
  }
  
  public void a(String paramString, aqvd paramaqvd)
  {
    this.lL.put(paramString, paramaqvd);
  }
  
  public boolean a(Context paramContext, ChatBackgroundInfo paramChatBackgroundInfo)
  {
    boolean bool = false;
    paramContext = paramContext.getSharedPreferences("userChatbgInfo", 4);
    SharedPreferences.Editor localEditor = paramContext.edit();
    paramContext = paramContext.getString("userChatbgKey", "");
    if (QLog.isColorLevel()) {
      QLog.d("ChatBackgroundManager", 2, " setchatbgInfo chatbgInfo=" + paramChatBackgroundInfo.toString());
    }
    String str = paramChatBackgroundInfo.id;
    if (str != null)
    {
      if (paramContext != null) {}
      try
      {
        if (paramContext.length() > 0)
        {
          paramContext = new JSONObject(paramContext);
          if (!paramContext.has(str)) {
            break label233;
          }
        }
        label233:
        for (JSONObject localJSONObject = paramContext.getJSONObject(str);; localJSONObject = new JSONObject())
        {
          localJSONObject.put("name", paramChatBackgroundInfo.name);
          localJSONObject.put("url", paramChatBackgroundInfo.url);
          localJSONObject.put("thumbUrl", paramChatBackgroundInfo.thumbUrl);
          paramContext.put(str, localJSONObject);
          bool = localEditor.putString("userChatbgKey", paramContext.toString()).commit();
          if ((bool) || (!QLog.isColorLevel())) {
            return bool;
          }
          QLog.d("ChatBackgroundManager", 2, "setThemeInfo sp comit rt=" + bool);
          return bool;
          paramContext = new JSONObject();
          break;
        }
        if (!QLog.isColorLevel()) {
          return bool;
        }
      }
      catch (JSONException paramContext)
      {
        if (QLog.isColorLevel()) {
          QLog.d("ChatBackgroundManager", 2, "ThemeUtil setThemeInfo error:" + paramContext.getMessage());
        }
        paramContext.printStackTrace();
        return false;
      }
    }
    else
    {
      QLog.d("ChatBackgroundManager", 2, "ThemeUtil setThemeInfo error themeId is null");
      return false;
    }
    return bool;
  }
  
  public void ap(QQAppInterface paramQQAppInterface, String paramString)
  {
    reportTimes = 0;
    reportHandler.removeMessages(1);
    bQL = null;
    paramQQAppInterface.execute(new ChatBackgroundManager.2(this, paramString, paramQQAppInterface));
  }
  
  public boolean b(int paramInt1, int paramInt2, double paramDouble)
  {
    int i = Color.red(paramInt1);
    int j = Color.green(paramInt1);
    int k = Color.blue(paramInt1);
    int m = Color.red(paramInt2);
    int n = Color.green(paramInt2);
    int i1 = Color.blue(paramInt2);
    double d = Math.abs(i * i - m * m);
    d = Math.abs(j * j - n * n) * 0.587D + d * 0.299D + Math.abs(k * k - i1 * i1) * 0.114D;
    if (QLog.isDevelopLevel()) {
      QLog.d("ChatBackgroundManager", 4, "color1=" + paramInt1 + ", color2=" + paramInt2 + ", similarity=" + d);
    }
    return d < paramDouble;
  }
  
  public void bE(Context paramContext, String paramString)
  {
    paramContext = paramContext.getSharedPreferences("mobileQQ", 4);
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      if (QLog.isColorLevel()) {
        QLog.e("ChatBackgroundManager", 2, "uin is empty,not save switch bg times");
      }
    }
    int i;
    do
    {
      return;
      paramString = lT(paramString);
      i = paramContext.getInt(paramString, 0);
      if (QLog.isColorLevel()) {
        QLog.d("ChatBackgroundManager", 2, "oldCount is:" + i);
      }
      paramContext = paramContext.edit();
      i += 1;
      paramContext.putInt(paramString, i);
      paramContext.commit();
    } while (!QLog.isColorLevel());
    QLog.d("ChatBackgroundManager", 2, "save count is:" + i);
  }
  
  public void bF(Context paramContext, String paramString)
  {
    paramContext = paramContext.getSharedPreferences("mobileQQ", 4);
    paramString = lT(paramString);
    paramContext = paramContext.edit();
    paramContext.putInt(paramString, 0);
    paramContext.commit();
  }
  
  public String bh(String paramString1, String paramString2)
  {
    SharedPreferences localSharedPreferences = wkj.getSharedPreferences(this.mApp.getApp(), paramString1, 4);
    if (TextUtils.isEmpty(paramString2))
    {
      paramString1 = localSharedPreferences.getString("chat_uniform_bg", null);
      if (TextUtils.isEmpty(paramString1)) {
        return lS("null");
      }
      return lS(paramString1);
    }
    paramString2 = localSharedPreferences.getString(paramString2, null);
    paramString1 = paramString2;
    if (paramString2 == null)
    {
      paramString2 = localSharedPreferences.getString("chat_uniform_bg", null);
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = "null";
      }
    }
    return lS(paramString1);
  }
  
  public void dB(Intent paramIntent)
  {
    paramIntent = paramIntent.getExtras();
    if (paramIntent != null)
    {
      String str = ChatActivityUtils.cs(paramIntent.getInt("uintype", 999));
      int i = paramIntent.getInt("bg_replace_entrance", 999);
      if (QLog.isDevelopLevel()) {
        QLog.d("reportEvent", 4, " uin_type : " + str + " entrance_type ： " + i);
      }
      if (i != 999) {
        anot.a(null, "CliOper", "", "", "background", "bkground_replace", i, 0, "0", "0", "", "");
      }
    }
  }
  
  public void dwd()
  {
    Object localObject = wkj.getSharedPreferences(this.mApp.getApplication().getApplicationContext(), this.mApp.getCurrentAccountUin(), 4);
    SharedPreferences.Editor localEditor = ((SharedPreferences)localObject).edit();
    new HashMap();
    Iterator localIterator = ((SharedPreferences)localObject).getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (Pattern.compile("[0-9]*").matcher(str1).matches())
      {
        String str2 = lS(((SharedPreferences)localObject).getString(str1, "null"));
        if ((str2 != null) && (!str2.equals("null")) && (!str2.equals("custom")))
        {
          localEditor.remove(str1);
          localEditor.remove(str1 + "_uinType");
        }
      }
    }
    localObject = lS(((SharedPreferences)localObject).getString("chat_uniform_bg", "null"));
    if ((localObject != null) && (!((String)localObject).equals("null")) && (!((String)localObject).equals("custom"))) {
      localEditor.remove("chat_uniform_bg");
    }
    localEditor.commit();
  }
  
  public Bundle e(String paramString)
  {
    Bundle localBundle = new Bundle();
    paramString = (aqra)this.Q.get(paramString);
    if (paramString != null)
    {
      localBundle.putString("id", paramString.mId);
      localBundle.putString("message", paramString.mErrorMsg);
      if (!paramString.mResult) {
        break label78;
      }
    }
    label78:
    for (int i = 1;; i = 0)
    {
      localBundle.putInt("status", i);
      localBundle.putInt("progress", paramString.mProgress);
      return localBundle;
    }
  }
  
  void h(int paramInt, String paramString, long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.i("ChatBackgroundManager", 2, "download chatbg report actionResult=" + paramInt + ",chatbgId=" + paramString);
    }
    int i = aqiw.getSystemNetwork(this.mApp.getApp().getApplicationContext());
    anot.a(this.mApp, "CliOper", "", "", "chatbackground", "BjIDXiazai", 0, paramInt, "0", "0", i + "", String.valueOf(paramLong));
  }
  
  public String lP(String paramString)
  {
    try
    {
      Object localObject = aqhq.readFileContent(new File(bQK));
      localObject = new JSONObject((String)((String)localObject).subSequence(((String)localObject).indexOf("{"), ((String)localObject).length() - 1)).getJSONObject("data").getJSONArray("chatBackground");
      int j = ((JSONArray)localObject).length();
      int i = 0;
      while (i < j)
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        if (localJSONObject.getString("id").equals(paramString))
        {
          paramString = "https://i.gtimg.cn/qqshow/admindata/comdata/backgroundMall_chat_1/" + localJSONObject.getString("thumbnail");
          return paramString;
        }
        i += 1;
      }
      return "none";
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      return null;
    }
  }
  
  public String lQ(String paramString)
  {
    return g(this.mApp.getApp(), this.uin, paramString);
  }
  
  public String lR(String paramString)
  {
    return bh(this.uin, paramString);
  }
  
  public String lT(String paramString)
  {
    return "chat_background_switch_times_" + paramString;
  }
  
  public String lU(String paramString)
  {
    return lV(paramString) + File.separatorChar + paramString + ".zip";
  }
  
  public boolean nn(String paramString)
  {
    paramString = new File(lV(paramString));
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
    return new File(paramString.getAbsoluteFile(), "aioImage").exists();
  }
  
  public void onDestroy() {}
  
  public void q(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    wkj.b(this.mApp.getApp().getApplicationContext(), paramString1, paramString2, paramString3, paramInt);
    anot.a(null, "CliOper", "", "", "chatbackground", "BjIDShezhi", 0, 0, "0", "0", "", lS(paramString3));
  }
  
  class BgColorExtractJob
    implements Runnable
  {
    private ChatBackgroundManager.a a;
    private Bitmap bmp;
    private boolean recycle;
    private String ub;
    
    public BgColorExtractJob(String paramString, Bitmap paramBitmap, boolean paramBoolean, ChatBackgroundManager.a parama)
    {
      this.ub = paramString;
      this.bmp = paramBitmap;
      this.recycle = paramBoolean;
      this.a = parama;
    }
    
    public void run()
    {
      Vector localVector;
      if (this.bmp != null)
      {
        localVector = ChatBackgroundManager.this.a(this.bmp);
        if (this.recycle) {
          this.bmp.recycle();
        }
        if ((localVector != null) && (!localVector.isEmpty())) {
          if (ChatBackgroundManager.this.y.get(this.ub) != null)
          {
            ((Vector)ChatBackgroundManager.this.y.get(this.ub)).addAll(localVector);
            if (QLog.isDevelopLevel()) {
              QLog.d("ChatBackgroundManager", 4, "get Bitmap from Drawable success.");
            }
            label97:
            if (this.a != null)
            {
              localVector = (Vector)ChatBackgroundManager.this.y.get(this.ub);
              if ((localVector == null) || (localVector.isEmpty())) {
                break label225;
              }
            }
          }
        }
      }
      label225:
      for (boolean bool = true;; bool = false)
      {
        ChatBackgroundManager.this.mApp.runOnUiThread(new ChatBackgroundManager.BgColorExtractJob.1(this, bool, localVector));
        return;
        ChatBackgroundManager.this.y.put(this.ub, localVector);
        break;
        ChatBackgroundManager.this.y.remove(this.ub);
        break;
        ChatBackgroundManager.this.y.remove(this.ub);
        if (!QLog.isDevelopLevel()) {
          break label97;
        }
        QLog.d("ChatBackgroundManager", 4, "get Bitmap from Drawable failed.");
        break label97;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean, Vector<Integer> paramVector);
  }
  
  static class b
    extends Handler
  {
    public b() {}
    
    public b(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      Object localObject = (Object[])paramMessage.obj;
      if (i == 1)
      {
        if (ChatBackgroundManager.reportTimes < 3)
        {
          paramMessage = (String)localObject[0];
          localObject = (QQAppInterface)localObject[1];
          ChatBackgroundManager.a((QQAppInterface)localObject, paramMessage, anpc.a(BaseApplication.getContext()));
          ChatBackgroundManager.reportTimes += 1;
          if (QLog.isColorLevel()) {
            QLog.d("ThemeDownloadTrace", 2, "reportTimes is:" + ChatBackgroundManager.reportTimes);
          }
          Message localMessage = ChatBackgroundManager.reportHandler.obtainMessage();
          localMessage.what = 1;
          localMessage.obj = new Object[] { paramMessage, localObject };
          ChatBackgroundManager.reportHandler.sendMessageDelayed(localMessage, 120000L);
        }
      }
      else {
        return;
      }
      ChatBackgroundManager.reportTimes = 0;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes9.jar
 * Qualified Name:     com.tencent.mobileqq.model.ChatBackgroundManager
 * JD-Core Version:    0.7.0.1
 */