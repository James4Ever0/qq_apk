package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.tools.util;

public class bv
  extends a
{
  long h = 0L;
  
  public bv()
  {
    this.g = 387;
  }
  
  public Boolean e()
  {
    if (this.e < 8) {
      return Boolean.valueOf(false);
    }
    this.h = util.buf_to_int64(this.f, this.d);
    return Boolean.valueOf(true);
  }
  
  public long f()
  {
    return this.h;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     oicq.wlogin_sdk.b.bv
 * JD-Core Version:    0.7.0.1
 */