import dov.com.tencent.biz.qqstory.takevideo.doodle.ui.doodle.GLTextureView;

public class aoiy
{
  private static String jdField_a_of_type_JavaLangString = "GLThreadManager";
  private int jdField_a_of_type_Int;
  private aoix jdField_a_of_type_Aoix;
  private boolean jdField_a_of_type_Boolean;
  private boolean b;
  private boolean c;
  private boolean d;
  
  private void a()
  {
    if (!this.jdField_a_of_type_Boolean)
    {
      this.jdField_a_of_type_Int = GLTextureView.a();
      if (this.jdField_a_of_type_Int >= 131072) {
        this.c = true;
      }
      this.jdField_a_of_type_Boolean = true;
    }
  }
  
  public void a(aoix paramaoix)
  {
    try
    {
      aoix.a(paramaoix, true);
      if (this.jdField_a_of_type_Aoix == paramaoix) {
        this.jdField_a_of_type_Aoix = null;
      }
      notifyAll();
      return;
    }
    finally {}
  }
  
  /* Error */
  public void a(javax.microedition.khronos.opengles.GL10 paramGL10)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 50	aoiy:b	Z
    //   8: ifne +65 -> 73
    //   11: aload_0
    //   12: invokespecial 52	aoiy:a	()V
    //   15: aload_1
    //   16: sipush 7937
    //   19: invokeinterface 58 2 0
    //   24: astore_1
    //   25: aload_0
    //   26: getfield 33	aoiy:jdField_a_of_type_Int	I
    //   29: ldc 34
    //   31: if_icmpge +23 -> 54
    //   34: aload_1
    //   35: ldc 60
    //   37: invokevirtual 66	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   40: ifne +36 -> 76
    //   43: iconst_1
    //   44: istore_2
    //   45: aload_0
    //   46: iload_2
    //   47: putfield 36	aoiy:c	Z
    //   50: aload_0
    //   51: invokevirtual 47	java/lang/Object:notifyAll	()V
    //   54: aload_0
    //   55: getfield 36	aoiy:c	Z
    //   58: ifne +23 -> 81
    //   61: iload_3
    //   62: istore_2
    //   63: aload_0
    //   64: iload_2
    //   65: putfield 68	aoiy:d	Z
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield 50	aoiy:b	Z
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: iconst_0
    //   77: istore_2
    //   78: goto -33 -> 45
    //   81: iconst_0
    //   82: istore_2
    //   83: goto -20 -> 63
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	aoiy
    //   0	91	1	paramGL10	javax.microedition.khronos.opengles.GL10
    //   44	39	2	bool1	boolean
    //   1	61	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   4	43	86	finally
    //   45	54	86	finally
    //   54	61	86	finally
    //   63	73	86	finally
  }
  
  public boolean a()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean a(aoix paramaoix)
  {
    if ((this.jdField_a_of_type_Aoix == paramaoix) || (this.jdField_a_of_type_Aoix == null))
    {
      this.jdField_a_of_type_Aoix = paramaoix;
      notifyAll();
    }
    do
    {
      return true;
      a();
    } while (this.c);
    if (this.jdField_a_of_type_Aoix != null) {
      this.jdField_a_of_type_Aoix.e();
    }
    return false;
  }
  
  public void b(aoix paramaoix)
  {
    if (this.jdField_a_of_type_Aoix == paramaoix) {
      this.jdField_a_of_type_Aoix = null;
    }
    notifyAll();
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 52	aoiy:a	()V
    //   6: aload_0
    //   7: getfield 36	aoiy:c	Z
    //   10: istore_1
    //   11: iload_1
    //   12: ifne +9 -> 21
    //   15: iconst_1
    //   16: istore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: iload_1
    //   20: ireturn
    //   21: iconst_0
    //   22: istore_1
    //   23: goto -6 -> 17
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	aoiy
    //   10	13	1	bool	boolean
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	26	finally
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aoiy
 * JD-Core Version:    0.7.0.1
 */