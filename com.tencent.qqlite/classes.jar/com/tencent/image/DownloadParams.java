package com.tencent.image;

import java.net.URL;
import org.apache.http.Header;
import org.apache.http.client.CookieStore;

public class DownloadParams
{
  public CookieStore cookies;
  public long downloaded;
  public Header[] headers;
  public boolean mAutoScaleByDensity;
  public float mGifRoundCorner;
  public int outHeight;
  public int outOrientation = 0;
  public int outWidth;
  public int reqHeight;
  public int reqWidth;
  public Object tag;
  public URL url;
  public String urlStr;
  public boolean useExifOrientation;
  public boolean useGifAnimation;
  
  public Header getHeader(String paramString)
  {
    Header[] arrayOfHeader;
    int j;
    int i;
    if (this.headers != null)
    {
      arrayOfHeader = this.headers;
      j = arrayOfHeader.length;
      i = 0;
    }
    for (;;)
    {
      Object localObject;
      if (i >= j) {
        localObject = null;
      }
      Header localHeader;
      do
      {
        return localObject;
        localHeader = arrayOfHeader[i];
        if (paramString == null) {
          break;
        }
        localObject = localHeader;
      } while (paramString.equals(localHeader.getName()));
      i += 1;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     com.tencent.image.DownloadParams
 * JD-Core Version:    0.7.0.1
 */