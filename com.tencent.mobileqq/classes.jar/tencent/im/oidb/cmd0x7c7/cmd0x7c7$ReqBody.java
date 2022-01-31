package tencent.im.oidb.cmd0x7c7;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x7c7$ReqBody
  extends MessageMicro
{
  public static final int UINT32_REQ_NOT_SEE_QZONE_FIELD_NUMBER = 2;
  public static final int UINT32_REQ_PREVENT_DYNAMIC_FIELD_NUMBER = 3;
  public static final int UINT64_UIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint64_uin", "uint32_req_not_see_qzone", "uint32_req_prevent_dynamic" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0) }, ReqBody.class);
  public final PBUInt32Field uint32_req_not_see_qzone = PBField.initUInt32(0);
  public final PBUInt32Field uint32_req_prevent_dynamic = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     tencent.im.oidb.cmd0x7c7.cmd0x7c7.ReqBody
 * JD-Core Version:    0.7.0.1
 */