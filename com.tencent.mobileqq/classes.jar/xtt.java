import com.tencent.mobileqq.activity.richmedia.trimvideo.video.widget.VideoFramesRetriever;
import java.util.concurrent.ConcurrentHashMap;

public class xtt
  implements Comparable
{
  public int a;
  public long a;
  public int b;
  
  public xtt(VideoFramesRetriever paramVideoFramesRetriever, long paramLong, int paramInt1, int paramInt2)
  {
    this.jdField_a_of_type_Long = paramLong;
    this.jdField_a_of_type_Int = paramInt1;
    this.b = Math.min(paramInt2, VideoFramesRetriever.a(paramVideoFramesRetriever));
    VideoFramesRetriever.a(paramVideoFramesRetriever).put(Integer.valueOf(paramInt1), this);
  }
  
  public int a(xtt paramxtt)
  {
    return -(int)(this.jdField_a_of_type_Long - paramxtt.jdField_a_of_type_Long);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xtt
 * JD-Core Version:    0.7.0.1
 */