import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.view.SurfaceHolder;
import com.tencent.mobileqq.troop.widget.VideoViewX;

public class erb
  implements MediaPlayer.OnVideoSizeChangedListener
{
  public erb(VideoViewX paramVideoViewX) {}
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    VideoViewX.a(this.a, paramMediaPlayer.getVideoWidth());
    VideoViewX.b(this.a, paramMediaPlayer.getVideoHeight());
    if ((VideoViewX.b(this.a) != 0) && (VideoViewX.c(this.a) != 0))
    {
      this.a.getHolder().setFixedSize(VideoViewX.b(this.a), VideoViewX.c(this.a));
      this.a.requestLayout();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     erb
 * JD-Core Version:    0.7.0.1
 */