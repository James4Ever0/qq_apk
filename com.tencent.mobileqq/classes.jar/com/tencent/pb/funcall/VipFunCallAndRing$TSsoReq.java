package com.tencent.pb.funcall;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;

public final class VipFunCallAndRing$TSsoReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34, 42, 50, 58, 66 }, new String[] { "i32_cmd", "i32_implat", "str_qq_ver", "st_cmd0x1_req", "st_cmd0x2_req", "st_cmd0x3_req", "st_cmd0x4_req", "st_cmd0x5_req" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "", null, null, null, null, null }, TSsoReq.class);
  public final PBInt32Field i32_cmd = PBField.initInt32(0);
  public final PBInt32Field i32_implat = PBField.initInt32(0);
  public VipFunCallAndRing.TSsoCmd0x1Req st_cmd0x1_req = new VipFunCallAndRing.TSsoCmd0x1Req();
  public VipFunCallAndRing.TSsoCmd0x2Req st_cmd0x2_req = new VipFunCallAndRing.TSsoCmd0x2Req();
  public VipFunCallAndRing.TSsoCmd0x3Req st_cmd0x3_req = new VipFunCallAndRing.TSsoCmd0x3Req();
  public VipFunCallAndRing.TSsoCmd0x4Req st_cmd0x4_req = new VipFunCallAndRing.TSsoCmd0x4Req();
  public VipFunCallAndRing.TSsoCmd0x5Req st_cmd0x5_req = new VipFunCallAndRing.TSsoCmd0x5Req();
  public final PBStringField str_qq_ver = PBField.initString("");
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.pb.funcall.VipFunCallAndRing.TSsoReq
 * JD-Core Version:    0.7.0.1
 */