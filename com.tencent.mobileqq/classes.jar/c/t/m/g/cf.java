package c.t.m.g;

public final class cf
  implements bj, cd
{
  private static cf a = new cf();
  private cd b;
  private bj c;
  private boolean d = false;
  
  public static cf e()
  {
    return a;
  }
  
  public final void a()
  {
    this.b.a();
  }
  
  public final void a(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public final void a(bj parambj)
  {
    this.c = parambj;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.c.a(paramString1, paramString2);
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.c.a(paramString1, paramArrayOfByte, paramString2);
  }
  
  public final void b()
  {
    this.b.b();
  }
  
  public final void c()
  {
    this.c.c();
  }
  
  /* Error */
  public final void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	c/t/m/g/cf:d	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokestatic 54	c/t/m/g/bv:c	()Lc/t/m/g/bv;
    //   18: putfield 31	c/t/m/g/cf:b	Lc/t/m/g/cd;
    //   21: aload_0
    //   22: getfield 31	c/t/m/g/cf:b	Lc/t/m/g/cd;
    //   25: ifnull +22 -> 47
    //   28: aload_0
    //   29: getfield 31	c/t/m/g/cf:b	Lc/t/m/g/cd;
    //   32: aload_0
    //   33: invokeinterface 56 2 0
    //   38: aload_0
    //   39: getfield 31	c/t/m/g/cf:b	Lc/t/m/g/cd;
    //   42: invokeinterface 58 1 0
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield 27	c/t/m/g/cf:d	Z
    //   52: goto -41 -> 11
    //   55: astore_2
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_2
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	cf
    //   6	2	1	bool	boolean
    //   55	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	55	finally
    //   14	47	55	finally
    //   47	52	55	finally
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     c.t.m.g.cf
 * JD-Core Version:    0.7.0.1
 */