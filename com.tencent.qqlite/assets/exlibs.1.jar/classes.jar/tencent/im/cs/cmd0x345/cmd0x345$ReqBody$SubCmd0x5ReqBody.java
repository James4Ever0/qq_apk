package tencent.im.cs.cmd0x345;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x345$ReqBody$SubCmd0x5ReqBody
  extends MessageMicro
{
  public static final int BYTES_MD5_FIELD_NUMBER = 8;
  public static final int BYTES_SRC_FILE_PATH_FIELD_NUMBER = 3;
  public static final int BYTES_SRC_PARENT_FOLDER_FIELD_NUMBER = 2;
  public static final int STR_FILE_NAME_FIELD_NUMBER = 7;
  public static final int UINT32_DST_UIN_FIELD_NUMBER = 4;
  public static final int UINT32_FROM_UIN_FIELD_NUMBER = 6;
  public static final int UINT32_SRC_BUS_ID_FIELD_NUMBER = 1;
  public static final int UINT64_FILE_SIZE_FIELD_NUMBER = 5;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_src_file_path = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_src_parent_folder = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_file_name = PBField.initString("");
  public final PBUInt32Field uint32_dst_uin = PBField.initUInt32(0);
  public final PBUInt32Field uint32_from_uin = PBField.initUInt32(0);
  public final PBUInt32Field uint32_src_bus_id = PBField.initUInt32(0);
  public final PBUInt64Field uint64_file_size = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40, 48, 58, 66 }, new String[] { "uint32_src_bus_id", "bytes_src_parent_folder", "bytes_src_file_path", "uint32_dst_uin", "uint64_file_size", "uint32_from_uin", "str_file_name", "bytes_md5" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), "", localByteStringMicro3 }, SubCmd0x5ReqBody.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.cs.cmd0x345.cmd0x345.ReqBody.SubCmd0x5ReqBody
 * JD-Core Version:    0.7.0.1
 */