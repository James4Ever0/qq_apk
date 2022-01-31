package com.weiyun.sdk.job.api;

import com.weiyun.sdk.log.Log;
import com.weiyun.sdk.util.NetworkUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

public class UploadTaskRequestRetryHandler
  extends DefaultHttpRequestRetryHandler
{
  private static final String TAG = "UploadTaskRequestRetryHandler";
  
  public UploadTaskRequestRetryHandler() {}
  
  public UploadTaskRequestRetryHandler(int paramInt, boolean paramBoolean)
  {
    super(paramInt, paramBoolean);
  }
  
  public boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    Log.d("UploadTaskRequestRetryHandler", "retryRequest, executionCount: " + paramInt);
    if (paramIOException == null) {
      throw new IllegalArgumentException("Exception parameter may not be null");
    }
    if (paramHttpContext == null) {
      throw new IllegalArgumentException("HTTP context may not be null");
    }
    if (!NetworkUtils.hasInternet(null)) {}
    for (;;)
    {
      return false;
      if (paramInt < getRetryCount())
      {
        if ((paramIOException instanceof NoHttpResponseException)) {
          return true;
        }
        if ((paramIOException instanceof InterruptedIOException)) {
          return true;
        }
        if ((paramIOException instanceof UnknownHostException)) {
          return true;
        }
        if (!(paramIOException instanceof SSLHandshakeException))
        {
          if ((paramIOException instanceof SocketException)) {
            return true;
          }
          if ((paramIOException instanceof SocketTimeoutException)) {
            return true;
          }
          paramIOException = (Boolean)paramHttpContext.getAttribute("http.request_sent");
          if ((paramIOException != null) && (paramIOException.booleanValue())) {}
          for (paramInt = 1; (paramInt == 0) || (isRequestSentRetryEnabled()); paramInt = 0) {
            return true;
          }
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     com.weiyun.sdk.job.api.UploadTaskRequestRetryHandler
 * JD-Core Version:    0.7.0.1
 */