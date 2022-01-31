package com.tencent.tmassistantsdk.internal.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class QueryLoginInfoRequest
  extends JceStruct
{
  public String addtion = "";
  
  public QueryLoginInfoRequest() {}
  
  public QueryLoginInfoRequest(String paramString)
  {
    this.addtion = paramString;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.addtion = paramJceInputStream.readString(0, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.addtion != null) {
      paramJceOutputStream.write(this.addtion, 0);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.tmassistantsdk.internal.openSDK.param.jce.QueryLoginInfoRequest
 * JD-Core Version:    0.7.0.1
 */