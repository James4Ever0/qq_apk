package com.tencent.pb.chatbgInfo;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class chatbgInfo$Bg_CheckAuth_Rsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "AuthRst" }, new Object[] { null }, Bg_CheckAuth_Rsp.class);
  public final PBRepeatMessageField AuthRst = PBField.initRepeatMessage(chatbgInfo.Bg_Auth_Rst.class);
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     com.tencent.pb.chatbgInfo.chatbgInfo.Bg_CheckAuth_Rsp
 * JD-Core Version:    0.7.0.1
 */