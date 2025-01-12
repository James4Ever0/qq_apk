package com.tencent.mobileqq.activity.recent.data;

import aale;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.common.config.AppSetting;
import com.tencent.imcore.message.QQMessageFacade;
import com.tencent.imcore.message.QQMessageFacade.Message;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.RecentUser;
import com.tencent.qphone.base.util.QLog;
import tog;

public class RecentItemActivateFriendsData
  extends RecentUserBaseData
{
  private static final String TAG = "ActivateFriends.Recent";
  
  public RecentItemActivateFriendsData(RecentUser paramRecentUser)
    throws NullPointerException
  {
    super(paramRecentUser);
  }
  
  public void c(QQAppInterface paramQQAppInterface, Context paramContext)
  {
    if ((paramQQAppInterface == null) || (paramContext == null)) {}
    label111:
    do
    {
      return;
      super.c(paramQQAppInterface, paramContext);
      QQMessageFacade.Message localMessage = null;
      QQMessageFacade localQQMessageFacade = paramQQAppInterface.b();
      if (localQQMessageFacade != null) {
        localMessage = localQQMessageFacade.a(this.mUser.uin, this.mUser.getType());
      }
      if (localMessage == null) {
        break label242;
      }
      this.mDisplayTime = localMessage.time;
      paramQQAppInterface = paramQQAppInterface.a();
      if (paramQQAppInterface == null) {
        break;
      }
      this.mUnreadNum = paramQQAppInterface.A(localMessage.frienduin, localMessage.istroop);
      this.mShowTime = aale.a().t(qx(), this.mDisplayTime);
      this.mLastMsg = localMessage.getMessageText();
      cvo();
      if (TextUtils.isEmpty(this.mTitleName)) {
        this.mTitleName = paramContext.getString(2131689680);
      }
    } while (!AppSetting.enableTalkBack);
    paramQQAppInterface = new StringBuilder();
    paramQQAppInterface.append(this.mTitleName).append(",");
    if (this.mUnreadNum == 0) {}
    for (;;)
    {
      if (this.mMsgExtroInfo != null) {
        paramQQAppInterface.append(this.mMsgExtroInfo + ",");
      }
      paramQQAppInterface.append(this.mLastMsg).append(",").append(this.mShowTime);
      this.mContentDesc = paramQQAppInterface.toString();
      return;
      this.mUnreadNum = 0;
      break;
      label242:
      this.mUnreadNum = 0;
      this.mDisplayTime = 0L;
      if (QLog.isColorLevel()) {
        QLog.e("ActivateFriends.Recent", 2, "RecentActivateFriends update, last msg is null");
      }
      this.mShowTime = "";
      this.mLastMsg = "";
      break label111;
      if (this.mUnreadNum == 1) {
        paramQQAppInterface.append("有一条未读");
      } else if (this.mUnreadNum == 2) {
        paramQQAppInterface.append("有两条未读");
      } else if (this.mUnreadNum > 0) {
        paramQQAppInterface.append("有").append(this.mUnreadNum).append("条未读,");
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes8.jar
 * Qualified Name:     com.tencent.mobileqq.activity.recent.data.RecentItemActivateFriendsData
 * JD-Core Version:    0.7.0.1
 */