import com.tencent.av.VideoController.GAudioFriends;
import com.tencent.av.ui.MultiVideoMembersListviewAvtivity;
import java.util.Comparator;

public class jyn
  implements Comparator
{
  public jyn(MultiVideoMembersListviewAvtivity paramMultiVideoMembersListviewAvtivity) {}
  
  public int a(VideoController.GAudioFriends paramGAudioFriends1, VideoController.GAudioFriends paramGAudioFriends2)
  {
    if ((paramGAudioFriends2.b) && (paramGAudioFriends1.b)) {
      return paramGAudioFriends2.e - paramGAudioFriends1.e;
    }
    if ((!paramGAudioFriends2.b) && (!paramGAudioFriends1.b)) {
      return paramGAudioFriends2.e - paramGAudioFriends1.e;
    }
    if ((paramGAudioFriends2.b) && (!paramGAudioFriends1.b)) {
      return 1;
    }
    return -1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jyn
 * JD-Core Version:    0.7.0.1
 */