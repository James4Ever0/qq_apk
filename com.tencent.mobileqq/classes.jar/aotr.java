import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.qphone.base.util.BaseApplication;
import dov.com.tencent.mobileqq.richmedia.VideoSendTaskManager;
import java.util.HashMap;

public class aotr
  implements Runnable
{
  public aotr(VideoSendTaskManager paramVideoSendTaskManager, HashMap paramHashMap) {}
  
  public void run()
  {
    StatisticCollector.a(BaseApplication.getContext()).a(null, "actPreUploadVideoCancel", true, 0L, -1L, this.jdField_a_of_type_JavaUtilHashMap, "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aotr
 * JD-Core Version:    0.7.0.1
 */