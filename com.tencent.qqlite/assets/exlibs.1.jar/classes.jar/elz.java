import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.SystemClock;
import android.widget.Chronometer;
import android.widget.ImageView;
import com.tencent.mobileqq.troop.activity.VideoRecordActivity;

public class elz
  implements MediaPlayer.OnPreparedListener
{
  public elz(VideoRecordActivity paramVideoRecordActivity) {}
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    VideoRecordActivity.a(this.a).setBase(SystemClock.elapsedRealtime());
    VideoRecordActivity.a(this.a).start();
    VideoRecordActivity.a(this.a).start();
    VideoRecordActivity.a(this.a, 2);
    VideoRecordActivity.a(this.a).setVisibility(4);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     elz
 * JD-Core Version:    0.7.0.1
 */