import android.hardware.SensorManager;
import com.tencent.mobileqq.activity.ChatHistory;
import com.tencent.mobileqq.activity.ChatHistory.PlayingPttHistoryInfo;
import com.tencent.mobileqq.activity.aio.AudioPlayer;
import com.tencent.mobileqq.activity.aio.AudioPlayer.AudioPlayerListener;

public class cif
  implements AudioPlayer.AudioPlayerListener
{
  public cif(ChatHistory paramChatHistory) {}
  
  public void a(AudioPlayer paramAudioPlayer)
  {
    this.a.l();
    if (this.a.a != null) {
      this.a.a.b();
    }
    this.a.setVolumeControlStream(3);
    ChatHistory.a(this.a).unregisterListener(this.a);
  }
  
  public void a(AudioPlayer paramAudioPlayer, int paramInt)
  {
    this.a.a(2131563199);
    this.a.setVolumeControlStream(3);
    ChatHistory.a(this.a).unregisterListener(this.a);
  }
  
  public void b(AudioPlayer paramAudioPlayer, int paramInt)
  {
    this.a.setVolumeControlStream(paramInt);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     cif
 * JD-Core Version:    0.7.0.1
 */