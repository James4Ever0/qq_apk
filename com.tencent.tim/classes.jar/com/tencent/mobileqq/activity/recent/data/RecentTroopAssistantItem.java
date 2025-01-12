package com.tencent.mobileqq.activity.recent.data;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import anot;
import aofe;
import aofk;
import aptr;
import apuh;
import apuk;
import aqgv;
import aqpm;
import com.tencent.av.gaudio.AVNotifyCenter;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.common.config.AppSetting;
import com.tencent.imcore.message.QQMessageFacade;
import com.tencent.imcore.message.QQMessageFacade.Message;
import com.tencent.mobileqq.activity.recent.MsgSummary;
import com.tencent.mobileqq.activity.recent.RecentBaseData;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopManager;
import com.tencent.mobileqq.data.TroopAssistantData;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import jof;
import tog;

public class RecentTroopAssistantItem
  extends RecentBaseData
{
  private TroopAssistantData mData;
  public long mTroopCreditLevel = 5L;
  
  public RecentTroopAssistantItem(TroopAssistantData paramTroopAssistantData)
    throws NullPointerException
  {
    if (paramTroopAssistantData == null) {
      throw new NullPointerException("TroopAssistantData is null");
    }
    this.mData = paramTroopAssistantData;
    this.mUnreadFlag = 3;
  }
  
  public boolean Gq()
  {
    return false;
  }
  
  public void c(QQAppInterface paramQQAppInterface, Context paramContext)
  {
    if ((paramQQAppInterface == null) || (paramContext == null)) {
      return;
    }
    QQMessageFacade.Message localMessage = null;
    String str = qx();
    int i = ng();
    Object localObject1 = paramQQAppInterface.b();
    if (localObject1 != null) {
      localMessage = ((QQMessageFacade)localObject1).a(str, i);
    }
    int j;
    if (localMessage != null)
    {
      this.mDisplayTime = localMessage.time;
      localObject1 = paramQQAppInterface.a();
      if (localObject1 != null)
      {
        this.mUnreadNum = ((tog)localObject1).A(localMessage.frienduin, localMessage.istroop);
        if ((aptr.qV(str)) || (aptr.qX(str)))
        {
          this.mMsgExtroInfo = BaseApplicationImpl.getContext().getString(2131721137);
          this.mExtraInfoColor = paramContext.getResources().getColor(2131167410);
        }
        j = this.mMenuFlag;
        localObject1 = (TroopManager)paramQQAppInterface.getManager(52);
        if (localObject1 == null) {
          break label1145;
        }
      }
    }
    label212:
    label1145:
    for (TroopInfo localTroopInfo = ((TroopManager)localObject1).b(str);; localTroopInfo = null)
    {
      Object localObject3;
      if (localTroopInfo != null)
      {
        localObject3 = localTroopInfo.getTroopName();
        localObject1 = localTroopInfo.troopmemo;
      }
      for (;;)
      {
        this.mMenuFlag = (j & 0xFFFFF0FF | 0x100);
        MsgSummary localMsgSummary;
        label378:
        long l1;
        if (TextUtils.isEmpty((CharSequence)localObject3))
        {
          this.mTitleName = aqgv.a(paramQQAppInterface, str, true);
          localMsgSummary = a();
          if ((localMessage != null) && (TextUtils.isEmpty(localMessage.nickName))) {
            localMessage.nickName = localMessage.senderuin;
          }
          a(localMessage, i, paramQQAppInterface, paramContext, localMsgSummary);
          if ((localMsgSummary.nState == 0) && ((!TextUtils.isEmpty(localMsgSummary.strContent)) || (!TextUtils.isEmpty(localMsgSummary.suffix))))
          {
            SpannableString localSpannableString = null;
            if (TextUtils.isEmpty(localMsgSummary.strContent)) {
              break label1041;
            }
            Object localObject4 = localMsgSummary.strContent.toString();
            localObject3 = localObject4;
            if (!TextUtils.isEmpty(localMsgSummary.strPrefix))
            {
              localObject3 = localObject4;
              if (TextUtils.indexOf(localMsgSummary.strContent, localMsgSummary.strPrefix) == 0) {
                localObject3 = (String)((String)localObject4).subSequence(localMsgSummary.strPrefix.length() + 2, localMsgSummary.strContent.length());
              }
            }
            if (!TextUtils.isEmpty(localMsgSummary.strPrefix)) {
              localSpannableString = new aofe(localMsgSummary.strPrefix, 16).k();
            }
            localObject3 = aqpm.a((String)localObject3, localMessage, 16, 3);
            localObject4 = new SpannableStringBuilder();
            if (localSpannableString != null) {
              ((SpannableStringBuilder)localObject4).append(localSpannableString).append(": ");
            }
            ((SpannableStringBuilder)localObject4).append((CharSequence)localObject3);
            localMsgSummary.strContent = new aofk((CharSequence)localObject4, 3, 16);
          }
          if ((TextUtils.isEmpty(localMsgSummary.strContent)) && (TextUtils.isEmpty(localMsgSummary.suffix)))
          {
            localObject3 = localObject1;
            if (localObject1 == null) {
              localObject3 = "";
            }
            localMsgSummary.strContent = ((CharSequence)localObject3);
          }
          bI(paramQQAppInterface);
          a(paramQQAppInterface, localMsgSummary);
          a(paramQQAppInterface, paramContext, localMsgSummary);
          l1 = 0L;
        }
        try
        {
          long l2 = Long.parseLong(qx());
          l1 = l2;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          boolean bool;
          break label550;
        }
        this.mIsGroupVideo = paramQQAppInterface.a().au(l1);
        bool = this.mIsGroupVideoNotify;
        this.mIsGroupVideoNotify = paramQQAppInterface.a().at(l1);
        if (this.mIsGroupVideoNotify)
        {
          localObject1 = (apuk)paramQQAppInterface.getManager(164);
          if ((localObject1 != null) && (((apuk)localObject1).eV(qx()) == 2)) {
            this.mIsGroupVideoNotify = false;
          }
        }
        if ((this.mIsGroupVideoNotify) && (TextUtils.isEmpty(this.mMsgExtroInfo)))
        {
          this.mMsgExtroInfo = paramQQAppInterface.getApp().getString(2131700021);
          this.mExtraInfoColor = paramQQAppInterface.getApp().getResources().getColor(2131167410);
        }
        if ((this.mIsGroupVideoNotify) && (!bool))
        {
          localObject1 = String.valueOf(l1);
          anot.a(null, "dc00899", "Grp_video", "", "notice", "exp", 0, 0, (String)localObject1, "" + apuh.n(paramQQAppInterface, (String)localObject1), "", "");
        }
        if ((TextUtils.isEmpty(this.mMsgExtroInfo)) && (localMessage != null) && (localMsgSummary != null) && (jof.a(localMessage))) {
          this.mLastMsg = localMsgSummary.a(paramContext, paramContext.getResources().getString(2131699453), -1);
        }
        if (localTroopInfo != null)
        {
          this.mTroopCreditLevel = localTroopInfo.troopCreditLevel;
          if (this.mTroopCreditLevel == 0L) {
            this.mTroopCreditLevel = 5L;
          }
          if (QLog.isColorLevel()) {
            QLog.i("troop.credit.act", 2, "RecentTroopAssistantItem->update," + str + "," + this.mTroopCreditLevel);
          }
        }
        paramQQAppInterface = (TroopManager)paramQQAppInterface.getManager(52);
        this.mMenuFlag &= 0xFFFFFF0F;
        j = this.mMenuFlag;
        if (paramQQAppInterface.kv(str))
        {
          i = 32;
          this.mMenuFlag = (i | j);
          if (!AppSetting.enableTalkBack) {
            break;
          }
          paramQQAppInterface = new StringBuilder(24);
          paramQQAppInterface.append(this.mTitleName);
          if (this.mUnreadNum != 0) {
            break label1062;
          }
        }
        for (;;)
        {
          if (this.mMsgExtroInfo != null) {
            paramQQAppInterface.append(this.mMsgExtroInfo + ",");
          }
          paramQQAppInterface.append(this.mLastMsg).append(' ').append(this.mShowTime);
          this.mContentDesc = paramQQAppInterface.toString();
          return;
          this.mUnreadNum = 0;
          break;
          this.mDisplayTime = 0L;
          this.mUnreadNum = 0;
          break;
          this.mTitleName = ((String)localObject3);
          break label212;
          localObject3 = localMsgSummary.suffix.toString();
          break label378;
          i = 16;
          break label906;
          if (this.mUnreadNum == 1) {
            paramQQAppInterface.append("有一条未读");
          } else if (this.mUnreadNum == 2) {
            paramQQAppInterface.append("有两条未读");
          } else if (this.mUnreadNum > 0) {
            paramQQAppInterface.append("有").append(this.mUnreadNum).append("条未读");
          }
        }
        Object localObject2 = null;
        localObject3 = null;
      }
    }
  }
  
  public long eI()
  {
    return this.mData.lastmsgtime;
  }
  
  public long eJ()
  {
    return this.mData.lastdrafttime;
  }
  
  public long eK()
  {
    return this.mTroopCreditLevel;
  }
  
  public int ng()
  {
    return 1;
  }
  
  public String qx()
  {
    return this.mData.troopUin;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes8.jar
 * Qualified Name:     com.tencent.mobileqq.activity.recent.data.RecentTroopAssistantItem
 * JD-Core Version:    0.7.0.1
 */