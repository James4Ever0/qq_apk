package com.tencent.av.ui.redbag;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.qphone.base.util.QLog;

class GetRedBag$1
  extends ResultReceiver
{
  GetRedBag$1(GetRedBag paramGetRedBag, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      QLog.d(this.a.i, 1, "onReceiveResult, 忽略");
      this.a.a(-6, 5000L);
      return;
    }
    GetRedBag.a(this.a, paramInt, paramBundle);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     com.tencent.av.ui.redbag.GetRedBag.1
 * JD-Core Version:    0.7.0.1
 */