import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsHelper;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsPlayManager;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsPlayManager.VideoPlayParam;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayerWrapper;

public class mdf
  implements SeekBar.OnSeekBarChangeListener
{
  public mdf(VideoFeedsPlayManager paramVideoFeedsPlayManager) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((VideoFeedsPlayManager.a(this.a) == null) || (!paramBoolean)) {
      return;
    }
    VideoFeedsPlayManager.b(this.a, System.currentTimeMillis());
    long l = VideoFeedsPlayManager.a(this.a).b();
    double d = paramInt / 100.0D;
    paramInt = (int)(l * d);
    VideoFeedsHelper.a(VideoFeedsPlayManager.a(this.a).a, paramInt);
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    VideoFeedsPlayManager.d(this.a, true);
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if (VideoFeedsPlayManager.a(this.a) == null) {
      return;
    }
    VideoFeedsPlayManager.d(this.a, false);
    int i = paramSeekBar.getProgress();
    long l = VideoFeedsPlayManager.a(this.a).b();
    i = (int)(i / 100.0D * l);
    VideoFeedsPlayManager.a(this.a).a(i);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mdf
 * JD-Core Version:    0.7.0.1
 */