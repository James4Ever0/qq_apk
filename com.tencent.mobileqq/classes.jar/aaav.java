import android.os.Bundle;
import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.message.BaseMessageProcessor.RequestBuilder;
import com.tencent.mobileqq.app.message.UncommonMessageProcessor;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.service.message.MessageConstants;
import com.tencent.mobileqq.service.message.MessageUtils;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.QLog;
import msf.msgsvc.msg_svc.PbSendMsgReq;

public class aaav
  implements BaseMessageProcessor.RequestBuilder
{
  public aaav(UncommonMessageProcessor paramUncommonMessageProcessor, MessageRecord paramMessageRecord, boolean paramBoolean, msg_svc.PbSendMsgReq paramPbSendMsgReq) {}
  
  public ToServiceMsg a()
  {
    long l = System.currentTimeMillis();
    ToServiceMsg localToServiceMsg = this.jdField_a_of_type_ComTencentMobileqqAppMessageUncommonMessageProcessor.a.a("MessageSvc.PbMultiMsgSend");
    localToServiceMsg.extraData.putLong("uniseq", this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq);
    localToServiceMsg.extraData.putInt("msgtype", this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgtype);
    localToServiceMsg.extraData.putBoolean(MessageConstants.h, this.jdField_a_of_type_Boolean);
    localToServiceMsg.extraData.putLong("key_msg_info_time_start", l);
    localToServiceMsg.putWupBuffer(this.jdField_a_of_type_MsfMsgsvcMsg_svc$PbSendMsgReq.toByteArray());
    localToServiceMsg.setTimeout(15000L);
    localToServiceMsg.setEnableFastResend(true);
    if (QLog.isColorLevel())
    {
      int i = MessageUtils.a(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgUid);
      QLog.d("Q.msg.UncommonMessageProcessor", 2, "sendBlessMsg,  mr_uniseq:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq + " msgSeq:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgseq + " mr_shMsgseq:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.shmsgseq + " mr_msgUid:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgUid + " random:" + i + " isRedBagVideo:" + this.jdField_a_of_type_Boolean);
    }
    return localToServiceMsg;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     aaav
 * JD-Core Version:    0.7.0.1
 */