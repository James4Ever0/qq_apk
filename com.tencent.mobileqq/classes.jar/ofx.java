import com.tencent.biz.qqstory.boundaries.extension.widgets.TrimTextureVideoView;
import com.tencent.biz.qqstory.playvideo.player.mediaplayer.wrapper.IMediaPlayer;
import com.tencent.biz.qqstory.playvideo.player.mediaplayer.wrapper.IMediaPlayer.OnErrorListener;
import com.tencent.biz.qqstory.takevideo.LocalVideoSelectActivity;

public class ofx
  implements IMediaPlayer.OnErrorListener
{
  public ofx(LocalVideoSelectActivity paramLocalVideoSelectActivity) {}
  
  public boolean a(IMediaPlayer paramIMediaPlayer, int paramInt1, int paramInt2)
  {
    LocalVideoSelectActivity.a(this.a).a();
    LocalVideoSelectActivity.a(this.a).a(true);
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ofx
 * JD-Core Version:    0.7.0.1
 */