import android.app.Activity;
import android.graphics.Bitmap;
import com.tencent.mobileqq.filemanager.fileviewer.FileView.LocalVideoFileView;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil.IGetVideoCallback;

public class dtf
  implements FileManagerUtil.IGetVideoCallback
{
  public dtf(LocalVideoFileView paramLocalVideoFileView) {}
  
  public void a(Bitmap paramBitmap)
  {
    LocalVideoFileView.a(this.a).runOnUiThread(new dtg(this, paramBitmap));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     dtf
 * JD-Core Version:    0.7.0.1
 */