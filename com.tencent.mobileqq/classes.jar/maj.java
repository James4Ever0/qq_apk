import android.view.View;
import android.widget.TextView;
import com.tencent.biz.pubaccount.VideoInfo;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsAdapter;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsAdapter.VideoItemHolder;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsListView;
import java.util.List;

public class maj
  implements Runnable
{
  public maj(VideoFeedsAdapter paramVideoFeedsAdapter) {}
  
  public void run()
  {
    VideoInfo localVideoInfo = (VideoInfo)VideoFeedsAdapter.a(this.a).get(0);
    if (VideoFeedsAdapter.a(this.a).getFirstVisiblePosition() == 0)
    {
      Object localObject = VideoFeedsAdapter.a(this.a).getChildAt(VideoFeedsAdapter.a(this.a).getHeaderViewsCount());
      if ((localObject != null) && ((((View)localObject).getTag() instanceof VideoFeedsAdapter.VideoItemHolder)))
      {
        localObject = (VideoFeedsAdapter.VideoItemHolder)((View)localObject).getTag();
        ((VideoFeedsAdapter.VideoItemHolder)localObject).d.setText(localVideoInfo.c);
        ((VideoFeedsAdapter.VideoItemHolder)localObject).m.setText(localVideoInfo.c);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     maj
 * JD-Core Version:    0.7.0.1
 */