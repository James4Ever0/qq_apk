package com.tencent.mobileqq.data;

import com.tencent.mobileqq.persistence.Entity;
import com.tencent.mobileqq.persistence.unique;

public class NeedHandleUserData
  extends Entity
{
  public int type;
  @unique
  public String uin;
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.data.NeedHandleUserData
 * JD-Core Version:    0.7.0.1
 */