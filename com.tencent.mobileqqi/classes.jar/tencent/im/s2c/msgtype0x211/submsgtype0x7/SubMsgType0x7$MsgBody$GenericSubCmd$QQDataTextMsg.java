package tencent.im.s2c.msgtype0x211.submsgtype0x7;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class SubMsgType0x7$MsgBody$GenericSubCmd$QQDataTextMsg
  extends MessageMicro
{
  public static final int RPT_MSG_ITEM_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rpt_msg_item" }, new Object[] { null }, QQDataTextMsg.class);
  public final PBRepeatMessageField rpt_msg_item = PBField.initRepeatMessage(SubMsgType0x7.MsgBody.GenericSubCmd.QQDataTextMsg.MsgItem.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x211.submsgtype0x7.SubMsgType0x7.MsgBody.GenericSubCmd.QQDataTextMsg
 * JD-Core Version:    0.7.0.1
 */