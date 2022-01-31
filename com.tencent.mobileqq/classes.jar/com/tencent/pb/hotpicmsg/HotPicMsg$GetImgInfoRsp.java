package com.tencent.pb.hotpicmsg;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class HotPicMsg$GetImgInfoRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_fail_msg = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatMessageField rpt_msg_img_info = PBField.initRepeatMessage(HotPicMsg.ImgInfo.class);
  public final PBRepeatMessageField rpt_msg_tag_info = PBField.initRepeatMessage(HotPicMsg.TagInfo.class);
  public final PBUInt32Field uint32_build_ver = PBField.initUInt32(0);
  public final PBUInt32Field uint32_result = PBField.initUInt32(0);
  public final PBUInt32Field uint32_tag_id = PBField.initUInt32(0);
  
  static
  {
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 34, 42, 48 }, new String[] { "uint32_result", "bytes_fail_msg", "uint32_build_ver", "rpt_msg_img_info", "rpt_msg_tag_info", "uint32_tag_id" }, new Object[] { Integer.valueOf(0), localByteStringMicro, Integer.valueOf(0), null, null, Integer.valueOf(0) }, GetImgInfoRsp.class);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.pb.hotpicmsg.HotPicMsg.GetImgInfoRsp
 * JD-Core Version:    0.7.0.1
 */