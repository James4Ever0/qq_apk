package tencent.im.s2c.msgtype0x210.submsgtype0xc7;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class submsgtype0xc7$HotFriendNotify
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_key_wording = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_chat_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_chat_hot_days = PBField.initUInt32(0);
  public final PBUInt32Field uint32_chat_hot_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_close_days = PBField.initUInt32(0);
  public final PBUInt32Field uint32_close_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_close_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_key_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_key_hot_days = PBField.initUInt32(0);
  public final PBUInt32Field uint32_key_hot_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_key_trans_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_lover_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_praise_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_praise_hot_days = PBField.initUInt32(0);
  public final PBUInt32Field uint32_praise_hot_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_qzone_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_qzone_hot_days = PBField.initUInt32(0);
  public final PBUInt32Field uint32_qzone_hot_level = PBField.initUInt32(0);
  public final PBUInt64Field uint64_dst_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_last_chat_time = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_last_key_time = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_last_praise_time = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_last_qzone_time = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_notify_time = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96, 104, 112, 120, 128, 136, 800, 1600, 1608, 1616, 1624, 1634, 1640 }, new String[] { "uint64_dst_uin", "uint32_praise_hot_level", "uint32_chat_hot_level", "uint32_praise_hot_days", "uint32_chat_hot_days", "uint32_close_level", "uint32_close_days", "uint32_praise_flag", "uint32_chat_flag", "uint32_close_flag", "uint64_notify_time", "uint64_last_praise_time", "uint64_last_chat_time", "uint32_qzone_hot_level", "uint32_qzone_hot_days", "uint32_qzone_flag", "uint64_last_qzone_time", "uint32_lover_flag", "uint32_key_hot_level", "uint32_key_hot_days", "uint32_key_flag", "uint64_last_key_time", "bytes_key_wording", "uint32_key_trans_flag" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), localByteStringMicro, Integer.valueOf(0) }, HotFriendNotify.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.s2c.msgtype0x210.submsgtype0xc7.submsgtype0xc7.HotFriendNotify
 * JD-Core Version:    0.7.0.1
 */