package tencent.im.cs.cmd0x345;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x345$RspBody$SubCmd0x4RspBody
  extends MessageMicro
{
  public static final int UINT32_MAX_DOWNLOAD_FILE_NUM_FIELD_NUMBER = 4;
  public static final int UINT32_MAX_TRANSFER_FILE_COUNT_FIELD_NUMBER = 1;
  public static final int UINT32_MAX_TRANSFER_FILE_QUEUE_NUM_FIELD_NUMBER = 3;
  public static final int UINT64_MAX_TRANSFER_SINGLE_FILE_SIZE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32 }, new String[] { "uint32_max_transfer_file_count", "uint64_max_transfer_single_file_size", "uint32_max_transfer_file_queue_num", "uint32_max_download_file_num" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0) }, SubCmd0x4RspBody.class);
  public final PBUInt32Field uint32_max_download_file_num = PBField.initUInt32(0);
  public final PBUInt32Field uint32_max_transfer_file_count = PBField.initUInt32(0);
  public final PBUInt32Field uint32_max_transfer_file_queue_num = PBField.initUInt32(0);
  public final PBUInt64Field uint64_max_transfer_single_file_size = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.cs.cmd0x345.cmd0x345.RspBody.SubCmd0x4RspBody
 * JD-Core Version:    0.7.0.1
 */