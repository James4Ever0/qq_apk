package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.b.aw;
import oicq.wlogin_sdk.b.ay;
import oicq.wlogin_sdk.b.cl;
import oicq.wlogin_sdk.b.f;
import oicq.wlogin_sdk.b.g;
import oicq.wlogin_sdk.b.t;
import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

public class v
  extends o
{
  public v(y paramy)
  {
    this.s = 2064;
    this.t = 3;
    this.u = "wtlogin.login";
    this.w = paramy;
    this.w.m = 0;
  }
  
  public int a(int paramInt1, int paramInt2, long[] paramArrayOfLong, WUserSigInfo paramWUserSigInfo)
  {
    int j = y.u;
    f localf = y.b(this.w.h).m;
    if (localf == null) {
      localf = new f();
    }
    for (;;)
    {
      int i = 0;
      for (;;)
      {
        byte[] arrayOfByte = a(localf.b(), paramInt1, paramInt2, paramArrayOfLong);
        a(this.h, this.s, this.i, this.w.f, this.l, this.m, j, this.o, arrayOfByte);
        int k = a(String.valueOf(this.w.f), false, paramWUserSigInfo);
        if (k != 0) {
          return k;
        }
        k = b();
        util.LOGI("retry num:" + i + " ret:" + k, "" + this.w.f);
        if (k != 180) {
          return k;
        }
        if (i >= 1) {
          return k;
        }
        i += 1;
      }
    }
  }
  
  public byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long[] paramArrayOfLong)
  {
    Object localObject1 = new cl();
    f localf = new f();
    Object localObject2 = new t();
    localObject1 = ((cl)localObject1).a(0, y.s, 0);
    paramArrayOfByte = localf.a(paramArrayOfByte);
    paramArrayOfLong = ((t)localObject2).a(paramInt1, paramInt2, paramArrayOfLong);
    localObject2 = new byte[localObject1.length + paramArrayOfByte.length + paramArrayOfLong.length];
    System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
    paramInt1 = localObject1.length + 0;
    System.arraycopy(paramArrayOfByte, 0, localObject2, paramInt1, paramArrayOfByte.length);
    paramInt1 += paramArrayOfByte.length;
    System.arraycopy(paramArrayOfLong, 0, localObject2, paramInt1, paramArrayOfLong.length);
    paramInt1 = paramArrayOfLong.length;
    return a((byte[])localObject2, this.t, 3);
  }
  
  public int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = new f();
    g localg = new g();
    ay localay = new ay();
    aw localaw = new aw();
    k localk = y.b(this.w.h);
    paramInt2 = c(paramArrayOfByte, paramInt1 + 2);
    util.LOGD(getClass().getName(), "type=" + paramInt2);
    int j = paramInt1 + 5;
    switch (paramInt2)
    {
    default: 
      b(paramArrayOfByte, j, this.b - j - 1);
      paramInt1 = paramInt2;
    }
    int i;
    do
    {
      do
      {
        do
        {
          return paramInt1;
          i = localf.b(paramArrayOfByte, j, this.b - j);
          paramInt1 = i;
        } while (i < 0);
        localk.m = localf;
        i = localg.b(paramArrayOfByte, j, this.b - j);
        paramInt1 = i;
      } while (i < 0);
      localk.n = localg;
      if (localay.b(paramArrayOfByte, j, this.b - j) >= 0) {}
      for (localk.o = localay;; localk.o = new ay())
      {
        a((ErrMsg)null);
        return paramInt2;
      }
      i = localaw.b(paramArrayOfByte, j, this.b - j - 1);
      paramInt1 = i;
    } while (i < 0);
    a(localaw);
    util.LOGD("0xb4 parse t161 called");
    b(paramArrayOfByte, j, this.b - j - 1);
    return paramInt2;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     oicq.wlogin_sdk.request.v
 * JD-Core Version:    0.7.0.1
 */