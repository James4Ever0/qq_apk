package com.tencent.mobileqq.transfile.protohandler;

public class RichProto$RichProtoReq$PttUpReq
  extends RichProto.RichProtoReq.ReqCommon
{
  public int a;
  public String a;
  public boolean a;
  public byte[] a;
  public int b;
  public int c;
  public int d;
  
  public RichProto$RichProtoReq$PttUpReq()
  {
    this.jdField_a_of_type_Boolean = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" name:");
    localStringBuilder.append(this.jdField_a_of_type_JavaLangString);
    localStringBuilder.append(" size:");
    localStringBuilder.append(this.b);
    localStringBuilder.append(" voiceLength:");
    localStringBuilder.append(this.jdField_a_of_type_Int);
    localStringBuilder.append(" type:").append(this.c).append(" audioPanel:").append(this.d);
    return localStringBuilder.toString();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\tmp\a2.jar
 * Qualified Name:     com.tencent.mobileqq.transfile.protohandler.RichProto.RichProtoReq.PttUpReq
 * JD-Core Version:    0.7.0.1
 */