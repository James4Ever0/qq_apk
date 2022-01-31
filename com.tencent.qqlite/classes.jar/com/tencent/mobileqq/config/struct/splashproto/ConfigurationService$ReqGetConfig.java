package com.tencent.mobileqq.config.struct.splashproto;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class ConfigurationService$ReqGetConfig
  extends MessageMicro
{
  public static final int DEVICE_INFO_FIELD_NUMBER = 2;
  public static final int SEQ_LIST_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "seq_list", "device_info" }, new Object[] { null, null }, ReqGetConfig.class);
  public ConfigurationService.DeviceInfo device_info = new ConfigurationService.DeviceInfo();
  public final PBRepeatMessageField seq_list = PBField.initRepeatMessage(ConfigurationService.ConfigSeq.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.config.struct.splashproto.ConfigurationService.ReqGetConfig
 * JD-Core Version:    0.7.0.1
 */