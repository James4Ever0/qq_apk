package com.qzone.common.dns;

public class AnswerRecord
{
  public String domain;
  public byte[] ip;
  public int qclass;
  public long ttl;
  public int type;
  
  public AnswerRecord() {}
  
  public AnswerRecord(String paramString, byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
  {
    this.domain = paramString;
    this.ip = paramArrayOfByte;
    this.type = paramInt1;
    this.ttl = paramLong;
    this.qclass = paramInt2;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     com.qzone.common.dns.AnswerRecord
 * JD-Core Version:    0.7.0.1
 */