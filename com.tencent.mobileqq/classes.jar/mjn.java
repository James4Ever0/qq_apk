import com.tencent.biz.pubaccount.PublicAccountReportUtils;
import com.tencent.biz.pubaccount.VideoReporter;
import com.tencent.biz.pubaccount.readinjoy.struct.BaseArticleInfo;
import com.tencent.biz.pubaccount.readinjoy.video.VideoPlayManager.VideoPlayParam;
import com.tencent.biz.pubaccount.readinjoy.video.VideoUIManager;

public class mjn
  implements Runnable
{
  public mjn(VideoUIManager paramVideoUIManager) {}
  
  public void run()
  {
    if ((VideoUIManager.a(this.a) != null) && (VideoUIManager.a(this.a).a != null)) {
      PublicAccountReportUtils.a(null, "", "0X8008AD0", "0X8008AD0", 0, 0, "", "", "", VideoReporter.a(VideoUIManager.a(this.a).a.mVideoVid, VideoUIManager.a(this.a).a.innerUniqueID, (int)VideoUIManager.a(this.a).a.mChannelID, null), false);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mjn
 * JD-Core Version:    0.7.0.1
 */