package com.tencent.analysis.a;

import com.tencent.analysis.d.a.a;
import com.tencent.analysis.d.a.d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i
  extends g
{
  private final Map c = new HashMap();
  
  public i()
  {
    this.b = 256;
  }
  
  final void a(DataOutputStream paramDataOutputStream)
  {
    Object localObject = new ByteArrayOutputStream(200);
    DataOutputStream localDataOutputStream = new DataOutputStream((OutputStream)localObject);
    localDataOutputStream.writeShort(this.c.size());
    if (this.c.size() != 0)
    {
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localDataOutputStream.write(((b)localEntry.getKey()).a((String)localEntry.getValue()));
      }
    }
    localObject = b().b.b(((ByteArrayOutputStream)localObject).toByteArray());
    paramDataOutputStream.writeShort(localObject.length);
    paramDataOutputStream.write((byte[])localObject);
  }
  
  final void a(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[paramByteBuffer.getShort() & 0xFFFF];
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer = ByteBuffer.wrap(b().b.a(arrayOfByte));
    int j = paramByteBuffer.getShort();
    int i = 0;
    while (i < (0xFFFF & j))
    {
      b.a(paramByteBuffer, this.c);
      i += 1;
    }
  }
  
  public final void b(b paramb, String paramString)
  {
    if (paramb.b() != f.a) {}
    while ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    this.c.put(paramb, paramString);
  }
  
  public final String c()
  {
    return super.c();
  }
  
  public final String toString()
  {
    return "ShakeHandsReq [field=" + this.c + ", toString()=" + super.toString() + "]";
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     com.tencent.analysis.a.i
 * JD-Core Version:    0.7.0.1
 */