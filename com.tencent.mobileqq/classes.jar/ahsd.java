import android.os.FileObserver;
import com.tencent.mobileqq.statistics.ThreadTraceHelper;
import com.tencent.qphone.base.util.QLog;

public class ahsd
  extends FileObserver
{
  public ahsd(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  public void onEvent(int paramInt, String arg2)
  {
    QLog.e("UnifiedMonitor.Trace", 1, "dumpTraces onEvent " + ???);
    synchronized (ThreadTraceHelper.a())
    {
      notifyAll();
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     ahsd
 * JD-Core Version:    0.7.0.1
 */