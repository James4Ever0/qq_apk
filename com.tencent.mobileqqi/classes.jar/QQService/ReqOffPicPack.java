package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class ReqOffPicPack
  extends JceStruct
{
  static byte[] cache_vBody;
  public long lUIN = 0L;
  public byte[] vBody = null;
  
  public ReqOffPicPack() {}
  
  public ReqOffPicPack(long paramLong, byte[] paramArrayOfByte)
  {
    this.lUIN = paramLong;
    this.vBody = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lUIN = paramJceInputStream.read(this.lUIN, 0, true);
    if (cache_vBody == null)
    {
      cache_vBody = (byte[])new byte[1];
      ((byte[])cache_vBody)[0] = 0;
    }
    this.vBody = ((byte[])paramJceInputStream.read(cache_vBody, 1, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lUIN, 0);
    paramJceOutputStream.write(this.vBody, 1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     QQService.ReqOffPicPack
 * JD-Core Version:    0.7.0.1
 */