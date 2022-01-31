import com.tencent.biz.pubaccount.util.ShareStructLongMessageManager;
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageForStructing;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pic.UpCallBack;
import com.tencent.mobileqq.pic.UpCallBack.SendResult;
import com.tencent.mobileqq.service.message.MessageProtoCodec;
import com.tencent.mobileqq.structmsg.AbsStructMsg;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.List;
import tencent.im.msg.im_msg_body.Elem;
import tencent.im.msg.im_msg_body.RichMsg;
import tencent.im.msg.im_msg_body.RichText;
import tencent.im.msg.im_msg_body.Text;

public class mwv
  implements UpCallBack
{
  public mwv(ShareStructLongMessageManager paramShareStructLongMessageManager, MessageRecord paramMessageRecord, QQAppInterface paramQQAppInterface, MessageObserver paramMessageObserver, boolean paramBoolean) {}
  
  public MessageRecord a(im_msg_body.RichText paramRichText)
  {
    return null;
  }
  
  public void a(UpCallBack.SendResult paramSendResult) {}
  
  public void b(UpCallBack.SendResult paramSendResult)
  {
    MessageForStructing localMessageForStructing;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      try
      {
        if (paramSendResult.jdField_a_of_type_Int != 0) {
          break label541;
        }
        if ((this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord instanceof MessageForStructing))
        {
          localMessageForStructing = (MessageForStructing)this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord;
          if (localMessageForStructing.richText != null) {
            break label306;
          }
          localObject1 = MessageProtoCodec.a(localMessageForStructing);
          if (localObject1 == null) {
            break label283;
          }
          localObject2 = ((im_msg_body.RichText)localObject1).elems.get();
          if (QLog.isColorLevel()) {
            QLog.d("ShareStructLongMessageManager", 2, "current uid is" + paramSendResult.c);
          }
          localObject2 = ((List)localObject2).iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          localObject3 = (im_msg_body.Elem)((Iterator)localObject2).next();
          if (((im_msg_body.Elem)localObject3).rich_msg.has())
          {
            ((im_msg_body.Elem)localObject3).rich_msg.bytes_msg_resid.set(ByteStringMicro.copyFrom(paramSendResult.c.getBytes()));
            ((im_msg_body.Elem)localObject3).rich_msg.bytes_template_1.set(ByteStringMicro.EMPTY);
            continue;
          }
        }
        else
        {
          return;
        }
      }
      catch (Exception paramSendResult)
      {
        if (QLog.isColorLevel()) {
          QLog.d("ShareStructLongMessageManager", 2, "upload  msg pack failed, catch exception", paramSendResult);
        }
        this.jdField_a_of_type_ComTencentBizPubaccountUtilShareStructLongMessageManager.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord);
      }
      if ((((im_msg_body.Elem)localObject3).text.has()) && (((im_msg_body.Elem)localObject3).text.str.has()))
      {
        String str = ((im_msg_body.Elem)localObject3).text.str.get().toStringUtf8();
        if (str.length() > 500)
        {
          str = str.substring(0, 500);
          ((im_msg_body.Elem)localObject3).text.str.set(ByteStringMicro.copyFromUtf8(str));
        }
      }
    }
    localMessageForStructing.richText = ((im_msg_body.RichText)localObject1);
    for (;;)
    {
      label283:
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord, this.jdField_a_of_type_ComTencentMobileqqAppMessageObserver, this.jdField_a_of_type_Boolean);
      return;
      label306:
      localObject1 = localMessageForStructing.richText.elems.get();
      if (QLog.isColorLevel()) {
        QLog.d("ShareStructLongMessageManager", 2, "current uid is" + paramSendResult.c);
      }
      if ((localObject1 != null) && (ShareStructLongMessageManager.b(localMessageForStructing.structingMsg)))
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (im_msg_body.Elem)((Iterator)localObject1).next();
          if (((im_msg_body.Elem)localObject2).rich_msg.has())
          {
            ((im_msg_body.Elem)localObject2).rich_msg.bytes_msg_resid.set(ByteStringMicro.copyFrom(paramSendResult.c.getBytes()));
            ((im_msg_body.Elem)localObject2).rich_msg.bytes_template_1.set(ByteStringMicro.EMPTY);
            ((im_msg_body.Elem)localObject2).rich_msg.uint32_service_id.set(localMessageForStructing.structingMsg.mMsgServiceID);
          }
          else if ((((im_msg_body.Elem)localObject2).text.has()) && (((im_msg_body.Elem)localObject2).text.str.has()))
          {
            localObject3 = ((im_msg_body.Elem)localObject2).text.str.get().toStringUtf8();
            if (((String)localObject3).length() > 500)
            {
              localObject3 = ((String)localObject3).substring(0, 500);
              ((im_msg_body.Elem)localObject2).text.str.set(ByteStringMicro.copyFromUtf8((String)localObject3));
            }
          }
        }
      }
    }
    label541:
    if (QLog.isColorLevel()) {
      QLog.d("ShareStructLongMessageManager", 2, "upload  msg pack failed, result.errStr=" + paramSendResult.b + ",result.errStr=" + paramSendResult.jdField_a_of_type_JavaLangString);
    }
    this.jdField_a_of_type_ComTencentBizPubaccountUtilShareStructLongMessageManager.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mwv
 * JD-Core Version:    0.7.0.1
 */