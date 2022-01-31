package com.tencent.pb.now;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class FeedsProtocol$GetLivingAnchorListRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField errmsg = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatMessageField living_list = PBField.initRepeatMessage(FeedsProtocol.LivingAnchorInfo.class);
  public final PBInt32Field result = PBField.initInt32(0);
  public final PBUInt32Field total = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 32 }, new String[] { "living_list", "result", "errmsg", "total" }, new Object[] { null, Integer.valueOf(0), localByteStringMicro, Integer.valueOf(0) }, GetLivingAnchorListRsp.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.pb.now.FeedsProtocol.GetLivingAnchorListRsp
 * JD-Core Version:    0.7.0.1
 */