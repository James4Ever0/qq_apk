import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.mobileqq.utils.AudioUtil;

public final class akbu
  implements MediaPlayer.OnCompletionListener
{
  public akbu(MediaPlayer.OnCompletionListener paramOnCompletionListener) {}
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    if (AudioUtil.b() == 0)
    {
      if (this.a != null)
      {
        this.a.onCompletion(AudioUtil.a);
        return;
      }
      AudioUtil.a();
      return;
    }
    AudioUtil.c();
    AudioUtil.a.start();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     akbu
 * JD-Core Version:    0.7.0.1
 */