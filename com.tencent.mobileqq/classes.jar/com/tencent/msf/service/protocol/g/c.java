package com.tencent.msf.service.protocol.g;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class c
  extends JceStruct
{
  static byte[] c;
  public String a = "";
  public byte[] b;
  
  public c() {}
  
  public c(String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.readString(1, true);
    if (c == null)
    {
      c = (byte[])new byte[1];
      ((byte[])c)[0] = 0;
    }
    this.b = ((byte[])paramJceInputStream.read(c, 2, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.msf.service.protocol.g.c
 * JD-Core Version:    0.7.0.1
 */