package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.tools.ErrMsg;

class WtloginHelper$HelperThread$6
  implements Runnable
{
  WtloginHelper$HelperThread$6(WtloginHelper.HelperThread paramHelperThread, int paramInt1, int paramInt2) {}
  
  public void run()
  {
    WtloginHelper.HelperThread.access$500(this.this$1);
    if (this.val$cancel != 0) {
      return;
    }
    ErrMsg localErrMsg = y.b(this.this$1.mUserSigInfo._seqence).k;
    y.c(this.this$1.mUserSigInfo._seqence);
    if ((this.this$1.mDwDstSubAppidList == null) && (!WtloginHelper.access$200(this.this$1.this$0).e()))
    {
      WtloginHelper.access$100(this.this$1.mHelper).OnGetStWithoutPasswd(this.this$1.mUserAccount, this.this$1.mDwAppid, this.this$1.mDwDstAppid, this.this$1.mDwMainSigMap, this.this$1.mDwSubDstAppid, this.this$1.mUserSigInfo, this.val$ret, localErrMsg);
      return;
    }
    WtloginHelper.access$100(this.this$1.mHelper).OnGetStWithoutPasswd(this.this$1.mUserAccount, this.this$1.mDwAppid, this.this$1.mDwDstAppid, this.this$1.mDwMainSigMap, this.this$1.mDwSubDstAppid, this.this$1.mDwDstSubAppidList, this.this$1.mUserSigInfo, this.this$1.mST, this.val$ret, localErrMsg);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     oicq.wlogin_sdk.request.WtloginHelper.HelperThread.6
 * JD-Core Version:    0.7.0.1
 */