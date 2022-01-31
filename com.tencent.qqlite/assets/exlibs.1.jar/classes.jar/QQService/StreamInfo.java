package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class StreamInfo
  extends JceStruct
{
  static int cache_type;
  public String fileKey = "";
  public int iMsgId = 0;
  public int iSendTime = 0;
  public long lFromUIN = 0L;
  public long lToUIN = 0L;
  public int msgSeq = 0;
  public long msgTime = 0L;
  public short oprType = 0;
  public byte pttTransFlag = 0;
  public long random = 0L;
  public short shFlowLayer = 0;
  public short shPackNum = 0;
  public int type = 0;
  
  public StreamInfo() {}
  
  public StreamInfo(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, short paramShort1, short paramShort2, short paramShort3, byte paramByte, String paramString, long paramLong3, int paramInt4, long paramLong4)
  {
    this.lFromUIN = paramLong1;
    this.lToUIN = paramLong2;
    this.iMsgId = paramInt1;
    this.type = paramInt2;
    this.iSendTime = paramInt3;
    this.shPackNum = paramShort1;
    this.shFlowLayer = paramShort2;
    this.oprType = paramShort3;
    this.pttTransFlag = paramByte;
    this.fileKey = paramString;
    this.msgTime = paramLong3;
    this.msgSeq = paramInt4;
    this.random = paramLong4;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lFromUIN = paramJceInputStream.read(this.lFromUIN, 0, true);
    this.lToUIN = paramJceInputStream.read(this.lToUIN, 1, true);
    this.iMsgId = paramJceInputStream.read(this.iMsgId, 2, true);
    this.type = paramJceInputStream.read(this.type, 3, true);
    this.iSendTime = paramJceInputStream.read(this.iSendTime, 4, true);
    this.shPackNum = paramJceInputStream.read(this.shPackNum, 5, true);
    this.shFlowLayer = paramJceInputStream.read(this.shFlowLayer, 6, true);
    this.oprType = paramJceInputStream.read(this.oprType, 7, false);
    this.pttTransFlag = paramJceInputStream.read(this.pttTransFlag, 8, false);
    this.fileKey = paramJceInputStream.readString(9, false);
    this.msgTime = paramJceInputStream.read(this.msgTime, 10, false);
    this.msgSeq = paramJceInputStream.read(this.msgSeq, 11, false);
    this.random = paramJceInputStream.read(this.random, 12, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lFromUIN, 0);
    paramJceOutputStream.write(this.lToUIN, 1);
    paramJceOutputStream.write(this.iMsgId, 2);
    paramJceOutputStream.write(this.type, 3);
    paramJceOutputStream.write(this.iSendTime, 4);
    paramJceOutputStream.write(this.shPackNum, 5);
    paramJceOutputStream.write(this.shFlowLayer, 6);
    paramJceOutputStream.write(this.oprType, 7);
    paramJceOutputStream.write(this.pttTransFlag, 8);
    if (this.fileKey != null) {
      paramJceOutputStream.write(this.fileKey, 9);
    }
    paramJceOutputStream.write(this.msgTime, 10);
    paramJceOutputStream.write(this.msgSeq, 11);
    paramJceOutputStream.write(this.random, 12);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     QQService.StreamInfo
 * JD-Core Version:    0.7.0.1
 */