import com.tencent.biz.qqstory.model.TroopNickNameManager;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class nbv
  implements Runnable
{
  public nbv(TroopNickNameManager paramTroopNickNameManager) {}
  
  public void run()
  {
    long l = System.currentTimeMillis();
    Iterator localIterator = this.a.a.entrySet().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      if (l - ((Long)((Map.Entry)localIterator.next()).getValue()).longValue() < 30000L) {
        break label115;
      }
      localIterator.remove();
      i += 1;
    }
    label115:
    for (;;)
    {
      break;
      if ((i > 0) && (QLog.isColorLevel())) {
        QLog.d("TroopNickNameManager", 2, "timeout count=" + i);
      }
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nbv
 * JD-Core Version:    0.7.0.1
 */