package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class ReqUpGrpMsg
  extends JceStruct
{
  static ReqHeader cache_stHeader;
  static GrpMsg cache_stMsg;
  public ReqHeader stHeader = null;
  public GrpMsg stMsg = null;
  
  public ReqUpGrpMsg() {}
  
  public ReqUpGrpMsg(ReqHeader paramReqHeader, GrpMsg paramGrpMsg)
  {
    this.stHeader = paramReqHeader;
    this.stMsg = paramGrpMsg;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_stHeader == null) {
      cache_stHeader = new ReqHeader();
    }
    this.stHeader = ((ReqHeader)paramJceInputStream.read(cache_stHeader, 0, true));
    if (cache_stMsg == null) {
      cache_stMsg = new GrpMsg();
    }
    this.stMsg = ((GrpMsg)paramJceInputStream.read(cache_stMsg, 1, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stHeader, 0);
    paramJceOutputStream.write(this.stMsg, 1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     QQService.ReqUpGrpMsg
 * JD-Core Version:    0.7.0.1
 */