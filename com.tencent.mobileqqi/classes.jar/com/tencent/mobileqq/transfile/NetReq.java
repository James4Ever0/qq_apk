package com.tencent.mobileqq.transfile;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

public class NetReq
{
  public static final int d = 0;
  public static final int e = 1;
  public static final int f = 2;
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  public long a;
  public INetEngine.IBreakDownFix a;
  public INetEngine.INetEngineListener a;
  public NetResp a;
  public OutputStream a;
  public Object a;
  public HashMap a;
  public List a;
  public boolean a;
  public byte[] a;
  public long b;
  private Object b;
  public String b;
  public String c;
  int j = 1;
  public int k = 0;
  public int l = 8;
  public int m = 1;
  public int n;
  public int o;
  
  public NetReq()
  {
    this.jdField_a_of_type_Long = 0L;
    this.jdField_b_of_type_Long = 480000L;
    this.jdField_a_of_type_Boolean = false;
    this.jdField_a_of_type_ComTencentMobileqqTransfileNetResp = null;
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
  }
  
  public Object a()
  {
    try
    {
      Object localObject1 = this.jdField_b_of_type_JavaLangObject;
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }
  
  public void a(Object paramObject)
  {
    try
    {
      this.jdField_b_of_type_JavaLangObject = paramObject;
      return;
    }
    finally
    {
      paramObject = finally;
      throw paramObject;
    }
  }
  
  public boolean a()
  {
    return (this.jdField_b_of_type_JavaLangString != null) || (this.jdField_a_of_type_JavaIoOutputStream != null);
  }
  
  public boolean b()
  {
    return this.jdField_b_of_type_JavaLangString != null;
  }
  
  public boolean c()
  {
    return this.jdField_a_of_type_JavaIoOutputStream != null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes.jar
 * Qualified Name:     com.tencent.mobileqq.transfile.NetReq
 * JD-Core Version:    0.7.0.1
 */