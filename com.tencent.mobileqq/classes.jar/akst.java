import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.mobileqq.vipav.VipFunCallMediaListener;

public final class akst
  implements MediaPlayer.OnPreparedListener
{
  public akst(VipFunCallMediaListener paramVipFunCallMediaListener) {}
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer.start();
    paramMediaPlayer.setLooping(true);
    if (this.a != null) {
      this.a.a();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     akst
 * JD-Core Version:    0.7.0.1
 */