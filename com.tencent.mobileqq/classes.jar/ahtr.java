import com.tencent.biz.pubaccount.PublicAccountReportUtils;
import com.tencent.mobileqq.activity.aio.rebuild.PublicAccountChatPie;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.structmsg.StructMsgForGeneralShare;

class ahtr
  implements Runnable
{
  ahtr(ahtq paramahtq, StructMsgForGeneralShare paramStructMsgForGeneralShare, QQAppInterface paramQQAppInterface) {}
  
  public void run()
  {
    long l = NetConnInfoCenter.getServerTime();
    if (PublicAccountChatPie.a(this.jdField_a_of_type_ComTencentMobileqqStructmsgStructMsgForGeneralShare.uin, this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface)) {}
    for (int i = 1;; i = 0)
    {
      PublicAccountReportUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", this.jdField_a_of_type_ComTencentMobileqqStructmsgStructMsgForGeneralShare.uin, "0X80055C7", "0X80055C7", 0, 0, Long.toString(l), Long.toString(this.jdField_a_of_type_ComTencentMobileqqStructmsgStructMsgForGeneralShare.msgId), this.jdField_a_of_type_ComTencentMobileqqStructmsgStructMsgForGeneralShare.mMsgAction, Integer.toString(i), false);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     ahtr
 * JD-Core Version:    0.7.0.1
 */