package tencent.im.s2c.msgtype0x210.submsgtype0x27;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class SubMsgType0x27$ModFrdRoamPriv
  extends MessageMicro
{
  public static final int RPT_MSG_ROAM_PRIV_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rpt_msg_roam_priv" }, new Object[] { null }, ModFrdRoamPriv.class);
  public final PBRepeatMessageField rpt_msg_roam_priv = PBField.initRepeatMessage(SubMsgType0x27.OneRoamPriv.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0x27.SubMsgType0x27.ModFrdRoamPriv
 * JD-Core Version:    0.7.0.1
 */