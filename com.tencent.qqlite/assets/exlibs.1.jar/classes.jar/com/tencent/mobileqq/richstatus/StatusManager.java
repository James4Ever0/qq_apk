package com.tencent.mobileqq.richstatus;

import PersonalState.UserProfile;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.util.MQLruCache;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.ConfigHandler;
import com.tencent.mobileqq.app.ConfigObserver;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.FriendsManagerImp;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Friends;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import ecm;
import eco;
import edz;
import eea;
import eeb;
import eec;
import eed;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import mqq.manager.Manager;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import protocol.KQQConfig.GetResourceReqInfo;

public class StatusManager
  implements eco, Manager
{
  public static final int a = -3;
  private static final long jdField_a_of_type_Long = 65L;
  public static final String a = "Q.richstatus.";
  private static volatile WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  public static final boolean a = false;
  private static Object[] jdField_a_of_type_ArrayOfJavaLangObject = new Object[2];
  public static final int b = -2;
  private static final long jdField_b_of_type_Long = 180000L;
  public static final String b = "Q.richstatus.img";
  public static final int c = -1;
  private static final long jdField_c_of_type_Long = 240000L;
  public static final String c = "Q.richstatus.xml";
  public static final int d = 100;
  private static final long jdField_d_of_type_Long = 60000L;
  public static final String d = "Q.richstatus.shuo";
  public static final int e = 101;
  private static final long jdField_e_of_type_Long = 43200000L;
  public static final String e = "Q.richstatus.set";
  public static final int f = 102;
  private static final long f = 300000L;
  public static final String f = "Q.richstatus.mate";
  public static final int g = 200;
  public static final String g = "Q.richstatus.status";
  public static final int h = 201;
  public static final String h = "rich_status.tmp";
  public static final int i = 300;
  public static final String i = "$N";
  public static final int j = 301;
  public static final String j = "$A";
  public static final int k = -1;
  public static final String k = "rich_status";
  public static final int l = 0;
  public static final String l = "k_version";
  public static final int m = 0;
  public static final String m = "key_params_qq";
  public static final int n = 1;
  private static final String n = "rich_status.xml";
  private static final int jdField_o_of_type_Int = 2;
  private static final String jdField_o_of_type_JavaLangString = "_";
  private static final int jdField_p_of_type_Int = 3;
  private static final String jdField_p_of_type_JavaLangString = "_s_";
  private static final String jdField_q_of_type_JavaLangString = "$U";
  private static final String jdField_r_of_type_JavaLangString = "$D";
  private static final String jdField_s_of_type_JavaLangString = "$T";
  private static final int jdField_t_of_type_Int = 14;
  private static final String jdField_t_of_type_JavaLangString = "$S";
  private static final String u = "$I";
  private static final String v = "k_update_time";
  private static final String w = "k_icon";
  private static final String x = "k_sync_ss";
  private static final String y = "k_ss_time";
  private volatile AsyncTask jdField_a_of_type_AndroidOsAsyncTask;
  private volatile SparseArray jdField_a_of_type_AndroidUtilSparseArray = new SparseArray();
  private ConfigObserver jdField_a_of_type_ComTencentMobileqqAppConfigObserver;
  private FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private RichStatus jdField_a_of_type_ComTencentMobileqqRichstatusRichStatus;
  private StatusObserver jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver;
  private ecm jdField_a_of_type_Ecm;
  private ArrayList jdField_a_of_type_JavaUtilArrayList = new ArrayList();
  private HashMap jdField_a_of_type_JavaUtilHashMap;
  private HashSet jdField_a_of_type_JavaUtilHashSet;
  private LinkedList jdField_a_of_type_JavaUtilLinkedList;
  private byte[] jdField_a_of_type_ArrayOfByte;
  private AsyncTask jdField_b_of_type_AndroidOsAsyncTask;
  private ArrayList jdField_b_of_type_JavaUtilArrayList;
  private LinkedList jdField_b_of_type_JavaUtilLinkedList;
  private ArrayList jdField_c_of_type_JavaUtilArrayList;
  private LinkedList jdField_c_of_type_JavaUtilLinkedList;
  private LinkedList jdField_d_of_type_JavaUtilLinkedList;
  private LinkedList jdField_e_of_type_JavaUtilLinkedList;
  private long g;
  private long h;
  private long i;
  private long j;
  private int jdField_q_of_type_Int;
  private int jdField_r_of_type_Int;
  private int jdField_s_of_type_Int;
  
  private StatusManager(QQAppInterface paramQQAppInterface)
  {
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_JavaUtilHashSet = new HashSet();
    this.i = a().getLong("k_update_time", 0L);
  }
  
  private int a()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.xml", 2, "updateActions_Local");
    }
    if (this.jdField_a_of_type_AndroidOsAsyncTask != null) {
      return 100;
    }
    this.jdField_a_of_type_AndroidOsAsyncTask = new edz(this).execute(new Void[0]);
    return 100;
  }
  
  /* Error */
  private android.content.Intent a(BaseActivity paramBaseActivity, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: iload_3
    //   5: invokevirtual 208	com/tencent/mobileqq/richstatus/StatusManager:a	(I)Lcom/tencent/mobileqq/richstatus/ActionInfo;
    //   8: astore 7
    //   10: aload 7
    //   12: ifnonnull +5 -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: aload 7
    //   19: getfield 212	com/tencent/mobileqq/richstatus/ActionInfo:jdField_j_of_type_Int	I
    //   22: tableswitch	default:+22 -> 44, 4:+24->46, 5:+74->96
    //   45: areturn
    //   46: aload 7
    //   48: getfield 214	com/tencent/mobileqq/richstatus/ActionInfo:f	Ljava/lang/String;
    //   51: ifnull -36 -> 15
    //   54: new 216	android/content/Intent
    //   57: dup
    //   58: aload_1
    //   59: ldc 218
    //   61: invokespecial 221	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   64: astore_1
    //   65: aload_1
    //   66: ldc 76
    //   68: aload_0
    //   69: aload 7
    //   71: getfield 214	com/tencent/mobileqq/richstatus/ActionInfo:f	Ljava/lang/String;
    //   74: iload_3
    //   75: iload 4
    //   77: aload 5
    //   79: invokevirtual 224	com/tencent/mobileqq/richstatus/StatusManager:a	(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    //   82: invokevirtual 228	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   85: pop
    //   86: aload_1
    //   87: ldc 230
    //   89: aload_2
    //   90: invokevirtual 228	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   93: pop
    //   94: aload_1
    //   95: areturn
    //   96: new 216	android/content/Intent
    //   99: dup
    //   100: aload_1
    //   101: aload 7
    //   103: getfield 232	com/tencent/mobileqq/richstatus/ActionInfo:jdField_j_of_type_JavaLangString	Ljava/lang/String;
    //   106: invokestatic 238	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   109: invokespecial 221	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   112: astore_1
    //   113: aload 7
    //   115: getfield 240	com/tencent/mobileqq/richstatus/ActionInfo:k	Ljava/lang/String;
    //   118: ifnull +24 -> 142
    //   121: aload_1
    //   122: ldc 76
    //   124: aload_0
    //   125: aload 7
    //   127: getfield 240	com/tencent/mobileqq/richstatus/ActionInfo:k	Ljava/lang/String;
    //   130: iload_3
    //   131: iload 4
    //   133: aload 5
    //   135: invokevirtual 224	com/tencent/mobileqq/richstatus/StatusManager:a	(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    //   138: invokevirtual 228	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   141: pop
    //   142: aload_1
    //   143: areturn
    //   144: astore_2
    //   145: aload 6
    //   147: astore_1
    //   148: aload_2
    //   149: invokevirtual 243	java/lang/Exception:printStackTrace	()V
    //   152: aload_1
    //   153: areturn
    //   154: astore_2
    //   155: goto -7 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	StatusManager
    //   0	158	1	paramBaseActivity	BaseActivity
    //   0	158	2	paramString1	String
    //   0	158	3	paramInt1	int
    //   0	158	4	paramInt2	int
    //   0	158	5	paramString2	String
    //   1	145	6	localObject	Object
    //   8	118	7	localActionInfo	ActionInfo
    // Exception table:
    //   from	to	target	type
    //   96	113	144	java/lang/Exception
    //   113	142	154	java/lang/Exception
  }
  
  private SharedPreferences a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences("rich_status", 0);
  }
  
  public static StatusManager a(QQAppInterface paramQQAppInterface)
  {
    if (jdField_a_of_type_JavaLangRefWeakReference != null) {}
    for (StatusManager localStatusManager1 = (StatusManager)jdField_a_of_type_JavaLangRefWeakReference.get();; localStatusManager1 = null)
    {
      StatusManager localStatusManager2;
      if (localStatusManager1 == null)
      {
        localStatusManager2 = new StatusManager(paramQQAppInterface);
        jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(localStatusManager2);
      }
      for (;;)
      {
        localStatusManager2.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
        return localStatusManager2;
        localStatusManager1.jdField_a_of_type_JavaUtilHashSet.clear();
        localStatusManager1.h = 0L;
        localStatusManager1.g = 0L;
        localStatusManager1.jdField_a_of_type_ComTencentMobileqqRichstatusRichStatus = null;
        if (localStatusManager1.jdField_a_of_type_ComTencentMobileqqAppConfigObserver != null)
        {
          localStatusManager1.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.c(localStatusManager1.jdField_a_of_type_ComTencentMobileqqAppConfigObserver);
          localStatusManager1.jdField_a_of_type_ComTencentMobileqqAppConfigObserver = null;
        }
        if (localStatusManager1.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver != null)
        {
          localStatusManager1.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.unRegistObserver(localStatusManager1.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver);
          localStatusManager1.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver = null;
        }
        localStatusManager2 = localStatusManager1;
        if (localStatusManager1.jdField_a_of_type_Ecm != null)
        {
          localStatusManager1.jdField_a_of_type_Ecm.a();
          localStatusManager2 = localStatusManager1;
        }
      }
    }
  }
  
  private boolean a(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    int i1 = 0;
    boolean bool2 = false;
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.xml", 2, "removeOldIcons(" + paramSparseArray1 + ", " + paramSparseArray2 + ")");
    }
    File localFile = ecm.a();
    boolean bool1;
    if (localFile == null)
    {
      bool1 = bool2;
      if (QLog.isColorLevel())
      {
        QLog.d("Q.richstatus.xml", 2, "removeOldIcons: dir is null");
        bool1 = bool2;
      }
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          if (!localFile.exists())
          {
            if (QLog.isColorLevel()) {
              QLog.d("Q.richstatus.xml", 2, "removeOldIcons: dir does not exist!");
            }
            return true;
          }
          if (localFile.canWrite()) {
            break;
          }
          bool1 = bool2;
        } while (!QLog.isColorLevel());
        QLog.d("Q.richstatus.xml", 2, "removeOldIcons: dir can not write!");
        return false;
        if (paramSparseArray1 != null) {
          break;
        }
        paramSparseArray1 = localFile.listFiles();
        i2 = paramSparseArray1.length;
        while (i1 < i2)
        {
          paramSparseArray2 = paramSparseArray1[i1];
          if ((paramSparseArray2.exists()) && (!paramSparseArray2.delete()) && (!paramSparseArray2.delete()) && (paramSparseArray2.delete())) {}
          i1 += 1;
        }
        bool2 = localFile.canWrite();
        bool1 = bool2;
      } while (!QLog.isColorLevel());
      QLog.d("Q.richstatus.xml", 2, "removeOldIcons return with " + bool2);
      return bool2;
      ArrayList localArrayList = new ArrayList();
      int i2 = paramSparseArray2.size();
      i1 = 0;
      while (i1 < i2)
      {
        ActionInfo localActionInfo1 = (ActionInfo)paramSparseArray2.valueAt(i1);
        ActionInfo localActionInfo2 = (ActionInfo)paramSparseArray1.get(localActionInfo1.i);
        if ((localActionInfo2 != null) && (localActionInfo2.jdField_a_of_type_JavaLangString != null) && (!localActionInfo2.jdField_a_of_type_JavaLangString.equalsIgnoreCase(localActionInfo1.jdField_a_of_type_JavaLangString))) {
          localArrayList.add(localActionInfo2.i + "_s_" + 201);
        }
        if ((localActionInfo2 != null) && (localActionInfo2.b != null) && (!localActionInfo2.b.equalsIgnoreCase(localActionInfo1.b))) {
          localArrayList.add(localActionInfo2.i + "_s_" + 200);
        }
        i1 += 1;
      }
      paramSparseArray1 = localArrayList.iterator();
      while (paramSparseArray1.hasNext())
      {
        paramSparseArray2 = new File(localFile, (String)paramSparseArray1.next());
        if ((!paramSparseArray2.exists()) || (paramSparseArray2.delete()) || (paramSparseArray2.delete()) || (!paramSparseArray2.delete())) {}
      }
      bool2 = localFile.canWrite();
      bool1 = bool2;
    } while (!QLog.isColorLevel());
    QLog.d("Q.richstatus.xml", 2, "removeOldIcons return with " + bool2);
    return bool2;
  }
  
  private Object[] a(InputStream paramInputStream)
  {
    int i2 = -1;
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.xml", 2, "parseXmlFile(" + paramInputStream + ")");
    }
    Object[] arrayOfObject = new Object[2];
    if (paramInputStream == null) {
      return arrayOfObject;
    }
    Object localObject2 = new StatusXmlHandler();
    for (;;)
    {
      try
      {
        SAXParserFactory.newInstance().newSAXParser().parse(paramInputStream, (DefaultHandler)localObject2);
        SparseArray localSparseArray = ((StatusXmlHandler)localObject2).a();
        localObject2 = ((StatusXmlHandler)localObject2).a();
        if (localSparseArray.size() > 1) {
          arrayOfObject[0] = localSparseArray;
        }
        if (((ArrayList)localObject2).size() > 0) {
          arrayOfObject[1] = localObject2;
        }
      }
      catch (ParserConfigurationException localParserConfigurationException)
      {
        localParserConfigurationException.printStackTrace();
        try
        {
          paramInputStream.close();
        }
        catch (IOException paramInputStream)
        {
          paramInputStream.printStackTrace();
        }
        continue;
      }
      catch (SAXException localSAXException)
      {
        localSAXException.printStackTrace();
        try
        {
          paramInputStream.close();
        }
        catch (IOException paramInputStream)
        {
          paramInputStream.printStackTrace();
        }
        continue;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        try
        {
          paramInputStream.close();
        }
        catch (IOException paramInputStream)
        {
          paramInputStream.printStackTrace();
        }
        continue;
      }
      finally
      {
        try
        {
          paramInputStream.close();
          throw localObject1;
        }
        catch (IOException paramInputStream)
        {
          paramInputStream.printStackTrace();
          continue;
        }
        int i1 = -1;
        continue;
      }
      try
      {
        paramInputStream.close();
        if (QLog.isColorLevel())
        {
          paramInputStream = new StringBuilder().append("parseXmlFile return, action num: ");
          if (arrayOfObject[0] != null)
          {
            i1 = ((SparseArray)arrayOfObject[0]).size();
            paramInputStream = paramInputStream.append(i1).append(" tag num: ");
            i1 = i2;
            if (arrayOfObject[1] != null) {
              i1 = ((ArrayList)arrayOfObject[1]).size();
            }
            QLog.d("Q.richstatus.xml", 2, i1);
          }
        }
        else
        {
          return arrayOfObject;
        }
      }
      catch (IOException paramInputStream)
      {
        paramInputStream.printStackTrace();
      }
    }
  }
  
  private int b()
  {
    long l1 = System.currentTimeMillis();
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.xml", 2, "updateActions_Remote:" + l1 + ", " + this.h + ", " + "rich_status_android");
    }
    if (Math.abs(l1 - this.h) > 240000L)
    {
      ConfigHandler localConfigHandler = (ConfigHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(4);
      if (this.jdField_a_of_type_ComTencentMobileqqAppConfigObserver == null) {
        c();
      }
      localConfigHandler.a(null, new GetResourceReqInfo[] { localConfigHandler.c() });
      this.h = l1;
    }
    return 100;
  }
  
  private int b(boolean paramBoolean)
  {
    int i1 = 101;
    if (this.jdField_a_of_type_AndroidUtilSparseArray.size() == 0) {
      i1 = 102;
    }
    long l1;
    do
    {
      return i1;
      l1 = System.currentTimeMillis();
      if (Math.abs(this.i - l1) <= 43200000L) {
        break;
      }
    } while (!paramBoolean);
    if (Math.abs(this.j - l1) > 300000L)
    {
      this.j = l1;
      return 101;
    }
    return 100;
  }
  
  private SharedPreferences b()
  {
    return this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences("rich_status" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), 0);
  }
  
  private void b(boolean paramBoolean)
  {
    long l1 = System.currentTimeMillis();
    b().edit().putBoolean("k_sync_ss", paramBoolean).putLong("k_ss_time", l1).commit();
  }
  
  private void c()
  {
    this.jdField_a_of_type_ComTencentMobileqqAppConfigObserver = new eea(this);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(this.jdField_a_of_type_ComTencentMobileqqAppConfigObserver);
  }
  
  private boolean c()
  {
    int i1 = b(true);
    if (i1 != 100)
    {
      a(i1);
      return true;
    }
    return false;
  }
  
  private void d()
  {
    this.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver = new eec(this);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.registObserver(this.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver);
  }
  
  public int a(int paramInt)
  {
    if (paramInt == 102) {
      return a();
    }
    if (paramInt == 101) {
      return b();
    }
    return -1;
  }
  
  public int a(int paramInt, ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      throw new InvalidParameterException("list is null!");
    }
    paramArrayList.clear();
    Object localObject = (ActionInfo)this.jdField_a_of_type_AndroidUtilSparseArray.get(paramInt);
    if (localObject != null) {}
    for (localObject = ((ActionInfo)localObject).jdField_a_of_type_JavaUtilArrayList;; localObject = null)
    {
      if (localObject != null)
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          paramArrayList.add((ActionInfo)((Iterator)localObject).next());
        }
      }
      return b(false);
    }
  }
  
  public int a(RichStatus paramRichStatus, int paramInt)
  {
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder().append("changeStatus ");
      if (paramRichStatus == null) {
        break label103;
      }
    }
    label103:
    for (int i1 = paramRichStatus.b;; i1 = -1)
    {
      QLog.d("Q.richstatus.set", 2, i1 + paramInt);
      this.jdField_a_of_type_ComTencentMobileqqRichstatusRichStatus = paramRichStatus;
      ((FriendListHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(1)).a(paramRichStatus, paramInt);
      if (this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver == null) {
        this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new eeb(this);
      }
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
      return 100;
    }
  }
  
  public int a(ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      throw new InvalidParameterException("array list is null");
    }
    paramArrayList.clear();
    if (this.jdField_a_of_type_JavaUtilArrayList.size() > 0) {
      paramArrayList.addAll(this.jdField_a_of_type_JavaUtilArrayList);
    }
    return b(false);
  }
  
  public int a(boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.shuo", 2, "setSyncShuoShuo " + paramBoolean);
    }
    if (this.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver == null) {
      d();
    }
    StatusServlet.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramBoolean);
    return 100;
  }
  
  public int a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    byte[] arrayOfByte = null;
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.mate", 2, "getStatusMates " + paramBoolean + ", " + paramInt1 + ", " + paramInt2 + ", " + paramInt3 + ", " + paramString);
    }
    if (paramBoolean)
    {
      this.q = paramInt1;
      this.r = paramInt2;
      this.s = paramInt3;
      this.jdField_b_of_type_JavaUtilArrayList = null;
      if ((this.jdField_c_of_type_JavaUtilArrayList == null) && (this.jdField_b_of_type_AndroidOsAsyncTask == null))
      {
        this.jdField_b_of_type_AndroidOsAsyncTask = new eed(this);
        this.jdField_b_of_type_AndroidOsAsyncTask.execute(new Void[0]);
      }
    }
    if (this.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver == null) {
      d();
    }
    QQAppInterface localQQAppInterface = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
    if (paramBoolean) {}
    for (;;)
    {
      StatusServlet.a(localQQAppInterface, paramBoolean, paramInt1, paramInt2, paramInt3, paramString, arrayOfByte);
      return 100;
      arrayOfByte = this.jdField_a_of_type_ArrayOfByte;
    }
  }
  
  public long a()
  {
    return a().getLong("k_version", 0L);
  }
  
  public Bitmap a(int paramInt1, int paramInt2)
  {
    localObject7 = null;
    if (this.jdField_a_of_type_Ecm == null) {
      this.jdField_a_of_type_Ecm = new ecm("StatusIcon_", this);
    }
    localObject3 = (ActionInfo)this.jdField_a_of_type_AndroidUtilSparseArray.get(paramInt1);
    Object localObject5 = paramInt1 + "_s_" + paramInt2;
    Object localObject6 = this.jdField_a_of_type_Ecm;
    Object localObject1;
    if (localObject3 != null) {
      if (paramInt2 == 201)
      {
        localObject1 = ((ActionInfo)localObject3).jdField_a_of_type_JavaLangString;
        localObject6 = ((ecm)localObject6).a((String)localObject5, null, (String)localObject1);
        if ((localObject3 == null) && (c()) && (localObject6 == null)) {
          this.jdField_a_of_type_JavaUtilHashSet.add(localObject5);
        }
        if (paramInt2 != 201) {
          break label256;
        }
      }
    }
    try
    {
      if (BaseApplicationImpl.a != null)
      {
        localObject5 = (Bitmap)BaseApplicationImpl.a.get("StatusIcon_RichStatusDefaultBig");
        localObject1 = localObject5;
        localObject3 = localObject7;
        if (localObject5 == null) {
          localObject1 = localObject5;
        }
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      for (;;)
      {
        label208:
        localObject2 = null;
        label256:
        localObject3 = localObject7;
      }
    }
    try
    {
      localObject5 = BitmapFactory.decodeResource(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getResources(), 2130839113);
      localObject1 = localObject5;
      BaseApplicationImpl.a.put("StatusIcon_RichStatusDefaultSmall", localObject5, (byte)0);
      localObject3 = localObject7;
      localObject1 = localObject5;
    }
    catch (OutOfMemoryError localOutOfMemoryError2)
    {
      Object localObject4 = localObject7;
      break label208;
      localObject2 = null;
      break label208;
      localObject2 = null;
      localObject4 = localObject7;
      break label208;
    }
    if (localObject6 != null) {
      localObject1 = localObject6;
    }
    while (paramInt2 == 201)
    {
      return localObject1;
      localObject1 = ((ActionInfo)localObject3).b;
      break;
      localObject1 = null;
      break;
      localObject1 = BitmapFactory.decodeResource(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getResources(), 2130839113);
      localObject3 = localObject7;
      break label208;
      if (paramInt2 != 200) {
        break label381;
      }
      if (BaseApplicationImpl.a != null)
      {
        localObject3 = (Bitmap)BaseApplicationImpl.a.get("StatusIcon_RichStatusDefaultSmall");
        if (localObject3 != null) {
          break label376;
        }
        localObject3 = BitmapFactory.decodeResource(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getResources(), 2130839115);
        BaseApplicationImpl.a.put("StatusIcon_RichStatusDefaultSmall", localObject3, (byte)0);
        localObject1 = null;
        break label208;
      }
      localObject3 = BitmapFactory.decodeResource(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getResources(), 2130839115);
      localObject1 = null;
      break label208;
    }
    return localObject3;
  }
  
  public ActionInfo a(int paramInt)
  {
    ActionInfo localActionInfo = (ActionInfo)this.jdField_a_of_type_AndroidUtilSparseArray.get(paramInt);
    if (localActionInfo == null) {
      c();
    }
    return localActionInfo;
  }
  
  public RichStatus a()
  {
    Object localObject2;
    if (this.jdField_a_of_type_ComTencentMobileqqRichstatusRichStatus != null)
    {
      localObject2 = this.jdField_a_of_type_ComTencentMobileqqRichstatusRichStatus;
      return localObject2;
    }
    Object localObject1 = (FriendsManagerImp)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(8);
    if (localObject1 != null)
    {
      localObject1 = ((FriendsManagerImp)localObject1).c(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a());
      if (localObject1 == null) {}
    }
    for (localObject1 = ((Friends)localObject1).getRichStatus();; localObject1 = null)
    {
      localObject2 = localObject1;
      if (localObject1 != null) {
        break;
      }
      return new RichStatus(null);
    }
  }
  
  public String a()
  {
    Object localObject = a();
    if (((RichStatus)localObject).b == 14)
    {
      localObject = a(((RichStatus)localObject).b);
      if (localObject != null) {
        return ((ActionInfo)localObject).jdField_c_of_type_JavaLangString;
      }
      return "听音乐";
    }
    StringBuilder localStringBuilder = new StringBuilder().append(((RichStatus)localObject).jdField_c_of_type_JavaLangString);
    if (TextUtils.isEmpty(((RichStatus)localObject).d)) {}
    for (localObject = "";; localObject = ((RichStatus)localObject).d) {
      return (String)localObject;
    }
  }
  
  public String a(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    return paramString1.replace("$I", Integer.toString(paramInt1)).replace("$U", Integer.toString(paramInt2)).replace("$A", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a()).replace("$S", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getSid()).replace("$N", paramString2);
  }
  
  /* Error */
  public ArrayList a()
  {
    // Byte code:
    //   0: new 145	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 146	java/util/ArrayList:<init>	()V
    //   7: astore 8
    //   9: aload_0
    //   10: getfield 150	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   13: bipush 8
    //   15: invokevirtual 653	com/tencent/mobileqq/app/QQAppInterface:getManager	(I)Lmqq/manager/Manager;
    //   18: checkcast 695	com/tencent/mobileqq/model/FriendManager
    //   21: astore 10
    //   23: aload 10
    //   25: ifnull +242 -> 267
    //   28: invokestatic 468	java/lang/System:currentTimeMillis	()J
    //   31: ldc2_w 696
    //   34: ldiv
    //   35: lstore_2
    //   36: aload_0
    //   37: getfield 591	com/tencent/mobileqq/richstatus/StatusManager:r	I
    //   40: istore_1
    //   41: aload_0
    //   42: getfield 593	com/tencent/mobileqq/richstatus/StatusManager:s	I
    //   45: i2l
    //   46: lstore 4
    //   48: aload_0
    //   49: getfield 150	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   52: invokevirtual 502	com/tencent/mobileqq/app/QQAppInterface:a	()Ljava/lang/String;
    //   55: astore 6
    //   57: aload 6
    //   59: ifnonnull +550 -> 609
    //   62: ldc_w 681
    //   65: astore 6
    //   67: aload 10
    //   69: invokeinterface 699 1 0
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +189 -> 267
    //   81: aload 7
    //   83: invokeinterface 702 1 0
    //   88: ifle +179 -> 267
    //   91: aload 7
    //   93: invokeinterface 703 1 0
    //   98: astore 7
    //   100: aload 7
    //   102: invokeinterface 399 1 0
    //   107: ifeq +160 -> 267
    //   110: aload 7
    //   112: invokeinterface 402 1 0
    //   117: checkcast 705	com/tencent/mobileqq/persistence/Entity
    //   120: checkcast 660	com/tencent/mobileqq/data/Friends
    //   123: astore 9
    //   125: aload 6
    //   127: aload 9
    //   129: getfield 708	com/tencent/mobileqq/data/Friends:uin	Ljava/lang/String;
    //   132: invokevirtual 711	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   135: ifne -35 -> 100
    //   138: lload_2
    //   139: aload 9
    //   141: getfield 714	com/tencent/mobileqq/data/Friends:richTime	J
    //   144: lsub
    //   145: ldc2_w 715
    //   148: lcmp
    //   149: ifge -49 -> 100
    //   152: aload 9
    //   154: invokevirtual 663	com/tencent/mobileqq/data/Friends:getRichStatus	()Lcom/tencent/mobileqq/richstatus/RichStatus;
    //   157: astore 11
    //   159: iload_1
    //   160: aload 11
    //   162: getfield 560	com/tencent/mobileqq/richstatus/RichStatus:b	I
    //   165: if_icmpne -65 -> 100
    //   168: lload 4
    //   170: aload 11
    //   172: getfield 718	com/tencent/mobileqq/richstatus/RichStatus:jdField_c_of_type_Int	I
    //   175: i2l
    //   176: lcmp
    //   177: ifeq +9 -> 186
    //   180: iload_1
    //   181: bipush 14
    //   183: if_icmpne -83 -> 100
    //   186: new 720	PersonalState/UserProfile
    //   189: dup
    //   190: invokespecial 721	PersonalState/UserProfile:<init>	()V
    //   193: astore 12
    //   195: aload 12
    //   197: aload 9
    //   199: getfield 708	com/tencent/mobileqq/data/Friends:uin	Ljava/lang/String;
    //   202: invokestatic 727	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   205: putfield 730	PersonalState/UserProfile:lEctID	J
    //   208: aload 12
    //   210: aload 9
    //   212: invokestatic 735	com/tencent/mobileqq/utils/ContactUtils:a	(Lcom/tencent/mobileqq/data/Friends;)Ljava/lang/String;
    //   215: putfield 738	PersonalState/UserProfile:strNick	Ljava/lang/String;
    //   218: aload 12
    //   220: aload 9
    //   222: getfield 742	com/tencent/mobileqq/data/Friends:status	B
    //   225: i2l
    //   226: putfield 745	PersonalState/UserProfile:nStatus	J
    //   229: aload 12
    //   231: aload 9
    //   233: getfield 749	com/tencent/mobileqq/data/Friends:faceid	S
    //   236: putfield 752	PersonalState/UserProfile:wFace	S
    //   239: aload 12
    //   241: aload 11
    //   243: putfield 755	PersonalState/UserProfile:rs	Lcom/tencent/mobileqq/richstatus/RichStatus;
    //   246: aload 12
    //   248: aload 9
    //   250: getfield 714	com/tencent/mobileqq/data/Friends:richTime	J
    //   253: putfield 756	PersonalState/UserProfile:richTime	J
    //   256: aload 8
    //   258: aload 12
    //   260: invokevirtual 388	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   263: pop
    //   264: goto -164 -> 100
    //   267: aload 8
    //   269: invokevirtual 450	java/util/ArrayList:size	()I
    //   272: ifle +175 -> 447
    //   275: aload_0
    //   276: getfield 150	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   279: invokevirtual 759	com/tencent/mobileqq/app/QQAppInterface:a	()Lcom/tencent/mobileqq/persistence/EntityManagerFactory;
    //   282: invokevirtual 765	com/tencent/mobileqq/persistence/EntityManagerFactory:createEntityManager	()Lcom/tencent/mobileqq/persistence/EntityManager;
    //   285: astore 9
    //   287: aconst_null
    //   288: astore 6
    //   290: aload 9
    //   292: invokevirtual 770	com/tencent/mobileqq/persistence/EntityManager:a	()Lcom/tencent/mobileqq/persistence/EntityTransaction;
    //   295: astore 7
    //   297: aload 7
    //   299: astore 6
    //   301: aload 6
    //   303: invokevirtual 773	com/tencent/mobileqq/persistence/EntityTransaction:a	()V
    //   306: aload 8
    //   308: invokevirtual 394	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   311: astore 7
    //   313: aload 7
    //   315: invokeinterface 399 1 0
    //   320: ifeq +235 -> 555
    //   323: aload 7
    //   325: invokeinterface 402 1 0
    //   330: checkcast 720	PersonalState/UserProfile
    //   333: astore 11
    //   335: aload 10
    //   337: aload 11
    //   339: getfield 730	PersonalState/UserProfile:lEctID	J
    //   342: invokestatic 776	java/lang/Long:toString	(J)Ljava/lang/String;
    //   345: invokeinterface 779 2 0
    //   350: astore 12
    //   352: aload 12
    //   354: ifnull +192 -> 546
    //   357: aload 11
    //   359: aload 12
    //   361: getfield 784	com/tencent/mobileqq/data/Card:iFaceNum	I
    //   364: i2l
    //   365: putfield 787	PersonalState/UserProfile:nPicNum	J
    //   368: aload 11
    //   370: aload 12
    //   372: getfield 790	com/tencent/mobileqq/data/Card:age	B
    //   375: putfield 793	PersonalState/UserProfile:bAge	B
    //   378: aload 12
    //   380: getfield 796	com/tencent/mobileqq/data/Card:shGender	S
    //   383: ifne +103 -> 486
    //   386: aload 11
    //   388: iconst_0
    //   389: putfield 799	PersonalState/UserProfile:bSex	B
    //   392: goto -79 -> 313
    //   395: astore 7
    //   397: invokestatic 173	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   400: ifeq +14 -> 414
    //   403: ldc 17
    //   405: iconst_2
    //   406: aload 7
    //   408: invokevirtual 802	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   411: invokestatic 178	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   414: aload 6
    //   416: ifnull +8 -> 424
    //   419: aload 6
    //   421: invokevirtual 804	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   424: aload 9
    //   426: ifnull +8 -> 434
    //   429: aload 9
    //   431: invokevirtual 805	com/tencent/mobileqq/persistence/EntityManager:a	()V
    //   434: aload 8
    //   436: new 807	eee
    //   439: dup
    //   440: aload_0
    //   441: invokespecial 808	eee:<init>	(Lcom/tencent/mobileqq/richstatus/StatusManager;)V
    //   444: invokestatic 814	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   447: invokestatic 173	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   450: ifeq +33 -> 483
    //   453: ldc 51
    //   455: iconst_2
    //   456: new 315	java/lang/StringBuilder
    //   459: dup
    //   460: invokespecial 316	java/lang/StringBuilder:<init>	()V
    //   463: ldc_w 816
    //   466: invokevirtual 322	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: aload 8
    //   471: invokevirtual 450	java/util/ArrayList:size	()I
    //   474: invokevirtual 384	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   477: invokevirtual 333	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   480: invokestatic 178	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   483: aload 8
    //   485: areturn
    //   486: aload 12
    //   488: getfield 796	com/tencent/mobileqq/data/Card:shGender	S
    //   491: iconst_1
    //   492: if_icmpne +45 -> 537
    //   495: aload 11
    //   497: iconst_1
    //   498: putfield 799	PersonalState/UserProfile:bSex	B
    //   501: goto -188 -> 313
    //   504: astore 8
    //   506: aload 6
    //   508: astore 7
    //   510: aload 8
    //   512: astore 6
    //   514: aload 7
    //   516: ifnull +8 -> 524
    //   519: aload 7
    //   521: invokevirtual 804	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   524: aload 9
    //   526: ifnull +8 -> 534
    //   529: aload 9
    //   531: invokevirtual 805	com/tencent/mobileqq/persistence/EntityManager:a	()V
    //   534: aload 6
    //   536: athrow
    //   537: aload 11
    //   539: iconst_2
    //   540: putfield 799	PersonalState/UserProfile:bSex	B
    //   543: goto -230 -> 313
    //   546: aload 11
    //   548: iconst_2
    //   549: putfield 799	PersonalState/UserProfile:bSex	B
    //   552: goto -239 -> 313
    //   555: aload 6
    //   557: invokevirtual 817	com/tencent/mobileqq/persistence/EntityTransaction:c	()V
    //   560: aload 6
    //   562: ifnull +8 -> 570
    //   565: aload 6
    //   567: invokevirtual 804	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   570: aload 9
    //   572: ifnull -138 -> 434
    //   575: aload 9
    //   577: invokevirtual 805	com/tencent/mobileqq/persistence/EntityManager:a	()V
    //   580: goto -146 -> 434
    //   583: astore 6
    //   585: aconst_null
    //   586: astore 7
    //   588: goto -74 -> 514
    //   591: astore 8
    //   593: aload 6
    //   595: astore 7
    //   597: aload 8
    //   599: astore 6
    //   601: goto -87 -> 514
    //   604: astore 7
    //   606: goto -209 -> 397
    //   609: goto -542 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	612	0	this	StatusManager
    //   40	144	1	i1	int
    //   35	104	2	l1	long
    //   46	123	4	l2	long
    //   55	511	6	localObject1	Object
    //   583	11	6	localObject2	Object
    //   599	1	6	localObject3	Object
    //   74	250	7	localObject4	Object
    //   395	12	7	localException1	Exception
    //   508	88	7	localObject5	Object
    //   604	1	7	localException2	Exception
    //   7	477	8	localArrayList	ArrayList
    //   504	7	8	localObject6	Object
    //   591	7	8	localObject7	Object
    //   123	453	9	localObject8	Object
    //   21	315	10	localFriendManager	com.tencent.mobileqq.model.FriendManager
    //   157	390	11	localObject9	Object
    //   193	294	12	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   301	313	395	java/lang/Exception
    //   313	352	395	java/lang/Exception
    //   357	392	395	java/lang/Exception
    //   486	501	395	java/lang/Exception
    //   537	543	395	java/lang/Exception
    //   546	552	395	java/lang/Exception
    //   555	560	395	java/lang/Exception
    //   301	313	504	finally
    //   313	352	504	finally
    //   357	392	504	finally
    //   486	501	504	finally
    //   537	543	504	finally
    //   546	552	504	finally
    //   555	560	504	finally
    //   290	297	583	finally
    //   397	414	591	finally
    //   290	297	604	java/lang/Exception
  }
  
  public ArrayList a(ArrayList paramArrayList)
  {
    HashMap localHashMap = this.jdField_a_of_type_JavaUtilHashMap;
    int i2 = paramArrayList.size();
    Object localObject;
    if ((localHashMap != null) && (localHashMap.size() > 0) && (i2 > 0))
    {
      i1 = i2 - 1;
      while (i1 > -1)
      {
        localObject = (UserProfile)paramArrayList.get(i1);
        UserProfile localUserProfile = (UserProfile)localHashMap.get(Long.valueOf(((UserProfile)localObject).lEctID));
        if (localUserProfile != null)
        {
          localUserProfile.bAge = ((UserProfile)localObject).bAge;
          localUserProfile.bSex = ((UserProfile)localObject).bSex;
          localUserProfile.strDesc = ((UserProfile)localObject).strDesc;
          paramArrayList.remove(i1);
        }
        i1 -= 1;
      }
    }
    if (QLog.isColorLevel())
    {
      localObject = new StringBuilder().append("filterFriends ").append(i2).append(" - ");
      if (localHashMap == null) {
        break label185;
      }
    }
    label185:
    for (int i1 = localHashMap.size();; i1 = -1)
    {
      QLog.d("Q.richstatus.mate", 2, i1 + "=" + paramArrayList.size());
      return paramArrayList;
    }
  }
  
  public ArrayList a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    if (paramInt == -1)
    {
      localArrayList.addAll(paramArrayList1);
      localObject1 = paramArrayList1.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (UserProfile)((Iterator)localObject1).next();
        localHashMap.put(Long.valueOf(((UserProfile)localObject2).lEctID), localObject2);
      }
    }
    Object localObject1 = paramArrayList1.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (UserProfile)((Iterator)localObject1).next();
      if (((UserProfile)localObject2).bSex == paramInt)
      {
        localArrayList.add(localObject2);
        localHashMap.put(Long.valueOf(((UserProfile)localObject2).lEctID), localObject2);
      }
    }
    Object localObject2 = Long.valueOf(0L);
    try
    {
      long l1 = Long.parseLong(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a());
      localObject1 = Long.valueOf(l1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject1 = localObject2;
        if (QLog.isColorLevel())
        {
          QLog.w("Q.richstatus.xml", 2, localException.toString());
          localObject1 = localObject2;
          continue;
          localException.bAge = ((UserProfile)localObject2).bAge;
          localException.bSex = ((UserProfile)localObject2).bSex;
          localException.strDesc = ((UserProfile)localObject2).strDesc;
        }
      }
      this.jdField_a_of_type_JavaUtilHashMap = localHashMap;
      if (!QLog.isColorLevel()) {
        break label396;
      }
    }
    localHashMap.put(localObject1, new UserProfile());
    localObject1 = paramArrayList2.iterator();
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (UserProfile)((Iterator)localObject1).next();
        UserProfile localUserProfile = (UserProfile)localHashMap.get(Long.valueOf(((UserProfile)localObject2).lEctID));
        if (localUserProfile == null)
        {
          localArrayList.add(localObject2);
          continue;
        }
      }
      localObject1 = new StringBuilder().append("mergeFriendsStrangers ");
      if (paramArrayList1 == null) {
        break;
      }
    }
    for (int i1 = paramArrayList1.size();; i1 = -1)
    {
      QLog.d("Q.richstatus.mate", 2, i1 + " " + paramArrayList2.size() + " " + paramInt + "=" + localArrayList.size());
      label396:
      return localArrayList;
    }
  }
  
  public void a()
  {
    StatusServlet.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
  }
  
  public void a(Object paramObject)
  {
    if (paramObject == null) {}
    label79:
    label116:
    do
    {
      for (;;)
      {
        return;
        if ((paramObject instanceof IIconListener))
        {
          if (this.jdField_a_of_type_JavaUtilLinkedList == null)
          {
            this.jdField_a_of_type_JavaUtilLinkedList = new LinkedList();
            this.jdField_a_of_type_JavaUtilLinkedList.add((IIconListener)paramObject);
          }
        }
        else
        {
          if ((paramObject instanceof IActionListener))
          {
            if (this.jdField_b_of_type_JavaUtilLinkedList != null) {
              break label217;
            }
            this.jdField_b_of_type_JavaUtilLinkedList = new LinkedList();
            this.jdField_b_of_type_JavaUtilLinkedList.add((IActionListener)paramObject);
          }
          if ((paramObject instanceof IImageListener))
          {
            if (this.jdField_c_of_type_JavaUtilLinkedList != null) {
              break label243;
            }
            this.jdField_c_of_type_JavaUtilLinkedList = new LinkedList();
            this.jdField_c_of_type_JavaUtilLinkedList.add((IImageListener)paramObject);
          }
          if ((paramObject instanceof IStatusListener))
          {
            if (this.d != null) {
              break label269;
            }
            this.d = new LinkedList();
            this.d.add((IStatusListener)paramObject);
          }
        }
        for (;;)
        {
          if (!(paramObject instanceof ISameStatusListener)) {
            break label293;
          }
          if (this.e != null) {
            break label295;
          }
          this.e = new LinkedList();
          this.e.add((ISameStatusListener)paramObject);
          return;
          if (this.jdField_a_of_type_JavaUtilLinkedList.contains(paramObject)) {
            break;
          }
          this.jdField_a_of_type_JavaUtilLinkedList.add((IIconListener)paramObject);
          break;
          if (this.jdField_b_of_type_JavaUtilLinkedList.contains(paramObject)) {
            break label79;
          }
          this.jdField_b_of_type_JavaUtilLinkedList.add((IActionListener)paramObject);
          break label79;
          if (this.jdField_c_of_type_JavaUtilLinkedList.contains(paramObject)) {
            break label116;
          }
          this.jdField_c_of_type_JavaUtilLinkedList.add((IImageListener)paramObject);
          break label116;
          if (!this.d.contains(paramObject)) {
            this.d.add((IStatusListener)paramObject);
          }
        }
      }
    } while (this.e.contains(paramObject));
    label217:
    label243:
    this.e.add((ISameStatusListener)paramObject);
    label269:
    label293:
    label295:
    return;
  }
  
  public void a(String paramString)
  {
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getPreferences().edit().putString(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "sp_hot_status", paramString).commit();
  }
  
  public void a(String paramString1, String paramString2, Bitmap paramBitmap, int paramInt)
  {
    if ((paramString2 == null) && (paramBitmap != null)) {
      this.jdField_a_of_type_JavaUtilHashSet.remove(paramString1);
    }
    paramString1 = paramString1.split("_");
    int i1;
    if (paramString1.length == 3)
    {
      if (this.jdField_a_of_type_JavaUtilLinkedList != null)
      {
        paramInt = Integer.parseInt(paramString1[0]);
        i1 = Integer.parseInt(paramString1[2]);
        paramString1 = this.jdField_a_of_type_JavaUtilLinkedList.iterator();
        while (paramString1.hasNext()) {
          ((IIconListener)paramString1.next()).a(paramInt, i1, paramBitmap);
        }
      }
    }
    else if ((paramString1.length == 2) && (this.jdField_c_of_type_JavaUtilLinkedList != null))
    {
      i1 = Integer.parseInt(paramString1[0]);
      int i2 = Integer.parseInt(paramString1[1]);
      paramString1 = this.jdField_c_of_type_JavaUtilLinkedList.iterator();
      while (paramString1.hasNext()) {
        ((IImageListener)paramString1.next()).a(i1, i2, paramBitmap, paramInt);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (((this.jdField_a_of_type_JavaUtilLinkedList == null) || (this.jdField_a_of_type_JavaUtilLinkedList.size() == 0)) && ((this.jdField_c_of_type_JavaUtilLinkedList == null) || (this.jdField_c_of_type_JavaUtilLinkedList.size() == 0)))
    {
      this.jdField_a_of_type_JavaUtilHashSet.clear();
      return;
    }
    Iterator localIterator = this.jdField_a_of_type_JavaUtilHashSet.iterator();
    label50:
    String str;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localObject1 = str.split("_");
        localObject2 = (ActionInfo)this.jdField_a_of_type_AndroidUtilSparseArray.get(Integer.parseInt(localObject1[0]));
        if (localObject2 != null) {
          if (localObject1.length == 3) {
            if (Integer.parseInt(localObject1[2]) == 201) {
              localObject1 = ((ActionInfo)localObject2).jdField_a_of_type_JavaLangString;
            }
          }
        }
      }
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = this.jdField_a_of_type_Ecm.a(str, null, (String)localObject1);
        if (localObject2 == null) {
          break label50;
        }
        a(str, (String)localObject1, (Bitmap)localObject2, 1);
        break label50;
        localObject1 = ((ActionInfo)localObject2).b;
        continue;
        if ((localObject1.length != 2) || (TextUtils.isEmpty(((ActionInfo)localObject2).g))) {
          break label224;
        }
        localObject1 = ((ActionInfo)localObject2).g.replace("$U", localObject1[1]);
        continue;
      }
      localIterator.remove();
      break label50;
      if (!paramBoolean) {
        break;
      }
      this.jdField_a_of_type_JavaUtilHashSet.clear();
      return;
      label224:
      localObject1 = null;
    }
  }
  
  public boolean a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqRichstatusRichStatus != null;
  }
  
  public boolean a(long paramLong)
  {
    long l2 = a().getLong("k_version", 65L);
    long l1 = l2;
    if (l2 < 65L) {
      l1 = 65L;
    }
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.xml", 2, "StatusManager.isNewVersion(): localVersion " + l1 + " serverVersion " + paramLong + ", builtInVersion " + 65L);
    }
    return paramLong > l1;
  }
  
  public boolean a(BaseActivity paramBaseActivity, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (TextUtils.isEmpty(paramString2)) {}
    do
    {
      return false;
      paramString1 = a(paramBaseActivity, paramString1, paramInt1, paramInt2, paramString2);
    } while (paramString1 == null);
    paramBaseActivity.startActivity(paramString1);
    return true;
  }
  
  /* Error */
  public boolean a(File paramFile, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 173	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   3: ifeq +45 -> 48
    //   6: ldc 33
    //   8: iconst_2
    //   9: new 315	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 316	java/lang/StringBuilder:<init>	()V
    //   16: ldc_w 932
    //   19: invokevirtual 322	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_1
    //   23: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   26: ldc_w 327
    //   29: invokevirtual 322	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: lload_2
    //   33: invokevirtual 473	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   36: ldc_w 329
    //   39: invokevirtual 322	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 333	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 178	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   48: aload_0
    //   49: new 934	java/io/FileInputStream
    //   52: dup
    //   53: aload_1
    //   54: invokespecial 937	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   57: invokespecial 416	com/tencent/mobileqq/richstatus/StatusManager:a	(Ljava/io/InputStream;)[Ljava/lang/Object;
    //   60: astore 7
    //   62: aload 7
    //   64: iconst_0
    //   65: aaload
    //   66: checkcast 140	android/util/SparseArray
    //   69: astore 8
    //   71: aload 7
    //   73: iconst_1
    //   74: aaload
    //   75: checkcast 145	java/util/ArrayList
    //   78: astore 9
    //   80: aload 8
    //   82: ifnull +418 -> 500
    //   85: aload 8
    //   87: invokevirtual 365	android/util/SparseArray:size	()I
    //   90: ifle +410 -> 500
    //   93: aload 9
    //   95: ifnull +405 -> 500
    //   98: aload 9
    //   100: invokevirtual 450	java/util/ArrayList:size	()I
    //   103: ifle +397 -> 500
    //   106: aload_0
    //   107: getfield 143	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_AndroidUtilSparseArray	Landroid/util/SparseArray;
    //   110: astore 7
    //   112: aload_0
    //   113: getfield 143	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_AndroidUtilSparseArray	Landroid/util/SparseArray;
    //   116: astore 10
    //   118: aload 10
    //   120: monitorenter
    //   121: aload_0
    //   122: getfield 180	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_AndroidOsAsyncTask	Landroid/os/AsyncTask;
    //   125: astore 11
    //   127: aload 11
    //   129: ifnull +10 -> 139
    //   132: aload 11
    //   134: iconst_1
    //   135: invokevirtual 941	android/os/AsyncTask:cancel	(Z)Z
    //   138: pop
    //   139: aload_0
    //   140: aload 8
    //   142: putfield 143	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_AndroidUtilSparseArray	Landroid/util/SparseArray;
    //   145: aload 10
    //   147: monitorexit
    //   148: aload 9
    //   150: ifnull +40 -> 190
    //   153: aload 9
    //   155: invokevirtual 450	java/util/ArrayList:size	()I
    //   158: ifle +32 -> 190
    //   161: aload_0
    //   162: getfield 148	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   165: astore 8
    //   167: aload 8
    //   169: monitorenter
    //   170: aload_0
    //   171: getfield 148	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   174: invokevirtual 552	java/util/ArrayList:clear	()V
    //   177: aload_0
    //   178: getfield 148	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   181: aload 9
    //   183: invokevirtual 577	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   186: pop
    //   187: aload 8
    //   189: monitorexit
    //   190: aload_0
    //   191: invokestatic 468	java/lang/System:currentTimeMillis	()J
    //   194: putfield 166	com/tencent/mobileqq/richstatus/StatusManager:i	J
    //   197: new 340	java/io/File
    //   200: dup
    //   201: aload_0
    //   202: getfield 150	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   205: invokevirtual 248	com/tencent/mobileqq/app/QQAppInterface:a	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   208: invokevirtual 944	com/tencent/qphone/base/util/BaseApplication:getFilesDir	()Ljava/io/File;
    //   211: ldc 80
    //   213: invokespecial 405	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   216: astore 8
    //   218: aload_1
    //   219: aload 8
    //   221: invokevirtual 948	java/io/File:renameTo	(Ljava/io/File;)Z
    //   224: ifne +21 -> 245
    //   227: aload_1
    //   228: aload 8
    //   230: invokevirtual 948	java/io/File:renameTo	(Ljava/io/File;)Z
    //   233: ifne +12 -> 245
    //   236: aload_1
    //   237: aload 8
    //   239: invokevirtual 948	java/io/File:renameTo	(Ljava/io/File;)Z
    //   242: ifeq +218 -> 460
    //   245: aload_0
    //   246: invokespecial 158	com/tencent/mobileqq/richstatus/StatusManager:a	()Landroid/content/SharedPreferences;
    //   249: invokeinterface 512 1 0
    //   254: astore_1
    //   255: aload_1
    //   256: ldc 73
    //   258: lload_2
    //   259: invokeinterface 522 4 0
    //   264: ldc 107
    //   266: aload_0
    //   267: getfield 166	com/tencent/mobileqq/richstatus/StatusManager:i	J
    //   270: invokeinterface 522 4 0
    //   275: invokeinterface 525 1 0
    //   280: pop
    //   281: aload_0
    //   282: aload 7
    //   284: aload_0
    //   285: getfield 143	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_AndroidUtilSparseArray	Landroid/util/SparseArray;
    //   288: invokespecial 408	com/tencent/mobileqq/richstatus/StatusManager:a	(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z
    //   291: ifeq +18 -> 309
    //   294: aload_1
    //   295: ldc 110
    //   297: lload_2
    //   298: invokeinterface 522 4 0
    //   303: invokeinterface 525 1 0
    //   308: pop
    //   309: iconst_0
    //   310: istore 4
    //   312: iload 4
    //   314: aload_0
    //   315: getfield 148	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   318: invokevirtual 450	java/util/ArrayList:size	()I
    //   321: if_icmpge +173 -> 494
    //   324: aload_0
    //   325: getfield 148	com/tencent/mobileqq/richstatus/StatusManager:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   328: iload 4
    //   330: invokevirtual 824	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   333: checkcast 950	com/tencent/mobileqq/richstatus/StateTag
    //   336: astore_1
    //   337: aload_1
    //   338: getfield 951	com/tencent/mobileqq/richstatus/StateTag:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   341: ldc_w 953
    //   344: invokevirtual 711	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   347: ifeq +131 -> 478
    //   350: iconst_0
    //   351: istore 5
    //   353: iload 5
    //   355: aload_1
    //   356: getfield 954	com/tencent/mobileqq/richstatus/StateTag:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   359: invokevirtual 450	java/util/ArrayList:size	()I
    //   362: if_icmpge +116 -> 478
    //   365: aload_1
    //   366: getfield 954	com/tencent/mobileqq/richstatus/StateTag:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   369: iload 5
    //   371: invokevirtual 824	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   374: checkcast 683	java/lang/Integer
    //   377: invokevirtual 957	java/lang/Integer:intValue	()I
    //   380: bipush 15
    //   382: if_icmpne +13 -> 395
    //   385: aload_1
    //   386: getfield 954	com/tencent/mobileqq/richstatus/StateTag:jdField_a_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   389: iload 5
    //   391: invokevirtual 835	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   394: pop
    //   395: iload 5
    //   397: iconst_1
    //   398: iadd
    //   399: istore 5
    //   401: goto -48 -> 353
    //   404: astore_1
    //   405: aload 10
    //   407: monitorexit
    //   408: aload_1
    //   409: athrow
    //   410: astore_1
    //   411: iconst_0
    //   412: istore 6
    //   414: aload_1
    //   415: invokevirtual 958	java/io/FileNotFoundException:printStackTrace	()V
    //   418: invokestatic 173	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   421: ifeq +30 -> 451
    //   424: ldc 33
    //   426: iconst_2
    //   427: new 315	java/lang/StringBuilder
    //   430: dup
    //   431: invokespecial 316	java/lang/StringBuilder:<init>	()V
    //   434: ldc_w 960
    //   437: invokevirtual 322	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: iload 6
    //   442: invokevirtual 362	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   445: invokevirtual 333	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   448: invokestatic 178	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   451: iload 6
    //   453: ireturn
    //   454: astore_1
    //   455: aload 8
    //   457: monitorexit
    //   458: aload_1
    //   459: athrow
    //   460: invokestatic 173	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   463: ifeq -154 -> 309
    //   466: ldc 33
    //   468: iconst_2
    //   469: ldc_w 962
    //   472: invokestatic 178	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   475: goto -166 -> 309
    //   478: iload 4
    //   480: iconst_1
    //   481: iadd
    //   482: istore 4
    //   484: goto -172 -> 312
    //   487: astore_1
    //   488: iconst_1
    //   489: istore 6
    //   491: goto -77 -> 414
    //   494: iconst_1
    //   495: istore 6
    //   497: goto -79 -> 418
    //   500: iconst_0
    //   501: istore 6
    //   503: goto -85 -> 418
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	506	0	this	StatusManager
    //   0	506	1	paramFile	File
    //   0	506	2	paramLong	long
    //   310	173	4	i1	int
    //   351	49	5	i2	int
    //   412	90	6	bool	boolean
    //   60	223	7	localObject1	Object
    //   78	104	9	localArrayList	ArrayList
    //   125	8	11	localAsyncTask	AsyncTask
    // Exception table:
    //   from	to	target	type
    //   121	127	404	finally
    //   132	139	404	finally
    //   139	148	404	finally
    //   405	408	404	finally
    //   48	80	410	java/io/FileNotFoundException
    //   85	93	410	java/io/FileNotFoundException
    //   98	121	410	java/io/FileNotFoundException
    //   153	170	410	java/io/FileNotFoundException
    //   190	245	410	java/io/FileNotFoundException
    //   245	309	410	java/io/FileNotFoundException
    //   408	410	410	java/io/FileNotFoundException
    //   458	460	410	java/io/FileNotFoundException
    //   460	475	410	java/io/FileNotFoundException
    //   170	190	454	finally
    //   455	458	454	finally
    //   312	350	487	java/io/FileNotFoundException
    //   353	395	487	java/io/FileNotFoundException
  }
  
  public Object[] a(int paramInt1, int paramInt2)
  {
    Object localObject2 = null;
    if (this.jdField_a_of_type_Ecm == null) {
      this.jdField_a_of_type_Ecm = new ecm("StatusIcon_", this);
    }
    Object localObject3 = (ActionInfo)this.jdField_a_of_type_AndroidUtilSparseArray.get(paramInt1);
    String str2 = paramInt1 + "_" + paramInt2;
    Object localObject1 = this.jdField_a_of_type_Ecm.a(str2);
    String str1;
    if (localObject1 == null)
    {
      if ((localObject3 == null) && (c())) {
        this.jdField_a_of_type_JavaUtilHashSet.add(str2);
      }
      if ((localObject3 != null) && (((ActionInfo)localObject3).g != null))
      {
        localObject1 = ((ActionInfo)localObject3).g.replace("$U", Integer.toString(paramInt2)).replace("$D", Integer.toString(paramInt2 % 100)).replace("$T", Integer.toString(paramInt2 % 1000));
        str1 = paramInt1 + "_s_" + 201;
        localObject3 = this.jdField_a_of_type_Ecm.a(str1);
        ecm localecm = this.jdField_a_of_type_Ecm;
        if (localObject3 != null)
        {
          label201:
          localecm.a(str2, (String)localObject2, (String)localObject1);
          if (localObject3 != null) {
            break label324;
          }
          if (BaseApplicationImpl.a == null) {
            break label297;
          }
          localObject1 = (Bitmap)BaseApplicationImpl.a.get("StatusIcon_RichStatusDefaultBig");
          if (localObject1 != null) {
            break label319;
          }
          localObject1 = BitmapFactory.decodeResource(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getResources(), 2130839113);
          BaseApplicationImpl.a.put("StatusIcon_RichStatusDefaultSmall", localObject1, (byte)0);
          paramInt1 = 0;
        }
      }
    }
    for (;;)
    {
      jdField_a_of_type_ArrayOfJavaLangObject[0] = localObject1;
      jdField_a_of_type_ArrayOfJavaLangObject[1] = Integer.valueOf(paramInt1);
      return jdField_a_of_type_ArrayOfJavaLangObject;
      localObject2 = str1;
      break label201;
      label297:
      localObject1 = BitmapFactory.decodeResource(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getResources(), 2130839113);
      paramInt1 = 0;
      continue;
      label319:
      paramInt1 = 0;
      continue;
      label324:
      localObject1 = localObject3;
      paramInt1 = 0;
      continue;
      localObject1 = null;
      break;
      paramInt1 = 1;
    }
  }
  
  public Bitmap b(int paramInt1, int paramInt2)
  {
    return (Bitmap)a(paramInt1, paramInt2)[0];
  }
  
  public void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.mate", 2, "clearSameFriends");
    }
    this.jdField_c_of_type_JavaUtilArrayList = null;
    this.jdField_b_of_type_JavaUtilArrayList = null;
    if (this.jdField_b_of_type_AndroidOsAsyncTask != null)
    {
      this.jdField_b_of_type_AndroidOsAsyncTask.cancel(true);
      this.jdField_b_of_type_AndroidOsAsyncTask = null;
    }
  }
  
  public void b(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return;
      if (((paramObject instanceof IIconListener)) && (this.jdField_a_of_type_JavaUtilLinkedList != null)) {
        this.jdField_a_of_type_JavaUtilLinkedList.remove(paramObject);
      }
      if (((paramObject instanceof IActionListener)) && (this.jdField_b_of_type_JavaUtilLinkedList != null)) {
        this.jdField_b_of_type_JavaUtilLinkedList.remove(paramObject);
      }
      if (((paramObject instanceof IImageListener)) && (this.jdField_c_of_type_JavaUtilLinkedList != null)) {
        this.jdField_c_of_type_JavaUtilLinkedList.remove(paramObject);
      }
      if (((paramObject instanceof IStatusListener)) && (this.d != null)) {
        this.d.remove(paramObject);
      }
    } while ((!(paramObject instanceof ISameStatusListener)) || (this.e == null));
    this.e.remove(paramObject);
  }
  
  public boolean b()
  {
    SharedPreferences localSharedPreferences = b();
    boolean bool = localSharedPreferences.getBoolean("k_sync_ss", false);
    long l1 = System.currentTimeMillis();
    if ((Math.abs(l1 - this.g) > 180000L) && (Math.abs(l1 - localSharedPreferences.getLong("k_ss_time", 0L)) > 60000L))
    {
      if (this.jdField_a_of_type_ComTencentMobileqqRichstatusStatusObserver == null) {
        d();
      }
      this.g = l1;
      StatusServlet.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
    }
    if (QLog.isColorLevel()) {
      QLog.d("Q.richstatus.shuo", 2, "getSyncShuoShuo " + bool);
    }
    return bool;
  }
  
  public void onDestroy() {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     com.tencent.mobileqq.richstatus.StatusManager
 * JD-Core Version:    0.7.0.1
 */