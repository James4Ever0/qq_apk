package tencent.im.cs.cmd0x346;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x346$ApplyUploadHitReq
  extends MessageMicro
{
  public static final int BYTES_10M_MD5_FIELD_NUMBER = 50;
  public static final int STR_FILE_NAME_FIELD_NUMBER = 40;
  public static final int STR_LOCAL_FILEPATH_FIELD_NUMBER = 60;
  public static final int UINT32_DANGER_LEVEL_FIELD_NUMBER = 70;
  public static final int UINT64_FILE_SIZE_FIELD_NUMBER = 30;
  public static final int UINT64_RECVER_UIN_FIELD_NUMBER = 20;
  public static final int UINT64_SENDER_UIN_FIELD_NUMBER = 10;
  public static final int UINT64_TOTAL_SPACE_FIELD_NUMBER = 80;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_10m_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_file_name = PBField.initString("");
  public final PBStringField str_local_filepath = PBField.initString("");
  public final PBUInt32Field uint32_danger_level = PBField.initUInt32(0);
  public final PBUInt64Field uint64_file_size = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_recver_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_sender_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_total_space = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 80, 160, 240, 322, 402, 482, 560, 640 }, new String[] { "uint64_sender_uin", "uint64_recver_uin", "uint64_file_size", "str_file_name", "bytes_10m_md5", "str_local_filepath", "uint32_danger_level", "uint64_total_space" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), Long.valueOf(0L), "", localByteStringMicro, "", Integer.valueOf(0), Long.valueOf(0L) }, ApplyUploadHitReq.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.cs.cmd0x346.cmd0x346.ApplyUploadHitReq
 * JD-Core Version:    0.7.0.1
 */