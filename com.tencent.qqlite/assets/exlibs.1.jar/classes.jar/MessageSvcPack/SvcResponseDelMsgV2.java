package MessageSvcPack;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class SvcResponseDelMsgV2
  extends JceStruct
{
  public byte cReplyCode = 0;
  public long lUin = 0L;
  public String strResult = "";
  
  public SvcResponseDelMsgV2() {}
  
  public SvcResponseDelMsgV2(long paramLong, byte paramByte, String paramString)
  {
    this.lUin = paramLong;
    this.cReplyCode = paramByte;
    this.strResult = paramString;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lUin = paramJceInputStream.read(this.lUin, 0, true);
    this.cReplyCode = paramJceInputStream.read(this.cReplyCode, 1, true);
    this.strResult = paramJceInputStream.readString(2, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lUin, 0);
    paramJceOutputStream.write(this.cReplyCode, 1);
    paramJceOutputStream.write(this.strResult, 2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     MessageSvcPack.SvcResponseDelMsgV2
 * JD-Core Version:    0.7.0.1
 */