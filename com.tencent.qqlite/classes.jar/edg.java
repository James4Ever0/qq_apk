import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.qq.jce.wup.UniPacket;
import com.tencent.common.app.BaseProtocolCoder;
import com.tencent.mobileqq.app.BusinessHandler;
import com.tencent.mobileqq.app.Cmd2HandlerMap;
import com.tencent.mobileqq.app.NotificationDeleteReceiver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.compatible.TempServlet;
import com.tencent.mobileqq.msf.sdk.SettingCloneUtil;
import com.tencent.mobileqq.service.MobileQQService;
import com.tencent.mobileqq.utils.httputils.PkgTools;
import com.tencent.mobileqq.utils.kapalaiadapter.KapalaiAdapterUtil;
import com.tencent.mobileqq.utils.kapalaiadapter.MobileIssueSettings;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.util.Map;
import mqq.app.NewIntent;

public class edg
  implements Runnable
{
  public edg(MobileQQService paramMobileQQService, ToServiceMsg paramToServiceMsg) {}
  
  private PendingIntent a()
  {
    Intent localIntent = new Intent(BaseApplication.getContext(), NotificationDeleteReceiver.class);
    return PendingIntent.getBroadcast(BaseApplication.getContext(), 0, localIntent, 268435456);
  }
  
  private void a(ToServiceMsg paramToServiceMsg)
  {
    String[] arrayOfString = paramToServiceMsg.extraData.getStringArray("cmds");
    if (arrayOfString.length != 3) {
      return;
    }
    Bitmap localBitmap = (Bitmap)paramToServiceMsg.extraData.getParcelable("bitmap");
    paramToServiceMsg = (Intent)paramToServiceMsg.extraData.getParcelable("intent");
    paramToServiceMsg = MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService, paramToServiceMsg, localBitmap, arrayOfString[1], arrayOfString[2]);
    paramToServiceMsg.flags = 34;
    this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a();
    if (MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService) != null) {
      MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).cancel(121);
    }
    this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a(119, paramToServiceMsg);
  }
  
  private void b(ToServiceMsg paramToServiceMsg)
  {
    String[] arrayOfString = paramToServiceMsg.extraData.getStringArray("cmds");
    if (arrayOfString.length != 3) {
      return;
    }
    Intent localIntent = (Intent)paramToServiceMsg.extraData.getParcelable("intent");
    Bitmap localBitmap = (Bitmap)paramToServiceMsg.extraData.getParcelable("bitmap");
    if (!MobileIssueSettings.e)
    {
      paramToServiceMsg = KapalaiAdapterUtil.a().a(localIntent, localBitmap, arrayOfString[0], arrayOfString[1], arrayOfString[2], MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService), MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService));
      paramToServiceMsg.deleteIntent = a();
      this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a();
      if (!SettingCloneUtil.readValue(BaseApplication.getContext(), MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).a(), BaseApplication.getContext().getString(2131363278), "qqsetting_notify_showcontent_key", true)) {
        break label336;
      }
      if (MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService) != null)
      {
        MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).cancel(121);
        MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).cancel(119);
      }
      this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a(121, paramToServiceMsg);
    }
    for (;;)
    {
      paramToServiceMsg = new Intent("com.tencent.msg.newmessage");
      paramToServiceMsg.setPackage("com.tencent.qqlite");
      paramToServiceMsg.putExtra("cmds", arrayOfString);
      paramToServiceMsg.putExtra("intent", localIntent);
      paramToServiceMsg.putExtra("type", 0);
      MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).a().sendBroadcast(paramToServiceMsg);
      return;
      if (MobileIssueSettings.m)
      {
        Notification localNotification = MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService, localIntent, null, arrayOfString[0], arrayOfString[1], arrayOfString[2]);
        int i = MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).a("icon");
        paramToServiceMsg = localNotification;
        if (i <= 0) {
          break;
        }
        paramToServiceMsg = localNotification;
        if (localNotification.contentView == null) {
          break;
        }
        localNotification.contentView.setImageViewBitmap(i, localBitmap);
        paramToServiceMsg = localNotification;
        break;
      }
      paramToServiceMsg = MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService, localIntent, localBitmap, arrayOfString[0], arrayOfString[1], arrayOfString[2]);
      break;
      label336:
      if (MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService) != null)
      {
        MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).cancel(121);
        MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).cancel(119);
      }
      this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a(121, paramToServiceMsg);
    }
  }
  
  public void run()
  {
    Object localObject1 = null;
    int k = 1;
    if (QLog.isColorLevel()) {
      QLog.d("MobileQQService", 2, "req cmd: " + this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd());
    }
    try
    {
      if ("CMD_SHOW_NOTIFIYCATION".equals(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd()))
      {
        b(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg);
        return;
      }
      if (!"CMD_IDLE_NOTIFIYCATION".equals(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd())) {
        break label206;
      }
      MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).A();
      a(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg);
      return;
    }
    catch (Exception localException1)
    {
      localException1.printStackTrace();
      if (!QLog.isColorLevel()) {
        break label161;
      }
    }
    Object localObject3 = new StringBuilder().append("handleRequest Exception. cmd=");
    label161:
    label206:
    boolean bool;
    Object localObject2;
    label397:
    int j;
    int i;
    if (this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg != null)
    {
      localObject1 = this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd();
      QLog.e("MobileQQService", 2, (String)localObject1, localException1);
      localObject1 = new FromServiceMsg(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getUin(), this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd());
      ((FromServiceMsg)localObject1).setMsgFail();
      this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a(false, this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg, (FromServiceMsg)localObject1, localException1);
      return;
      if ("CMD_STOP_NOTIFIYCATION".equals(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd()))
      {
        MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).A();
        this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a(119);
        return;
      }
      if ("CMD_CANCLE_NOTIFIYCATION".equals(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd()))
      {
        this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.b(119);
        return;
      }
      bool = this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.extraData.getBoolean("req_pb_protocol_flag", false);
      long l;
      if (bool)
      {
        if (this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getWupBuffer() == null) {
          break label800;
        }
        l = this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getWupBuffer().length;
        localObject2 = new byte[(int)l + 4];
        PkgTools.a((byte[])localObject2, 0, 4L + l);
        PkgTools.a((byte[])localObject2, 4, this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getWupBuffer(), (int)l);
        this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.putWupBuffer((byte[])localObject2);
        if (!QLog.isColorLevel()) {
          break label808;
        }
        QLog.d("MobileQQService", 2, "PB cmd: req cmd: " + this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd());
        break label808;
      }
      for (;;)
      {
        if (j == 0) {
          break label822;
        }
        this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.actionListener = MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService);
        localObject1 = new NewIntent(MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).getApplication(), TempServlet.class);
        ((NewIntent)localObject1).putExtra(ToServiceMsg.class.getSimpleName(), this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg);
        MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).startServlet((NewIntent)localObject1);
        l = System.currentTimeMillis();
        this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.extraData.putLong("sendtimekey", l);
        return;
        localObject1 = this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService.a(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd());
        if (localObject1 == null) {
          break;
        }
        localObject2 = new UniPacket(true);
        ((UniPacket)localObject2).setEncodeName("utf-8");
        i = MobileQQService.c;
        MobileQQService.c = i + 1;
        ((UniPacket)localObject2).setRequestId(i);
        if (((BaseProtocolCoder)localObject1).a())
        {
          localObject2 = ((BaseProtocolCoder)localObject1).a(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg);
          if (localObject2 == null) {
            break label795;
          }
          this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.putWupBuffer((byte[])localObject2);
          i = 1;
          break label815;
        }
        if (!((BaseProtocolCoder)localObject1).a(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg, (UniPacket)localObject2)) {
          break;
        }
        this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.putWupBuffer(((UniPacket)localObject2).encode());
        j = 1;
        i = 0;
      }
    }
    for (;;)
    {
      label611:
      localObject1 = new FromServiceMsg(MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).a(), this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd());
      localObject2 = (int[])Cmd2HandlerMap.a().get(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg.getServiceCmd());
      if ((localObject2 != null) && (localObject2.length > 0))
      {
        j = localObject2.length;
        i = 0;
        if (i < j)
        {
          k = localObject2[i];
          localObject3 = MobileQQService.a(this.jdField_a_of_type_ComTencentMobileqqServiceMobileQQService).a(k);
          if ((localObject3 == null) || (bool)) {}
          for (;;)
          {
            i += 1;
            break;
            try
            {
              ((BusinessHandler)localObject3).a(this.jdField_a_of_type_ComTencentQphoneBaseRemoteToServiceMsg, (FromServiceMsg)localObject1, null);
            }
            catch (Exception localException2)
            {
              localException2.printStackTrace();
            }
            if (QLog.isColorLevel()) {
              QLog.w("MobileQQService", 2, localObject3.getClass().getSimpleName() + " onReceive error,", localException2);
            }
          }
          localObject1 = "";
          break;
          i = 0;
          j = 0;
          break label397;
          label795:
          i = 0;
          break label815;
          label800:
          i = 0;
          j = 0;
          break label397;
        }
      }
      label808:
      label815:
      label822:
      do
      {
        return;
        j = 1;
        i = 0;
        break;
        j = i;
        i = k;
        break;
        if (bool) {
          break label611;
        }
      } while ((localObject1 == null) || (i != 0));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     edg
 * JD-Core Version:    0.7.0.1
 */