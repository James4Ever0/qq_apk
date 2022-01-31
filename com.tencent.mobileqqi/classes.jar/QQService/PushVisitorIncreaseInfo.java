package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class PushVisitorIncreaseInfo
  extends JceStruct
{
  static ArrayList cache_vVisitorList;
  public int iIncrement = 0;
  public int lTime = 0;
  public ArrayList vVisitorList = null;
  
  public PushVisitorIncreaseInfo() {}
  
  public PushVisitorIncreaseInfo(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    this.iIncrement = paramInt1;
    this.lTime = paramInt2;
    this.vVisitorList = paramArrayList;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.iIncrement = paramJceInputStream.read(this.iIncrement, 0, true);
    this.lTime = paramJceInputStream.read(this.lTime, 1, true);
    if (cache_vVisitorList == null)
    {
      cache_vVisitorList = new ArrayList();
      Visitor localVisitor = new Visitor();
      cache_vVisitorList.add(localVisitor);
    }
    this.vVisitorList = ((ArrayList)paramJceInputStream.read(cache_vVisitorList, 2, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.iIncrement, 0);
    paramJceOutputStream.write(this.lTime, 1);
    if (this.vVisitorList != null) {
      paramJceOutputStream.write(this.vVisitorList, 2);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     QQService.PushVisitorIncreaseInfo
 * JD-Core Version:    0.7.0.1
 */