import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsAppJumpManager;
import com.tencent.biz.pubaccount.readinjoy.video.VideoFeedsPlayActivity;
import com.tencent.widget.AbsListView;
import com.tencent.widget.AbsListView.OnScrollListener;

public class mdd
  implements AbsListView.OnScrollListener
{
  public mdd(VideoFeedsPlayActivity paramVideoFeedsPlayActivity) {}
  
  public void a(AbsListView paramAbsListView, int paramInt)
  {
    if ((VideoFeedsPlayActivity.j(this.a)) && (paramInt == 1)) {
      VideoFeedsPlayActivity.b(this.a);
    }
    if ((VideoFeedsPlayActivity.a(this.a) != null) && (paramInt == 1)) {
      VideoFeedsPlayActivity.a(this.a).a(1);
    }
  }
  
  public void a(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mdd
 * JD-Core Version:    0.7.0.1
 */