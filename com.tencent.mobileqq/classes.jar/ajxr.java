import com.tencent.mobileqq.webprocess.WebAccelerateHelper;
import com.tencent.mobileqq.webprocess.WebProcessReceiver;
import com.tencent.sonic.sdk.SonicEngine;
import java.util.Map;

public class ajxr
  implements Runnable
{
  public ajxr(WebProcessReceiver paramWebProcessReceiver, Map paramMap) {}
  
  public void run()
  {
    WebAccelerateHelper.getSonicEngine().removeExpiredSessionCache(this.jdField_a_of_type_JavaUtilMap);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     ajxr
 * JD-Core Version:    0.7.0.1
 */