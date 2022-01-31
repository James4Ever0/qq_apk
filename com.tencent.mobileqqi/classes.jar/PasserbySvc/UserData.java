package PasserbySvc;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class UserData
  extends JceStruct
{
  static byte[] cache_strCookie;
  public long lNextMid = 0L;
  public byte[] strCookie = null;
  
  public UserData() {}
  
  public UserData(long paramLong, byte[] paramArrayOfByte)
  {
    this.lNextMid = paramLong;
    this.strCookie = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lNextMid = paramJceInputStream.read(this.lNextMid, 0, true);
    if (cache_strCookie == null)
    {
      cache_strCookie = (byte[])new byte[1];
      ((byte[])cache_strCookie)[0] = 0;
    }
    this.strCookie = ((byte[])paramJceInputStream.read(cache_strCookie, 1, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lNextMid, 0);
    if (this.strCookie != null) {
      paramJceOutputStream.write(this.strCookie, 1);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     PasserbySvc.UserData
 * JD-Core Version:    0.7.0.1
 */