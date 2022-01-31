package MessageSvcPack;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class SvcResponseBatchSetGroupFilter
  extends JceStruct
{
  public byte cReplyCode = 0;
  public long lUin = 0L;
  public String strResult = "";
  
  public SvcResponseBatchSetGroupFilter() {}
  
  public SvcResponseBatchSetGroupFilter(long paramLong, byte paramByte, String paramString)
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


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     MessageSvcPack.SvcResponseBatchSetGroupFilter
 * JD-Core Version:    0.7.0.1
 */