package com.tencent.pb.now;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class ilive_feeds_read$ReadFeedsByIdRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "infos" }, new Object[] { null }, ReadFeedsByIdRsp.class);
  public final PBRepeatMessageField infos = PBField.initRepeatMessage(ilive_feeds_read.FeedsInfo.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.pb.now.ilive_feeds_read.ReadFeedsByIdRsp
 * JD-Core Version:    0.7.0.1
 */