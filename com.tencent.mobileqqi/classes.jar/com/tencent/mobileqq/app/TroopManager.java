package com.tencent.mobileqq.app;

import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.TroopNotificationCache;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.app.proxy.RecentUserProxy;
import com.tencent.mobileqq.data.CommonlyUsedTroop;
import com.tencent.mobileqq.data.FavOpenTroopInfo;
import com.tencent.mobileqq.data.Friends;
import com.tencent.mobileqq.data.OpenTroopInfo;
import com.tencent.mobileqq.data.RecentUser;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.data.TroopMemberCard;
import com.tencent.mobileqq.data.TroopMemberInfo;
import com.tencent.mobileqq.model.FriendManager;
import com.tencent.mobileqq.persistence.Entity;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.persistence.EntityTransaction;
import com.tencent.mobileqq.util.TroopSystemMsgUtil;
import com.tencent.mobileqq.utils.StringUtil;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.TraceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mqq.manager.Manager;

public class TroopManager
  implements Manager
{
  public static final int a = -100;
  public static final String a = "Q.contacttab.";
  public static final String b = "Q.contacttab.troop";
  private LruCache jdField_a_of_type_AndroidSupportV4UtilLruCache = new LruCache(120);
  FriendsManager jdField_a_of_type_ComTencentMobileqqAppFriendsManager;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private EntityManager jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager;
  ArrayList jdField_a_of_type_JavaUtilArrayList = new ArrayList();
  private HashMap jdField_a_of_type_JavaUtilHashMap = new HashMap();
  private Map jdField_a_of_type_JavaUtilMap;
  private ConcurrentHashMap jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
  private boolean jdField_a_of_type_Boolean = false;
  private LruCache jdField_b_of_type_AndroidSupportV4UtilLruCache = new LruCache(50);
  private ConcurrentHashMap jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
  private ConcurrentHashMap c;
  private ConcurrentHashMap d;
  
  public TroopManager(QQAppInterface paramQQAppInterface)
  {
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager = paramQQAppInterface.a().createEntityManager();
    this.jdField_a_of_type_ComTencentMobileqqAppFriendsManager = ((FriendsManager)paramQQAppInterface.getManager(46));
  }
  
  private ConcurrentHashMap a()
  {
    int j = 0;
    if (this.c == null)
    {
      ArrayList localArrayList = (ArrayList)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(CommonlyUsedTroop.class, false, null, null, null, null, null, null);
      if (localArrayList != null) {}
      for (int i = localArrayList.size();; i = 0)
      {
        this.c = new ConcurrentHashMap(i);
        while (j < i)
        {
          CommonlyUsedTroop localCommonlyUsedTroop = (CommonlyUsedTroop)localArrayList.get(j);
          if (QLog.isColorLevel()) {
            QLog.d("OpenTroopDebug", 2, "init load groupcode = " + localCommonlyUsedTroop.troopUin);
          }
          this.c.put(localCommonlyUsedTroop.troopUin, localCommonlyUsedTroop);
          j += 1;
        }
      }
      if (QLog.isColorLevel()) {
        QLog.d("CommonlyUsedTroop", 2, "load CommonlyUsedTroop info: size = " + i);
      }
    }
    return this.c;
  }
  
  private void a(OpenTroopInfo paramOpenTroopInfo)
  {
    if ((paramOpenTroopInfo == null) || (TextUtils.isEmpty(paramOpenTroopInfo.troopCode))) {}
    for (;;)
    {
      return;
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(FavOpenTroopInfo.class, paramOpenTroopInfo.troopCode);
      if (localObject != null) {
        this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b((Entity)localObject);
      }
      localObject = new FavOpenTroopInfo();
      ((FavOpenTroopInfo)localObject).CopyFrom(paramOpenTroopInfo);
      a((Entity)localObject);
      localObject = a();
      if ((localObject != null) && (((ArrayList)localObject).size() > 20))
      {
        int j = ((ArrayList)localObject).size();
        int i = 0;
        while (i < j - 20)
        {
          FavOpenTroopInfo localFavOpenTroopInfo = (FavOpenTroopInfo)((ArrayList)localObject).get(i);
          if (paramOpenTroopInfo != null) {
            this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(localFavOpenTroopInfo);
          }
          i += 1;
        }
      }
    }
  }
  
  private void b(ArrayList paramArrayList)
  {
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap == null) {
      if (paramArrayList == null) {
        break label33;
      }
    }
    label33:
    for (int i = paramArrayList.size();; i = 0)
    {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap(i);
      if (paramArrayList != null) {
        break;
      }
      return;
    }
    EntityTransaction localEntityTransaction = this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a();
    for (;;)
    {
      try
      {
        localEntityTransaction.a();
        i = 0;
        if (i < paramArrayList.size())
        {
          TroopInfo localTroopInfo = (TroopInfo)paramArrayList.get(i);
          Object localObject = (FriendManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(8);
          if ((localTroopInfo == null) || (((FriendManager)localObject).f(localTroopInfo.troopuin)) || ((localTroopInfo != null) && (localTroopInfo.troopuin == null) && (localTroopInfo.troopcode == null))) {
            break label272;
          }
          if ((localTroopInfo.troopcode == null) || (localTroopInfo.troopcode.length() <= 1))
          {
            localObject = (Entity)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(localTroopInfo.troopuin);
            if ((localObject != null) && ((localObject instanceof TroopInfo)))
            {
              localObject = (TroopInfo)localObject;
              if ((((TroopInfo)localObject).troopcode != null) && (((TroopInfo)localObject).troopcode.length() > 1)) {
                localTroopInfo.troopcode = ((TroopInfo)localObject).troopcode;
              }
            }
          }
          this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(localTroopInfo.troopuin, localTroopInfo);
          a(localTroopInfo);
        }
      }
      catch (Exception paramArrayList)
      {
        paramArrayList.printStackTrace();
        localEntityTransaction.b();
        f();
        return;
        localEntityTransaction.c();
        localEntityTransaction.b();
        continue;
      }
      finally
      {
        localEntityTransaction.b();
      }
      label272:
      i += 1;
    }
  }
  
  private boolean d(String paramString)
  {
    return (paramString != null) && (!"".equals(paramString));
  }
  
  private void e()
  {
    int j = 0;
    if (QLog.isColorLevel()) {
      QLog.d("Q.contacttab.troop", 2, "initTroopListCache begin");
    }
    localObject2 = (ArrayList)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopInfo.class, false, null, null, null, null, null, null);
    if (localObject2 != null) {}
    ConcurrentHashMap localConcurrentHashMap;
    ArrayList localArrayList;
    for (int i = ((ArrayList)localObject2).size();; i = 0)
    {
      localConcurrentHashMap = new ConcurrentHashMap(i);
      if (localObject2 == null) {
        break label218;
      }
      localArrayList = new ArrayList();
      i = 0;
      while (i < ((ArrayList)localObject2).size())
      {
        TroopInfo localTroopInfo = (TroopInfo)((ArrayList)localObject2).get(i);
        if ((localTroopInfo.mCompareSpell == null) || (localTroopInfo.mCompareSpell.length() == 0))
        {
          ContactSorter.a(localTroopInfo);
          localArrayList.add(localTroopInfo);
        }
        localConcurrentHashMap.put(localTroopInfo.troopuin, localTroopInfo);
        i += 1;
      }
    }
    if (localArrayList.size() > 0)
    {
      localObject2 = this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a();
      ((EntityTransaction)localObject2).a();
      i = j;
    }
    try
    {
      while (i < localArrayList.size())
      {
        a((Entity)localArrayList.get(i));
        i += 1;
      }
      ((EntityTransaction)localObject2).c();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        ((EntityTransaction)localObject2).b();
      }
    }
    finally
    {
      ((EntityTransaction)localObject2).b();
    }
    localArrayList.clear();
    label218:
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.putAll(localConcurrentHashMap);
    this.jdField_a_of_type_Boolean = true;
    if (QLog.isColorLevel()) {
      QLog.d("Q.contacttab.troop", 2, "initTroopListCache end: " + localConcurrentHashMap.size());
    }
  }
  
  private void f()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.contacttab.troop", 2, "buildTroopUI begin: ");
    }
    ArrayList localArrayList = new ArrayList();
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null)
    {
      int i = this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.size();
      if (i > 0)
      {
        localArrayList.ensureCapacity(i);
        Iterator localIterator = this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.values().iterator();
        while (localIterator.hasNext())
        {
          TroopInfo localTroopInfo = (TroopInfo)localIterator.next();
          if ((localTroopInfo.mCompareSpell == null) || (localTroopInfo.mCompareSpell.length() == 0)) {
            ContactSorter.a(localTroopInfo);
          }
          localArrayList.add(localTroopInfo);
        }
        if (i > 1) {
          ContactSorter.a(localArrayList);
        }
      }
    }
    this.jdField_a_of_type_JavaUtilArrayList = localArrayList;
    if (QLog.isColorLevel()) {
      QLog.d("Q.contacttab.troop", 2, "buildTroopUI end: " + localArrayList.size());
    }
  }
  
  public TroopManager.MemberGagInfo a(String paramString1, String paramString2)
  {
    paramString1 = a(paramString1, paramString2);
    long l = 0L;
    if (paramString1 != null) {
      l = paramString1.gagTimeStamp;
    }
    return new TroopManager.MemberGagInfo(this, paramString2, l);
  }
  
  public OpenTroopInfo a(String paramString)
  {
    return (OpenTroopInfo)this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString);
  }
  
  public TroopInfo a(String paramString)
  {
    Object localObject;
    if (a(paramString))
    {
      localObject = new TroopInfo();
      paramString = a(paramString);
      ((TroopInfo)localObject).troopuin = paramString.troopCode;
      ((TroopInfo)localObject).troopcode = paramString.troopUin;
      ((TroopInfo)localObject).troopname = paramString.troopName;
      ((TroopInfo)localObject).troopface = ((short)paramString.troopFace);
      ((TroopInfo)localObject).fingertroopmemo = paramString.troopIntro;
      ((TroopInfo)localObject).dwGroupClassExt = paramString.troopClass;
      ((TroopInfo)localObject).wMemberNum = paramString.troopMemberNum;
      ((TroopInfo)localObject).strLocation = paramString.troopLocation;
    }
    TroopInfo localTroopInfo;
    do
    {
      do
      {
        do
        {
          return localObject;
          localTroopInfo = null;
          if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) {
            localTroopInfo = (TroopInfo)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString);
          }
          localObject = localTroopInfo;
        } while (localTroopInfo != null);
        localObject = localTroopInfo;
      } while (this.jdField_a_of_type_Boolean);
      localTroopInfo = (TroopInfo)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopInfo.class, paramString);
      localObject = localTroopInfo;
    } while (localTroopInfo == null);
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, localTroopInfo);
    return localTroopInfo;
  }
  
  protected TroopInfo a(String paramString1, String paramString2)
  {
    TroopInfo localTroopInfo2 = a(paramString1);
    TroopInfo localTroopInfo1 = localTroopInfo2;
    if (localTroopInfo2 == null)
    {
      localTroopInfo1 = new TroopInfo();
      localTroopInfo1.troopuin = paramString1;
    }
    localTroopInfo1.troopname = paramString2;
    if ((this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) && (!this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(localTroopInfo1.troopuin))) {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(localTroopInfo1.troopuin, localTroopInfo1);
    }
    ContactSorter.a(localTroopInfo1);
    f();
    return localTroopInfo1;
  }
  
  public TroopMemberCard a(String paramString1, String paramString2)
  {
    paramString1 = paramString1 + "_" + paramString2;
    return (TroopMemberCard)this.jdField_b_of_type_AndroidSupportV4UtilLruCache.get(paramString1);
  }
  
  public TroopMemberInfo a(String paramString1, String paramString2)
  {
    String str = paramString1 + "_" + paramString2;
    TroopMemberInfo localTroopMemberInfo = (TroopMemberInfo)this.jdField_a_of_type_AndroidSupportV4UtilLruCache.get(str);
    Object localObject = localTroopMemberInfo;
    if (localTroopMemberInfo == null)
    {
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
      paramString1 = ((EntityManager)localObject).a(TroopMemberInfo.class, false, "troopuin=? AND memberuin=?", new String[] { paramString1, paramString2 }, null, null, null, null);
      ((EntityManager)localObject).a();
      localObject = localTroopMemberInfo;
      if (paramString1 != null)
      {
        localObject = localTroopMemberInfo;
        if (paramString1.size() > 0)
        {
          localObject = (TroopMemberInfo)paramString1.get(0);
          this.jdField_a_of_type_AndroidSupportV4UtilLruCache.put(str, localObject);
        }
      }
    }
    return localObject;
  }
  
  public EntityTransaction a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a();
  }
  
  public String a(TroopMemberInfo paramTroopMemberInfo)
  {
    Object localObject1 = ((FriendsManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(46)).a(paramTroopMemberInfo.memberuin);
    if ((localObject1 != null) && (((Friends)localObject1).isFriend()) && (!TextUtils.isEmpty(((Friends)localObject1).remark))) {
      localObject1 = ((Friends)localObject1).remark;
    }
    for (;;)
    {
      Object localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        localObject2 = paramTroopMemberInfo.memberuin;
      }
      return localObject2;
      if ((paramTroopMemberInfo != null) && (!TextUtils.isEmpty(paramTroopMemberInfo.troopnick))) {
        localObject1 = paramTroopMemberInfo.troopnick;
      } else if ((localObject1 != null) && (((Friends)localObject1).isFriend())) {
        localObject1 = ((Friends)localObject1).name;
      } else if (paramTroopMemberInfo != null)
      {
        if (!TextUtils.isEmpty(paramTroopMemberInfo.autoremark)) {
          localObject1 = paramTroopMemberInfo.autoremark;
        } else {
          localObject1 = paramTroopMemberInfo.friendnick;
        }
      }
      else {
        localObject1 = "";
      }
    }
  }
  
  public String a(String paramString)
  {
    TroopInfo localTroopInfo = a(paramString);
    String str = paramString;
    if (localTroopInfo != null)
    {
      str = paramString;
      if (localTroopInfo.troopname != null) {
        str = localTroopInfo.troopname;
      }
    }
    return str;
  }
  
  public String a(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      if (QLog.isColorLevel()) {
        QLog.d("Q.contacttab.troop", 2, "getTroopMemberName with: " + paramString1 + ", " + paramString2);
      }
    }
    do
    {
      do
      {
        do
        {
          return null;
          paramString2 = a(paramString1, paramString2);
          if ((paramString2 == null) || (paramString2.level <= 0)) {
            break;
          }
          paramString1 = a(paramString1);
        } while (paramString1 == null);
        paramString1 = paramString1.getTroopLevelMap();
      } while (paramString1 == null);
      return (String)paramString1.get(Integer.valueOf(paramString2.level));
    } while (!QLog.isColorLevel());
    QLog.d("Q.contacttab.troop", 2, "getTroopMemberLevel returns null");
    return null;
  }
  
  public ArrayList a()
  {
    return (ArrayList)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(FavOpenTroopInfo.class, false, null, null, null, null, null, null);
  }
  
  /* Error */
  public ArrayList a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: new 56	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 57	java/util/ArrayList:<init>	()V
    //   10: astore 6
    //   12: aload_0
    //   13: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   16: invokevirtual 175	com/tencent/mobileqq/persistence/EntityManager:a	()Lcom/tencent/mobileqq/persistence/EntityTransaction;
    //   19: astore 5
    //   21: aload 5
    //   23: astore 4
    //   25: aload 4
    //   27: ifnull +139 -> 166
    //   30: aload 4
    //   32: invokevirtual 179	com/tencent/mobileqq/persistence/EntityTransaction:a	()V
    //   35: invokestatic 408	com/tencent/mobileqq/msf/core/NetConnInfoCenter:getServerTime	()J
    //   38: lstore_2
    //   39: aload_0
    //   40: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   43: ldc_w 276
    //   46: iconst_0
    //   47: ldc_w 410
    //   50: iconst_1
    //   51: anewarray 195	java/lang/String
    //   54: dup
    //   55: iconst_0
    //   56: aload_1
    //   57: aastore
    //   58: aconst_null
    //   59: aconst_null
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokevirtual 93	com/tencent/mobileqq/persistence/EntityManager:a	(Ljava/lang/Class;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnull +99 -> 166
    //   70: aload_1
    //   71: invokeinterface 411 1 0
    //   76: astore_1
    //   77: aload_1
    //   78: invokeinterface 262 1 0
    //   83: ifeq +83 -> 166
    //   86: aload_1
    //   87: invokeinterface 266 1 0
    //   92: checkcast 276	com/tencent/mobileqq/data/TroopMemberInfo
    //   95: astore 5
    //   97: aload 5
    //   99: invokestatic 416	com/tencent/mobileqq/activity/ChatActivityUtils:a	(Lcom/tencent/mobileqq/data/TroopMemberInfo;)Z
    //   102: ifeq -25 -> 77
    //   105: aload 5
    //   107: getfield 280	com/tencent/mobileqq/data/TroopMemberInfo:gagTimeStamp	J
    //   110: lconst_0
    //   111: lcmp
    //   112: ifeq -35 -> 77
    //   115: aload 5
    //   117: getfield 280	com/tencent/mobileqq/data/TroopMemberInfo:gagTimeStamp	J
    //   120: lload_2
    //   121: lcmp
    //   122: ifle -45 -> 77
    //   125: aload 6
    //   127: new 282	com/tencent/mobileqq/app/TroopManager$MemberGagInfo
    //   130: dup
    //   131: aload_0
    //   132: aload 5
    //   134: getfield 354	com/tencent/mobileqq/data/TroopMemberInfo:memberuin	Ljava/lang/String;
    //   137: aload 5
    //   139: getfield 280	com/tencent/mobileqq/data/TroopMemberInfo:gagTimeStamp	J
    //   142: invokespecial 285	com/tencent/mobileqq/app/TroopManager$MemberGagInfo:<init>	(Lcom/tencent/mobileqq/app/TroopManager;Ljava/lang/String;J)V
    //   145: invokevirtual 232	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   148: pop
    //   149: goto -72 -> 77
    //   152: astore_1
    //   153: aload 4
    //   155: ifnull +8 -> 163
    //   158: aload 4
    //   160: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   163: aload 6
    //   165: areturn
    //   166: aload 4
    //   168: ifnull -5 -> 163
    //   171: aload 4
    //   173: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   176: aload 6
    //   178: areturn
    //   179: astore_1
    //   180: aconst_null
    //   181: astore 4
    //   183: aload 4
    //   185: ifnull +8 -> 193
    //   188: aload 4
    //   190: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   193: aload_1
    //   194: athrow
    //   195: astore_1
    //   196: goto -13 -> 183
    //   199: astore_1
    //   200: goto -47 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	TroopManager
    //   0	203	1	paramString	String
    //   38	83	2	l	long
    //   1	188	4	localObject1	Object
    //   19	119	5	localObject2	Object
    //   10	167	6	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   30	66	152	java/lang/Throwable
    //   70	77	152	java/lang/Throwable
    //   77	149	152	java/lang/Throwable
    //   12	21	179	finally
    //   30	66	195	finally
    //   70	77	195	finally
    //   77	149	195	finally
    //   12	21	199	java/lang/Throwable
  }
  
  public List a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap.keySet().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((String)localIterator.next());
    }
    return localArrayList;
  }
  
  public List a(String paramString)
  {
    return this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopNotificationCache.class, true, "troopUin=? and read=? and currentUin=?", new String[] { paramString, "0", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() }, null, null, "time ASC", null);
  }
  
  public void a()
  {
    c();
    e();
    f();
  }
  
  public void a(OpenTroopInfo paramOpenTroopInfo, boolean paramBoolean)
  {
    OpenTroopInfo localOpenTroopInfo = new OpenTroopInfo();
    localOpenTroopInfo.CopyFrom(paramOpenTroopInfo);
    localOpenTroopInfo.isNeedDelete = false;
    d(paramOpenTroopInfo.troopCode);
    this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap.put(localOpenTroopInfo.troopCode, localOpenTroopInfo);
    a(localOpenTroopInfo);
    if (QLog.isColorLevel()) {
      QLog.d("OpenTroopDebug", 2, "saveOpenTroopInfo, groupcode = " + paramOpenTroopInfo.troopCode);
    }
    if (paramBoolean) {
      a(paramOpenTroopInfo);
    }
  }
  
  void a(TroopInfo paramTroopInfo)
  {
    FriendManager localFriendManager = (FriendManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(8);
    if ((paramTroopInfo == null) || (localFriendManager.f(paramTroopInfo.troopuin))) {
      return;
    }
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap == null) {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    }
    if ((this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) && (!this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(paramTroopInfo.troopuin))) {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramTroopInfo.troopuin, paramTroopInfo);
    }
    a(paramTroopInfo);
    f();
  }
  
  public void a(String paramString)
  {
    TroopInfo localTroopInfo = a(paramString);
    if (localTroopInfo == null) {
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(localTroopInfo);
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.remove(paramString);
    }
    f();
  }
  
  public void a(String paramString1, String paramString2, TroopMemberCard paramTroopMemberCard)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)) && (paramTroopMemberCard != null))
    {
      paramString1 = paramString1 + "_" + paramString2;
      this.jdField_b_of_type_AndroidSupportV4UtilLruCache.put(paramString1, paramTroopMemberCard);
    }
  }
  
  public void a(ArrayList paramArrayList)
  {
    TraceUtils.a("queryTroops_" + paramArrayList.size());
    if (paramArrayList.size() > 0)
    {
      Object localObject = new StringBuilder("troopuin=? ");
      int i = 1;
      while (i < paramArrayList.size())
      {
        ((StringBuilder)localObject).append("or troopuin=? ");
        i += 1;
      }
      paramArrayList = this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopInfo.class, true, ((StringBuilder)localObject).toString(), (String[])paramArrayList.toArray(new String[paramArrayList.size()]), null, null, null, null);
      if (paramArrayList != null)
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext())
        {
          localObject = (TroopInfo)paramArrayList.next();
          this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(((TroopInfo)localObject).troopuin, localObject);
        }
      }
    }
    TraceUtils.a();
  }
  
  /* Error */
  void a(ArrayList paramArrayList, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 108	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   3: ifeq +54 -> 57
    //   6: new 112	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   13: ldc_w 476
    //   16: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: astore 5
    //   21: aload_1
    //   22: ifnull +47 -> 69
    //   25: aload_1
    //   26: invokevirtual 97	java/util/ArrayList:size	()I
    //   29: istore 4
    //   31: ldc 15
    //   33: iconst_2
    //   34: aload 5
    //   36: iload 4
    //   38: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   41: ldc_w 383
    //   44: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: lload_2
    //   48: invokevirtual 479	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   51: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokestatic 129	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   57: aload_1
    //   58: ifnull +10 -> 68
    //   61: aload_1
    //   62: invokevirtual 97	java/util/ArrayList:size	()I
    //   65: ifne +10 -> 75
    //   68: return
    //   69: iconst_m1
    //   70: istore 4
    //   72: goto -41 -> 31
    //   75: aload_0
    //   76: aload_1
    //   77: invokespecial 481	com/tencent/mobileqq/app/TroopManager:b	(Ljava/util/ArrayList;)V
    //   80: aload_0
    //   81: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   84: invokevirtual 175	com/tencent/mobileqq/persistence/EntityManager:a	()Lcom/tencent/mobileqq/persistence/EntityTransaction;
    //   87: astore_1
    //   88: aload_1
    //   89: invokevirtual 179	com/tencent/mobileqq/persistence/EntityTransaction:a	()V
    //   92: aload_0
    //   93: getfield 36	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap	Ljava/util/concurrent/ConcurrentHashMap;
    //   96: invokevirtual 484	java/util/concurrent/ConcurrentHashMap:entrySet	()Ljava/util/Set;
    //   99: invokeinterface 424 1 0
    //   104: astore 5
    //   106: aload 5
    //   108: invokeinterface 262 1 0
    //   113: ifeq +119 -> 232
    //   116: aload 5
    //   118: invokeinterface 266 1 0
    //   123: checkcast 486	java/util/Map$Entry
    //   126: invokeinterface 489 1 0
    //   131: checkcast 181	com/tencent/mobileqq/data/TroopInfo
    //   134: astore 6
    //   136: aload 6
    //   138: getfield 492	com/tencent/mobileqq/data/TroopInfo:timeSec	J
    //   141: lload_2
    //   142: lcmp
    //   143: ifge -37 -> 106
    //   146: aload 5
    //   148: invokeinterface 494 1 0
    //   153: aload_0
    //   154: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   157: aload 6
    //   159: invokevirtual 160	com/tencent/mobileqq/persistence/EntityManager:b	(Lcom/tencent/mobileqq/persistence/Entity;)Z
    //   162: pop
    //   163: aload_0
    //   164: getfield 61	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   167: invokevirtual 497	com/tencent/mobileqq/app/QQAppInterface:a	()Lcom/tencent/mobileqq/app/proxy/ProxyManager;
    //   170: astore 7
    //   172: aload 7
    //   174: invokevirtual 502	com/tencent/mobileqq/app/proxy/ProxyManager:a	()Lcom/tencent/mobileqq/app/proxy/RecentUserProxy;
    //   177: aload 6
    //   179: getfield 186	com/tencent/mobileqq/data/TroopInfo:troopuin	Ljava/lang/String;
    //   182: iconst_1
    //   183: invokevirtual 507	com/tencent/mobileqq/app/proxy/RecentUserProxy:a	(Ljava/lang/String;I)Lcom/tencent/mobileqq/data/RecentUser;
    //   186: astore 8
    //   188: aload 8
    //   190: ifnull +13 -> 203
    //   193: aload 7
    //   195: invokevirtual 502	com/tencent/mobileqq/app/proxy/ProxyManager:a	()Lcom/tencent/mobileqq/app/proxy/RecentUserProxy;
    //   198: aload 8
    //   200: invokevirtual 510	com/tencent/mobileqq/app/proxy/RecentUserProxy:b	(Lcom/tencent/mobileqq/data/RecentUser;)V
    //   203: invokestatic 515	com/tencent/mobileqq/managers/TroopAssistantManager:a	()Lcom/tencent/mobileqq/managers/TroopAssistantManager;
    //   206: aload 6
    //   208: getfield 186	com/tencent/mobileqq/data/TroopInfo:troopuin	Ljava/lang/String;
    //   211: aload_0
    //   212: getfield 61	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqAppQQAppInterface	Lcom/tencent/mobileqq/app/QQAppInterface;
    //   215: invokevirtual 518	com/tencent/mobileqq/managers/TroopAssistantManager:b	(Ljava/lang/String;Lcom/tencent/mobileqq/app/QQAppInterface;)V
    //   218: goto -112 -> 106
    //   221: astore 5
    //   223: aload_1
    //   224: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   227: aload_0
    //   228: invokespecial 210	com/tencent/mobileqq/app/TroopManager:f	()V
    //   231: return
    //   232: aload_1
    //   233: invokevirtual 212	com/tencent/mobileqq/persistence/EntityTransaction:c	()V
    //   236: aload_1
    //   237: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   240: goto -13 -> 227
    //   243: astore 5
    //   245: aload_1
    //   246: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   249: aload 5
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	TroopManager
    //   0	252	1	paramArrayList	ArrayList
    //   0	252	2	paramLong	long
    //   29	42	4	i	int
    //   19	128	5	localObject1	Object
    //   221	1	5	localException	Exception
    //   243	7	5	localObject2	Object
    //   134	73	6	localTroopInfo	TroopInfo
    //   170	24	7	localProxyManager	ProxyManager
    //   186	13	8	localRecentUser	RecentUser
    // Exception table:
    //   from	to	target	type
    //   88	106	221	java/lang/Exception
    //   106	188	221	java/lang/Exception
    //   193	203	221	java/lang/Exception
    //   203	218	221	java/lang/Exception
    //   232	236	221	java/lang/Exception
    //   88	106	243	finally
    //   106	188	243	finally
    //   193	203	243	finally
    //   203	218	243	finally
    //   232	236	243	finally
  }
  
  public void a(Map paramMap)
  {
    this.jdField_a_of_type_JavaUtilMap = paramMap;
  }
  
  public boolean a()
  {
    if ((this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) && (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.size() > 0)) {}
    ArrayList localArrayList;
    do
    {
      return false;
      localArrayList = (ArrayList)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopInfo.class, false, null, null, null, null, null, String.valueOf("1"));
    } while ((localArrayList != null) && (localArrayList.size() > 0));
    return true;
  }
  
  public boolean a(Entity paramEntity)
  {
    boolean bool = false;
    if (paramEntity.getStatus() == 1000)
    {
      this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(paramEntity);
      if (paramEntity.getStatus() == 1001) {
        bool = true;
      }
    }
    while ((paramEntity.getStatus() != 1001) && (paramEntity.getStatus() != 1002)) {
      return bool;
    }
    return this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(paramEntity);
  }
  
  public boolean a(String paramString)
  {
    return a(paramString) != null;
  }
  
  public boolean a(String paramString, long paramLong)
  {
    ConcurrentHashMap localConcurrentHashMap = a();
    CommonlyUsedTroop localCommonlyUsedTroop = (CommonlyUsedTroop)localConcurrentHashMap.get(paramString);
    if (localCommonlyUsedTroop == null)
    {
      localCommonlyUsedTroop = new CommonlyUsedTroop();
      localCommonlyUsedTroop.troopUin = paramString;
      localCommonlyUsedTroop.addedTimestamp = paramLong;
      localConcurrentHashMap.put(paramString, localCommonlyUsedTroop);
      a(localCommonlyUsedTroop);
      return true;
    }
    if (localCommonlyUsedTroop.addedTimestamp != paramLong)
    {
      localCommonlyUsedTroop.addedTimestamp = paramLong;
      a(localCommonlyUsedTroop);
      return true;
    }
    return false;
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    EntityManager localEntityManager = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
    FriendsManagerImp localFriendsManagerImp = (FriendsManagerImp)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(8);
    if ((localEntityManager == null) || (localFriendsManagerImp == null)) {
      return false;
    }
    TroopInfo localTroopInfo = localFriendsManagerImp.a(paramString1);
    if (localTroopInfo == null) {
      return false;
    }
    paramString1 = (TroopMemberInfo)localEntityManager.a(TroopMemberInfo.class, "troopuin=? and memberuin=?", new String[] { paramString1, paramString2 });
    if (paramString1 != null)
    {
      localEntityManager.b(paramString1);
      if (localTroopInfo.wMemberNum > 0) {
        localTroopInfo.wMemberNum -= 1;
      }
      if ((localTroopInfo.Administrator != null) && (localTroopInfo.Administrator.contains(paramString2))) {
        localTroopInfo.Administrator.replace(paramString2, "");
      }
    }
    localFriendsManagerImp.b(localTroopInfo);
    localEntityManager.a();
    return true;
  }
  
  public boolean a(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, int paramInt2, int paramInt3, int paramInt4, long paramLong1, byte paramByte, long paramLong2)
  {
    paramString5 = a(paramString1, paramString2);
    int j = 0;
    if (paramString5 == null)
    {
      paramString5 = new TroopMemberInfo();
      paramString5.troopuin = paramString1;
      paramString5.memberuin = paramString2;
      paramString5.isTroopFollowed = false;
      j = 1;
    }
    for (;;)
    {
      int i = j;
      if (paramString3 != null)
      {
        i = j;
        if (!paramString3.equals(paramString5.troopnick))
        {
          paramString5.troopnick = paramString3;
          i = 1;
        }
      }
      j = i;
      if (paramString4 != null)
      {
        j = i;
        if (!paramString4.equals(paramString5.friendnick))
        {
          paramString5.friendnick = paramString4;
          j = 1;
        }
      }
      i = j;
      if (paramInt1 > 0)
      {
        i = j;
        if (paramInt1 != paramString5.level)
        {
          paramString5.level = paramInt1;
          i = 1;
        }
      }
      j = i;
      if (paramLong2 != -100L)
      {
        j = i;
        if (paramLong2 != paramString5.gagTimeStamp)
        {
          paramString5.gagTimeStamp = paramLong2;
          j = 1;
        }
      }
      boolean bool;
      if (paramByte == 1)
      {
        bool = true;
        paramInt1 = j;
        if (paramByte != -100)
        {
          paramInt1 = j;
          if (paramString5.isTroopFollowed != bool)
          {
            paramString5.isTroopFollowed = bool;
            paramInt1 = 1;
          }
        }
        if ((paramLong1 == -100L) || (paramLong1 >= paramString5.msgseq)) {
          break label321;
        }
        paramInt2 = paramInt1;
        label254:
        if (paramInt2 == 0) {
          break label460;
        }
        if (paramString5.getStatus() != 1000) {
          break label447;
        }
        this.jdField_a_of_type_AndroidSupportV4UtilLruCache.put(paramString1 + "_" + paramString2, paramString5);
        this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(paramString5);
      }
      for (;;)
      {
        return true;
        bool = false;
        break;
        label321:
        if (paramLong1 != -100L) {
          paramString5.msgseq = paramLong1;
        }
        paramByte = paramInt1;
        if (paramInt2 != -100)
        {
          paramByte = paramInt1;
          if (paramInt2 != paramString5.age)
          {
            paramString5.age = ((byte)paramInt2);
            paramByte = 1;
          }
        }
        paramInt1 = paramByte;
        if (paramInt3 != -100)
        {
          paramInt1 = paramByte;
          if (paramInt3 != paramString5.sex)
          {
            paramString5.sex = ((byte)paramInt3);
            paramInt1 = 1;
          }
        }
        paramInt2 = paramInt1;
        if (paramInt4 == -100) {
          break label254;
        }
        paramInt2 = paramInt1;
        if (paramInt4 == paramString5.distance) {
          break label254;
        }
        paramString5.distance = paramInt4;
        paramInt2 = 1;
        break label254;
        label447:
        this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(paramString5);
      }
      label460:
      return false;
    }
  }
  
  public boolean a(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    return a(paramString1, paramString2, paramString3, paramInt1, paramString4, paramString5, paramInt2, paramInt3, paramInt4, paramLong1, (byte)-100, paramLong2);
  }
  
  /* Error */
  public boolean a(List paramList)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +12 -> 13
    //   4: aload_1
    //   5: invokeinterface 588 1 0
    //   10: ifeq +7 -> 17
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: ireturn
    //   17: new 590	java/util/HashSet
    //   20: dup
    //   21: invokespecial 591	java/util/HashSet:<init>	()V
    //   24: astore 7
    //   26: iconst_0
    //   27: istore_3
    //   28: iconst_0
    //   29: istore 4
    //   31: iconst_0
    //   32: istore_2
    //   33: aconst_null
    //   34: astore 5
    //   36: aload_0
    //   37: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   40: invokevirtual 175	com/tencent/mobileqq/persistence/EntityManager:a	()Lcom/tencent/mobileqq/persistence/EntityTransaction;
    //   43: astore 6
    //   45: aload 6
    //   47: astore 5
    //   49: iload 4
    //   51: istore_3
    //   52: aload 5
    //   54: invokevirtual 179	com/tencent/mobileqq/persistence/EntityTransaction:a	()V
    //   57: iload 4
    //   59: istore_3
    //   60: aload_1
    //   61: invokeinterface 411 1 0
    //   66: astore_1
    //   67: iload_2
    //   68: istore_3
    //   69: aload_1
    //   70: invokeinterface 262 1 0
    //   75: ifeq +135 -> 210
    //   78: iload_2
    //   79: istore_3
    //   80: aload_1
    //   81: invokeinterface 266 1 0
    //   86: checkcast 276	com/tencent/mobileqq/data/TroopMemberInfo
    //   89: astore 6
    //   91: iload_2
    //   92: istore_3
    //   93: new 112	java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   100: aload 6
    //   102: getfield 563	com/tencent/mobileqq/data/TroopMemberInfo:troopuin	Ljava/lang/String;
    //   105: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc_w 339
    //   111: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload 6
    //   116: getfield 354	com/tencent/mobileqq/data/TroopMemberInfo:memberuin	Ljava/lang/String;
    //   119: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: astore 8
    //   127: iload_2
    //   128: istore_3
    //   129: aload 7
    //   131: aload 8
    //   133: invokevirtual 593	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   136: ifne +194 -> 330
    //   139: iload_2
    //   140: istore_3
    //   141: aload_0
    //   142: aload 6
    //   144: getfield 563	com/tencent/mobileqq/data/TroopMemberInfo:troopuin	Ljava/lang/String;
    //   147: aload 6
    //   149: getfield 354	com/tencent/mobileqq/data/TroopMemberInfo:memberuin	Ljava/lang/String;
    //   152: aload 6
    //   154: getfield 368	com/tencent/mobileqq/data/TroopMemberInfo:troopnick	Ljava/lang/String;
    //   157: aload 6
    //   159: getfield 386	com/tencent/mobileqq/data/TroopMemberInfo:level	I
    //   162: aconst_null
    //   163: aconst_null
    //   164: aload 6
    //   166: getfield 576	com/tencent/mobileqq/data/TroopMemberInfo:age	B
    //   169: aload 6
    //   171: getfield 579	com/tencent/mobileqq/data/TroopMemberInfo:sex	B
    //   174: aload 6
    //   176: getfield 582	com/tencent/mobileqq/data/TroopMemberInfo:distance	I
    //   179: aload 6
    //   181: getfield 571	com/tencent/mobileqq/data/TroopMemberInfo:msgseq	J
    //   184: aload 6
    //   186: getfield 280	com/tencent/mobileqq/data/TroopMemberInfo:gagTimeStamp	J
    //   189: invokevirtual 595	com/tencent/mobileqq/app/TroopManager:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIJJ)Z
    //   192: istore 4
    //   194: iload 4
    //   196: iload_2
    //   197: ior
    //   198: istore_2
    //   199: aload 7
    //   201: aload 8
    //   203: invokevirtual 596	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   206: pop
    //   207: goto -140 -> 67
    //   210: iload_2
    //   211: istore_3
    //   212: aload 5
    //   214: invokevirtual 212	com/tencent/mobileqq/persistence/EntityTransaction:c	()V
    //   217: iload_2
    //   218: istore_3
    //   219: aload 5
    //   221: ifnull -206 -> 15
    //   224: aload 5
    //   226: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   229: iload_2
    //   230: ireturn
    //   231: astore 6
    //   233: iload_3
    //   234: istore_2
    //   235: aload 5
    //   237: astore_1
    //   238: aload 6
    //   240: astore 5
    //   242: invokestatic 108	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   245: ifeq +14 -> 259
    //   248: ldc 15
    //   250: iconst_2
    //   251: aload 5
    //   253: invokestatic 602	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   256: invokestatic 604	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   259: iload_2
    //   260: istore_3
    //   261: aload_1
    //   262: ifnull -247 -> 15
    //   265: aload_1
    //   266: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   269: iload_2
    //   270: ireturn
    //   271: astore_1
    //   272: aconst_null
    //   273: astore 5
    //   275: aload 5
    //   277: ifnull +8 -> 285
    //   280: aload 5
    //   282: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   285: aload_1
    //   286: athrow
    //   287: astore_1
    //   288: goto -13 -> 275
    //   291: astore 6
    //   293: aload_1
    //   294: astore 5
    //   296: aload 6
    //   298: astore_1
    //   299: goto -24 -> 275
    //   302: astore 6
    //   304: aload 5
    //   306: astore_1
    //   307: aload 6
    //   309: astore 5
    //   311: iload_3
    //   312: istore_2
    //   313: goto -71 -> 242
    //   316: astore_1
    //   317: aload 5
    //   319: astore 6
    //   321: aload_1
    //   322: astore 5
    //   324: aload 6
    //   326: astore_1
    //   327: goto -85 -> 242
    //   330: goto -123 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	this	TroopManager
    //   0	333	1	paramList	List
    //   32	281	2	bool1	boolean
    //   14	298	3	bool2	boolean
    //   29	169	4	bool3	boolean
    //   34	289	5	localObject1	Object
    //   43	142	6	localObject2	Object
    //   231	8	6	localThrowable1	java.lang.Throwable
    //   291	6	6	localObject3	Object
    //   302	6	6	localThrowable2	java.lang.Throwable
    //   319	6	6	localObject4	Object
    //   24	176	7	localHashSet	java.util.HashSet
    //   125	77	8	str	String
    // Exception table:
    //   from	to	target	type
    //   36	45	231	java/lang/Throwable
    //   36	45	271	finally
    //   52	57	287	finally
    //   60	67	287	finally
    //   69	78	287	finally
    //   80	91	287	finally
    //   93	127	287	finally
    //   129	139	287	finally
    //   141	194	287	finally
    //   199	207	287	finally
    //   212	217	287	finally
    //   242	259	291	finally
    //   52	57	302	java/lang/Throwable
    //   60	67	302	java/lang/Throwable
    //   69	78	302	java/lang/Throwable
    //   80	91	302	java/lang/Throwable
    //   93	127	302	java/lang/Throwable
    //   129	139	302	java/lang/Throwable
    //   141	194	302	java/lang/Throwable
    //   212	217	302	java/lang/Throwable
    //   199	207	316	java/lang/Throwable
  }
  
  public TroopInfo b(String paramString)
  {
    TroopInfo localTroopInfo1 = new TroopInfo();
    Object localObject;
    if (paramString != null) {
      if ("".equals(paramString)) {
        localObject = localTroopInfo1;
      }
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("Q.contacttab.", 2, StringUtil.a(new Object[] { "getTroopInfo()", paramString, Long.valueOf(((TroopInfo)localObject).dwGroupFlagExt) }));
      }
      if (!d(((TroopInfo)localObject).troopname)) {
        ((TroopInfo)localObject).troopname = paramString;
      }
      return localObject;
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
      TroopInfo localTroopInfo2 = (TroopInfo)((EntityManager)localObject).a(TroopInfo.class, paramString);
      ((EntityManager)localObject).a();
      localObject = localTroopInfo2;
      if (localTroopInfo2 == null)
      {
        localTroopInfo1.troopname = TroopSystemMsgUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), paramString);
        localTroopInfo1.dwGroupFlagExt = TroopSystemMsgUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), paramString);
        if (d(localTroopInfo1.troopname))
        {
          localObject = localTroopInfo1;
        }
        else
        {
          localTroopInfo1.troopname = paramString;
          localObject = localTroopInfo1;
        }
      }
    }
  }
  
  public String b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    if (this.d == null) {
      this.d = new ConcurrentHashMap();
    }
    if (this.d.containsKey(paramString)) {
      return (String)this.d.get(paramString);
    }
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null)
    {
      Iterator localIterator = this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (TroopInfo)((Map.Entry)localIterator.next()).getValue();
        if ((localObject != null) && (((TroopInfo)localObject).troopcode != null) && (((TroopInfo)localObject).troopcode.equals(paramString)))
        {
          localObject = ((TroopInfo)localObject).troopuin;
          if ((localObject != null) && (((String)localObject).length() > 0))
          {
            this.d.put(paramString, localObject);
            return localObject;
          }
        }
      }
    }
    return null;
  }
  
  public String b(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      if (QLog.isColorLevel()) {
        QLog.d("Q.contacttab.troop", 2, "getTroopMemberName uin is null");
      }
      paramString2 = "";
    }
    for (;;)
    {
      return paramString2;
      Friends localFriends = ((FriendsManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(46)).a(paramString2);
      if ((localFriends != null) && (localFriends.isFriend()) && (!TextUtils.isEmpty(localFriends.remark))) {
        paramString1 = localFriends.remark;
      }
      while (!TextUtils.isEmpty(paramString1))
      {
        return paramString1;
        paramString1 = a(paramString1, paramString2);
        if ((paramString1 != null) && (!TextUtils.isEmpty(paramString1.troopnick))) {
          paramString1 = paramString1.troopnick;
        } else if ((localFriends != null) && (localFriends.isFriend())) {
          paramString1 = localFriends.name;
        } else if (paramString1 != null)
        {
          if (!TextUtils.isEmpty(paramString1.autoremark)) {
            paramString1 = paramString1.autoremark;
          } else {
            paramString1 = paramString1.friendnick;
          }
        }
        else {
          paramString1 = null;
        }
      }
    }
  }
  
  public ArrayList b()
  {
    return this.jdField_a_of_type_JavaUtilArrayList;
  }
  
  public List b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a().values().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((CommonlyUsedTroop)localIterator.next());
    }
    return localArrayList;
  }
  
  public List b(String paramString)
  {
    return this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopMemberInfo.class, false, "troopuin=?", new String[] { paramString }, null, null, null, null);
  }
  
  public void b()
  {
    this.jdField_a_of_type_AndroidSupportV4UtilLruCache.evictAll();
  }
  
  public void b(TroopInfo paramTroopInfo)
  {
    if ((paramTroopInfo == null) || (a(paramTroopInfo.troopuin))) {
      return;
    }
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap == null) {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    }
    ContactSorter.a(paramTroopInfo);
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramTroopInfo.troopuin, paramTroopInfo);
    }
    if ((!a(paramTroopInfo)) && (QLog.isColorLevel())) {
      QLog.d("Q.contacttab.troop", 2, "saveTroopInfo failed.");
    }
    ProxyManager localProxyManager = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a();
    RecentUser localRecentUser = localProxyManager.a().a(paramTroopInfo.troopuin, 1);
    localRecentUser.displayName = paramTroopInfo.troopname;
    if (localRecentUser.getStatus() == 1001) {
      localProxyManager.a().a(localRecentUser);
    }
    f();
  }
  
  public void b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return;
      paramString = a(paramString);
    } while (paramString == null);
    a(paramString);
  }
  
  void b(ArrayList paramArrayList, long paramLong)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return;
    }
    b(paramArrayList);
    f();
  }
  
  public boolean b(String paramString)
  {
    return a().get(paramString) != null;
  }
  
  public boolean b(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      if (QLog.isColorLevel()) {
        QLog.d("Q.contacttab.troop", 2, "getIsTroopMemberFollowed uin is null");
      }
    }
    do
    {
      return false;
      paramString1 = a(paramString1, paramString2);
    } while ((paramString1 == null) || (TextUtils.isEmpty(paramString1.troopnick)));
    return paramString1.isTroopFollowed;
  }
  
  public String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      break label37;
    }
    label37:
    OpenTroopInfo localOpenTroopInfo;
    do
    {
      Iterator localIterator;
      do
      {
        do
        {
          return paramString;
        } while (this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap == null);
        this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap.size();
        localIterator = this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap.values().iterator();
      } while (!localIterator.hasNext());
      localOpenTroopInfo = (OpenTroopInfo)localIterator.next();
      if ((localOpenTroopInfo == null) || (TextUtils.isEmpty(localOpenTroopInfo.troopUin)) || (!paramString.equals(localOpenTroopInfo.troopUin))) {
        break;
      }
    } while (TextUtils.isEmpty(localOpenTroopInfo.troopName));
    return localOpenTroopInfo.troopName;
  }
  
  public String c(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      if (QLog.isColorLevel()) {
        QLog.d("Q.contacttab.troop", 2, "getTroopMemberNick uin is null");
      }
    }
    do
    {
      return "";
      paramString1 = a(paramString1, paramString2);
    } while ((paramString1 == null) || (TextUtils.isEmpty(paramString1.troopnick)));
    return paramString1.troopnick;
  }
  
  public void c()
  {
    int i = 0;
    ArrayList localArrayList = (ArrayList)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(OpenTroopInfo.class, false, null, null, null, null, null, null);
    int j;
    int k;
    label36:
    OpenTroopInfo localOpenTroopInfo;
    if (localArrayList != null)
    {
      j = localArrayList.size();
      k = 0;
      if (k >= j) {
        break label175;
      }
      localOpenTroopInfo = (OpenTroopInfo)localArrayList.get(k);
      if (!localOpenTroopInfo.isNeedDelete) {
        break label118;
      }
      if (QLog.isColorLevel()) {
        QLog.d("OpenTroopDebug", 2, "init delete groupcode = " + localOpenTroopInfo.troopCode);
      }
      this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(localOpenTroopInfo);
    }
    for (;;)
    {
      k += 1;
      break label36;
      j = 0;
      break;
      label118:
      if (QLog.isColorLevel()) {
        QLog.d("OpenTroopDebug", 2, "init load groupcode = " + localOpenTroopInfo.troopCode);
      }
      this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap.put(localOpenTroopInfo.troopCode, localOpenTroopInfo);
      i += 1;
    }
    label175:
    if (QLog.isColorLevel()) {
      QLog.d("OpenTroopDebug", 2, "load opentroop info: size = " + j + ", newsize = " + i);
    }
  }
  
  void c(TroopInfo paramTroopInfo)
  {
    b(paramTroopInfo);
    f();
  }
  
  public void c(String paramString)
  {
    paramString = this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(FavOpenTroopInfo.class, paramString);
    if (paramString != null) {
      this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(paramString);
    }
  }
  
  public boolean c(String paramString)
  {
    paramString = (CommonlyUsedTroop)a().remove(paramString);
    if (paramString != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b(paramString);
      return true;
    }
    return false;
  }
  
  public String d(String paramString)
  {
    if (!this.jdField_a_of_type_JavaUtilHashMap.containsKey(paramString))
    {
      TroopInfo localTroopInfo = (TroopInfo)this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a(TroopInfo.class, "troopcode=?", new String[] { paramString });
      if (localTroopInfo == null) {
        return null;
      }
      this.jdField_a_of_type_JavaUtilHashMap.put(localTroopInfo.troopcode, localTroopInfo.troopuin);
    }
    return (String)this.jdField_a_of_type_JavaUtilHashMap.get(paramString);
  }
  
  public String d(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      if (QLog.isColorLevel()) {
        QLog.d("Q.contacttab.troop", 2, "getTroopMemberNick uin is null");
      }
      paramString2 = "";
    }
    do
    {
      return paramString2;
      paramString1 = a(paramString1, paramString2);
      if (paramString1 == null) {
        break;
      }
      if (!TextUtils.isEmpty(paramString1.troopnick)) {
        return paramString1.troopnick;
      }
    } while (TextUtils.isEmpty(paramString1.friendnick));
    return paramString1.friendnick;
    return "";
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokespecial 535	com/tencent/mobileqq/app/TroopManager:a	()Ljava/util/concurrent/ConcurrentHashMap;
    //   6: astore_3
    //   7: aload_0
    //   8: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   11: invokevirtual 175	com/tencent/mobileqq/persistence/EntityManager:a	()Lcom/tencent/mobileqq/persistence/EntityTransaction;
    //   14: astore_2
    //   15: aload_2
    //   16: astore_1
    //   17: aload_1
    //   18: ifnull +134 -> 152
    //   21: aload_1
    //   22: invokevirtual 179	com/tencent/mobileqq/persistence/EntityTransaction:a	()V
    //   25: aload_0
    //   26: getfield 74	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager	Lcom/tencent/mobileqq/persistence/EntityManager;
    //   29: ldc 88
    //   31: invokevirtual 669	com/tencent/mobileqq/persistence/EntityManager:a	(Ljava/lang/Class;)Z
    //   34: pop
    //   35: aload_3
    //   36: invokevirtual 670	java/util/concurrent/ConcurrentHashMap:clear	()V
    //   39: aload_0
    //   40: getfield 520	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_JavaUtilMap	Ljava/util/Map;
    //   43: ifnull +105 -> 148
    //   46: aload_0
    //   47: getfield 520	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_JavaUtilMap	Ljava/util/Map;
    //   50: invokeinterface 673 1 0
    //   55: invokeinterface 424 1 0
    //   60: astore_2
    //   61: aload_2
    //   62: invokeinterface 262 1 0
    //   67: ifeq +81 -> 148
    //   70: aload_2
    //   71: invokeinterface 266 1 0
    //   76: checkcast 195	java/lang/String
    //   79: astore 4
    //   81: new 88	com/tencent/mobileqq/data/CommonlyUsedTroop
    //   84: dup
    //   85: invokespecial 536	com/tencent/mobileqq/data/CommonlyUsedTroop:<init>	()V
    //   88: astore 5
    //   90: aload 5
    //   92: aload 4
    //   94: putfield 122	com/tencent/mobileqq/data/CommonlyUsedTroop:troopUin	Ljava/lang/String;
    //   97: aload 5
    //   99: aload_0
    //   100: getfield 520	com/tencent/mobileqq/app/TroopManager:jdField_a_of_type_JavaUtilMap	Ljava/util/Map;
    //   103: aload 4
    //   105: invokeinterface 674 2 0
    //   110: checkcast 611	java/lang/Long
    //   113: invokevirtual 677	java/lang/Long:longValue	()J
    //   116: putfield 539	com/tencent/mobileqq/data/CommonlyUsedTroop:addedTimestamp	J
    //   119: aload_3
    //   120: aload 4
    //   122: aload 5
    //   124: invokevirtual 133	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   127: pop
    //   128: aload_0
    //   129: aload 5
    //   131: invokevirtual 166	com/tencent/mobileqq/app/TroopManager:a	(Lcom/tencent/mobileqq/persistence/Entity;)Z
    //   134: pop
    //   135: goto -74 -> 61
    //   138: astore_2
    //   139: aload_1
    //   140: ifnull +7 -> 147
    //   143: aload_1
    //   144: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   147: return
    //   148: aload_1
    //   149: invokevirtual 212	com/tencent/mobileqq/persistence/EntityTransaction:c	()V
    //   152: aload_1
    //   153: ifnull -6 -> 147
    //   156: aload_1
    //   157: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   160: return
    //   161: astore_1
    //   162: aconst_null
    //   163: astore_3
    //   164: aload_1
    //   165: astore_2
    //   166: aload_3
    //   167: ifnull +7 -> 174
    //   170: aload_3
    //   171: invokevirtual 208	com/tencent/mobileqq/persistence/EntityTransaction:b	()V
    //   174: aload_2
    //   175: athrow
    //   176: astore_2
    //   177: aload_1
    //   178: astore_3
    //   179: goto -13 -> 166
    //   182: astore_2
    //   183: goto -44 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	TroopManager
    //   1	156	1	localObject1	Object
    //   161	17	1	localObject2	Object
    //   14	57	2	localObject3	Object
    //   138	1	2	localThrowable1	java.lang.Throwable
    //   165	10	2	localObject4	Object
    //   176	1	2	localObject5	Object
    //   182	1	2	localThrowable2	java.lang.Throwable
    //   6	173	3	localObject6	Object
    //   79	42	4	str	String
    //   88	42	5	localCommonlyUsedTroop	CommonlyUsedTroop
    // Exception table:
    //   from	to	target	type
    //   21	61	138	java/lang/Throwable
    //   61	135	138	java/lang/Throwable
    //   148	152	138	java/lang/Throwable
    //   7	15	161	finally
    //   21	61	176	finally
    //   61	135	176	finally
    //   148	152	176	finally
    //   7	15	182	java/lang/Throwable
  }
  
  public void d(String paramString)
  {
    OpenTroopInfo localOpenTroopInfo = a(paramString);
    if (localOpenTroopInfo != null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("OpenTroopDebug", 2, "deleteOpenTroopInfo set nedddelete, groupcode = " + paramString);
      }
      localOpenTroopInfo.isNeedDelete = true;
      a(localOpenTroopInfo);
    }
  }
  
  public String e(String paramString1, String paramString2)
  {
    paramString2 = d(paramString2);
    if (paramString2 == null) {
      return paramString1;
    }
    return b(paramString2, paramString1);
  }
  
  public void e(String paramString)
  {
    this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.b("update TroopNotificationCache set read=1 where troopUin=" + paramString);
  }
  
  public void onDestroy()
  {
    this.jdField_a_of_type_ComTencentMobileqqPersistenceEntityManager.a();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.TroopManager
 * JD-Core Version:    0.7.0.1
 */