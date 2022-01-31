package com.tencent.mobileqq.msf.core.auth;

import com.qq.taf.jce.HexUtil;
import com.tencent.qphone.base.remote.SimpleAccount;
import com.tencent.qphone.base.util.QLog;

class a
{
  public static final String a = "MSF.C.Account";
  private long A = 0L;
  private long B = 0L;
  private long C = 0L;
  int b;
  private String c;
  private byte[] d = new byte[0];
  private byte[] e = new byte[0];
  private byte[] f = new byte[0];
  private byte[] g = new byte[0];
  private byte[] h = new byte[0];
  private byte[] i = new byte[0];
  private byte[] j = new byte[0];
  private byte[] k = new byte[0];
  private byte[] l = new byte[0];
  private byte[] m = new byte[0];
  private byte[] n = new byte[0];
  private byte[] o = new byte[0];
  private int p = 0;
  private int q = 0;
  private int r = 0;
  private byte[] s = new byte[0];
  private String t = "";
  private byte[] u = new byte[0];
  private long v;
  private boolean w;
  private int x = -1;
  private String y = "";
  private long z = 0L;
  
  public a(String paramString)
  {
    this.c = paramString;
  }
  
  public static a c(String paramString)
  {
    Object localObject4 = null;
    String[] arrayOfString = null;
    Object localObject3 = null;
    Object localObject2 = arrayOfString;
    Object localObject1;
    if (paramString != null)
    {
      localObject1 = localObject4;
      localObject2 = arrayOfString;
    }
    for (;;)
    {
      int i1;
      try
      {
        if (paramString.length() > 0)
        {
          localObject1 = localObject4;
          arrayOfString = paramString.split(",");
          localObject1 = localObject4;
          int i2 = arrayOfString.length;
          i1 = 0;
          paramString = localObject3;
          localObject2 = paramString;
          if (i1 < i2)
          {
            localObject2 = arrayOfString[i1];
            localObject1 = paramString;
            if (((String)localObject2).length() > 0)
            {
              localObject1 = paramString;
              localObject2 = ((String)localObject2).split("=");
              localObject1 = paramString;
              if (localObject2.length == 2)
              {
                localObject1 = paramString;
                if ("uin".equals(localObject2[0]))
                {
                  localObject1 = paramString;
                  paramString = new a(localObject2[1]);
                }
                else
                {
                  localObject1 = paramString;
                  if ("loginTime".equals(localObject2[0]))
                  {
                    localObject1 = paramString;
                    paramString.a(Long.parseLong(localObject2[1]));
                  }
                  else
                  {
                    localObject1 = paramString;
                    if ("active".equals(localObject2[0]))
                    {
                      localObject1 = paramString;
                      paramString.a(Boolean.parseBoolean(localObject2[1]));
                    }
                    else
                    {
                      localObject1 = paramString;
                      if ("A1".equals(localObject2[0]))
                      {
                        localObject1 = paramString;
                        paramString.d(HexUtil.hexStr2Bytes(localObject2[1]));
                      }
                      else
                      {
                        localObject1 = paramString;
                        if ("A2".equals(localObject2[0]))
                        {
                          localObject1 = paramString;
                          paramString.e(HexUtil.hexStr2Bytes(localObject2[1]));
                        }
                        else
                        {
                          localObject1 = paramString;
                          if ("A3".equals(localObject2[0]))
                          {
                            localObject1 = paramString;
                            paramString.f(HexUtil.hexStr2Bytes(localObject2[1]));
                          }
                          else
                          {
                            localObject1 = paramString;
                            if ("D1".equals(localObject2[0]))
                            {
                              localObject1 = paramString;
                              paramString.g(HexUtil.hexStr2Bytes(localObject2[1]));
                            }
                            else
                            {
                              localObject1 = paramString;
                              if ("D2".equals(localObject2[0]))
                              {
                                localObject1 = paramString;
                                paramString.h(HexUtil.hexStr2Bytes(localObject2[1]));
                              }
                              else
                              {
                                localObject1 = paramString;
                                if ("S2".equals(localObject2[0]))
                                {
                                  localObject1 = paramString;
                                  paramString.i(HexUtil.hexStr2Bytes(localObject2[1]));
                                }
                                else
                                {
                                  localObject1 = paramString;
                                  if ("key".equals(localObject2[0]))
                                  {
                                    localObject1 = paramString;
                                    paramString.j(HexUtil.hexStr2Bytes(localObject2[1]));
                                  }
                                  else
                                  {
                                    localObject1 = paramString;
                                    if ("sid".equals(localObject2[0]))
                                    {
                                      localObject1 = paramString;
                                      paramString.b(localObject2[1]);
                                    }
                                    else
                                    {
                                      localObject1 = paramString;
                                      if ("MiniA2".equals(localObject2[0]))
                                      {
                                        localObject1 = paramString;
                                        paramString.l(HexUtil.hexStr2Bytes(localObject2[1]));
                                      }
                                      else
                                      {
                                        localObject1 = paramString;
                                        if ("MainAccount".equals(localObject2[0]))
                                        {
                                          localObject1 = paramString;
                                          paramString.m(HexUtil.hexStr2Bytes(localObject2[1]));
                                        }
                                        else
                                        {
                                          localObject1 = paramString;
                                          if ("FaceId".equalsIgnoreCase(localObject2[0]))
                                          {
                                            localObject1 = paramString;
                                            paramString.a(Integer.parseInt(localObject2[1]));
                                          }
                                          else
                                          {
                                            localObject1 = paramString;
                                            if ("Age".equalsIgnoreCase(localObject2[0]))
                                            {
                                              localObject1 = paramString;
                                              paramString.b(Integer.parseInt(localObject2[1]));
                                            }
                                            else
                                            {
                                              localObject1 = paramString;
                                              if ("Gender".equalsIgnoreCase(localObject2[0]))
                                              {
                                                localObject1 = paramString;
                                                paramString.c(Integer.parseInt(localObject2[1]));
                                              }
                                              else
                                              {
                                                localObject1 = paramString;
                                                if ("NickName".equals(localObject2[0]))
                                                {
                                                  localObject1 = paramString;
                                                  paramString.n(HexUtil.hexStr2Bytes(localObject2[1]));
                                                }
                                                else
                                                {
                                                  localObject1 = paramString;
                                                  if ("sid".equals(localObject2[0]))
                                                  {
                                                    localObject1 = paramString;
                                                    paramString.b(localObject2[1]);
                                                  }
                                                  else
                                                  {
                                                    localObject1 = paramString;
                                                    if ("renewA2D2Time".equals(localObject2[0]))
                                                    {
                                                      localObject1 = paramString;
                                                      paramString.b(Long.parseLong(localObject2[1]));
                                                    }
                                                    else
                                                    {
                                                      localObject1 = paramString;
                                                      if ("renewSidTime".equals(localObject2[0]))
                                                      {
                                                        localObject1 = paramString;
                                                        paramString.c(Long.parseLong(localObject2[1]));
                                                      }
                                                      else
                                                      {
                                                        localObject1 = paramString;
                                                        if ("loginedProcess".equals(localObject2[0]))
                                                        {
                                                          localObject1 = paramString;
                                                          paramString.d(localObject2[1]);
                                                        }
                                                        else
                                                        {
                                                          localObject1 = paramString;
                                                          if ("vkey".equals(localObject2[0]))
                                                          {
                                                            localObject1 = paramString;
                                                            paramString.a(HexUtil.hexStr2Bytes(localObject2[1]));
                                                          }
                                                          else
                                                          {
                                                            localObject1 = paramString;
                                                            if ("skey".equals(localObject2[0]))
                                                            {
                                                              localObject1 = paramString;
                                                              paramString.b(HexUtil.hexStr2Bytes(localObject2[1]));
                                                            }
                                                            else
                                                            {
                                                              localObject1 = paramString;
                                                              if ("stweb".equals(localObject2[0]))
                                                              {
                                                                localObject1 = paramString;
                                                                paramString.c(HexUtil.hexStr2Bytes(localObject2[1]));
                                                              }
                                                              else
                                                              {
                                                                localObject1 = paramString;
                                                                if ("renewSkeyTime".equals(localObject2[0]))
                                                                {
                                                                  localObject1 = paramString;
                                                                  paramString.d(Long.parseLong(localObject2[1]));
                                                                }
                                                                else
                                                                {
                                                                  localObject1 = paramString;
                                                                  if ("renewWebviewKeyTime".equals(localObject2[0]))
                                                                  {
                                                                    localObject1 = paramString;
                                                                    paramString.e(Long.parseLong(localObject2[1]));
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      catch (Exception paramString)
      {
        QLog.e("MSF.C.Account", 2, "parse account error", paramString);
        localObject2 = localObject1;
      }
      return localObject2;
      i1 += 1;
    }
  }
  
  public long A()
  {
    if (this.z == 0L) {
      return this.v;
    }
    return this.z;
  }
  
  public long B()
  {
    if (this.A == 0L) {
      return this.v;
    }
    return this.A;
  }
  
  public long C()
  {
    if (this.B == 0L) {
      return this.v;
    }
    return this.B;
  }
  
  public long D()
  {
    if (this.C == 0L) {
      return this.v;
    }
    return this.C;
  }
  
  public void a(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.v = paramLong;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.k = paramArrayOfByte;
  }
  
  public byte[] a()
  {
    return this.k;
  }
  
  public void b(int paramInt)
  {
    this.q = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.z = paramLong;
  }
  
  public void b(String paramString)
  {
    this.t = paramString;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.l = paramArrayOfByte;
  }
  
  public byte[] b()
  {
    return this.l;
  }
  
  public void c(int paramInt)
  {
    this.r = paramInt;
  }
  
  public void c(long paramLong)
  {
    this.A = paramLong;
  }
  
  public void c(byte[] paramArrayOfByte)
  {
    this.m = paramArrayOfByte;
  }
  
  public byte[] c()
  {
    return this.m;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public void d(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void d(long paramLong)
  {
    this.B = paramLong;
  }
  
  public void d(String paramString)
  {
    this.y = paramString;
  }
  
  public void d(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  public void e(int paramInt)
  {
    this.x = paramInt;
  }
  
  public void e(long paramLong)
  {
    this.C = paramLong;
  }
  
  public void e(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  public byte[] e()
  {
    return this.d;
  }
  
  public void f(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
  }
  
  public byte[] f()
  {
    return this.e;
  }
  
  public void g(byte[] paramArrayOfByte)
  {
    this.g = paramArrayOfByte;
  }
  
  public byte[] g()
  {
    return this.f;
  }
  
  public void h(byte[] paramArrayOfByte)
  {
    this.h = paramArrayOfByte;
  }
  
  public byte[] h()
  {
    return this.g;
  }
  
  public void i(byte[] paramArrayOfByte)
  {
    this.i = paramArrayOfByte;
  }
  
  public byte[] i()
  {
    return this.h;
  }
  
  public void j(byte[] paramArrayOfByte)
  {
    this.j = paramArrayOfByte;
  }
  
  public byte[] j()
  {
    return this.i;
  }
  
  public void k(byte[] paramArrayOfByte)
  {
    this.u = paramArrayOfByte;
  }
  
  public byte[] k()
  {
    return this.j;
  }
  
  public String l()
  {
    return this.t;
  }
  
  public void l(byte[] paramArrayOfByte)
  {
    this.n = paramArrayOfByte;
  }
  
  public void m(byte[] paramArrayOfByte)
  {
    this.o = paramArrayOfByte;
  }
  
  public byte[] m()
  {
    return this.u;
  }
  
  public long n()
  {
    return this.v;
  }
  
  public void n(byte[] paramArrayOfByte)
  {
    this.s = paramArrayOfByte;
  }
  
  public boolean o()
  {
    return this.w;
  }
  
  public SimpleAccount p()
  {
    SimpleAccount localSimpleAccount = new SimpleAccount();
    localSimpleAccount.setUin(this.c);
    localSimpleAccount.setAttribute("_isLogined", String.valueOf(this.w));
    localSimpleAccount.setAttribute("_loginTime", String.valueOf(this.v));
    localSimpleAccount.setAttribute("_loginedProcess", this.y);
    return localSimpleAccount;
  }
  
  public String q()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(",uin=").append(this.c);
    if (n() > 0L) {
      localStringBuilder.append(",loginTime=").append(n());
    }
    localStringBuilder.append(",active=").append(this.w);
    if ((e() != null) && (e().length > 0)) {
      localStringBuilder.append(",A1=").append(HexUtil.bytes2HexStr(e()));
    }
    if ((f() != null) && (f().length > 0)) {
      localStringBuilder.append(",A2=").append(HexUtil.bytes2HexStr(f()));
    }
    if ((g() != null) && (g().length > 0)) {
      localStringBuilder.append(",A3=").append(HexUtil.bytes2HexStr(g()));
    }
    if ((h() != null) && (h().length > 0)) {
      localStringBuilder.append(",D1=").append(HexUtil.bytes2HexStr(h()));
    }
    if ((i() != null) && (i().length > 0)) {
      localStringBuilder.append(",D2=").append(HexUtil.bytes2HexStr(i()));
    }
    if ((j() != null) && (j().length > 0)) {
      localStringBuilder.append(",S2=").append(HexUtil.bytes2HexStr(j()));
    }
    if ((k() != null) && (k().length > 0)) {
      localStringBuilder.append(",key=").append(HexUtil.bytes2HexStr(k()));
    }
    if ((r() != null) && (r().length > 0)) {
      localStringBuilder.append(",MiniA2=").append(HexUtil.bytes2HexStr(r()));
    }
    if ((s() != null) && (s().length > 0)) {
      localStringBuilder.append(",MainAccount=").append(HexUtil.bytes2HexStr(s()));
    }
    if ((a() != null) && (a().length > 0)) {
      localStringBuilder.append(",vkey=").append(HexUtil.bytes2HexStr(a()));
    }
    if ((b() != null) && (b().length > 0)) {
      localStringBuilder.append(",skey=").append(HexUtil.bytes2HexStr(b()));
    }
    if ((c() != null) && (c().length > 0)) {
      localStringBuilder.append(",stweb=").append(HexUtil.bytes2HexStr(c()));
    }
    localStringBuilder.append(",FaceId=").append(t());
    localStringBuilder.append(",Age=").append(u());
    localStringBuilder.append(",Gender=").append(v());
    if ((w() != null) && (w().length > 0)) {
      localStringBuilder.append(",NickName=").append(HexUtil.bytes2HexStr(w()));
    }
    if ((l() != null) && (l().length() > 0)) {
      localStringBuilder.append(",sid=").append(l());
    }
    localStringBuilder.append(",renewA2D2Time=").append(A());
    localStringBuilder.append(",renewSidTime=").append(B());
    localStringBuilder.append(",renewSkeyTime=").append(C());
    localStringBuilder.append(",renewWebviewKeyTime=").append(D());
    localStringBuilder.append(",loginedProcess=").append(this.y);
    return localStringBuilder.toString();
  }
  
  public byte[] r()
  {
    return this.n;
  }
  
  public byte[] s()
  {
    return this.o;
  }
  
  public int t()
  {
    return this.p;
  }
  
  public int u()
  {
    return this.q;
  }
  
  public int v()
  {
    return this.r;
  }
  
  public byte[] w()
  {
    return this.s;
  }
  
  public int x()
  {
    return this.b;
  }
  
  public int y()
  {
    return this.x;
  }
  
  public String z()
  {
    return this.y;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.mobileqq.msf.core.auth.a
 * JD-Core Version:    0.7.0.1
 */