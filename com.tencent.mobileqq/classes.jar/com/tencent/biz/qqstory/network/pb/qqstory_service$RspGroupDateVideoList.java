package com.tencent.biz.qqstory.network.pb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class qqstory_service$RspGroupDateVideoList
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBRepeatMessageField group_node_info = PBField.initRepeatMessage(qqstory_struct.GroupNodeInfo.class);
  public final PBUInt32Field is_end = PBField.initUInt32(0);
  public final PBBytesField next_cookie = PBField.initBytes(ByteStringMicro.EMPTY);
  public qqstory_struct.ErrorInfo result = new qqstory_struct.ErrorInfo();
  public final PBUInt64Field seqno = PBField.initUInt64(0L);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 32, 42 }, new String[] { "result", "is_end", "next_cookie", "seqno", "group_node_info" }, new Object[] { null, Integer.valueOf(0), localByteStringMicro, Long.valueOf(0L), null }, RspGroupDateVideoList.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.network.pb.qqstory_service.RspGroupDateVideoList
 * JD-Core Version:    0.7.0.1
 */