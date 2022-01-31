package tencent.im.oidb;

import appoint.define.appoint_define.AppointID;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x7db$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24, 34 }, new String[] { "msg_appoint_id", "uint32_appoint_action", "uint32_overwrite", "rpt_msg_appoint_ids" }, new Object[] { null, Integer.valueOf(0), Integer.valueOf(0), null }, ReqBody.class);
  public appoint_define.AppointID msg_appoint_id = new appoint_define.AppointID();
  public final PBRepeatMessageField rpt_msg_appoint_ids = PBField.initRepeatMessage(appoint_define.AppointID.class);
  public final PBUInt32Field uint32_appoint_action = PBField.initUInt32(0);
  public final PBUInt32Field uint32_overwrite = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x7db.ReqBody
 * JD-Core Version:    0.7.0.1
 */