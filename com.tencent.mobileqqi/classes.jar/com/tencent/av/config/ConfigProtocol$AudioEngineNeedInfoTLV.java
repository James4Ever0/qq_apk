package com.tencent.av.config;

public class ConfigProtocol$AudioEngineNeedInfoTLV
  extends ConfigProtocol.TLVBase
{
  private byte jdField_a_of_type_Byte;
  private int jdField_a_of_type_Int;
  private byte b;
  private byte c;
  private byte d;
  
  public ConfigProtocol$AudioEngineNeedInfoTLV(ConfigProtocol paramConfigProtocol, short paramShort)
  {
    super(paramConfigProtocol, (short)7, (short)4);
    this.jdField_a_of_type_Int = paramShort;
    this.jdField_a_of_type_Byte = 0;
    this.b = 0;
    this.c = 0;
    this.d = 0;
  }
  
  public byte a()
  {
    return this.jdField_a_of_type_Byte;
  }
  
  public boolean a(ByteBuffer paramByteBuffer)
  {
    if ((this.jdField_a_of_type_Int != c()) || (paramByteBuffer.b() < this.jdField_a_of_type_Int)) {
      return false;
    }
    this.jdField_a_of_type_Byte = paramByteBuffer.a();
    this.b = paramByteBuffer.a();
    this.c = paramByteBuffer.a();
    this.d = paramByteBuffer.a();
    return true;
  }
  
  public byte[] a()
  {
    return null;
  }
  
  public byte b()
  {
    return this.b;
  }
  
  public byte c()
  {
    return this.c;
  }
  
  public byte d()
  {
    return this.d;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     com.tencent.av.config.ConfigProtocol.AudioEngineNeedInfoTLV
 * JD-Core Version:    0.7.0.1
 */