import com.tencent.biz.qqstory.comment.FeedCommentLikeLego;
import com.tencent.biz.qqstory.newshare.callback.OnSimpleShareListener;
import com.tencent.biz.qqstory.storyHome.model.CommentLikeFeedItem;
import com.tencent.biz.qqstory.support.report.StoryReportor;

class nfu
  extends OnSimpleShareListener
{
  nfu(nfs paramnfs) {}
  
  public void a()
  {
    super.a();
    FeedCommentLikeLego.a(this.a.a, null);
  }
  
  public void a(int paramInt)
  {
    super.a(paramInt);
    StoryReportor.a("home_page", "suc_share", 1, paramInt, new String[] { StoryReportor.b(this.a.a.a) + "", StoryReportor.a(this.a.a.a) + "", this.a.a.a.feedId });
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nfu
 * JD-Core Version:    0.7.0.1
 */