package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.tools.util;

public class bw
  extends a
{
  private int h;
  
  public bw()
  {
    this.g = 390;
  }
  
  public Boolean e()
  {
    if (this.e < 2) {
      return Boolean.valueOf(false);
    }
    this.h = util.buf_to_int8(this.f, this.d + 1);
    return Boolean.valueOf(true);
  }
  
  public boolean f()
  {
    return this.h == 1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     oicq.wlogin_sdk.b.bw
 * JD-Core Version:    0.7.0.1
 */