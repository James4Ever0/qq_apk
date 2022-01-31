package tencent.im.s2c.msgtype0x210.submsgtype0xbe;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class SubMsgType0xbe$Medal
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34, 42, 50 }, new String[] { "uint32_id", "uint32_level", "uint32_type", "str_icon_url", "str_flash_url", "str_name" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", "", "" }, Medal.class);
  public final PBStringField str_flash_url = PBField.initString("");
  public final PBStringField str_icon_url = PBField.initString("");
  public final PBStringField str_name = PBField.initString("");
  public final PBUInt32Field uint32_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0xbe.SubMsgType0xbe.Medal
 * JD-Core Version:    0.7.0.1
 */