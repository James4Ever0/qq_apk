import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.widget.Chronometer;
import android.widget.ImageView;
import com.tencent.mobileqq.troop.activity.VideoRecordActivity;

public class elt
  implements MediaPlayer.OnCompletionListener
{
  public elt(VideoRecordActivity paramVideoRecordActivity) {}
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    VideoRecordActivity.a(this.a).stop();
    VideoRecordActivity.a(this.a, 1);
    VideoRecordActivity.a(this.a).setVisibility(8);
    VideoRecordActivity.a(this.a).setVisibility(0);
    VideoRecordActivity.a(this.a).bringToFront();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     elt
 * JD-Core Version:    0.7.0.1
 */