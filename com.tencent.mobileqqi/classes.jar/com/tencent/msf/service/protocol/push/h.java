package com.tencent.msf.service.protocol.push;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

public final class h
  extends JceStruct
{
  static Map h;
  public long a = 0L;
  public byte b = 0;
  public String c = "";
  public Map d = null;
  public int e = 300;
  public byte f = 0;
  public String g = "";
  
  public h() {}
  
  public h(long paramLong, byte paramByte1, String paramString1, Map paramMap, int paramInt, byte paramByte2, String paramString2)
  {
    this.a = paramLong;
    this.b = paramByte1;
    this.c = paramString1;
    this.d = paramMap;
    this.e = paramInt;
    this.f = paramByte2;
    this.g = paramString2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 0, true);
    this.b = paramJceInputStream.read(this.b, 1, true);
    this.c = paramJceInputStream.readString(2, true);
    if (h == null)
    {
      h = new HashMap();
      c localc = new c();
      h.put(Long.valueOf(0L), localc);
    }
    this.d = ((Map)paramJceInputStream.read(h, 3, true));
    this.e = paramJceInputStream.read(this.e, 4, false);
    this.f = paramJceInputStream.read(this.f, 5, false);
    this.g = paramJceInputStream.readString(6, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 0);
    paramJceOutputStream.write(this.b, 1);
    paramJceOutputStream.write(this.c, 2);
    paramJceOutputStream.write(this.d, 3);
    paramJceOutputStream.write(this.e, 4);
    paramJceOutputStream.write(this.f, 5);
    if (this.g != null) {
      paramJceOutputStream.write(this.g, 6);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.msf.service.protocol.push.h
 * JD-Core Version:    0.7.0.1
 */