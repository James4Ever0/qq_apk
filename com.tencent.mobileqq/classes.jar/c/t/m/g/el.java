package c.t.m.g;

import com.tencent.map.geolocation.TencentDistanceAnalysis;

public final class el
  implements TencentDistanceAnalysis
{
  public double a;
  public int b;
  public int c;
  
  public final double getConfidence()
  {
    return this.a;
  }
  
  public final int getGpsCount()
  {
    return this.b;
  }
  
  public final int getNetworkCount()
  {
    return this.c;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     c.t.m.g.el
 * JD-Core Version:    0.7.0.1
 */