package com.tencent.msf.service.protocol.h;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class e
  extends JceStruct
{
  static byte[] d;
  public int a = 0;
  public byte[] b = null;
  public long c = 0L;
  
  public e() {}
  
  public e(int paramInt, byte[] paramArrayOfByte, long paramLong)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
    this.c = paramLong;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 1, true);
    if (d == null)
    {
      d = (byte[])new byte[1];
      ((byte[])d)[0] = 0;
    }
    this.b = ((byte[])paramJceInputStream.read(d, 2, true));
    this.c = paramJceInputStream.read(this.c, 3, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.msf.service.protocol.h.e
 * JD-Core Version:    0.7.0.1
 */