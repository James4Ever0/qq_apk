import com.dataline.mpfile.LiteMpFileMainActivity;
import com.dataline.mpfile.MpfileFileListDownloader.MpFileHttpDownloadListener;

public class cs
  implements MpfileFileListDownloader.MpFileHttpDownloadListener
{
  public cs(LiteMpFileMainActivity paramLiteMpFileMainActivity) {}
  
  public void a(int paramInt, String paramString)
  {
    if (this.a.isFinishing()) {
      return;
    }
    LiteMpFileMainActivity.a(this.a, System.currentTimeMillis());
    this.a.runOnUiThread(new ct(this));
  }
  
  public void a(int paramInt, String paramString1, String paramString2)
  {
    if (this.a.isFinishing()) {
      return;
    }
    LiteMpFileMainActivity.a(this.a, System.currentTimeMillis());
    LiteMpFileMainActivity.b(this.a, paramString2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     cs
 * JD-Core Version:    0.7.0.1
 */