package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class GetDownloadProgressResponse
  extends JceStruct
{
  private static IPCBaseParam cache_requestParam;
  public long allTaskTotalLength = 0L;
  public long allTaskTotalProgress = 0L;
  public long receivedLen = 0L;
  public IPCBaseParam requestParam = null;
  public long totalLen = 0L;
  
  public GetDownloadProgressResponse() {}
  
  public GetDownloadProgressResponse(IPCBaseParam paramIPCBaseParam, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.requestParam = paramIPCBaseParam;
    this.receivedLen = paramLong1;
    this.totalLen = paramLong2;
    this.allTaskTotalProgress = paramLong3;
    this.allTaskTotalLength = paramLong4;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_requestParam == null) {
      cache_requestParam = new IPCBaseParam();
    }
    this.requestParam = ((IPCBaseParam)paramJceInputStream.read(cache_requestParam, 0, true));
    this.receivedLen = paramJceInputStream.read(this.receivedLen, 1, false);
    this.totalLen = paramJceInputStream.read(this.totalLen, 2, false);
    this.allTaskTotalProgress = paramJceInputStream.read(this.allTaskTotalProgress, 3, false);
    this.allTaskTotalLength = paramJceInputStream.read(this.allTaskTotalLength, 4, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.requestParam, 0);
    paramJceOutputStream.write(this.receivedLen, 1);
    paramJceOutputStream.write(this.totalLen, 2);
    paramJceOutputStream.write(this.allTaskTotalProgress, 3);
    paramJceOutputStream.write(this.allTaskTotalLength, 4);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.param.jce.GetDownloadProgressResponse
 * JD-Core Version:    0.7.0.1
 */