package com.tencent.mobileqq.activity.recent.data;

import acbn;
import android.content.Context;
import com.tencent.common.config.AppSetting;
import com.tencent.imcore.message.QQMessageFacade;
import com.tencent.imcore.message.QQMessageFacade.Message;
import com.tencent.mobileqq.activity.recent.MsgSummary;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.MessageForNearbyLiveTip;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.qphone.base.util.QLog;
import tog;

public class RecentItemNearbyLiveTipData
  extends RecentMsgBoxItem
{
  public MessageForNearbyLiveTip nearbyLiveTipMsg;
  
  public RecentItemNearbyLiveTipData(MessageRecord paramMessageRecord)
    throws NullPointerException
  {
    super(paramMessageRecord);
    this.mMenuFlag |= 0x200000;
  }
  
  public void c(QQAppInterface paramQQAppInterface, Context paramContext)
  {
    if ((paramQQAppInterface == null) || (paramContext == null)) {
      return;
    }
    Object localObject = paramQQAppInterface.b();
    tog localtog = paramQQAppInterface.a();
    if (localObject != null) {}
    for (localObject = ((QQMessageFacade)localObject).a(this.mData.senderuin, this.mData.istroop);; localObject = null)
    {
      MsgSummary localMsgSummary = a();
      if (localObject == null)
      {
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.i("Q.nearby.tag_nearby_live_tip", 2, "RecentItemNearbyLiveTipData, msg = null");
        return;
      }
      this.mDisplayTime = ((QQMessageFacade.Message)localObject).time;
      this.nearbyLiveTipMsg = ((MessageForNearbyLiveTip)paramQQAppInterface.b().a(((QQMessageFacade.Message)localObject).senderuin, ((QQMessageFacade.Message)localObject).istroop, ((QQMessageFacade.Message)localObject).uniseq));
      if (this.nearbyLiveTipMsg == null)
      {
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.i("Q.nearby.tag_nearby_live_tip", 2, "RecentItemNearbyLiveTipData, nearbyLiveTipMsg = null");
        return;
      }
      this.nearbyLiveTipMsg.parse();
      this.mTitleName = this.nearbyLiveTipMsg.nickName;
      localMsgSummary.strContent = this.nearbyLiveTipMsg.msg;
      if (localtog != null)
      {
        this.mUnreadNum = localtog.A(((QQMessageFacade.Message)localObject).frienduin, ((QQMessageFacade.Message)localObject).istroop);
        if (hf().equals("1822701914")) {
          this.mUnreadFlag = 3;
        }
        a(paramQQAppInterface, paramContext, localMsgSummary);
        if (!AppSetting.enableTalkBack) {
          break;
        }
        paramQQAppInterface = new StringBuilder(24);
        paramQQAppInterface.append(this.mTitleName);
        if (this.mUnreadNum != 0) {
          break label305;
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
        label305:
        if (this.mUnreadNum == 1) {
          paramQQAppInterface.append("有一条未读");
        } else if (this.mUnreadNum == 2) {
          paramQQAppInterface.append("有两条未读");
        } else if (this.mUnreadNum > 0) {
          paramQQAppInterface.append("有").append(this.mUnreadNum).append("条未读");
        }
      }
    }
  }
  
  public String hf()
  {
    String str2 = this.mData.senderuin;
    try
    {
      long l1 = Long.valueOf(str2).longValue();
      String str1 = str2;
      if (l1 > acbn.Pd)
      {
        long l2 = acbn.Pd;
        str1 = l1 - l2 + "";
      }
      return str1;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return str2;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes8.jar
 * Qualified Name:     com.tencent.mobileqq.activity.recent.data.RecentItemNearbyLiveTipData
 * JD-Core Version:    0.7.0.1
 */