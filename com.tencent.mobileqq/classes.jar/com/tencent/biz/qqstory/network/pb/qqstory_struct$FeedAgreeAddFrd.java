package com.tencent.biz.qqstory.network.pb;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class qqstory_struct$FeedAgreeAddFrd
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField feed_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public qqstory_struct.UserInfo from_uid = new qqstory_struct.UserInfo();
  public qqstory_struct.UserInfo to_uid = new qqstory_struct.UserInfo();
  public final PBUInt32Field video_isend = PBField.initUInt32(0);
  public final PBRepeatMessageField video_list = PBField.initRepeatMessage(qqstory_struct.StoryVideoFullInfo.class);
  public final PBUInt32Field video_next = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 32, 40, 50 }, new String[] { "from_uid", "to_uid", "feed_id", "video_isend", "video_next", "video_list" }, new Object[] { null, null, localByteStringMicro, Integer.valueOf(0), Integer.valueOf(0), null }, FeedAgreeAddFrd.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.network.pb.qqstory_struct.FeedAgreeAddFrd
 * JD-Core Version:    0.7.0.1
 */