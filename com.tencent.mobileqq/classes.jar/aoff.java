import android.widget.ImageView;
import com.tencent.biz.qqstory.playvideo.player.mediaplayer.wrapper.IMediaPlayer;
import com.tencent.biz.qqstory.playvideo.player.mediaplayer.wrapper.IMediaPlayer.OnPreparedListener;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.biz.qqstory.takevideo.view.widget.frameSelectBar.ScrollFrameSelectBar;
import dov.com.tencent.biz.qqstory.takevideo.LocalVideoSelectActivity;

public class aoff
  implements IMediaPlayer.OnPreparedListener
{
  public aoff(LocalVideoSelectActivity paramLocalVideoSelectActivity) {}
  
  public void a_(IMediaPlayer paramIMediaPlayer)
  {
    SLog.d("Q.qqstory.publish.edit.LocalVideoSelectActivity", "video prrepared completed!");
    LocalVideoSelectActivity.a(this.a).b();
    LocalVideoSelectActivity.a(this.a).postDelayed(new aofg(this), 300L);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aoff
 * JD-Core Version:    0.7.0.1
 */