package com.tencent.tmassistantsdk.internal.b;

import com.tencent.assistant.sdk.remote.SDKActionCallback.Stub;
import com.tencent.tmassistantbase.util.r;
import com.tencent.tmdownloader.s;
import java.util.ArrayList;

class c
  extends SDKActionCallback.Stub
{
  c(b paramb) {}
  
  public void onActionResult(byte[] paramArrayOfByte)
  {
    r.c("TMAssistantDownloadOpenSDKClient", "onActionResult  callBack data:" + paramArrayOfByte + "  mListeners.size:" + this.a.a.size());
    s.a().a(paramArrayOfByte, this.a.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     com.tencent.tmassistantsdk.internal.b.c
 * JD-Core Version:    0.7.0.1
 */