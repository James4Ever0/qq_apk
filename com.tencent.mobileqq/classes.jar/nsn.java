import com.tencent.biz.qqstory.storyHome.StoryHomePushYellowBarHandler;
import com.tencent.biz.qqstory.storyHome.qqstorylist.view.widget.NewMessageYellowBar;
import com.tencent.mobileqq.observer.GetRedPointExObserver;
import com.tencent.mobileqq.pb.PBUInt32Field;
import tencent.im.oidb.cmd0x791.oidb_0x791.RedDotInfo;

public class nsn
  extends GetRedPointExObserver
{
  public nsn(StoryHomePushYellowBarHandler paramStoryHomePushYellowBarHandler) {}
  
  protected void a(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof oidb_0x791.RedDotInfo)))
    {
      paramObject = (oidb_0x791.RedDotInfo)paramObject;
      if (paramObject.uint32_appid.get() == 21)
      {
        int i = paramObject.uint32_number.get();
        int j = paramObject.uint32_last_time.get();
        this.a.a.a(i, j);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nsn
 * JD-Core Version:    0.7.0.1
 */