package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.common.l;

final class aj
  implements Runnable
{
  aj(Context paramContext, StatSpecifyReportedInfo paramStatSpecifyReportedInfo) {}
  
  public final void run()
  {
    if (this.a == null)
    {
      StatServiceImpl.f().error("The Context of StatService.onResume() can not be null!");
      return;
    }
    StatServiceImpl.trackBeginPage(this.a, l.f(this.a), this.b);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.wxop.stat.aj
 * JD-Core Version:    0.7.0.1
 */