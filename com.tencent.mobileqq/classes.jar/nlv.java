import com.tencent.biz.qqstory.model.item.StoryVideoItem;
import com.tencent.biz.qqstory.playmode.child.TroopStoryPlayModeBase;
import com.tencent.biz.qqstory.playmode.util.PlayModeUtils;
import com.tencent.biz.qqstory.storyHome.model.VideoListFeedItem;
import com.tencent.biz.qqstory.support.report.StoryReportor;

public class nlv
  implements Runnable
{
  public nlv(TroopStoryPlayModeBase paramTroopStoryPlayModeBase, StoryVideoItem paramStoryVideoItem1, StoryVideoItem paramStoryVideoItem2, VideoListFeedItem paramVideoListFeedItem, boolean paramBoolean) {}
  
  public void run()
  {
    PlayModeUtils.a(this.jdField_a_of_type_ComTencentBizQqstoryModelItemStoryVideoItem, this.b.mStoryType, String.valueOf(this.jdField_a_of_type_ComTencentBizQqstoryPlaymodeChildTroopStoryPlayModeBase.hashCode()));
    int i = this.jdField_a_of_type_ComTencentBizQqstoryPlaymodeChildTroopStoryPlayModeBase.a();
    String str2 = PlayModeUtils.a(this.jdField_a_of_type_ComTencentBizQqstoryPlaymodeChildTroopStoryPlayModeBase.a, this.jdField_a_of_type_ComTencentBizQqstoryPlaymodeChildTroopStoryPlayModeBase.b);
    if (this.jdField_a_of_type_ComTencentBizQqstoryStoryHomeModelVideoListFeedItem == null)
    {
      str1 = "";
      StoryReportor.a("story_grp", "clk_one", i, 0, new String[] { "3", str2, "", str1 });
      if (!this.jdField_a_of_type_Boolean) {
        break label130;
      }
    }
    label130:
    for (String str1 = "2";; str1 = "1")
    {
      StoryReportor.a("play_video", "clk_download", 0, 0, new String[] { str1 });
      return;
      str1 = this.jdField_a_of_type_ComTencentBizQqstoryStoryHomeModelVideoListFeedItem.feedId;
      break;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nlv
 * JD-Core Version:    0.7.0.1
 */