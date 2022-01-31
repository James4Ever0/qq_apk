package com.tencent.biz.qqstory.msgTabNode.network;

import com.tencent.biz.qqstory.channel.BaseResponse;
import com.tencent.biz.qqstory.msgTabNode.model.MsgTabNodeInfo;
import com.tencent.biz.qqstory.network.pb.qqstory_service.MsgTabNodeInfo;
import com.tencent.biz.qqstory.network.pb.qqstory_service.RspMsgTabNodeList;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MsgTabNodeListRequest$MsgTabNodeListResponse
  extends BaseResponse
{
  public String a;
  public ArrayList a;
  public boolean a;
  public boolean b;
  public String c;
  
  public MsgTabNodeListRequest$MsgTabNodeListResponse(qqstory_service.RspMsgTabNodeList paramRspMsgTabNodeList)
  {
    super(paramRspMsgTabNodeList.result);
    this.jdField_a_of_type_JavaLangString = paramRspMsgTabNodeList.list_seq.get().toStringUtf8();
    this.c = paramRspMsgTabNodeList.next_cookie.get().toStringUtf8();
    if (paramRspMsgTabNodeList.is_animate.get() > 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.jdField_a_of_type_Boolean = bool1;
      if (paramRspMsgTabNodeList.is_end.has())
      {
        bool1 = bool2;
        if (paramRspMsgTabNodeList.is_end.get() != 1) {}
      }
      else
      {
        bool1 = true;
      }
      this.b = bool1;
      this.jdField_a_of_type_JavaUtilArrayList = new ArrayList(paramRspMsgTabNodeList.node_list.size());
      paramRspMsgTabNodeList = paramRspMsgTabNodeList.node_list.get().iterator();
      while (paramRspMsgTabNodeList.hasNext())
      {
        qqstory_service.MsgTabNodeInfo localMsgTabNodeInfo = (qqstory_service.MsgTabNodeInfo)paramRspMsgTabNodeList.next();
        MsgTabNodeInfo localMsgTabNodeInfo1 = new MsgTabNodeInfo();
        localMsgTabNodeInfo1.a(localMsgTabNodeInfo);
        this.jdField_a_of_type_JavaUtilArrayList.add(localMsgTabNodeInfo1);
      }
    }
  }
  
  public String toString()
  {
    return "MsgTabNodeListResponse{shouldAnimate=" + this.jdField_a_of_type_Boolean + ", seq='" + this.jdField_a_of_type_JavaLangString + '\'' + ", cookie='" + this.c + '\'' + ", isEnd=" + this.b + ", nodeList=" + this.jdField_a_of_type_JavaUtilArrayList + "} " + super.toString();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.msgTabNode.network.MsgTabNodeListRequest.MsgTabNodeListResponse
 * JD-Core Version:    0.7.0.1
 */