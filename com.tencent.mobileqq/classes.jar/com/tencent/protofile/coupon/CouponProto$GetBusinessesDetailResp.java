package com.tencent.protofile.coupon;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class CouponProto$GetBusinessesDetailResp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "retcode", "businesses" }, new Object[] { Integer.valueOf(0), null }, GetBusinessesDetailResp.class);
  public final PBRepeatMessageField businesses = PBField.initRepeatMessage(CouponProto.Business.class);
  public final PBUInt32Field retcode = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\c222.jar
 * Qualified Name:     com.tencent.protofile.coupon.CouponProto.GetBusinessesDetailResp
 * JD-Core Version:    0.7.0.1
 */