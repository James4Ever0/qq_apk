import android.graphics.Bitmap;
import com.tencent.mobileqq.transfile.VideoThumbDownloader;
import com.tencent.mobileqq.transfile.bitmapcreator.BitmapDecoder;
import com.tencent.qphone.base.util.QLog;
import java.net.URL;

public class aidz
  implements BitmapDecoder
{
  public aidz(VideoThumbDownloader paramVideoThumbDownloader) {}
  
  public Bitmap a(URL paramURL)
  {
    String str = paramURL.getPath();
    try
    {
      Bitmap localBitmap = VideoThumbDownloader.a(this.a, str);
      paramURL = localBitmap;
      if (localBitmap == null) {
        paramURL = VideoThumbDownloader.b(this.a, str);
      }
      return paramURL;
    }
    catch (Throwable paramURL)
    {
      QLog.e("VIdeoThumbDownloader", 2, "getBitmap", paramURL);
    }
    return null;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aidz
 * JD-Core Version:    0.7.0.1
 */