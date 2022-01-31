package com.tencent.plato.mqq.network;

import android.support.annotation.Nullable;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

public class ProgressResponseBody
  extends ResponseBody
{
  @Nullable
  private BufferedSource mBufferedSource;
  private final ProgressListener mProgressListener;
  private final ResponseBody mResponseBody;
  private long mTotalBytesRead;
  
  public ProgressResponseBody(ResponseBody paramResponseBody, ProgressListener paramProgressListener)
  {
    this.mResponseBody = paramResponseBody;
    this.mProgressListener = paramProgressListener;
    this.mTotalBytesRead = 0L;
  }
  
  private Source source(Source paramSource)
  {
    return new ProgressResponseBody.1(this, paramSource);
  }
  
  public long contentLength()
  {
    try
    {
      long l = this.mResponseBody.contentLength();
      return l;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return 0L;
  }
  
  public MediaType contentType()
  {
    return this.mResponseBody.contentType();
  }
  
  public BufferedSource source()
  {
    if (this.mBufferedSource == null) {}
    try
    {
      this.mBufferedSource = Okio.buffer(source(this.mResponseBody.source()));
      return this.mBufferedSource;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public long totalBytesRead()
  {
    return this.mTotalBytesRead;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     com.tencent.plato.mqq.network.ProgressResponseBody
 * JD-Core Version:    0.7.0.1
 */