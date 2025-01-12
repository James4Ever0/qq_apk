import android.content.ContentValues;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.tencent.imcore.message.QQMessageFacade;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopManager;
import com.tencent.mobileqq.app.automator.Automator;
import com.tencent.mobileqq.ark.ArkAppCenter;
import com.tencent.mobileqq.data.ArkAppMessage;
import com.tencent.mobileqq.data.MessageForArkApp;
import com.tencent.mobileqq.data.MessageForGrayTips;
import com.tencent.mobileqq.data.MessageForQQWalletTips;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.data.QQEntityManagerFactory;
import com.tencent.mobileqq.graytip.MessageForUniteGrayTip;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBSInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.revokemsg.RevokeMsgInfo;
import com.tencent.mobileqq.troop.data.TroopTipsEntity;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mqq.manager.Manager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tencent.im.apollo_game_status.STCMGameMessage;
import tencent.im.apollo_push_msgInfo.STPushMsgElem;
import tencent.im.msgrevoke.msgrevoke_userdef.MsgInfoUserDef;
import tencent.im.msgrevoke.msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef;
import tencent.im.oidb.cmd0x857.GroupOpenSysMsg.LightApp;
import tencent.im.oidb.cmd0x857.GroupOpenSysMsg.Sender;
import tencent.im.oidb.cmd0x857.GroupOpenSysMsg.Source;
import tencent.im.oidb.cmd0x857.GroupOpenSysMsg.SysMsgBody;
import tencent.im.oidb.cmd0x857.TroopTips0x857.AIOGrayTipsInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.GeneralGrayTipInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.GoldMsgTipsElem;
import tencent.im.oidb.cmd0x857.TroopTips0x857.GroupAnnounceTBCInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.GroupInfoChange;
import tencent.im.oidb.cmd0x857.TroopTips0x857.GroupNotifyInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.MediaChangePushInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.MessageRecallReminder;
import tencent.im.oidb.cmd0x857.TroopTips0x857.MessageRecallReminder.MessageMeta;
import tencent.im.oidb.cmd0x857.TroopTips0x857.MiniAppNotify;
import tencent.im.oidb.cmd0x857.TroopTips0x857.NotifyMsgBody;
import tencent.im.oidb.cmd0x857.TroopTips0x857.NotifyObjmsgUpdate;
import tencent.im.oidb.cmd0x857.TroopTips0x857.RedGrayTipsInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.SingChangePushInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.TroopFormGrayTipsInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.VideoChangePushInfo;
import tencent.im.oidb.cmd0x857.TroopTips0x857.WereWolfPush;
import tencent.im.s2c.msgtype0x210.submsgtype0xaa.SubMsgType0xaa.MsgBody;

