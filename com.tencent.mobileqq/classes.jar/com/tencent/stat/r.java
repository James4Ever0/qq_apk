package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.event.b;
import com.tencent.stat.event.c;

final class r
  implements Runnable
{
  r(Context paramContext, StatSpecifyReportedInfo paramStatSpecifyReportedInfo, c paramc, int paramInt) {}
  
  public void run()
  {
    try
    {
      b localb = new b(this.a, StatServiceImpl.a(this.a, false, this.b), this.c.a, this.b);
      localb.b().c = this.c.c;
      Long localLong = Long.valueOf(this.d);
      if (localLong.longValue() <= 0L) {}
      for (long l = 1L;; l = localLong.longValue())
      {
        localb.a(Long.valueOf(l).longValue());
        new ab(localb).a();
        return;
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      StatServiceImpl.f().e(localThrowable);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.stat.r
 * JD-Core Version:    0.7.0.1
 */