package tencent.im.cs.cmd0x345;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x345$ReqBody$SubCmd0x3ReqBody
  extends MessageMicro
{
  public static final int STR_FILE_ID_FIELD_NUMBER = 2;
  public static final int UINT32_COSTOM_ID_FIELD_NUMBER = 4;
  public static final int UINT32_DISSCUS_UIN_FIELD_NUMBER = 3;
  public static final int UINT32_UIN_FIELD_NUMBER = 1;
  public static final int UINT64_DISSCUS_UIN_FIELD_NUMBER = 6;
  public static final int UINT64_UIN_FIELD_NUMBER = 5;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32, 40, 48 }, new String[] { "uint32_uin", "str_file_id", "uint32_disscus_uin", "uint32_costom_id", "uint64_uin", "uint64_disscus_uin" }, new Object[] { Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L), Long.valueOf(0L) }, SubCmd0x3ReqBody.class);
  public final PBStringField str_file_id = PBField.initString("");
  public final PBUInt32Field uint32_costom_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_disscus_uin = PBField.initUInt32(0);
  public final PBUInt32Field uint32_uin = PBField.initUInt32(0);
  public final PBUInt64Field uint64_disscus_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     tencent.im.cs.cmd0x345.cmd0x345.ReqBody.SubCmd0x3ReqBody
 * JD-Core Version:    0.7.0.1
 */