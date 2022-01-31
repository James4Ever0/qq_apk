package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class SvcRespRegister
  extends JceStruct
{
  public byte bCrashFlag = 0;
  public byte bLogQQ = 0;
  public byte bNeedKik = 0;
  public byte bUpdateFlag = 0;
  public byte cReplyCode = 0;
  public int iClientPort = 0;
  public long lBid = 0L;
  public long lServerTime = 0L;
  public long lUin = 0L;
  public String strClientIP = "";
  public String strResult = "";
  public long timeStamp = 0L;
  
  public SvcRespRegister() {}
  
  public SvcRespRegister(long paramLong1, long paramLong2, byte paramByte1, String paramString1, long paramLong3, byte paramByte2, byte paramByte3, byte paramByte4, long paramLong4, byte paramByte5, String paramString2, int paramInt)
  {
    this.lUin = paramLong1;
    this.lBid = paramLong2;
    this.cReplyCode = paramByte1;
    this.strResult = paramString1;
    this.lServerTime = paramLong3;
    this.bLogQQ = paramByte2;
    this.bNeedKik = paramByte3;
    this.bUpdateFlag = paramByte4;
    this.timeStamp = paramLong4;
    this.bCrashFlag = paramByte5;
    this.strClientIP = paramString2;
    this.iClientPort = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lUin = paramJceInputStream.read(this.lUin, 0, true);
    this.lBid = paramJceInputStream.read(this.lBid, 1, true);
    this.cReplyCode = paramJceInputStream.read(this.cReplyCode, 2, true);
    this.strResult = paramJceInputStream.readString(3, true);
    this.lServerTime = paramJceInputStream.read(this.lServerTime, 4, false);
    this.bLogQQ = paramJceInputStream.read(this.bLogQQ, 5, false);
    this.bNeedKik = paramJceInputStream.read(this.bNeedKik, 6, false);
    this.bUpdateFlag = paramJceInputStream.read(this.bUpdateFlag, 7, false);
    this.timeStamp = paramJceInputStream.read(this.timeStamp, 8, false);
    this.bCrashFlag = paramJceInputStream.read(this.bCrashFlag, 9, false);
    this.strClientIP = paramJceInputStream.readString(10, false);
    this.iClientPort = paramJceInputStream.read(this.iClientPort, 11, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lUin, 0);
    paramJceOutputStream.write(this.lBid, 1);
    paramJceOutputStream.write(this.cReplyCode, 2);
    paramJceOutputStream.write(this.strResult, 3);
    paramJceOutputStream.write(this.lServerTime, 4);
    paramJceOutputStream.write(this.bLogQQ, 5);
    paramJceOutputStream.write(this.bNeedKik, 6);
    paramJceOutputStream.write(this.bUpdateFlag, 7);
    paramJceOutputStream.write(this.timeStamp, 8);
    paramJceOutputStream.write(this.bCrashFlag, 9);
    if (this.strClientIP != null) {
      paramJceOutputStream.write(this.strClientIP, 10);
    }
    paramJceOutputStream.write(this.iClientPort, 11);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     QQService.SvcRespRegister
 * JD-Core Version:    0.7.0.1
 */