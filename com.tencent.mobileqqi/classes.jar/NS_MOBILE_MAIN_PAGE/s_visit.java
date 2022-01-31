package NS_MOBILE_MAIN_PAGE;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class s_visit
  extends JceStruct
{
  static ArrayList cache_datalist;
  public ArrayList datalist = null;
  public long lasttime = 0L;
  public int nvnum = 0;
  public int todaynum = 0;
  public int totalnum = 0;
  
  public s_visit() {}
  
  public s_visit(int paramInt1, int paramInt2, int paramInt3, ArrayList paramArrayList, long paramLong)
  {
    this.nvnum = paramInt1;
    this.todaynum = paramInt2;
    this.totalnum = paramInt3;
    this.datalist = paramArrayList;
    this.lasttime = paramLong;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.nvnum = paramJceInputStream.read(this.nvnum, 0, false);
    this.todaynum = paramJceInputStream.read(this.todaynum, 1, false);
    this.totalnum = paramJceInputStream.read(this.totalnum, 2, false);
    if (cache_datalist == null)
    {
      cache_datalist = new ArrayList();
      s_user locals_user = new s_user();
      cache_datalist.add(locals_user);
    }
    this.datalist = ((ArrayList)paramJceInputStream.read(cache_datalist, 3, false));
    this.lasttime = paramJceInputStream.read(this.lasttime, 4, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.nvnum, 0);
    paramJceOutputStream.write(this.todaynum, 1);
    paramJceOutputStream.write(this.totalnum, 2);
    if (this.datalist != null) {
      paramJceOutputStream.write(this.datalist, 3);
    }
    paramJceOutputStream.write(this.lasttime, 4);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     NS_MOBILE_MAIN_PAGE.s_visit
 * JD-Core Version:    0.7.0.1
 */