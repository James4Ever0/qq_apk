package com.tencent.qidian.proto;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class mobileqq_qidian$VerifyWpaUinAndKeyRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "int32_result", "uint32_is_valid", "str_welcome_word" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), "" }, VerifyWpaUinAndKeyRsp.class);
  public final PBInt32Field int32_result = PBField.initInt32(0);
  public final PBStringField str_welcome_word = PBField.initString("");
  public final PBUInt32Field uint32_is_valid = PBField.initUInt32(0);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     com.tencent.qidian.proto.mobileqq_qidian.VerifyWpaUinAndKeyRsp
 * JD-Core Version:    0.7.0.1
 */