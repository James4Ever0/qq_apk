package friendlist;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class MovGroupMemResp
  extends JceStruct
{
  public String ErrorString = "";
  public byte reqtype = 0;
  public byte result = 0;
  public long uin = 0L;
  
  public MovGroupMemResp() {}
  
  public MovGroupMemResp(long paramLong, byte paramByte1, byte paramByte2, String paramString)
  {
    this.uin = paramLong;
    this.reqtype = paramByte1;
    this.result = paramByte2;
    this.ErrorString = paramString;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, true);
    this.reqtype = paramJceInputStream.read(this.reqtype, 1, true);
    this.result = paramJceInputStream.read(this.result, 2, true);
    this.ErrorString = paramJceInputStream.readString(3, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
    paramJceOutputStream.write(this.reqtype, 1);
    paramJceOutputStream.write(this.result, 2);
    paramJceOutputStream.write(this.ErrorString, 3);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     friendlist.MovGroupMemResp
 * JD-Core Version:    0.7.0.1
 */