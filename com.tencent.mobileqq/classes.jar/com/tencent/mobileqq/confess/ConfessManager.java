package com.tencent.mobileqq.confess;

import abkq;
import abkr;
import abks;
import abkt;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mobileqq.app.MessageHandlerUtils;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageForConfessNews;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.nearby.redtouch.RedTouchItem;
import com.tencent.mobileqq.service.message.MessageRecordFactory;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mqq.manager.Manager;

public class ConfessManager
  implements Manager
{
  public static final Object b;
  public abkt a;
  public QQAppInterface a;
  final ConfessCache jdField_a_of_type_ComTencentMobileqqConfessConfessCache;
  public ConfessConfig a;
  public final FrdConfessInfo a;
  final Object jdField_a_of_type_JavaLangObject = new Object();
  final ArrayList jdField_a_of_type_JavaUtilArrayList;
  abkt b;
  
  static
  {
    jdField_b_of_type_JavaLangObject = new Object();
  }
  
  public ConfessManager(QQAppInterface paramQQAppInterface)
  {
    this.jdField_a_of_type_Abkt = null;
    this.jdField_b_of_type_Abkt = null;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo = new FrdConfessInfo(paramQQAppInterface.getAccount());
    this.jdField_a_of_type_ComTencentMobileqqConfessConfessCache = new ConfessCache();
    ThreadManager.post(new abkq(this), 5, null, true);
  }
  
  private abkt a(String paramString1, String paramString2, int paramInt)
  {
    for (;;)
    {
      synchronized (this.jdField_a_of_type_JavaUtilArrayList)
      {
        Object localObject = this.jdField_a_of_type_JavaUtilArrayList.iterator();
        if (((Iterator)localObject).hasNext())
        {
          localabkt = (abkt)((Iterator)localObject).next();
          if ((localabkt == null) || (localabkt.jdField_a_of_type_Int != paramInt) || (!TextUtils.equals(localabkt.jdField_b_of_type_JavaLangString, paramString1)) || (!TextUtils.equals(localabkt.jdField_c_of_type_JavaLangString, paramString2))) {
            continue;
          }
          localObject = localabkt;
          if (localabkt == null)
          {
            localObject = new abkt();
            ((abkt)localObject).jdField_b_of_type_JavaLangString = paramString1;
            ((abkt)localObject).jdField_c_of_type_JavaLangString = paramString2;
            ((abkt)localObject).jdField_a_of_type_Int = paramInt;
            ((abkt)localObject).jdField_d_of_type_Int = 0;
            this.jdField_a_of_type_JavaUtilArrayList.add(localObject);
          }
          return localObject;
        }
      }
      abkt localabkt = null;
    }
  }
  
  private final void a()
  {
    synchronized (jdField_b_of_type_JavaLangObject)
    {
      QQAppInterface localQQAppInterface = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
      if ((this.jdField_a_of_type_ComTencentMobileqqConfessConfessConfig == null) && (localQQAppInterface != null)) {
        this.jdField_a_of_type_ComTencentMobileqqConfessConfessConfig = new ConfessConfig(localQQAppInterface.getAccount());
      }
      return;
    }
  }
  
  public int a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    Object localObject1 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramString1, 0, new int[] { -2065 });
    if ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      localObject1 = ((List)localObject1).iterator();
      Object localObject2;
      do
      {
        do
        {
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (MessageRecord)((Iterator)localObject1).next();
        } while (!(localObject2 instanceof MessageForConfessNews));
        localObject2 = (MessageForConfessNews)localObject2;
        ((MessageForConfessNews)localObject2).parse();
      } while ((((MessageForConfessNews)localObject2).nTopicId != paramInt) || (!TextUtils.equals(paramString3, ((MessageForConfessNews)localObject2).strConfessorUin)) || (!TextUtils.equals(paramString2, ((MessageForConfessNews)localObject2).strRecUin)));
    }
    for (int i = 2;; i = 1)
    {
      if (QLog.isDevelopLevel()) {
        QLog.i("ConfessManager", 4, String.format(Locale.getDefault(), "checkNeedAddConfessElem frdUin: %s, confessorUin: %s, topicId: %s, flag: %s", new Object[] { paramString1, paramString3, Integer.valueOf(paramInt), Integer.valueOf(i) }));
      }
      return i;
    }
  }
  
  public abkt a()
  {
    return this.jdField_a_of_type_Abkt;
  }
  
  public ConfessCache a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqConfessConfessCache;
  }
  
  public ConfessConfig a()
  {
    if (QLog.isColorLevel()) {
      QLog.i("ConfessManager", 2, "getConfigSync");
    }
    if (this.jdField_a_of_type_ComTencentMobileqqConfessConfessConfig == null) {
      a();
    }
    return this.jdField_a_of_type_ComTencentMobileqqConfessConfessConfig;
  }
  
  public FrdConfessInfo a()
  {
    if (!this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.a();
    }
    return this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo;
  }
  
  public void a(RedTouchItem paramRedTouchItem)
  {
    if (paramRedTouchItem == null) {
      return;
    }
    if (!this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.a();
    }
    if ((this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.jdField_a_of_type_Long < paramRedTouchItem.lastRecvTime) || (this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.jdField_a_of_type_Int != paramRedTouchItem.count)) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo.a(paramRedTouchItem);
        ConfessMsgUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, false, false);
        ((ConfessHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(125)).b(this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo);
      }
      if (!QLog.isDevelopLevel()) {
        break;
      }
      QLog.i("ConfessManager", 4, String.format(Locale.getDefault(), "onFrdRecNewConfess bNeedUpdate: %s, info: %s", new Object[] { Boolean.valueOf(bool), this.jdField_a_of_type_ComTencentMobileqqConfessFrdConfessInfo }));
      return;
    }
  }
  
  public void a(String paramString)
  {
    Integer localInteger = null;
    abkt localabkt = this.jdField_a_of_type_Abkt;
    this.jdField_a_of_type_Abkt = null;
    if (localabkt != null)
    {
      this.jdField_b_of_type_Abkt = localabkt;
      if (localabkt.jdField_d_of_type_Int == 1) {
        ThreadManager.postImmediately(new abks(this, paramString, localabkt), null, false);
      }
    }
    Locale localLocale;
    if (QLog.isDevelopLevel())
    {
      localLocale = Locale.getDefault();
      if (localabkt != null) {
        break label89;
      }
    }
    for (;;)
    {
      QLog.i("ConfessManager", 4, String.format(localLocale, "leaveFrdRecConfessChat frdUin: %s, flag: %s", new Object[] { paramString, localInteger }));
      return;
      label89:
      localInteger = Integer.valueOf(localabkt.jdField_d_of_type_Int);
    }
  }
  
  public void a(String paramString, abkt paramabkt)
  {
    if ((paramabkt == null) || (TextUtils.isEmpty(paramString))) {}
    do
    {
      return;
      synchronized (this.jdField_a_of_type_JavaLangObject)
      {
        if (paramabkt.jdField_d_of_type_Int == 1)
        {
          paramString = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramString, 0, new int[] { -2065 });
          if ((paramString != null) && (paramString.size() > 0))
          {
            paramString = paramString.iterator();
            while (paramString.hasNext())
            {
              MessageRecord localMessageRecord = (MessageRecord)paramString.next();
              if ((localMessageRecord instanceof MessageForConfessNews))
              {
                MessageForConfessNews localMessageForConfessNews = (MessageForConfessNews)localMessageRecord;
                localMessageForConfessNews.parse();
                if ((localMessageForConfessNews.nTopicId == paramabkt.jdField_a_of_type_Int) && (TextUtils.equals(paramabkt.jdField_c_of_type_JavaLangString, localMessageForConfessNews.strConfessorUin)) && (TextUtils.equals(paramabkt.jdField_b_of_type_JavaLangString, localMessageForConfessNews.strRecUin)))
                {
                  this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localMessageRecord.frienduin, 0, localMessageRecord.msgtype, localMessageRecord.uniseq);
                  this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(localMessageRecord.frienduin, localMessageRecord.istroop, localMessageRecord.uniseq);
                }
              }
            }
          }
        }
      }
    } while (!QLog.isDevelopLevel());
    QLog.i("ConfessManager", 4, String.format(Locale.getDefault(), "removeFrdConfessNews frdUin: %s confessorUin: %s topicId: %s", new Object[] { paramabkt.jdField_b_of_type_JavaLangString, paramabkt.jdField_c_of_type_JavaLangString, Integer.valueOf(paramabkt.jdField_a_of_type_Int) }));
  }
  
  public void a(String paramString, abkt paramabkt, long paramLong1, long paramLong2)
  {
    if ((paramabkt == null) || (TextUtils.isEmpty(paramString))) {}
    for (;;)
    {
      return;
      synchronized (this.jdField_a_of_type_JavaLangObject)
      {
        if (paramabkt.jdField_d_of_type_Int == 0) {
          paramabkt.jdField_d_of_type_Int = a(paramString, paramabkt.jdField_b_of_type_JavaLangString, paramabkt.jdField_c_of_type_JavaLangString, paramabkt.jdField_a_of_type_Int);
        }
        int i = paramabkt.jdField_d_of_type_Int;
        if (i == 1) {}
        try
        {
          String str = paramabkt.a();
          if (!TextUtils.isEmpty(str))
          {
            MessageRecord localMessageRecord = MessageRecordFactory.a(-2065);
            localMessageRecord.init(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getCurrentAccountUin(), paramString, paramString, str, paramLong1, -2065, 0, paramLong2);
            localMessageRecord.isread = true;
            if (!MessageHandlerUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMessageRecord, false)) {
              this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localMessageRecord, localMessageRecord.selfuin);
            }
          }
          if (!QLog.isDevelopLevel()) {
            continue;
          }
          QLog.i("ConfessManager", 4, String.format(Locale.getDefault(), "addFrdConfessNews frdUin: %s recUin: %s, confessorUin: %s topicId: %s", new Object[] { paramString, paramabkt.jdField_b_of_type_JavaLangString, paramabkt.jdField_c_of_type_JavaLangString, Integer.valueOf(paramabkt.jdField_a_of_type_Int) }));
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            QLog.i("ConfessManager", 1, "addFrdConfessNews error: " + localException.getMessage());
          }
        }
      }
    }
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    a(paramString1, paramString2, paramInt).jdField_d_of_type_Int = 2;
    if (QLog.isDevelopLevel()) {
      QLog.i("ConfessManager", 4, String.format(Locale.getDefault(), "markFrdChatExtra recUin: %s, confessorUin: %s, topicId: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) }));
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool = true;
    abkt localabkt = this.jdField_a_of_type_Abkt;
    if ((TextUtils.isEmpty(paramString)) || (localabkt == null) || (!TextUtils.equals(localabkt.jdField_b_of_type_JavaLangString, paramString))) {
      bool = false;
    }
    do
    {
      return bool;
      if (localabkt.jdField_d_of_type_Int == 0) {
        localabkt.jdField_d_of_type_Int = a(paramString, localabkt.jdField_b_of_type_JavaLangString, localabkt.jdField_c_of_type_JavaLangString, localabkt.jdField_a_of_type_Int);
      }
    } while (localabkt.jdField_d_of_type_Int == 1);
    return false;
  }
  
  public boolean a(String paramString, Intent paramIntent)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramIntent == null)) {
      return false;
    }
    String str1 = paramIntent.getStringExtra("key_confess_rec_uin");
    String str2 = paramIntent.getStringExtra("key_confessor_uin");
    int i = paramIntent.getIntExtra("key_confess_topicid", 0);
    String str3 = paramIntent.getStringExtra("key_confess_desc");
    String str4 = paramIntent.getStringExtra("key_confessor_nick");
    int j = paramIntent.getIntExtra("key_confessor_sex", 0);
    int k = paramIntent.getIntExtra("key_confess_bg_type", 0);
    String str5 = paramIntent.getStringExtra("key_confess_rec_nick_name");
    long l = paramIntent.getLongExtra("key_confess_time", 0L);
    if ((!TextUtils.equals(paramString, str1)) || (TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str4)) || (TextUtils.isEmpty(str3)) || (i == 0)) {
      return false;
    }
    paramIntent = a(str1, str2, i);
    if (!TextUtils.isEmpty(str5)) {
      paramIntent.jdField_a_of_type_JavaLangString = str5;
    }
    paramIntent.e = str4;
    paramIntent.jdField_c_of_type_Int = j;
    paramIntent.jdField_d_of_type_JavaLangString = str3;
    paramIntent.jdField_b_of_type_Int = k;
    paramIntent.jdField_a_of_type_Long = l;
    this.jdField_a_of_type_Abkt = paramIntent;
    if (paramIntent.jdField_d_of_type_Int != 2) {
      ThreadManager.postImmediately(new abkr(this, paramString), null, false);
    }
    if (QLog.isDevelopLevel()) {
      QLog.i("ConfessManager", 4, String.format(Locale.getDefault(), "enterFrdRecConfessChat recUin: %s, confessorUin: %s, topicId: %s, flag: %s", new Object[] { str1, str2, Integer.valueOf(i), Integer.valueOf(paramIntent.jdField_d_of_type_Int) }));
    }
    return true;
  }
  
  public ConfessConfig b()
  {
    return this.jdField_a_of_type_ComTencentMobileqqConfessConfessConfig;
  }
  
  public void onDestroy()
  {
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = null;
    this.jdField_a_of_type_ComTencentMobileqqConfessConfessConfig = null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\tmp\com33.jar
 * Qualified Name:     com.tencent.mobileqq.confess.ConfessManager
 * JD-Core Version:    0.7.0.1
 */