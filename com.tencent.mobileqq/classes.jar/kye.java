import android.media.AudioManager;
import android.widget.ImageView;
import com.tencent.biz.pubaccount.NativeAd.view.ReadInJoyNativeAdAppVideoView;
import com.tencent.qqlive.mediaplayer.api.TVK_IMediaPlayer;

class kye
  implements Runnable
{
  kye(kyd paramkyd) {}
  
  public void run()
  {
    if (ReadInJoyNativeAdAppVideoView.a(this.a.a).getStreamVolume(3) > 0)
    {
      ReadInJoyNativeAdAppVideoView.b(this.a.a).setImageResource(2130839655);
      ReadInJoyNativeAdAppVideoView.a(this.a.a).setOutputMute(false);
      return;
    }
    ReadInJoyNativeAdAppVideoView.b(this.a.a).setImageResource(2130839654);
    ReadInJoyNativeAdAppVideoView.a(this.a.a).setOutputMute(true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kye
 * JD-Core Version:    0.7.0.1
 */