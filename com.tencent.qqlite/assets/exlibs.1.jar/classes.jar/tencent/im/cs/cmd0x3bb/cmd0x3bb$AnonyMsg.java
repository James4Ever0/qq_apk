package tencent.im.cs.cmd0x3bb;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x3bb$AnonyMsg
  extends MessageMicro
{
  public static final int MSG_ANONY_REQ_FIELD_NUMBER = 10;
  public static final int MSG_ANONY_RSP_FIELD_NUMBER = 11;
  public static final int UINT32_CMD_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 82, 90 }, new String[] { "uint32_cmd", "msg_anony_req", "msg_anony_rsp" }, new Object[] { Integer.valueOf(0), null, null }, AnonyMsg.class);
  public cmd0x3bb.ReqBody msg_anony_req = new cmd0x3bb.ReqBody();
  public cmd0x3bb.RspBody msg_anony_rsp = new cmd0x3bb.RspBody();
  public final PBUInt32Field uint32_cmd = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.cs.cmd0x3bb.cmd0x3bb.AnonyMsg
 * JD-Core Version:    0.7.0.1
 */