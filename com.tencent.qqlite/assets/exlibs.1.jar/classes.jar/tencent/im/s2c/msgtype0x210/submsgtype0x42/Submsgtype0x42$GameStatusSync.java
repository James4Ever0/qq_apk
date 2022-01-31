package tencent.im.s2c.msgtype0x210.submsgtype0x42;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Submsgtype0x42$GameStatusSync
  extends MessageMicro
{
  public static final int BYTES_DATA_FIELD_NUMBER = 2;
  public static final int UINT32_GAME_APPID_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_data = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_game_appid = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint32_game_appid", "bytes_data" }, new Object[] { Integer.valueOf(0), localByteStringMicro }, GameStatusSync.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0x42.Submsgtype0x42.GameStatusSync
 * JD-Core Version:    0.7.0.1
 */