package MessageSvcPack;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class stText
  extends JceStruct
{
  static byte[] cache_strUrl;
  static byte[] cache_vMsg;
  public byte[] strUrl;
  public byte[] vMsg;
  
  public stText() {}
  
  public stText(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.vMsg = paramArrayOfByte1;
    this.strUrl = paramArrayOfByte2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_vMsg == null)
    {
      cache_vMsg = (byte[])new byte[1];
      ((byte[])cache_vMsg)[0] = 0;
    }
    this.vMsg = ((byte[])paramJceInputStream.read(cache_vMsg, 0, false));
    if (cache_strUrl == null)
    {
      cache_strUrl = (byte[])new byte[1];
      ((byte[])cache_strUrl)[0] = 0;
    }
    this.strUrl = ((byte[])paramJceInputStream.read(cache_strUrl, 1, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.vMsg != null) {
      paramJceOutputStream.write(this.vMsg, 0);
    }
    if (this.strUrl != null) {
      paramJceOutputStream.write(this.strUrl, 1);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     MessageSvcPack.stText
 * JD-Core Version:    0.7.0.1
 */