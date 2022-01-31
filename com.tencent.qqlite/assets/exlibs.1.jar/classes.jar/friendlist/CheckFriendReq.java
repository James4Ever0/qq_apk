package friendlist;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class CheckFriendReq
  extends JceStruct
{
  public long fuin = 0L;
  public long uin = 0L;
  
  public CheckFriendReq() {}
  
  public CheckFriendReq(long paramLong1, long paramLong2)
  {
    this.uin = paramLong1;
    this.fuin = paramLong2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, true);
    this.fuin = paramJceInputStream.read(this.fuin, 1, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
    paramJceOutputStream.write(this.fuin, 1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     friendlist.CheckFriendReq
 * JD-Core Version:    0.7.0.1
 */