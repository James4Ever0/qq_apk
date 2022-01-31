package com.tencent.mobileqq.app.message;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.MessageForFile;
import com.tencent.mobileqq.data.MessageForFunnyFace;
import com.tencent.mobileqq.data.MessageForLongMsg;
import com.tencent.mobileqq.data.MessageForMixedMsg;
import com.tencent.mobileqq.data.MessageForPic;
import com.tencent.mobileqq.data.MessageForPtt;
import com.tencent.mobileqq.data.MessageForText;
import com.tencent.mobileqq.data.MessageForTroopFile;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.data.TroopMemberInfo;
import com.tencent.mobileqq.model.FriendManager;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.service.message.MessageRecordFactory;
import com.tencent.qphone.base.util.MD5;
import com.tencent.qphone.base.util.QLog;
import cyv;
import cyw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MsgProxyUtils
{
  public static final int a = 40;
  private static final String jdField_a_of_type_JavaLangString = "Q.msg.MsgProxyUtils";
  static Comparator jdField_a_of_type_JavaUtilComparator = new cyv();
  private static ConcurrentHashMap jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
  public static final boolean a = true;
  public static final int[] a;
  public static final String[] a;
  public static final int b = 40;
  public static final int[] b;
  public static final int c = 15;
  public static final int[] c;
  public static final int d = 15;
  public static final int[] d;
  public static final int e = 10;
  public static final int[] e;
  private static final int f = 480;
  public static final int[] f;
  public static final int[] g;
  public static final int[] h;
  public static final int[] i;
  
  static
  {
    jdField_a_of_type_ArrayOfInt = new int[] { -1004, -1012, -1001, -1002, -1034, -2012, -2006, -4001, 193, 734, 230, -4002, -4003, -4004, -4008, -4009, -2021, -2018, -1040, -1039, -4005, -4020, -2019, -1041, -1043, -5000, -1042, 2024 };
    b = new int[] { -4004, -4003, -4009, -4020 };
    c = new int[] { -1034, -1042, -2003, -2004, -1001, -2012, -1013, -1019, -1018, -1043, -5000, -5001, -1024, 2024, -1025 };
    d = new int[] { -1004, -1012, -4002, -4003, -4004, -1013, -4009, -2021, -1041, -1043, -5000, -5001, 2024 };
    e = new int[] { -4003, -4020, -4004, -4009 };
    f = new int[] { -2006, -1034, -1042, -4002, -4003, -4004, -1001, -1013, -1019, -1018, -2012, -1004, -2021, -4020, -1041, -1043, -5000, -5001, -1024, 2024, -1012 };
    g = new int[] { -1000, -2000, -2002, -2005, -1035, -1036, -1037, -20000, -2007, -2011, -2010 };
    h = new int[] { -2002 };
    jdField_a_of_type_ArrayOfJavaLangString = new String[] { AppConstants.Z, AppConstants.S, AppConstants.V, AppConstants.Y };
    i = new int[] { 0, 1000, 1004, 1020, 1006, 1001, 1009, 1003, 1005, 1023, 1022, 1024, 1025 };
  }
  
  public static int a(String paramString)
  {
    if (paramString.startsWith("mr_discusssion")) {
      return 3000;
    }
    if (paramString.startsWith("mr_friend")) {
      return 0;
    }
    return 1;
  }
  
  public static int a(List paramList, QQAppInterface paramQQAppInterface)
  {
    int k;
    if ((paramList == null) || (paramList.isEmpty())) {
      k = 0;
    }
    HashSet localHashSet;
    int j;
    do
    {
      return k;
      localHashSet = new HashSet();
      paramList = paramList.iterator();
      j = 0;
      k = j;
    } while (!paramList.hasNext());
    MessageRecord localMessageRecord = (MessageRecord)paramList.next();
    if ((!localMessageRecord.isread) && (!localMessageRecord.isLongMsg())) {
      j += 1;
    }
    for (;;)
    {
      break;
      k = j;
      if (!localMessageRecord.isread)
      {
        k = j;
        if (localMessageRecord.isLongMsg())
        {
          if (paramQQAppInterface.a().a(localMessageRecord)) {
            break;
          }
          k = j;
          if (!localHashSet.contains(a(localMessageRecord)))
          {
            k = j + 1;
            localHashSet.add(a(localMessageRecord));
          }
        }
      }
      j = k;
    }
  }
  
  public static MessageRecord a(List paramList)
  {
    Object localObject;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      localObject = null;
      return localObject;
    }
    int j = paramList.size() - 1;
    for (;;)
    {
      if (j < 0) {
        break label60;
      }
      MessageRecord localMessageRecord = (MessageRecord)paramList.get(j);
      localObject = localMessageRecord;
      if (localMessageRecord.msgtype != -2006) {
        break;
      }
      j -= 1;
    }
    label60:
    return null;
  }
  
  public static TroopMemberInfo a(QQAppInterface paramQQAppInterface, MessageRecord paramMessageRecord)
  {
    if (!a(paramQQAppInterface, paramMessageRecord)) {
      return null;
    }
    paramQQAppInterface = paramQQAppInterface.a().createEntityManager();
    paramMessageRecord = (TroopMemberInfo)paramQQAppInterface.a(TroopMemberInfo.class, new String[] { paramMessageRecord.frienduin, paramMessageRecord.senderuin });
    paramQQAppInterface.a();
    return paramMessageRecord;
  }
  
  public static String a()
  {
    StringBuilder localStringBuilder = new StringBuilder("not in (");
    int j = 0;
    if (j < jdField_a_of_type_ArrayOfInt.length)
    {
      localStringBuilder.append(jdField_a_of_type_ArrayOfInt[j]);
      if (j == jdField_a_of_type_ArrayOfInt.length - 1) {
        localStringBuilder.append(")");
      }
      for (;;)
      {
        j += 1;
        break;
        localStringBuilder.append(",");
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String a(MessageRecord paramMessageRecord)
  {
    return paramMessageRecord.longMsgId + "&" + paramMessageRecord.senderuin + "&" + paramMessageRecord.longMsgCount;
  }
  
  public static String a(String paramString)
  {
    if (jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(paramString)) {
      return (String)jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString);
    }
    String str = MD5.toMD5(paramString);
    if (jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.size() > 3000) {
      jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.clear();
    }
    jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, str);
    return str;
  }
  
  public static String a(String paramString, int paramInt)
  {
    String str;
    if ((paramInt != 1) && (3000 != paramInt))
    {
      str = paramString;
      if (paramInt != 1006) {}
    }
    else
    {
      str = paramString + "&" + paramInt;
    }
    return str;
  }
  
  public static List a(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      MessageRecord localMessageRecord = (MessageRecord)paramList.next();
      if ((!e(localMessageRecord.msgtype)) && (((localMessageRecord.istroop != 3000) && (localMessageRecord.istroop != 1)) || (localMessageRecord.shmsgseq > 0L))) {
        localArrayList.add(localMessageRecord);
      }
    }
    return localArrayList;
  }
  
  public static List a(List paramList1, List paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList1 == null) || (paramList2 == null)) {
      return null;
    }
    paramList2 = paramList2.iterator();
    label191:
    for (;;)
    {
      MessageRecord localMessageRecord1;
      if (paramList2.hasNext())
      {
        localMessageRecord1 = (MessageRecord)paramList2.next();
        Iterator localIterator = paramList1.iterator();
        MessageRecord localMessageRecord2;
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localMessageRecord2 = (MessageRecord)localIterator.next();
        } while ((localMessageRecord1.getId() != localMessageRecord1.getId()) || (localMessageRecord1.shmsgseq != localMessageRecord2.shmsgseq) || (localMessageRecord1.msgtype != localMessageRecord2.msgtype) || (localMessageRecord1.time != localMessageRecord2.time) || (localMessageRecord1.msgUid != localMessageRecord2.msgUid) || (localMessageRecord1.longMsgIndex != localMessageRecord2.longMsgIndex) || (localMessageRecord1.longMsgId != localMessageRecord2.longMsgId));
      }
      for (int j = 1;; j = 0)
      {
        if (j != 0) {
          break label191;
        }
        localArrayList.add(localMessageRecord1);
        break;
        return localArrayList;
      }
    }
  }
  
  public static List a(List paramList, boolean paramBoolean)
  {
    return a(paramList, paramBoolean, 15);
  }
  
  public static List a(List paramList, boolean paramBoolean, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.isEmpty())) {
      return localArrayList;
    }
    if (paramBoolean) {
      Collections.sort(paramList, new cyw());
    }
    long l = ((MessageRecord)paramList.get(paramList.size() - 1)).shmsgseq;
    int j = paramList.size() - 1;
    int k = 0;
    for (;;)
    {
      if ((j >= 0) && (l - ((MessageRecord)paramList.get(j)).shmsgseq <= 1L)) {
        if ((l != ((MessageRecord)paramList.get(j)).shmsgseq) || (j >= paramList.size() - 1)) {
          break label169;
        }
      }
      for (;;)
      {
        l = ((MessageRecord)paramList.get(j)).shmsgseq;
        localArrayList.add(0, paramList.get(j));
        if (k < paramInt) {
          break;
        }
        return localArrayList;
        label169:
        k += 1;
      }
      j -= 1;
    }
  }
  
  public static void a(QQAppInterface paramQQAppInterface, String paramString, int paramInt)
  {
    if (paramInt != 1) {}
    for (;;)
    {
      return;
      Object localObject1 = new ArrayList();
      Object localObject2 = paramQQAppInterface.a().a(paramString, paramInt).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        MessageRecord localMessageRecord = (MessageRecord)((Iterator)localObject2).next();
        if (j(localMessageRecord.msgtype)) {
          ((List)localObject1).add(localMessageRecord);
        }
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (MessageRecord)((Iterator)localObject1).next();
        paramQQAppInterface.a().a(paramString, paramInt, -4009, ((MessageRecord)localObject2).uniseq);
      }
    }
  }
  
  public static void a(QQAppInterface paramQQAppInterface, String paramString, int paramInt1, int paramInt2)
  {
    Iterator localIterator = paramQQAppInterface.a().a(paramString, paramInt1).iterator();
    while (localIterator.hasNext())
    {
      MessageRecord localMessageRecord = (MessageRecord)localIterator.next();
      if (paramInt2 == localMessageRecord.msgtype) {
        switch (paramInt2)
        {
        default: 
          paramQQAppInterface.a().a(paramString, paramInt1, paramInt2, localMessageRecord.uniseq);
          break;
        case -4020: 
          paramQQAppInterface.a().a(paramString, paramInt1, paramInt2, localMessageRecord.uniseq);
        }
      }
    }
  }
  
  public static void a(String paramString, int paramInt, List paramList, QQAppInterface paramQQAppInterface)
  {
    if ((paramList == null) || (paramList.size() == 0)) {}
    for (;;)
    {
      return;
      Object localObject2 = new ArrayList();
      HashMap localHashMap = new HashMap();
      ArrayList localArrayList = new ArrayList();
      Object localObject1 = paramQQAppInterface.a();
      Object localObject3 = paramList.iterator();
      int j = 0;
      int k = 0;
      Object localObject4;
      label166:
      int m;
      if (((Iterator)localObject3).hasNext())
      {
        localObject4 = (MessageRecord)((Iterator)localObject3).next();
        String str1;
        if (((MessageRecord)localObject4).isLongMsg())
        {
          str1 = a((MessageRecord)localObject4);
          if (localHashMap.containsKey(str1)) {
            if (Math.abs(((MessageRecord)((ArrayList)localHashMap.get(str1)).get(0)).time - ((MessageRecord)localObject4).time) <= 480L)
            {
              ((ArrayList)localHashMap.get(str1)).add(localObject4);
              ((List)localObject2).add(localObject4);
              m = j;
              j = k;
              k = m;
            }
          }
        }
        for (;;)
        {
          m = j;
          j = k;
          k = m;
          break;
          m = j + 1;
          String str2 = b(str1, m);
          localHashMap.put(str2, localHashMap.get(str1));
          paramQQAppInterface = null;
          j = 0;
          for (;;)
          {
            if (j < localArrayList.size())
            {
              paramQQAppInterface = (Pair)localArrayList.get(j);
              if (!((String)paramQQAppInterface.first).equals(str1)) {}
            }
            else
            {
              if (paramQQAppInterface != null)
              {
                localArrayList.remove(j);
                localArrayList.add(j, new Pair(str2, paramQQAppInterface.second));
              }
              paramQQAppInterface = new ArrayList();
              paramQQAppInterface.add(localObject4);
              localHashMap.put(str1, paramQQAppInterface);
              localArrayList.add(new Pair(str1, Integer.valueOf(k)));
              j = m;
              break;
            }
            j += 1;
          }
          paramQQAppInterface = new ArrayList();
          paramQQAppInterface.add(localObject4);
          localHashMap.put(str1, paramQQAppInterface);
          localArrayList.add(new Pair(str1, Integer.valueOf(k)));
          break label166;
          m = k + 1;
          k = j;
          j = m;
        }
      }
      paramList.removeAll((Collection)localObject2);
      if ((!localHashMap.isEmpty()) && (!localArrayList.isEmpty()))
      {
        if (((MessageCache)localObject1).a(paramString, paramInt) != null)
        {
          paramQQAppInterface = new ArrayList();
          localObject2 = localHashMap.keySet().iterator();
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label764;
            }
            localObject3 = (String)((Iterator)localObject2).next();
            localObject4 = (ArrayList)localHashMap.get(localObject3);
            if (!((ArrayList)localObject4).isEmpty()) {
              if ((((MessageRecord)((ArrayList)localObject4).get(0)).longMsgCount <= ((ArrayList)localObject4).size()) || (((MessageRecord)((ArrayList)localObject4).get(0)).isSendFromLocal()))
              {
                if (QLog.isColorLevel()) {
                  QLog.d("Q.msg.MsgProxyUtils", 2, "mergeLongMsg: complete online msg: uin=" + paramString + ",istroop=" + paramInt + ",key=" + (String)localObject3);
                }
                ((MessageCache)localObject1).a(paramString, paramInt, (String)localObject3);
              }
              else if (((MessageCache)localObject1).a(paramString, paramInt, (String)localObject3))
              {
                if (QLog.isColorLevel()) {
                  QLog.d("Q.msg.MsgProxyUtils", 2, "mergeLongMsg: incomplete online msg: uin=" + paramString + ",istroop=" + paramInt + ",key=" + (String)localObject3);
                }
                paramQQAppInterface.add(localObject3);
                localObject4 = localArrayList.iterator();
                if (((Iterator)localObject4).hasNext())
                {
                  if (!TextUtils.equals((CharSequence)((Pair)((Iterator)localObject4).next()).first, (CharSequence)localObject3)) {
                    break;
                  }
                  ((Iterator)localObject4).remove();
                }
              }
            }
          }
          label764:
          if (!paramQQAppInterface.isEmpty())
          {
            paramQQAppInterface = paramQQAppInterface.iterator();
            while (paramQQAppInterface.hasNext()) {
              localHashMap.remove((String)paramQQAppInterface.next());
            }
          }
        }
        k = localArrayList.size() - 1;
        while (k >= 0)
        {
          paramQQAppInterface = (Pair)localArrayList.get(k);
          localObject2 = (ArrayList)localHashMap.get(paramQQAppInterface.first);
          Collections.sort((List)localObject2, jdField_a_of_type_JavaUtilComparator);
          localObject1 = new ArrayList();
          localObject2 = ((ArrayList)localObject2).iterator();
          j = 0;
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (MessageRecord)((Iterator)localObject2).next();
            if (a((MessageRecord)localObject3)) {
              ((ArrayList)localObject1).add(localObject3);
            }
            for (;;)
            {
              break;
              m = j;
              if (!((ArrayList)localObject1).isEmpty())
              {
                if (QLog.isColorLevel()) {
                  QLog.d("Q.msg.MsgProxyUtils", 2, "mergeLongMsg: uin=" + paramString + ",istroop=" + paramInt + ",key=" + a((MessageRecord)((ArrayList)localObject1).get(0)));
                }
                paramList.add(j + ((Integer)paramQQAppInterface.second).intValue(), new MessageForLongMsg((ArrayList)localObject1));
                ((ArrayList)localObject1).clear();
                m = j + 1;
              }
              paramList.add(m + ((Integer)paramQQAppInterface.second).intValue(), localObject3);
              j = m + 1;
            }
          }
          if (!((ArrayList)localObject1).isEmpty())
          {
            if (QLog.isColorLevel()) {
              QLog.d("Q.msg.MsgProxyUtils", 2, "mergeLongMsg: uin=" + paramString + ",istroop=" + paramInt + ",key=" + a((MessageRecord)((ArrayList)localObject1).get(0)));
            }
            paramList.add(((Integer)paramQQAppInterface.second).intValue() + j, new MessageForLongMsg((ArrayList)localObject1));
            ((ArrayList)localObject1).clear();
          }
          k -= 1;
        }
      }
    }
  }
  
  public static void a(List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      MessageRecord localMessageRecord = (MessageRecord)localIterator.next();
      if ((localMessageRecord.msgtype == -2006) || (!localMessageRecord.isValid)) {
        localArrayList.add(localMessageRecord);
      }
    }
    paramList.removeAll(localArrayList);
  }
  
  public static void a(List paramList, MessageRecord paramMessageRecord, boolean paramBoolean)
  {
    if ((paramMessageRecord.istroop == 3000) || (paramMessageRecord.istroop == 1))
    {
      c(paramList, paramMessageRecord, paramBoolean);
      return;
    }
    if (a(paramMessageRecord.istroop))
    {
      b(paramList, paramMessageRecord, paramBoolean);
      return;
    }
    paramList.add(paramMessageRecord);
  }
  
  public static boolean a(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = i;
    int k = arrayOfInt.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfInt[j] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 1001) && (paramInt2 != -3001) && (paramInt2 != -3000) && (paramInt2 != -1032) && (paramInt2 != -1031) && (paramInt2 != -1003);
  }
  
  public static boolean a(QQAppInterface paramQQAppInterface, MessageRecord paramMessageRecord)
  {
    return (paramMessageRecord.istroop == 1) && (((FriendManager)paramQQAppInterface.getManager(8)).f(paramMessageRecord.frienduin));
  }
  
  public static boolean a(MessageRecord paramMessageRecord)
  {
    return ((paramMessageRecord instanceof MessageForText)) || ((paramMessageRecord instanceof MessageForPic)) || ((paramMessageRecord instanceof MessageForMixedMsg));
  }
  
  public static boolean a(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2)
  {
    return (paramMessageRecord1.isLongMsg()) && (paramMessageRecord2.isLongMsg()) && (paramMessageRecord1.longMsgId == paramMessageRecord2.longMsgId) && (paramMessageRecord1.longMsgCount == paramMessageRecord2.longMsgCount) && (TextUtils.equals(paramMessageRecord1.senderuin, paramMessageRecord2.senderuin)) && (Math.abs(paramMessageRecord1.time - paramMessageRecord2.time) <= 480L);
  }
  
  public static boolean a(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramMessageRecord1.msgtype == paramMessageRecord2.msgtype) {
      if (paramMessageRecord1.msgUid != 0L) {
        if ((paramBoolean) && ((c(paramMessageRecord2.msgtype)) || (paramMessageRecord2.msgtype == -2002)))
        {
          bool1 = bool2;
          if (paramMessageRecord1.msgUid == paramMessageRecord2.msgUid)
          {
            bool1 = bool2;
            if (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) {
              bool1 = true;
            }
          }
          paramBoolean = bool1;
          if (!bool1) {
            if (paramMessageRecord1.msgtype != -2005)
            {
              paramBoolean = bool1;
              if (paramMessageRecord1.msgtype != -2002) {}
            }
            else
            {
              paramBoolean = bool1;
              if (c(paramMessageRecord1, paramMessageRecord2)) {
                paramBoolean = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((paramBoolean) && (QLog.isColorLevel())) {
        QLog.w("Q.msg.MsgProxyUtils", 2, "friend---------------msgFilter istroop: " + paramMessageRecord2.istroop + " friendUin: " + paramMessageRecord2.frienduin + " senderUin: " + paramMessageRecord2.senderuin + " LOC_shmsgseq: " + paramMessageRecord1.shmsgseq + " NEW_shmsgseq:" + paramMessageRecord1.shmsgseq + " LOC_msgType: " + paramMessageRecord1.msgtype + " NEW_msgType" + paramMessageRecord2.msgtype + " LOC_msgtime: " + paramMessageRecord1.time + " NEW_msgtime:" + paramMessageRecord2.time + " LOC_msgUid:" + paramMessageRecord1.msgUid + " NEW_msgUid:" + paramMessageRecord2.msgUid + " LOC_msgContent: " + paramMessageRecord1.getLogColorContent() + " NEW_msgContent:" + paramMessageRecord2.getLogColorContent());
      }
      return paramBoolean;
      paramBoolean = bool1;
      if (c(paramMessageRecord1, paramMessageRecord2))
      {
        paramBoolean = true;
        continue;
        paramBoolean = bool1;
        if (c(paramMessageRecord1, paramMessageRecord2))
        {
          paramBoolean = true;
          continue;
          if ((paramMessageRecord1.msgtype == -1000) && (paramMessageRecord2.msgtype == -2007))
          {
            paramBoolean = bool1;
            if (paramMessageRecord1.msgUid == paramMessageRecord2.msgUid)
            {
              paramBoolean = bool1;
              if (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) {
                paramBoolean = true;
              }
            }
          }
          else if ((paramMessageRecord1.msgtype == -2001) && (paramMessageRecord2.msgtype == -2000))
          {
            paramBoolean = bool1;
            if (paramMessageRecord1.time == paramMessageRecord2.time)
            {
              paramBoolean = bool1;
              if (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) {
                paramBoolean = true;
              }
            }
          }
          else if ((paramMessageRecord1.msgtype == -1000) && (paramMessageRecord2.msgtype == -2011))
          {
            paramBoolean = bool1;
            if (paramMessageRecord1.msgUid == paramMessageRecord2.msgUid)
            {
              paramBoolean = bool1;
              if (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) {
                paramBoolean = true;
              }
            }
          }
          else if ((paramMessageRecord1.msgtype == -1000) && (paramMessageRecord2.msgtype == -2022))
          {
            paramBoolean = bool1;
            if (paramMessageRecord1.msgUid == paramMessageRecord2.msgUid)
            {
              paramBoolean = bool1;
              if (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) {
                paramBoolean = true;
              }
            }
          }
          else
          {
            paramBoolean = bool1;
            if (paramMessageRecord1.msgtype == -1000)
            {
              paramBoolean = bool1;
              if (paramMessageRecord2.msgtype == -2025)
              {
                paramBoolean = bool1;
                if (paramMessageRecord1.msgUid == paramMessageRecord2.msgUid)
                {
                  paramBoolean = bool1;
                  if (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) {
                    paramBoolean = true;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static boolean a(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = true;
    if ((paramMessageRecord1.frienduin == null) || (!paramMessageRecord1.frienduin.equals(paramMessageRecord2.frienduin))) {
      paramBoolean1 = false;
    }
    label68:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return paramBoolean1;
                    if (paramBoolean1) {
                      break label170;
                    }
                    if (paramBoolean2) {
                      break label68;
                    }
                    if (Math.abs(paramMessageRecord1.time - paramMessageRecord2.time) >= 30L) {
                      break;
                    }
                    paramBoolean1 = bool;
                  } while (b(paramMessageRecord1, paramMessageRecord2));
                  return false;
                  if (paramMessageRecord1.shmsgseq != paramMessageRecord2.shmsgseq) {
                    break;
                  }
                  paramBoolean1 = bool;
                } while (paramMessageRecord1.msgtype == paramMessageRecord2.msgtype);
                if (paramMessageRecord1.msgtype != -1000) {
                  break;
                }
                paramBoolean1 = bool;
              } while (paramMessageRecord2.msgtype == -2007);
              paramBoolean1 = bool;
            } while (paramMessageRecord1.msgtype == -2006);
            paramBoolean1 = bool;
          } while (paramMessageRecord2.msgtype == -2006);
          if (paramMessageRecord1.msgtype != -1000) {
            break;
          }
          paramBoolean1 = bool;
        } while (paramMessageRecord2.msgtype == -2011);
        return false;
        return false;
        if (!paramMessageRecord1.isSendFromLocal()) {
          return false;
        }
        if ((paramMessageRecord1.extraflag != 32772) && (paramMessageRecord1.extraflag != 32768)) {
          return false;
        }
        if (paramMessageRecord1.msgtype == -2006) {
          return false;
        }
        if ((paramMessageRecord1.senderuin == null) || (!paramMessageRecord1.senderuin.equals(paramMessageRecord2.senderuin))) {
          return false;
        }
        if ((paramMessageRecord1.msgUid == 0L) || (paramMessageRecord2.msgUid == 0L) || (paramMessageRecord1.msgUid != paramMessageRecord2.msgUid)) {
          break;
        }
        paramBoolean1 = bool;
      } while (!QLog.isColorLevel());
      QLog.d("Q.msg.MsgProxyUtils", 2, "compTroopMsgContent RewriteSeq: find msg by uid=" + paramMessageRecord1.msgUid);
      return true;
      if ((Math.abs(paramMessageRecord1.time - paramMessageRecord2.time) >= 510L) && (Math.abs(paramMessageRecord1.shmsgseq - paramMessageRecord2.shmsgseq) >= 2L)) {
        break;
      }
      paramBoolean1 = bool;
    } while (b(paramMessageRecord1, paramMessageRecord2));
    label170:
    return false;
  }
  
  public static boolean a(String paramString)
  {
    boolean bool2 = false;
    String[] arrayOfString = jdField_a_of_type_ArrayOfJavaLangString;
    int k = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfString[j].equals(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean a(String paramString, int paramInt)
  {
    return ((paramInt == 1001) && (AppConstants.Z.equals(paramString))) || ((paramInt == 1009) && (AppConstants.S.equals(paramString)));
  }
  
  public static boolean a(String paramString, int paramInt, List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {}
    Object localObject;
    do
    {
      while (!paramList.hasNext())
      {
        do
        {
          return false;
          paramString = new HashMap();
          paramList = paramList.iterator();
          paramInt = 0;
          if (paramList.hasNext())
          {
            localObject = (MessageRecord)paramList.next();
            String str;
            if (((MessageRecord)localObject).isLongMsg())
            {
              str = a((MessageRecord)localObject);
              if (paramString.containsKey(str)) {
                if (Math.abs(((MessageRecord)((ArrayList)paramString.get(str)).get(0)).time - ((MessageRecord)localObject).time) <= 480L) {
                  ((ArrayList)paramString.get(str)).add(localObject);
                }
              }
            }
            for (;;)
            {
              break;
              paramInt += 1;
              paramString.put(b(str, paramInt), paramString.get(str));
              ArrayList localArrayList = new ArrayList();
              localArrayList.add(localObject);
              paramString.put(str, localArrayList);
              continue;
              localArrayList = new ArrayList();
              localArrayList.add(localObject);
              paramString.put(str, localArrayList);
            }
          }
        } while (paramString.isEmpty());
        paramList = paramString.keySet().iterator();
      }
      localObject = (ArrayList)paramString.get((String)paramList.next());
    } while ((((ArrayList)localObject).isEmpty()) || (((MessageRecord)((ArrayList)localObject).get(0)).longMsgCount <= ((ArrayList)localObject).size()) || (((MessageRecord)((ArrayList)localObject).get(0)).isSendFromLocal()));
    return true;
  }
  
  public static boolean a(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return false;
    }
    int k = paramList.size();
    int j = 0;
    while (j < k)
    {
      if (((MessageRecord)paramList.get(j)).msgtype != -2006) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public static byte[] a(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2)
  {
    MessageForTroopFile localMessageForTroopFile = (MessageForTroopFile)MessageRecordFactory.a(-2017);
    MessageRecord.copyMessageRecordBaseField(localMessageForTroopFile, paramMessageRecord1);
    localMessageForTroopFile.doParse();
    paramMessageRecord1 = (MessageForTroopFile)MessageRecordFactory.a(-2017);
    MessageRecord.copyMessageRecordBaseField(paramMessageRecord1, paramMessageRecord2);
    paramMessageRecord1.doParse();
    localMessageForTroopFile.bisID = paramMessageRecord1.bisID;
    localMessageForTroopFile.dspFileName = paramMessageRecord1.dspFileName;
    localMessageForTroopFile.dspFileSize = paramMessageRecord1.dspFileSize;
    localMessageForTroopFile.fileSize = paramMessageRecord1.fileSize;
    localMessageForTroopFile.fileName = paramMessageRecord1.fileName;
    localMessageForTroopFile.url = paramMessageRecord1.url;
    localMessageForTroopFile.serial();
    return localMessageForTroopFile.msgData;
  }
  
  static String[] a(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null)
    {
      localObject1 = localObject2;
      if (paramString.length() > 0)
      {
        localObject1 = localObject2;
        if (paramString.charAt(0) == '\026') {
          localObject1 = paramString.split("\\|");
        }
      }
    }
    return localObject1;
  }
  
  public static String b()
  {
    StringBuilder localStringBuilder = new StringBuilder("not in (");
    int j = 0;
    if (j < f.length)
    {
      localStringBuilder.append(f[j]);
      if (j == f.length - 1) {
        localStringBuilder.append(")");
      }
      for (;;)
      {
        j += 1;
        break;
        localStringBuilder.append(",");
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String b(String paramString, int paramInt)
  {
    return paramString + "&" + paramInt;
  }
  
  public static List b(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      MessageRecord localMessageRecord = (MessageRecord)paramList.next();
      if (!d(localMessageRecord.msgtype)) {
        localArrayList.add(localMessageRecord);
      }
    }
    return localArrayList;
  }
  
  public static void b(QQAppInterface paramQQAppInterface, String paramString, int paramInt1, int paramInt2)
  {
    a(paramQQAppInterface, paramString, paramInt1, paramInt2);
  }
  
  public static void b(List paramList, MessageRecord paramMessageRecord, boolean paramBoolean)
  {
    int m = 0;
    Iterator localIterator = paramList.iterator();
    int j = 0;
    for (;;)
    {
      k = m;
      if (!localIterator.hasNext()) {
        break label83;
      }
      MessageRecord localMessageRecord = (MessageRecord)localIterator.next();
      if (((paramBoolean) || (localMessageRecord.time >= paramMessageRecord.time)) && ((!paramBoolean) || (localMessageRecord.time > paramMessageRecord.time))) {
        break;
      }
      j += 1;
    }
    int k = 1;
    label83:
    if (k == 0)
    {
      paramList.add(paramMessageRecord);
      return;
    }
    paramList.add(j, paramMessageRecord);
  }
  
  public static boolean b(int paramInt)
  {
    int[] arrayOfInt = c;
    int k = arrayOfInt.length;
    int j = 0;
    while (j < k)
    {
      if (arrayOfInt[j] == paramInt) {
        return false;
      }
      j += 1;
    }
    return true;
  }
  
  public static boolean b(QQAppInterface paramQQAppInterface, MessageRecord paramMessageRecord)
  {
    return a(paramQQAppInterface, paramMessageRecord);
  }
  
  private static boolean b(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2)
  {
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool1 = true;
    if (paramMessageRecord1.msgtype != paramMessageRecord2.msgtype) {}
    String str;
    Object localObject;
    label573:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return false;
                  str = paramMessageRecord1.msg;
                  localObject = paramMessageRecord2.msg;
                  if (paramMessageRecord2.msgtype != -1000) {
                    break;
                  }
                } while (!TextUtils.equals(str, (CharSequence)localObject));
                return true;
                if (paramMessageRecord2.msgtype != -2002) {
                  break;
                }
              } while ((!(paramMessageRecord2 instanceof MessageForPtt)) || (!(paramMessageRecord1 instanceof MessageForPtt)) || (((MessageForPtt)paramMessageRecord1).urlAtServer == null) || (((MessageForPtt)paramMessageRecord1).urlAtServer.length() <= 0) || (((MessageForPtt)paramMessageRecord2).urlAtServer == null) || (((MessageForPtt)paramMessageRecord2).urlAtServer.length() <= 0));
              return ((MessageForPtt)paramMessageRecord1).urlAtServer.equals(((MessageForPtt)paramMessageRecord2).urlAtServer);
              if (paramMessageRecord2.msgtype == -2011)
              {
                if (QLog.isColorLevel()) {
                  QLog.d("Debug", 2, "c2c" + Arrays.toString(paramMessageRecord1.msgData) + " : " + Arrays.toString(paramMessageRecord2.msgData));
                }
                return Arrays.equals(paramMessageRecord2.msgData, paramMessageRecord1.msgData);
              }
              if (paramMessageRecord2.msgtype != -2000) {
                break label573;
              }
              if ((str == null) || (localObject == null) || (str.length() <= 0) || (((String)localObject).length() <= 0) || (str.charAt(0) != '\026') || (((String)localObject).charAt(0) != '\026')) {
                break;
              }
              paramMessageRecord1 = a((String)localObject);
              localObject = a(str);
            } while ((!paramMessageRecord1[1].equals(localObject[1])) || (!paramMessageRecord1[2].equals(localObject[2])));
            if ((paramMessageRecord2.issend == 2) || (paramMessageRecord2.isSendFromLocal()))
            {
              if (QLog.isColorLevel()) {
                QLog.d("Q.msg.MsgProxyUtils", 2, "-------->compMsgContent: samePic: picSize:" + paramMessageRecord1[1] + ",picType:" + paramMessageRecord1[2] + ",isSend == true");
              }
              return true;
            }
            if (!str.contains(AppConstants.as)) {
              break;
            }
            paramMessageRecord2 = localObject[0].split("/");
            paramMessageRecord2 = paramMessageRecord2[(paramMessageRecord2.length - 1)].split("\\.")[0];
            str = MD5.toMD5(paramMessageRecord1[4]);
          } while (!str.equals(paramMessageRecord2));
          if (QLog.isColorLevel()) {
            QLog.d("Q.msg.MsgProxyUtils", 2, "-------->compMsgContent: samePic: picSize:" + paramMessageRecord1[1] + ",picType:" + paramMessageRecord1[2] + ",Path:" + str);
          }
          return true;
          return localObject[0].equals(paramMessageRecord1[0]);
        } while ((((MessageForPic)paramMessageRecord1).uuid == null) || (((MessageForPic)paramMessageRecord1).uuid.length() <= 0) || (((MessageForPic)paramMessageRecord2).uuid == null) || (((MessageForPic)paramMessageRecord2).uuid.length() <= 0));
        return ((MessageForPic)paramMessageRecord1).uuid.equals(((MessageForPic)paramMessageRecord2).uuid);
        if ((paramMessageRecord2.msgtype == -2007) && (paramMessageRecord1.msgtype == -2007)) {
          return Arrays.equals(paramMessageRecord2.msgData, paramMessageRecord1.msgData);
        }
        if ((paramMessageRecord2.msgtype == -1035) && (paramMessageRecord1.msgtype == -1035)) {
          return Arrays.equals(paramMessageRecord2.msgData, paramMessageRecord1.msgData);
        }
        if ((paramMessageRecord2.msgtype == -1034) && (paramMessageRecord1.msgtype == -1034))
        {
          if ((paramMessageRecord2.time == paramMessageRecord1.time) && (paramMessageRecord2.uniseq == paramMessageRecord1.uniseq)) {}
          for (;;)
          {
            return bool1;
            bool1 = false;
          }
        }
        if ((paramMessageRecord2.msgtype == -1042) && (paramMessageRecord1.msgtype == -1042))
        {
          if (paramMessageRecord2.time == paramMessageRecord1.time) {}
          for (bool1 = bool2;; bool1 = false) {
            return bool1;
          }
        }
        if ((paramMessageRecord2.msgtype == -2010) && (paramMessageRecord1.msgtype == -2010)) {
          return ((MessageForFunnyFace)paramMessageRecord2).msgEquals((MessageForFunnyFace)paramMessageRecord1);
        }
        if (paramMessageRecord2.msgtype != -2005) {
          break;
        }
      } while ((!(paramMessageRecord2 instanceof MessageForFile)) || (!(paramMessageRecord1 instanceof MessageForFile)));
      if (paramMessageRecord2.uniseq == paramMessageRecord1.uniseq) {}
      for (bool1 = bool3;; bool1 = false) {
        return bool1;
      }
    } while ((paramMessageRecord2.msgtype == -2017) || (!TextUtils.equals(str, (CharSequence)localObject)));
    return true;
  }
  
  public static boolean b(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      String[] arrayOfString = jdField_a_of_type_ArrayOfJavaLangString;
      int k = arrayOfString.length;
      int j = 0;
      while (j < k)
      {
        String str = arrayOfString[j];
        if (paramString.startsWith(str + "&")) {
          return true;
        }
        j += 1;
      }
    }
  }
  
  public static String c()
  {
    StringBuilder localStringBuilder = new StringBuilder("not in (");
    int j = 0;
    if (j < c.length)
    {
      localStringBuilder.append(c[j]);
      if (j == c.length - 1) {
        localStringBuilder.append(")");
      }
      for (;;)
      {
        j += 1;
        break;
        localStringBuilder.append(",");
      }
    }
    return localStringBuilder.toString();
  }
  
  public static void c(List paramList, MessageRecord paramMessageRecord, boolean paramBoolean)
  {
    int m = 0;
    Iterator localIterator = paramList.iterator();
    int j = 0;
    for (;;)
    {
      k = m;
      if (!localIterator.hasNext()) {
        break label83;
      }
      MessageRecord localMessageRecord = (MessageRecord)localIterator.next();
      if (((paramBoolean) || (localMessageRecord.shmsgseq >= paramMessageRecord.shmsgseq)) && ((!paramBoolean) || (localMessageRecord.shmsgseq > paramMessageRecord.shmsgseq))) {
        break;
      }
      j += 1;
    }
    int k = 1;
    label83:
    if (k == 0)
    {
      paramList.add(paramMessageRecord);
      return;
    }
    paramList.add(j, paramMessageRecord);
  }
  
  public static boolean c(int paramInt)
  {
    int[] arrayOfInt = h;
    int k = arrayOfInt.length;
    int j = 0;
    while (j < k)
    {
      if (arrayOfInt[j] == paramInt) {
        return false;
      }
      j += 1;
    }
    return true;
  }
  
  private static boolean c(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2)
  {
    boolean bool = true;
    if (paramMessageRecord1.msgtype == -1034) {
      bool = b(paramMessageRecord1, paramMessageRecord2);
    }
    do
    {
      return bool;
      if (paramMessageRecord1.msgtype == -1042) {
        return b(paramMessageRecord1, paramMessageRecord2);
      }
      if ((paramMessageRecord1.msgtype != -2000) && (paramMessageRecord1.msgtype != -1000)) {
        break;
      }
    } while ((Math.abs(paramMessageRecord1.time - paramMessageRecord2.time) < 30L) && (paramMessageRecord1.shmsgseq == paramMessageRecord2.shmsgseq) && (b(paramMessageRecord1, paramMessageRecord2)));
    do
    {
      do
      {
        return false;
        if (paramMessageRecord1.msgtype == -2002) {
          return b(paramMessageRecord1, paramMessageRecord2);
        }
        if (paramMessageRecord1.msgtype == -2005) {
          return b(paramMessageRecord1, paramMessageRecord2);
        }
      } while ((Math.abs(paramMessageRecord1.time - paramMessageRecord2.time) >= 30L) || (paramMessageRecord1.shmsgseq != paramMessageRecord2.shmsgseq));
      if (QLog.isColorLevel()) {
        QLog.i("Q.msg.MsgProxyUtils", 2, "other equal : mr.shmsgseq = " + paramMessageRecord1.shmsgseq);
      }
    } while (!b(paramMessageRecord1, paramMessageRecord2));
    return true;
  }
  
  public static boolean d(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = jdField_a_of_type_ArrayOfInt;
    int k = arrayOfInt.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfInt[j] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean e(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = b;
    int k = arrayOfInt.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfInt[j] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean f(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = g;
    int k = arrayOfInt.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfInt[j] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean g(int paramInt)
  {
    return false;
  }
  
  public static boolean h(int paramInt)
  {
    return paramInt == -2006;
  }
  
  public static boolean i(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = d;
    int k = arrayOfInt.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfInt[j] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean j(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = e;
    int k = arrayOfInt.length;
    int j = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (j < k)
      {
        if (arrayOfInt[j] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      j += 1;
    }
  }
  
  public static boolean k(int paramInt)
  {
    return (paramInt == 1001) || (paramInt == 1009);
  }
  
  public static boolean l(int paramInt)
  {
    return paramInt == 1025;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.app.message.MsgProxyUtils
 * JD-Core Version:    0.7.0.1
 */