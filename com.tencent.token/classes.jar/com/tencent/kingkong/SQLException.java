package com.tencent.kingkong;

public class SQLException
  extends RuntimeException
{
  public SQLException() {}
  
  public SQLException(String paramString)
  {
    super(paramString);
  }
  
  public SQLException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.token\classes.jar
 * Qualified Name:     com.tencent.kingkong.SQLException
 * JD-Core Version:    0.7.0.1
 */