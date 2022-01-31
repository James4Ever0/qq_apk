package friendlist;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class GetTroopAppointRemarkResp
  extends JceStruct
{
  static int cache_result;
  static ArrayList cache_vecTroopRemark;
  public long GroupCode = 0L;
  public long GroupUin = 0L;
  public short errorCode = 0;
  public int result = 0;
  public long uin = 0L;
  public ArrayList vecTroopRemark = null;
  
  public GetTroopAppointRemarkResp() {}
  
  public GetTroopAppointRemarkResp(long paramLong1, long paramLong2, long paramLong3, ArrayList paramArrayList, int paramInt, short paramShort)
  {
    this.uin = paramLong1;
    this.GroupCode = paramLong2;
    this.GroupUin = paramLong3;
    this.vecTroopRemark = paramArrayList;
    this.result = paramInt;
    this.errorCode = paramShort;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, true);
    this.GroupCode = paramJceInputStream.read(this.GroupCode, 1, true);
    this.GroupUin = paramJceInputStream.read(this.GroupUin, 2, true);
    if (cache_vecTroopRemark == null)
    {
      cache_vecTroopRemark = new ArrayList();
      stTroopRemarkInfo localstTroopRemarkInfo = new stTroopRemarkInfo();
      cache_vecTroopRemark.add(localstTroopRemarkInfo);
    }
    this.vecTroopRemark = ((ArrayList)paramJceInputStream.read(cache_vecTroopRemark, 3, true));
    this.result = paramJceInputStream.read(this.result, 4, true);
    this.errorCode = paramJceInputStream.read(this.errorCode, 5, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
    paramJceOutputStream.write(this.GroupCode, 1);
    paramJceOutputStream.write(this.GroupUin, 2);
    paramJceOutputStream.write(this.vecTroopRemark, 3);
    paramJceOutputStream.write(this.result, 4);
    paramJceOutputStream.write(this.errorCode, 5);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     friendlist.GetTroopAppointRemarkResp
 * JD-Core Version:    0.7.0.1
 */