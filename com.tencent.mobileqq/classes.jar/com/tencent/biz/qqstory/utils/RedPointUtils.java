package com.tencent.biz.qqstory.utils;

import android.text.TextUtils;
import com.tencent.biz.TroopRedpoint.TroopRedTouchManager;
import com.tencent.biz.qqstory.app.QQStoryContext;
import com.tencent.biz.qqstory.msgTabNode.model.MsgTabStoryNodeConfigManager;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.pb.getbusiinfo.BusinessInfoCheckUpdate.AppInfo;
import com.tencent.pb.getbusiinfo.BusinessInfoCheckUpdate.RedDisplayInfo;
import com.tencent.pb.getbusiinfo.BusinessInfoCheckUpdate.RedTypeInfo;
import tencent.im.oidb.cmd0x791.oidb_0x791.RedDotInfo;

public class RedPointUtils
{
  public static int a(int paramInt)
  {
    Object localObject = QQStoryContext.a();
    if (localObject == null)
    {
      SLog.c("Q.qqstory.tag.RedPointUtils", "getStoryRedPointByAppId() error, app is null", new Throwable());
      return 0;
    }
    localObject = ((TroopRedTouchManager)((QQAppInterface)localObject).getManager(69)).a(paramInt);
    if (localObject == null)
    {
      SLog.a("Q.qqstory.tag.RedPointUtils", "getStoryRedPointByAppId(%d) info is null", Integer.valueOf(paramInt));
      return 0;
    }
    SLog.a("Q.qqstory.tag.RedPointUtils", "getStoryRedPointByAppId(%d) info is %s", Integer.valueOf(paramInt), PBUtils.a((MessageMicro)localObject));
    paramInt = ((oidb_0x791.RedDotInfo)localObject).uint32_number.get();
    boolean bool = ((oidb_0x791.RedDotInfo)localObject).bool_display_reddot.get();
    long l = ((oidb_0x791.RedDotInfo)localObject).uint32_last_time.get();
    if ((paramInt > 0) && (bool)) {}
    for (;;)
    {
      return paramInt;
      paramInt = 0;
    }
  }
  
  public static int a(QQAppInterface paramQQAppInterface)
  {
    return ((MsgTabStoryNodeConfigManager)paramQQAppInterface.getManager(251)).a;
  }
  
  public static BusinessInfoCheckUpdate.AppInfo a(int paramInt1, String paramString, int paramInt2)
  {
    BusinessInfoCheckUpdate.AppInfo localAppInfo = new BusinessInfoCheckUpdate.AppInfo();
    localAppInfo.path.set("null");
    localAppInfo.num.set(0);
    localAppInfo.type.set(-1);
    localAppInfo.iNewFlag.set(0);
    localAppInfo.appset.set(-1);
    if (paramInt1 != -1)
    {
      localAppInfo.uiAppId.set(0);
      localAppInfo.type.set(paramInt1);
      localAppInfo.iNewFlag.set(1);
      localAppInfo.appset.set(paramInt2);
      localAppInfo.mission_level.set(0);
      BusinessInfoCheckUpdate.RedDisplayInfo localRedDisplayInfo = new BusinessInfoCheckUpdate.RedDisplayInfo();
      BusinessInfoCheckUpdate.RedTypeInfo localRedTypeInfo = new BusinessInfoCheckUpdate.RedTypeInfo();
      localRedTypeInfo.red_type.set(paramInt1);
      if (!TextUtils.isEmpty(paramString)) {
        localRedTypeInfo.red_content.set(paramString);
      }
      localRedTypeInfo.red_desc.set("{'cn':'#FF0000'}");
      localRedDisplayInfo.tab_display_info.set(localRedTypeInfo);
      localRedDisplayInfo.red_type_info.add(localRedTypeInfo);
      localAppInfo.red_display_info.set(localRedDisplayInfo);
    }
    return localAppInfo;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.utils.RedPointUtils
 * JD-Core Version:    0.7.0.1
 */