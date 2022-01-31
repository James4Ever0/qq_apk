package tencent.im.oidb.cmd0x4f0;

import appoint.define.appoint_define.PublisherInfo;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x4f0$RspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_cookie = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatMessageField rpt_msg_vistor_info = PBField.initRepeatMessage(appoint_define.PublisherInfo.class);
  public final PBStringField str_error_tips = PBField.initString("");
  public final PBUInt32Field uint32_completed = PBField.initUInt32(0);
  public final PBUInt32Field uint32_timestamp = PBField.initUInt32(0);
  public final PBUInt32Field uint32_total_visitor = PBField.initUInt32(0);
  public final PBUInt32Field uint32_unread_visitor = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 32, 40, 48, 56 }, new String[] { "str_error_tips", "rpt_msg_vistor_info", "bytes_cookie", "uint32_completed", "uint32_total_visitor", "uint32_timestamp", "uint32_unread_visitor" }, new Object[] { "", null, localByteStringMicro, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, RspBody.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x4f0.cmd0x4f0.RspBody
 * JD-Core Version:    0.7.0.1
 */