package com.tencent.biz.qqstory.network.handler;

import com.tencent.biz.qqstory.base.BaseEvent;
import java.util.ArrayList;
import java.util.List;

public class UidToVidHandler$GetUserVidListEvent
  extends BaseEvent
{
  public int a;
  public List a;
  public List b = new ArrayList();
  
  public UidToVidHandler$GetUserVidListEvent()
  {
    this.jdField_a_of_type_JavaUtilList = new ArrayList();
  }
  
  public String toString()
  {
    return "GetUserVidListEvent{pullType=" + this.jdField_a_of_type_Int + ", mUserVidList=" + this.b + '}';
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     com.tencent.biz.qqstory.network.handler.UidToVidHandler.GetUserVidListEvent
 * JD-Core Version:    0.7.0.1
 */