public class apuf
  implements Manager
{
  protected static final String crx = "<{text:'A',action:'',url:'',url_p:'schemel://xxx',actionData:'action:xxxx',actionData_i:'',actionData_a:''}>" + acfp.m(2131716149) + "<{text:'B',action:'',url:'',url_p:'schemel://xxx',actionData:'action:xxxx',actionData_i:'',actionData_a:''}>" + acfp.m(2131716150) + "<{icon:'/rose',url:'url.qq.com?rose.png',alt:'玫瑰'}>";
  protected static HashMap<String, Boolean> oH = new HashMap();
  public ArrayList<apuf.a> Cr = new ArrayList();
  protected Queue<String> F = new LinkedList();
  protected QQAppInterface mApp;
  
  public apuf(QQAppInterface paramQQAppInterface)
  {
    this.mApp = paramQQAppInterface;
  }
  
  public static void a(MessageForGrayTips paramMessageForGrayTips, String paramString)
  {
    if ((paramMessageForGrayTips == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    for (;;)
    {
      int i;
      String str;
      Bundle localBundle;
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        i = 0;
        if (i >= localJSONArray.length()) {
          break;
        }
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        int k = localJSONObject.getInt("startIndex");
        int m = localJSONObject.optInt("endIndex");
        if (m <= 0) {
          break label375;
        }
        if (!localJSONObject.has("cmd")) {
          break label370;
        }
        j = localJSONObject.getInt("cmd");
        paramString = "";
        if (localJSONObject.has("data")) {
          paramString = localJSONObject.getString("data");
        }
        str = null;
        if (localJSONObject.has("data_a")) {
          str = localJSONObject.getString("data_a");
        }
        if (localJSONObject.has("url")) {
          paramString = localJSONObject.getString("url");
        }
        localBundle = new Bundle();
        localBundle.putInt("key_action", j);
        switch (j)
        {
        case 4: 
          if (localJSONObject.has("icon"))
          {
            localBundle.putString("image_resource", localJSONObject.optString("icon"));
            localBundle.putString("image_alt", localJSONObject.optString("alt"));
          }
          if (localJSONObject.has("textColor")) {
            localBundle.putString("textColor", localJSONObject.getString("textColor"));
          }
          paramMessageForGrayTips.addHightlightItem(k, m, localBundle);
        }
      }
      catch (JSONException paramMessageForGrayTips) {}
      if (!QLog.isColorLevel()) {
        break;
      }
      QLog.e("TroopTipsMsgMgr", 2, "addGrayTips==>JSONException");
      return;
      localBundle.putString("key_action_DATA", paramString);
      localBundle.putString("key_a_action_DATA", str);
      continue;
      localBundle.putString("troop_mem_uin", paramString);
      localBundle.putBoolean("need_update_nick", true);
      continue;
      label370:
      int j = -1;
      continue;
      label375:
      i += 1;
    }
  }
  
  private void a(GroupOpenSysMsg.SysMsgBody paramSysMsgBody, TroopTipsEntity paramTroopTipsEntity)
  {
    if ((paramSysMsgBody.msg_type.get() == 2) && (paramSysMsgBody.light_app.has()))
    {
      MessageForArkApp localMessageForArkApp = (MessageForArkApp)anbi.d(-5008);
      Object localObject = new ArkAppMessage();
      ((ArkAppMessage)localObject).promptText = paramSysMsgBody.light_app.prompt.get();
      ((ArkAppMessage)localObject).appName = paramSysMsgBody.light_app.app.get();
      ((ArkAppMessage)localObject).appView = paramSysMsgBody.light_app.view.get();
      ((ArkAppMessage)localObject).appDesc = paramSysMsgBody.light_app.desc.get();
      ((ArkAppMessage)localObject).appMinVersion = paramSysMsgBody.light_app.ver.get();
      ((ArkAppMessage)localObject).metaList = paramSysMsgBody.light_app.meta.get();
      ((ArkAppMessage)localObject).config = paramSysMsgBody.light_app.config.get();
      if (paramSysMsgBody.light_app.source.has())
      {
        ((ArkAppMessage)localObject).mSourceName = paramSysMsgBody.light_app.source.name.get();
        ((ArkAppMessage)localObject).mSourceUrl = paramSysMsgBody.light_app.source.url.get();
      }
      localMessageForArkApp.ark_app_message = ((ArkAppMessage)localObject);
      localObject = "";
      if (paramSysMsgBody.sender.has())
      {
        localMessageForArkApp.saveExtInfoToExtStr("troop_msg_has", "1");
        localMessageForArkApp.saveExtInfoToExtStr("troop_msg_flag", "1");
        localMessageForArkApp.saveExtInfoToExtStr("troop_msg_head_url", paramSysMsgBody.sender.avatar.get());
        localMessageForArkApp.saveExtInfoToExtStr("troop_msg_head_click_url", paramSysMsgBody.sender.url.get());
        localMessageForArkApp.saveExtInfoToExtStr("troop_msg_nickname", paramSysMsgBody.sender.nick.get());
        localMessageForArkApp.saveExtInfoToExtStr("troop_msg_nick_color", String.valueOf(BaseApplication.getContext().getResources().getColor(2131167328)));
        localObject = String.valueOf(paramSysMsgBody.sender.uin.get());
      }
      localMessageForArkApp.saveExtInfoToExtStr("troop_mini_app_sys", "1");
      localMessageForArkApp.frienduin = paramTroopTipsEntity.troopUin;
      localMessageForArkApp.init(this.mApp.getCurrentAccountUin(), paramTroopTipsEntity.troopUin, (String)localObject, paramTroopTipsEntity.optContent, paramTroopTipsEntity.time, -5008, paramTroopTipsEntity.uinType, paramTroopTipsEntity.msgSeq);
      localMessageForArkApp.isread = true;
      localMessageForArkApp.getBytes();
      this.mApp.b().b(localMessageForArkApp, this.mApp.getCurrentAccountUin());
    }
  }
  
  private void jdMethod_if(String paramString1, String paramString2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "setUnreadAIOGrayTips");
    }
    oH.put(paramString1 + "_" + paramString2, Boolean.valueOf(true));
  }
  
  private void ig(String paramString1, String paramString2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "removeReadedAIOGrayTips");
    }
    EntityManager localEntityManager = this.mApp.a().createEntityManager();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("read", Boolean.valueOf(true));
    boolean bool = localEntityManager.update(TroopTipsEntity.class.getSimpleName(), localContentValues, "troopUin=? and msgSeq=?", new String[] { paramString1, paramString2 });
    localEntityManager.close();
    if (bool)
    {
      QLog.d("TroopTipsMsgMgr", 2, "removeReadedAIOGrayTips ok troopUin:" + paramString1 + "msgSeq:" + paramString2);
      oH.remove(paramString1 + "_" + paramString2);
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.d("TroopTipsMsgMgr", 2, "removeReadedAIOGrayTips error");
  }
  
  public boolean I(String paramString, long paramLong)
  {
    paramString = paramString + "_" + paramLong;
    Iterator localIterator = this.F.iterator();
    while (localIterator.hasNext()) {
      if (((String)localIterator.next()).equals(paramString))
      {
        if (QLog.isColorLevel()) {
          QLog.d("TroopTipsMsgMgr", 2, "tipsMsgFilterBySeq, flag in queue equals uniFlag:" + paramString);
        }
        return true;
      }
    }
    if (this.F.size() > 30) {
      this.F.poll();
    }
    this.F.offer(paramString);
    return false;
  }
  
  public MessageForGrayTips a(TroopTipsEntity paramTroopTipsEntity)
  {
    Object localObject;
    if ((this.mApp == null) || (paramTroopTipsEntity == null)) {
      localObject = null;
    }
    MessageForGrayTips localMessageForGrayTips;
    do
    {
      ArrayList localArrayList;
      do
      {
        return localObject;
        localArrayList = new ArrayList();
        localMessageForGrayTips = b(paramTroopTipsEntity);
        localObject = localMessageForGrayTips;
      } while (achp.a(this.mApp, localMessageForGrayTips, false));
      localArrayList.add(localMessageForGrayTips);
      this.mApp.b().s(localArrayList, this.mApp.getCurrentAccountUin());
      localObject = localMessageForGrayTips;
    } while (paramTroopTipsEntity.uinType != 1);
    ig(paramTroopTipsEntity.troopUin, paramTroopTipsEntity.msgSeq + "");
    return localMessageForGrayTips;
  }
  
  public MessageForGrayTips a(String paramString1, String paramString2, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    TroopTipsEntity localTroopTipsEntity = new TroopTipsEntity();
    localTroopTipsEntity.troopUin = paramString1;
    localTroopTipsEntity.time = paramLong1;
    localTroopTipsEntity.expireTime = paramLong2;
    localTroopTipsEntity.msgSeq = paramInt1;
    localTroopTipsEntity.tipsPromptType = 1;
    localTroopTipsEntity.currentUin = this.mApp.getCurrentAccountUin();
    localTroopTipsEntity.optContent = paramString2;
    localTroopTipsEntity.optShowLatest = 1;
    localTroopTipsEntity.uinType = paramInt2;
    a(localTroopTipsEntity);
    return a(localTroopTipsEntity);
  }
  
  public MessageRecord a(QQAppInterface paramQQAppInterface, byte[] paramArrayOfByte, int paramInt, long paramLong, boolean paramBoolean1, boolean paramBoolean2, anbw.a parama)
  {
    if (paramArrayOfByte == null) {
      paramQQAppInterface = null;
    }
    Object localObject1;
    int i;
    int j;
    long l1;
    long l2;
    Object localObject2;
    label1172:
    label1231:
    do
    {
      return paramQQAppInterface;
      localObject1 = new TroopTips0x857.NotifyMsgBody();
      do
      {
        try
        {
          localObject1 = (TroopTips0x857.NotifyMsgBody)((TroopTips0x857.NotifyMsgBody)localObject1).mergeFrom(paramArrayOfByte);
          if (localObject1 == null)
          {
            if (!QLog.isColorLevel()) {
              break label3421;
            }
            QLog.e("TroopTipsMsgMgr", 2, "handle0x2dcSubType0x10 ==> notifyMsgBody == null");
            break label3421;
          }
          i = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_enum_type.get();
          j = ((TroopTips0x857.NotifyMsgBody)localObject1).uint32_service_type.get();
          l1 = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_uint64_group_code.get();
          if (QLog.isColorLevel()) {
            QLog.d("TroopTipsMsgMgr", 2, "handle0x2dcSubType0x10 ==> msgSeq:" + paramInt + ", promptType: " + i + ", serviceType: " + j + ", troopUin: " + l1);
          }
          if (I(l1 + "", paramInt)) {
            return null;
          }
          if (paramLong != 0L) {
            break label3418;
          }
          paramLong = NetConnInfoCenter.getServerTime();
          l2 = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_uint64_msg_expires.get();
          if ((l2 != 0L) && (NetConnInfoCenter.getServerTime() >= l2))
          {
            if (!QLog.isColorLevel()) {
              break label3423;
            }
            QLog.e("TroopTipsMsgMgr", 2, "handle0x2dcSubType0x10 ==> time expried!! promptType:" + i);
            break label3423;
          }
          localObject2 = new TroopTipsEntity();
          ((TroopTipsEntity)localObject2).troopUin = String.valueOf(l1);
          ((TroopTipsEntity)localObject2).time = paramLong;
          ((TroopTipsEntity)localObject2).expireTime = l2;
          ((TroopTipsEntity)localObject2).msgSeq = paramInt;
          ((TroopTipsEntity)localObject2).isOfflineMsg = paramBoolean1;
          switch (i)
          {
          case 1: 
            if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_redtips.has())
            {
              paramArrayOfByte = (TroopTips0x857.RedGrayTipsInfo)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_redtips.get();
              if (paramQQAppInterface.a.He())
              {
                a(new apuf.a(((TroopTipsEntity)localObject2).troopUin, paramArrayOfByte));
                return null;
              }
              ((TroopTipsEntity)localObject2).currentUin = this.mApp.getCurrentAccountUin();
              paramQQAppInterface = (MessageForQQWalletTips)anbi.d(-2029);
              paramQQAppInterface.senderUin = (paramArrayOfByte.uint64_sender_uin.get() + "");
              paramQQAppInterface.reciverUin = (paramArrayOfByte.uint64_receiver_uin.get() + "");
              paramQQAppInterface.senderContent = paramArrayOfByte.bytes_sender_rich_content.get().toStringUtf8();
              paramQQAppInterface.reciverContent = paramArrayOfByte.bytes_receiver_rich_content.get().toStringUtf8();
              paramQQAppInterface.authKey = paramArrayOfByte.bytes_authkey.get().toStringUtf8();
              paramQQAppInterface.idiomSeq = paramArrayOfByte.uint32_idiom_seq.get();
              paramQQAppInterface.idiom = paramArrayOfByte.bytes_idiom.get().toStringUtf8();
              paramQQAppInterface.msgType = paramArrayOfByte.sint32_msgtype.get();
              paramQQAppInterface.richContent = paramArrayOfByte.bytes_broadcast_rich_content.get().toStringUtf8();
              paramQQAppInterface.lastPinyin = paramArrayOfByte.bytes_idiom_alpha.get().toStringUtf8();
              paramQQAppInterface.bytes_jumpurl = paramArrayOfByte.bytes_jumpurl.get().toStringUtf8();
              paramQQAppInterface.subChannel = paramArrayOfByte.uint32_subchannel.get();
              paramQQAppInterface.init(this.mApp.getCurrentAccountUin(), ((TroopTipsEntity)localObject2).troopUin, "", "[QQWallet Tips]", anaz.gQ(), -2029, 1, anaz.gQ());
              paramQQAppInterface.isread = true;
              paramQQAppInterface.getBytes();
              paramQQAppInterface.onReceiveGrapTips();
              this.mApp.b().b(paramQQAppInterface, ((TroopTipsEntity)localObject2).currentUin);
              return null;
            }
            ((TroopTipsEntity)localObject2).tipsPromptType = 1;
            ((TroopTipsEntity)localObject2).currentUin = this.mApp.getCurrentAccountUin();
            ((TroopTipsEntity)localObject2).optContent = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.opt_bytes_content.get().toStringUtf8();
            ((TroopTipsEntity)localObject2).grayTipsRemindFlag = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.opt_uint32_remind.get();
            if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.opt_bytes_brief.has()) {
              ((TroopTipsEntity)localObject2).grayTipsSummary = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.opt_bytes_brief.get().toStringUtf8();
            }
            if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.uint32_robot_group_opt.has())
            {
              if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.uint32_robot_group_opt.get() == 1) {}
              paramArrayOfByte = (aptw)paramQQAppInterface.getManager(203);
            }
            if (TextUtils.isEmpty(((TroopTipsEntity)localObject2).optContent)) {
              return null;
            }
            ((TroopTipsEntity)localObject2).optShowLatest = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.opt_uint32_show_lastest.get();
            ((TroopTipsEntity)localObject2).serviceType = j;
            a((TroopTipsEntity)localObject2);
            if (j == 3)
            {
              apqz.a(paramQQAppInterface, (TroopTipsEntity)localObject2);
              return null;
            }
            if ((j == 6) && (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.uint64_receiver_uin.has()))
            {
              paramLong = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_graytips.uint64_receiver_uin.get();
              if (QLog.isColorLevel()) {
                QLog.d("TroopRankConfig", 2, "handle0x2dcSubType0x10Msg, grayTipsReceiverUin=" + paramLong);
              }
              if (String.valueOf(paramLong).equals(paramQQAppInterface.getCurrentAccountUin()))
              {
                apdg.a().U(String.valueOf(l1), paramQQAppInterface.getCurrentAccountUin(), true);
                ((acms)this.mApp.getBusinessHandler(20)).ac(l1, paramLong);
              }
            }
            for (;;)
            {
              paramArrayOfByte = this.mApp.b().a().a(this.mApp, ((TroopTipsEntity)localObject2).troopUin, (TroopTipsEntity)localObject2);
              if ((paramBoolean1) || (!achp.a(paramQQAppInterface, paramArrayOfByte, false))) {
                break label1231;
              }
              return null;
              if (j != 11) {
                break;
              }
              ((TroopTipsEntity)localObject2).repeatInterval = 10;
            }
            QLog.e("TroopTipsMsgMgr", 2, "handle0x2dcSubType0x10 Exception " + paramQQAppInterface.getStackTrace());
          }
        }
        catch (Exception paramQQAppInterface)
        {
          paramQQAppInterface.printStackTrace();
          if (!QLog.isColorLevel()) {
            break label3425;
          }
        }
        break label3425;
      } while (j != 12);
      if (!((TroopTips0x857.NotifyMsgBody)localObject1).opt_uint64_sender_uin.has()) {
        break;
      }
      paramLong = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_uint64_sender_uin.get();
      paramQQAppInterface = ((TroopTipsEntity)localObject2).optContent;
      if (QLog.isColorLevel()) {
        QLog.d("TroopTipsMsgMgr", 2, "ServiceType_GroupNameModified modify name:" + paramQQAppInterface + "， uin" + paramLong);
      }
      apuh.j(l1, paramQQAppInterface, paramLong);
      return null;
      paramQQAppInterface = paramArrayOfByte;
    } while (paramArrayOfByte == null);
    paramArrayOfByte.saveExtInfoToExtStr("gray_tips_serviceType", j + "");
    return paramArrayOfByte;
    if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_group_notify.has())
    {
      paramQQAppInterface = (TroopTips0x857.GroupNotifyInfo)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_group_notify.get();
      paramArrayOfByte = ((ajdr)this.mApp.getManager(37)).a(Long.valueOf(l1), true);
      if ((paramArrayOfByte != null) && (1 == paramQQAppInterface.opt_uint32_auto_pull_flag.get()))
      {
        paramArrayOfByte.d(paramQQAppInterface.opt_bytes_feeds_id.get().toStringUtf8(), Integer.valueOf(paramQQAppInterface.opt_uint32_auto_pull_flag.get()));
        ((acms)this.mApp.getBusinessHandler(20)).notifyUI(67, true, new Object[] { String.valueOf(l1), paramQQAppInterface.opt_bytes_feeds_id.get().toStringUtf8(), Integer.valueOf(paramQQAppInterface.opt_uint32_auto_pull_flag.get()) });
        break label3425;
        if (!paramBoolean2)
        {
          if (parama != null) {
            parama.cEP = false;
          }
          if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_recall.has())
          {
            parama = (TroopTips0x857.MessageRecallReminder)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_recall.get();
            paramLong = parama.uint64_uin.get();
            l2 = parama.uint64_admin_uin.get();
            paramInt = parama.uint32_op_type.get();
            paramQQAppInterface = new HashMap();
            try
            {
              paramArrayOfByte = new msgrevoke_userdef.MsgInfoUserDef();
              paramArrayOfByte.mergeFrom(parama.bytes_userdef.get().toByteArray());
              i = paramArrayOfByte.uint32_long_message_flag.get();
              if (i != 1) {
                break label1603;
              }
              paramArrayOfByte = ((ArrayList)paramArrayOfByte.long_msg_info.get()).iterator();
              while (paramArrayOfByte.hasNext())
              {
                localObject1 = (msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef)paramArrayOfByte.next();
                paramQQAppInterface.put(Integer.valueOf(((msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef)localObject1).uint32_msg_seq.get()), localObject1);
              }
              QLog.d("revokeMsg", 2, "recv 0x2dc_0x11 msg, parse msgInfoUserDef error");
            }
            catch (Exception paramQQAppInterface)
            {
              if (!QLog.isColorLevel()) {
                break label3427;
              }
            }
            break label3427;
            label1603:
            paramArrayOfByte = new ArrayList();
            parama = ((ArrayList)parama.uint32_recalled_msg_list.get()).iterator();
            while (parama.hasNext())
            {
              localObject2 = (TroopTips0x857.MessageRecallReminder.MessageMeta)parama.next();
              localObject1 = new RevokeMsgInfo();
              ((RevokeMsgInfo)localObject1).bYD = String.valueOf(paramLong);
              ((RevokeMsgInfo)localObject1).bYE = String.valueOf(l2);
              ((RevokeMsgInfo)localObject1).frienduin = String.valueOf(l1);
              ((RevokeMsgInfo)localObject1).istroop = 1;
              ((RevokeMsgInfo)localObject1).shmsgseq = ((TroopTips0x857.MessageRecallReminder.MessageMeta)localObject2).uint32_seq.get();
              ((RevokeMsgInfo)localObject1).time = ((TroopTips0x857.MessageRecallReminder.MessageMeta)localObject2).uint32_time.get();
              ((RevokeMsgInfo)localObject1).authorUin = String.valueOf(((TroopTips0x857.MessageRecallReminder.MessageMeta)localObject2).uint64_author_uin.get());
              ((RevokeMsgInfo)localObject1).opType = paramInt;
              ((RevokeMsgInfo)localObject1).dyl = ((TroopTips0x857.MessageRecallReminder.MessageMeta)localObject2).uint32_is_anony_msg.get();
              if (i == 1)
              {
                localObject2 = (msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef)paramQQAppInterface.get(Integer.valueOf(((TroopTips0x857.MessageRecallReminder.MessageMeta)localObject2).uint32_seq.get()));
                ((RevokeMsgInfo)localObject1).dyi = ((msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef)localObject2).long_msg_id.get();
                ((RevokeMsgInfo)localObject1).dyj = ((msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef)localObject2).long_msg_num.get();
                ((RevokeMsgInfo)localObject1).dyk = ((msgrevoke_userdef.MsgInfoUserDef.MsgInfoDef)localObject2).long_msg_index.get();
              }
              paramArrayOfByte.add(localObject1);
              if (QLog.isColorLevel()) {
                QLog.d("revokeMsg", 2, "recv 0x2dc_0x11 msg," + ((RevokeMsgInfo)localObject1).toString());
              }
            }
            this.mApp.b().v(paramArrayOfByte, false);
            return null;
            if (QLog.isColorLevel()) {
              QLog.d("GameParty", 2, "recv 0x857_notifyobjmsgupdate push message");
            }
            if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_objmsg_update.has())
            {
              parama = (TroopTips0x857.NotifyObjmsgUpdate)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_objmsg_update.get();
              if (parama.bytes_ext_msg.has())
              {
                paramArrayOfByte = new SubMsgType0xaa.MsgBody();
                try
                {
                  paramArrayOfByte.mergeFrom(parama.bytes_ext_msg.get().toByteArray());
                  ((ahvn)paramQQAppInterface.getManager(156)).a(paramArrayOfByte, false);
                }
                catch (Exception parama)
                {
                  for (;;)
                  {
                    if (QLog.isColorLevel()) {
                      QLog.d("GameParty", 2, "recv 0x857_notifyobjmsgupdate, prase msgBody error");
                    }
                  }
                }
                if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_werewolf_push.has())
                {
                  if (QLog.isColorLevel()) {
                    QLog.d("Q.werewolf", 2, "recv 0x857_werewolfPush");
                  }
                  ((ardq)paramQQAppInterface.getBusinessHandler(107)).a((TroopTips0x857.WereWolfPush)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_werewolf_push.get(), paramArrayOfByte);
                  break label3425;
                  if (QLog.isColorLevel()) {
                    QLog.d("ApolloGameManager", 2, "recv 0x857_gameStatusNotify push message.[troop]");
                  }
                  if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_stcm_game_state.has())
                  {
                    paramQQAppInterface = (apollo_game_status.STCMGameMessage)((TroopTips0x857.NotifyMsgBody)localObject1).opt_stcm_game_state.get();
                    if (this.mApp != null)
                    {
                      ((abhe)this.mApp.getManager(211)).a(0, 1, Long.toString(l1), paramQQAppInterface);
                      break label3425;
                      if (QLog.isColorLevel()) {
                        QLog.d("ApolloPushManager", 2, "recv action push message, [troop]");
                      }
                      if (((TroopTips0x857.NotifyMsgBody)localObject1).apllo_msg_push.has())
                      {
                        paramArrayOfByte = (apollo_push_msgInfo.STPushMsgElem)((TroopTips0x857.NotifyMsgBody)localObject1).apllo_msg_push.get();
                        if (this.mApp != null)
                        {
                          ((abht)paramQQAppInterface.getManager(227)).a(1, paramArrayOfByte);
                          break label3425;
                          if (QLog.isColorLevel()) {
                            QLog.d("TroopTipsMsgMgr", 2, "recv action push message, [troop]");
                          }
                          if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_goldtips.has())
                          {
                            paramQQAppInterface = (TroopTips0x857.GoldMsgTipsElem)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_goldtips.get();
                            if ((paramQQAppInterface.type.has()) && (paramQQAppInterface.type.get() == 3))
                            {
                              aaca.a(1, (TroopTips0x857.GoldMsgTipsElem)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_goldtips.get(), null);
                              break label3425;
                              if (QLog.isColorLevel()) {
                                QLog.d("TroopTipsMsgMgr", 2, "recv miniAppNotify");
                              }
                              paramBoolean1 = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_miniapp_notify.has();
                              if (paramBoolean1)
                              {
                                try
                                {
                                  paramQQAppInterface = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_miniapp_notify.bytes_msg.get().toByteArray();
                                  paramArrayOfByte = new GroupOpenSysMsg.SysMsgBody();
                                  paramArrayOfByte.mergeFrom(paramQQAppInterface);
                                  a(paramArrayOfByte, (TroopTipsEntity)localObject2);
                                }
                                catch (InvalidProtocolBufferMicroException paramQQAppInterface)
                                {
                                  if (!QLog.isColorLevel()) {
                                    break label3425;
                                  }
                                }
                                QLog.d("TroopTipsMsgMgr", 2, "parse miniAppNotify error");
                                break label3425;
                                if (QLog.isColorLevel()) {
                                  QLog.d("TroopTipsMsgMgr", 2, "recv RecvMsgSetChanged");
                                }
                                if (paramQQAppInterface != null)
                                {
                                  ((acms)paramQQAppInterface.getBusinessHandler(20)).a(String.valueOf(l1), false, "", false, true, false, true);
                                  break label3425;
                                  if (QLog.isColorLevel()) {
                                    QLog.d("TroopTipsMsgMgr", 2, "recv Prompt_TroopFormGrayTips");
                                  }
                                  QLog.d("TroopTipsMsgMgr", 1, "troopFormLog receive Prompt_TroopFormGray");
                                  if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_troopformtips_push.has())
                                  {
                                    aobw.a(paramQQAppInterface, (TroopTips0x857.TroopFormGrayTipsInfo)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_troopformtips_push.get(), ((TroopTipsEntity)localObject2).troopUin);
                                    break label3425;
                                    if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_media_push.has())
                                    {
                                      ainz.a(paramQQAppInterface, paramInt, paramLong, (TroopTips0x857.MediaChangePushInfo)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_media_push.get());
                                    }
                                    else
                                    {
                                      QLog.d("ListenTogether", 1, "notifyMsgBody.opt_msg_media_push miss");
                                      break label3425;
                                      paramBoolean1 = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_general_gray_tip.has();
                                      if (paramBoolean1)
                                      {
                                        try
                                        {
                                          parama = (TroopTips0x857.GeneralGrayTipInfo)((TroopTips0x857.NotifyMsgBody)localObject1).opt_general_gray_tip.get();
                                          if (parama.uint64_busi_type.has())
                                          {
                                            l1 = parama.uint64_busi_type.get();
                                            if (!parama.uint64_busi_id.has()) {
                                              break label2871;
                                            }
                                            l2 = parama.uint64_busi_id.get();
                                            if (!parama.uint32_ctrl_flag.has()) {
                                              break label2877;
                                            }
                                            paramInt = parama.uint32_ctrl_flag.get();
                                            if (parama.uint32_c2c_type.has()) {
                                              parama.uint32_c2c_type.get();
                                            }
                                            if (parama.uint32_service_type.has()) {
                                              parama.uint32_service_type.get();
                                            }
                                            if (!parama.bytes_pb_reserv.has()) {
                                              break label2882;
                                            }
                                            paramArrayOfByte = parama.bytes_pb_reserv.get().toByteArray();
                                            if (!parama.bytes_content.has()) {
                                              break label2887;
                                            }
                                            parama = parama.bytes_content.get().toByteArray();
                                            localObject1 = "";
                                            if ((parama == null) || (parama.length <= 0)) {
                                              break label2893;
                                            }
                                            parama = new String(parama, "utf-8");
                                            paramInt = ahwb.hW(paramInt);
                                            paramArrayOfByte = ahwb.a(paramQQAppInterface, ((TroopTipsEntity)localObject2).troopUin, 1, paramInt, paramLong, parama, l1, l2, paramArrayOfByte);
                                            if (paramArrayOfByte == null) {
                                              break label3425;
                                            }
                                            paramArrayOfByte.saveExtInfoToExtStr("uint64_busi_type", String.valueOf(l1));
                                            paramArrayOfByte.saveExtInfoToExtStr("uint64_busi_id", String.valueOf(l2));
                                            paramArrayOfByte.saveExtInfoToExtStr("bytes_content", parama);
                                            anot.a(paramQQAppInterface, "CliOper", "", "", "0X800A560", "0X800A560", 3, 0, "" + l2, "" + l1, "", "");
                                            ahwb.a(paramQQAppInterface, paramArrayOfByte);
                                          }
                                        }
                                        catch (NullPointerException paramQQAppInterface)
                                        {
                                          while (QLog.isColorLevel())
                                          {
                                            QLog.e("TroopTipsMsgMgr", 2, "handleC2COnlinePushMsgGrayTipResp fail2 ", paramQQAppInterface);
                                            break;
                                            l1 = 0L;
                                            continue;
                                            l2 = 0L;
                                            continue;
                                            paramInt = 0;
                                            continue;
                                            paramArrayOfByte = null;
                                            continue;
                                            parama = null;
                                            continue;
                                            parama = (anbw.a)localObject1;
                                            if (QLog.isColorLevel())
                                            {
                                              QLog.e("TroopTipsMsgMgr", 2, "handleC2COnlinePushMsgGrayTipResp fail content is null");
                                              parama = (anbw.a)localObject1;
                                            }
                                          }
                                        }
                                        catch (UnsupportedEncodingException paramQQAppInterface)
                                        {
                                          label2871:
                                          label2877:
                                          label2882:
                                          label2887:
                                          label2893:
                                          if (!QLog.isColorLevel()) {
                                            break label3425;
                                          }
                                        }
                                        QLog.e("TroopTipsMsgMgr", 2, "handleC2COnlinePushMsgGrayTipResp fail3 ", paramQQAppInterface);
                                      }
                                      else
                                      {
                                        QLog.d("ListenTogether", 1, "notifyMsgBody.opt_msg_media_push miss");
                                        break label3425;
                                        if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_video_push.has())
                                        {
                                          paramArrayOfByte = ((aohy)paramQQAppInterface.getManager(339)).a(2);
                                          if (paramArrayOfByte != null) {
                                            paramArrayOfByte.a(paramQQAppInterface, paramInt, paramLong, ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_video_push.get());
                                          }
                                        }
                                        else
                                        {
                                          QLog.d("WatchTogetherParser", 2, "notifyMsgBody.opt_msg_video_push miss");
                                          break label3425;
                                          if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_sing_push.has())
                                          {
                                            paramArrayOfByte = ((aohy)paramQQAppInterface.getManager(339)).a(4);
                                            if (paramArrayOfByte != null) {
                                              paramArrayOfByte.a(paramQQAppInterface, paramInt, paramLong, ((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_sing_push.get());
                                            }
                                          }
                                          else
                                          {
                                            QLog.d("WatchTogetherParser", 2, "notifyMsgBody.opt_msg_sing_push miss");
                                            break label3425;
                                            paramLong = ((TroopTips0x857.NotifyMsgBody)localObject1).opt_uint64_group_code.get();
                                            paramQQAppInterface = (TroopTips0x857.GroupInfoChange)((TroopTips0x857.NotifyMsgBody)localObject1).opt_msg_group_info_change.get();
                                            if ((paramQQAppInterface != null) && (paramQQAppInterface.uint32_group_honor_switch.has()))
                                            {
                                              paramInt = paramQQAppInterface.uint32_group_honor_switch.get();
                                              if (QLog.isColorLevel()) {
                                                QLog.d("TroopHonor.push", 2, String.format("aio switch push, groupCode: %s, switch: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) }));
                                              }
                                              paramQQAppInterface = (apmb)this.mApp.getManager(346);
                                              if (paramInt != 0) {
                                                break label3429;
                                              }
                                              paramBoolean1 = true;
                                              paramQQAppInterface.aF(String.valueOf(paramLong), paramBoolean1);
                                              break label3425;
                                              aird.a(paramQQAppInterface, paramInt, paramLong, (TroopTips0x857.NotifyMsgBody)localObject1);
                                              break label3425;
                                              if (((TroopTips0x857.NotifyMsgBody)localObject1).opt_group_announce_tbc_info.has())
                                              {
                                                parama = (TroopTips0x857.GroupAnnounceTBCInfo)((TroopTips0x857.NotifyMsgBody)localObject1).opt_group_announce_tbc_info.get();
                                                if (parama != null) {
                                                  if (!parama.feeds_id.has()) {
                                                    break label3438;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label3418:
    label3421:
    label3423:
    label3425:
    label3427:
    label3429:
    label3438:
    for (paramArrayOfByte = parama.feeds_id.get().toStringUtf8();; paramArrayOfByte = null)
    {
      paramLong = parama.group_id.get();
      paramInt = parama.action.get();
      switch (paramInt)
      {
      case 0: 
        aptr.r(paramQQAppInterface, paramArrayOfByte, String.valueOf(paramLong), 1);
        break;
      case 1: 
      case 2: 
        paramQQAppInterface = new JSONObject();
        try
        {
          paramQQAppInterface.put("fid", paramArrayOfByte);
          paramQQAppInterface.put("gc", String.valueOf(paramLong));
          paramQQAppInterface.put("action", String.valueOf(paramInt));
          try
          {
            ArkAppCenter.f("com.tencent.mannounce", "UpdateAnnounce", paramQQAppInterface.toString(), "json");
          }
          catch (UnsatisfiedLinkError paramQQAppInterface)
          {
            QLog.e("TroopTipsMsgMgr", 1, "Error: troop arkNotify com.tencent.mannounce error. UpdateAnnounce.", paramQQAppInterface);
          }
        }
        catch (JSONException paramArrayOfByte)
        {
          for (;;)
          {
            QLog.e("TroopTipsMsgMgr", 1, "jsonObj.put", paramArrayOfByte);
          }
        }
        paramLong = 0L;
        break label1172;
        break;
        return null;
        return null;
      default: 
        for (;;)
        {
          return null;
          return null;
          paramBoolean1 = false;
          break;
        }
      }
    }
  }
  
  public void a(apuf.a parama)
  {
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "addWalletTipsCache");
    }
    this.Cr.add(parama);
  }
  
  public void a(TroopTipsEntity paramTroopTipsEntity)
  {
    int i = 0;
    if ((paramTroopTipsEntity == null) || (paramTroopTipsEntity.optContent == null)) {
      if (QLog.isColorLevel()) {
        QLog.e("TroopTipsMsgMgr", 2, "decodeContent ===> entity == null || content == null");
      }
    }
    JSONArray localJSONArray;
    label1154:
    do
    {
      return;
      Matcher localMatcher = Pattern.compile("<([^>])+").matcher(paramTroopTipsEntity.optContent);
      paramTroopTipsEntity.highlightNum = 0;
      localJSONArray = new JSONArray();
      Object localObject1 = "";
      int j = 0;
      String str2;
      for (;;)
      {
        if (!localMatcher.find()) {
          break label1154;
        }
        j += 1;
        paramTroopTipsEntity.highlightNum = j;
        if (QLog.isColorLevel()) {
          QLog.d("TroopTipsMsgMgr", 2, "match count=====>" + j);
        }
        int m = localMatcher.start();
        int k = localMatcher.end();
        String str1 = paramTroopTipsEntity.optContent.substring(m + 1, k);
        str2 = paramTroopTipsEntity.optContent.substring(i, m);
        localObject1 = (String)localObject1 + str2;
        m = ((String)localObject1).length();
        i = k + 1;
        for (;;)
        {
          try
          {
            localStringBuilder = new StringBuilder();
            localJSONObject = new JSONObject(str1);
            localJSONObject.put("startIndex", m);
            if (localJSONObject.has("uin"))
            {
              str1 = localJSONObject.get("uin").toString();
              str2 = ((TroopManager)this.mApp.getManager(52)).getTroopMemberName(paramTroopTipsEntity.troopUin, str1);
              if (str2 == null) {
                continue;
              }
              str1 = (String)localObject1 + str2;
              localObject1 = str1;
            }
          }
          catch (JSONException localJSONException2)
          {
            StringBuilder localStringBuilder;
            JSONObject localJSONObject;
            boolean bool;
            String str3;
            Object localObject2;
            continue;
            Object localObject4 = localObject2;
            continue;
            localObject4 = localObject2;
            continue;
            localObject4 = localObject2;
            continue;
          }
          try
          {
            localJSONObject.put("endIndex", str2.length() + m);
            localObject1 = str1;
            localStringBuilder.append("text==>");
            localObject1 = str1;
            localStringBuilder.append(str2);
            localObject1 = str1;
            bool = localJSONObject.has("cmd");
            if (bool) {
              localObject1 = str1;
            }
          }
          catch (JSONException localJSONException1) {}
          try
          {
            k = Integer.parseInt(localJSONObject.get("cmd").toString());
            localObject1 = str1;
            localJSONObject.put("cmd", k);
            localObject1 = str1;
            localStringBuilder.append(",cmd==>");
            localObject1 = str1;
            localStringBuilder.append(k);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localObject2 = localObject3;
            if (!QLog.isColorLevel()) {
              continue;
            }
            localObject2 = localObject3;
            QLog.e("TroopTipsMsgMgr", 2, "decodeContent==>NumberFormatException");
            continue;
            localObject2 = str2;
            localJSONArray.put(localJSONObject);
            localObject2 = str2;
            Object localObject3 = str2;
            if (!QLog.isColorLevel()) {
              continue;
            }
            localObject2 = str2;
            QLog.d("TroopTipsMsgMgr", 2, "decodeContent==>" + localStringBuilder.toString());
            localObject3 = str2;
            continue;
          }
          localObject1 = str1;
          if (localJSONObject.has("textColor"))
          {
            localObject1 = str1;
            str2 = localJSONObject.getString("textColor");
            localObject1 = str1;
            localJSONObject.put("textColor", str2);
            localObject1 = str1;
            localStringBuilder.append(",textColor==>");
            localObject1 = str1;
            localStringBuilder.append(str2);
          }
          localObject1 = str1;
          if (localJSONObject.has("data"))
          {
            localObject1 = str1;
            str2 = localJSONObject.get("data").toString();
            localObject1 = str1;
            localJSONObject.put("data", str2);
            localObject1 = str1;
            localStringBuilder.append(",data==>");
            localObject1 = str1;
            localStringBuilder.append(str2);
          }
          localObject1 = str1;
          if (localJSONObject.has("data_a"))
          {
            localObject1 = str1;
            str2 = localJSONObject.get("data_a").toString();
            localObject1 = str1;
            localJSONObject.put("data_a", str2);
            localObject1 = str1;
            localStringBuilder.append(",data_a==>");
            localObject1 = str1;
            localStringBuilder.append(str2);
          }
          localObject1 = str1;
          if (localJSONObject.has("url"))
          {
            localObject1 = str1;
            str2 = localJSONObject.get("url").toString();
            localObject1 = str1;
            localJSONObject.put("url", str2);
            localObject1 = str1;
            localStringBuilder.append(",url:");
            localObject1 = str1;
            localStringBuilder.append(str2);
          }
          localObject1 = str1;
          if (localJSONObject.has("icon"))
          {
            localObject1 = str1;
            str2 = localJSONObject.get("icon").toString();
            localObject1 = str1;
            localJSONObject.put("icon", str2);
            localObject1 = str1;
            localStringBuilder.append(",icon:");
            localObject1 = str1;
            localStringBuilder.append(str2);
          }
          localObject1 = str1;
          str2 = str1;
          if (!localJSONObject.has("alt")) {
            continue;
          }
          localObject1 = str1;
          str3 = localJSONObject.get("alt").toString();
          str2 = str1;
          if (str3 == null) {
            continue;
          }
          localObject1 = str1;
          str2 = "[" + str3 + "]";
          localObject1 = str1;
          str1 = str1 + str2;
          localObject1 = str1;
          localJSONObject.put("endIndex", m + str2.length());
          localObject1 = str1;
          localStringBuilder.append(",alt:");
          localObject1 = str1;
          localStringBuilder.append(str2);
          localObject1 = str1;
          bool = paramTroopTipsEntity.isSupportImage;
          str2 = str1;
          if (bool) {
            continue;
          }
          localObject1 = str1;
          break;
          if (!localJSONObject.has("text")) {
            continue;
          }
          str2 = localJSONObject.get("text").toString();
          if (str2 == null) {
            continue;
          }
          str1 = (String)localObject1 + str2;
          localObject1 = str1;
          localJSONObject.put("endIndex", str2.length() + m);
          localObject1 = str1;
          localStringBuilder.append("text==>");
          localObject1 = str1;
          localStringBuilder.append(str2);
        }
        localObject3 = localObject1;
        if (QLog.isColorLevel())
        {
          QLog.e("TroopTipsMsgMgr", 2, "decodeContent:JSONException");
          localObject3 = localObject1;
        }
        localObject1 = localObject3;
      }
      paramTroopTipsEntity.optContent = (localObject2 + paramTroopTipsEntity.optContent.substring(i, paramTroopTipsEntity.optContent.length()));
    } while (paramTroopTipsEntity.highlightNum == 0);
    paramTroopTipsEntity.highlightItems = localJSONArray.toString();
  }
  
  public MessageForGrayTips b(TroopTipsEntity paramTroopTipsEntity)
  {
    if (paramTroopTipsEntity == null) {
      return null;
    }
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "decodeTroopTipsEntity2GrayTips,entity:" + paramTroopTipsEntity.toString());
    }
    if (paramTroopTipsEntity.grayTipsRemindFlag != 0) {}
    for (int i = -2042;; i = 2024)
    {
      MessageForGrayTips localMessageForGrayTips = (MessageForGrayTips)anbi.d(2024);
      localMessageForGrayTips.frienduin = paramTroopTipsEntity.troopUin;
      localMessageForGrayTips.init(this.mApp.getCurrentAccountUin(), paramTroopTipsEntity.troopUin, paramTroopTipsEntity.troopUin, paramTroopTipsEntity.optContent, paramTroopTipsEntity.time, i, paramTroopTipsEntity.uinType, paramTroopTipsEntity.msgSeq);
      if (paramTroopTipsEntity.highlightNum != 0) {
        a(localMessageForGrayTips, paramTroopTipsEntity.highlightItems);
      }
      if (paramTroopTipsEntity.optShowLatest == 1) {
        localMessageForGrayTips.shmsgseq = 0L;
      }
      localMessageForGrayTips.isread = true;
      localMessageForGrayTips.saveExtInfoToExtStr("gray_tips_serviceType", String.valueOf(paramTroopTipsEntity.serviceType));
      return localMessageForGrayTips;
    }
  }
  
  public void b(QQAppInterface paramQQAppInterface, TroopTipsEntity paramTroopTipsEntity)
  {
    if (paramTroopTipsEntity == null) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "saveTroopTips");
    }
    EntityManager localEntityManager = paramQQAppInterface.a().createEntityManager();
    paramTroopTipsEntity.read = false;
    paramTroopTipsEntity.currentUin = paramQQAppInterface.getCurrentAccountUin();
    jdMethod_if(paramTroopTipsEntity.troopUin, paramTroopTipsEntity.msgSeq + "");
    localEntityManager.persist(paramTroopTipsEntity);
    localEntityManager.close();
  }
  
  public List<TroopTipsEntity> ba(String paramString)
  {
    if (paramString == null) {}
    Object localObject;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    do
    {
      return null;
      localObject = this.mApp.a().createEntityManager();
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      paramString = ((EntityManager)localObject).query(TroopTipsEntity.class, true, "troopUin=? and read=? and currentUin=?", new String[] { paramString, "0", this.mApp.getCurrentAccountUin() }, null, null, "time ASC", null);
      ((EntityManager)localObject).close();
    } while (paramString == null);
    int i = 0;
    if (i < paramString.size())
    {
      localObject = (TroopTipsEntity)paramString.get(i);
      if ((((TroopTipsEntity)localObject).expireTime != 0L) && (NetConnInfoCenter.getServerTime() >= ((TroopTipsEntity)localObject).expireTime)) {}
      for (;;)
      {
        i += 1;
        break;
        if (((TroopTipsEntity)localObject).optShowLatest == 1) {
          localArrayList2.add(localObject);
        } else {
          localArrayList1.add(localObject);
        }
      }
    }
    localArrayList1.addAll(localArrayList2);
    return localArrayList1;
  }
  
  public void bb(QQAppInterface paramQQAppInterface, String paramString)
  {
    if ((paramQQAppInterface == null) || (paramString == null)) {}
    for (;;)
    {
      return;
      List localList = ba(paramString);
      if ((localList != null) && (localList.size() != 0))
      {
        Object localObject = new SparseIntArray();
        int i = localList.size() - 1;
        if (i >= 0)
        {
          TroopTipsEntity localTroopTipsEntity = (TroopTipsEntity)localList.get(i);
          if ((localTroopTipsEntity.repeatInterval > 0) && (((SparseIntArray)localObject).get(localTroopTipsEntity.serviceType, 0) > 0))
          {
            ig(localTroopTipsEntity.troopUin, localTroopTipsEntity.msgSeq + "");
            localList.remove(localTroopTipsEntity);
          }
          for (;;)
          {
            i -= 1;
            break;
            ((SparseIntArray)localObject).put(localTroopTipsEntity.serviceType, ((SparseIntArray)localObject).get(localTroopTipsEntity.serviceType, 0) + 1);
          }
        }
        if (localList.size() > 0)
        {
          paramQQAppInterface = paramQQAppInterface.a(1).h(paramString, 1);
          int j;
          label202:
          int k;
          label245:
          int m;
          if (paramQQAppInterface == null)
          {
            i = 0;
            j = localList.size() - 1;
            if ((j < 0) || (i <= 0)) {
              break label426;
            }
            paramString = (TroopTipsEntity)localList.get(j);
            if (paramString.repeatInterval > 0)
            {
              if (paramString.repeatInterval >= i) {
                break label406;
              }
              k = paramString.repeatInterval;
              m = 0;
            }
          }
          for (;;)
          {
            if (m < k)
            {
              localObject = (MessageRecord)paramQQAppInterface.get(i - k + m);
              if ((((MessageRecord)localObject).msgtype != 2024) || (!String.valueOf(paramString.serviceType).equals(((MessageRecord)localObject).getExtInfoFromExtStr("gray_tips_serviceType")))) {
                break label417;
              }
              ig(paramString.troopUin, paramString.msgSeq + "");
              localList.remove(j);
              if (QLog.isColorLevel()) {
                QLog.i("TroopTipsMsgMgr", 2, String.format("addGrayTipsIntoMessageListIfNeeded discard seq:%s interval:%d", new Object[] { Long.valueOf(paramString.msgSeq), Integer.valueOf(paramString.repeatInterval) }));
              }
            }
            j -= 1;
            break label202;
            i = paramQQAppInterface.size();
            break;
            label406:
            k = paramQQAppInterface.size();
            break label245;
            label417:
            m += 1;
          }
        }
        label426:
        paramQQAppInterface = localList.iterator();
        while (paramQQAppInterface.hasNext()) {
          a((TroopTipsEntity)paramQQAppInterface.next());
        }
      }
    }
  }
  
  public void eq(QQAppInterface paramQQAppInterface)
  {
    if (this.Cr.isEmpty()) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "handleWalletTipsCache, size: " + this.Cr.size());
    }
    Iterator localIterator = this.Cr.iterator();
    while (localIterator.hasNext())
    {
      apuf.a locala = (apuf.a)localIterator.next();
      TroopTips0x857.RedGrayTipsInfo localRedGrayTipsInfo = locala.a;
      String str = paramQQAppInterface.getCurrentAccountUin();
      MessageForQQWalletTips localMessageForQQWalletTips = (MessageForQQWalletTips)anbi.d(-2029);
      localMessageForQQWalletTips.senderUin = (localRedGrayTipsInfo.uint64_sender_uin.get() + "");
      localMessageForQQWalletTips.reciverUin = (localRedGrayTipsInfo.uint64_receiver_uin.get() + "");
      localMessageForQQWalletTips.senderContent = localRedGrayTipsInfo.bytes_sender_rich_content.get().toStringUtf8();
      localMessageForQQWalletTips.reciverContent = localRedGrayTipsInfo.bytes_receiver_rich_content.get().toStringUtf8();
      localMessageForQQWalletTips.authKey = localRedGrayTipsInfo.bytes_authkey.get().toStringUtf8();
      localMessageForQQWalletTips.idiomSeq = localRedGrayTipsInfo.uint32_idiom_seq.get();
      localMessageForQQWalletTips.idiom = localRedGrayTipsInfo.bytes_idiom.get().toStringUtf8();
      localMessageForQQWalletTips.msgType = localRedGrayTipsInfo.sint32_msgtype.get();
      localMessageForQQWalletTips.richContent = localRedGrayTipsInfo.bytes_broadcast_rich_content.get().toStringUtf8();
      localMessageForQQWalletTips.lastPinyin = localRedGrayTipsInfo.bytes_idiom_alpha.get().toStringUtf8();
      localMessageForQQWalletTips.bytes_jumpurl = localRedGrayTipsInfo.bytes_jumpurl.get().toStringUtf8();
      localMessageForQQWalletTips.subChannel = localRedGrayTipsInfo.uint32_subchannel.get();
      localMessageForQQWalletTips.init(this.mApp.getCurrentAccountUin(), locala.troopUin, "", "[QQWallet Tips]", anaz.gQ(), -2029, 1, anaz.gQ());
      localMessageForQQWalletTips.isread = true;
      localMessageForQQWalletTips.getBytes();
      localMessageForQQWalletTips.onReceiveGrapTips();
      paramQQAppInterface.b().b(localMessageForQQWalletTips, str);
    }
    this.Cr.clear();
  }
  
  public void er(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("TroopTipsMsgMgr", 2, "initTroopTipsFlag");
    }
    oH.clear();
    EntityManager localEntityManager = paramQQAppInterface.a().createEntityManager();
    Cursor localCursor = localEntityManager.query(true, TroopTipsEntity.class.getSimpleName(), new String[] { "troopUin" }, "read=?", new String[] { String.valueOf(0) }, "troopUin", null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          int i = localCursor.getColumnIndex("troopUin");
          if (i == -1) {
            break label232;
          }
          paramQQAppInterface = localCursor.getString(i);
          i = localCursor.getColumnIndex("msgSeq");
          if (i == -1) {
            break label226;
          }
          str = localCursor.getString(i);
          if ((paramQQAppInterface != null) && (str != null)) {
            jdMethod_if(paramQQAppInterface, str);
          }
          boolean bool = localCursor.moveToNext();
          if (bool) {
            continue;
          }
        }
      }
      catch (Exception paramQQAppInterface)
      {
        paramQQAppInterface.printStackTrace();
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("TroopTipsMsgMgr", 2, "initTroopTipsFlag Exception");
        localCursor.close();
        continue;
      }
      finally
      {
        localCursor.close();
      }
      localEntityManager.close();
      return;
      label226:
      String str = null;
      continue;
      label232:
      paramQQAppInterface = null;
    }
  }
  
  public void onDestroy() {}
  
  public boolean qZ(String paramString)
  {
    return !oH.isEmpty();
  }
  
  class a
  {
    TroopTips0x857.RedGrayTipsInfo a;
    String troopUin;
    
    public a(String paramString, TroopTips0x857.RedGrayTipsInfo paramRedGrayTipsInfo)
    {
      this.troopUin = paramString;
      this.a = paramRedGrayTipsInfo;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.tim\classes4.jar
 * Qualified Name:     apuf
 * JD-Core Version:    0.7.0.1
 */