import java.nio.ByteBuffer;

public class aipd
{
  public final long a;
  public final long b;
  public final long c;
  public final long d;
  
  public aipd(long paramLong)
  {
    this.a = 2882377846L;
    this.b = 1007L;
    this.c = 0L;
    this.d = paramLong;
  }
  
  public aipd(ByteBuffer paramByteBuffer)
  {
    this.a = (paramByteBuffer.getInt() & 0xFFFFFFFF);
    this.b = (paramByteBuffer.getInt() & 0xFFFFFFFF);
    this.c = (paramByteBuffer.getInt() & 0xFFFFFFFF);
    this.d = (paramByteBuffer.getInt() & 0xFFFFFFFF);
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt((int)(this.a & 0xFFFFFFFF));
    paramByteBuffer.putInt((int)(this.b & 0xFFFFFFFF));
    paramByteBuffer.putInt((int)(this.c & 0xFFFFFFFF));
    paramByteBuffer.putInt((int)(this.d & 0xFFFFFFFF));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aipd
 * JD-Core Version:    0.7.0.1
 */