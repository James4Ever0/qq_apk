import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import com.tencent.mobileqq.filemanager.fileviewer.FileView.LocalMusicFileView;
import com.tencent.mobileqq.filemanager.fileviewer.IFileViewListener;
import com.tencent.mobileqq.filemanager.util.FileManagerReporter;

public class dsv
  implements View.OnClickListener
{
  public dsv(LocalMusicFileView paramLocalMusicFileView) {}
  
  public void onClick(View paramView)
  {
    FileManagerReporter.a("0X8004BE2");
    if (LocalMusicFileView.c(this.a) != null) {
      LocalMusicFileView.d(this.a).b(LocalMusicFileView.a(this.a));
    }
    LocalMusicFileView.a(this.a).setProgress(0);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     dsv
 * JD-Core Version:    0.7.0.1
 */