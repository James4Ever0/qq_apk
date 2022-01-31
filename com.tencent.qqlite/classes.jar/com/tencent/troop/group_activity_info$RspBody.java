package com.tencent.troop;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class group_activity_info$RspBody
  extends MessageMicro
{
  public static final int ERROR_CODE_FIELD_NUMBER = 1;
  public static final int GROUP_CODE_FIELD_NUMBER = 2;
  public static final int INFO_LIST_FIELD_NUMBER = 3;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "error_code", "group_code", "info_list" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), null }, RspBody.class);
  public final PBUInt32Field error_code = PBField.initUInt32(0);
  public final PBUInt64Field group_code = PBField.initUInt64(0L);
  public final PBRepeatMessageField info_list = PBField.initRepeatMessage(group_activity_info.GroupActInfo.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.troop.group_activity_info.RspBody
 * JD-Core Version:    0.7.0.1
 */