package b.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class a
  extends JceStruct
{
  static byte[] g;
  static byte[] h;
  public long a = 0L;
  public long b = 0L;
  public String c = "";
  public byte[] d = null;
  public byte[] e = null;
  public int f = 0;
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 0, true);
    this.b = paramJceInputStream.read(this.b, 1, true);
    this.c = paramJceInputStream.readString(2, true);
    if (g == null)
    {
      g = (byte[])new byte[1];
      ((byte[])g)[0] = 0;
    }
    this.d = ((byte[])paramJceInputStream.read(g, 3, true));
    if (h == null)
    {
      h = (byte[])new byte[1];
      ((byte[])h)[0] = 0;
    }
    this.e = ((byte[])paramJceInputStream.read(h, 4, true));
    this.f = paramJceInputStream.read(this.f, 5, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 0);
    paramJceOutputStream.write(this.b, 1);
    paramJceOutputStream.write(this.c, 2);
    paramJceOutputStream.write(this.d, 3);
    paramJceOutputStream.write(this.e, 4);
    paramJceOutputStream.write(this.f, 5);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     b.a.a
 * JD-Core Version:    0.7.0.1
 */