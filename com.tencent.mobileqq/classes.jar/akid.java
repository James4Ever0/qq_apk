import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import java.util.concurrent.BlockingQueue;

public class akid
  extends Handler
{
  private long a = 0L;
  
  private akid(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private void a(long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQToast", 2, "scheduleNextToast to " + paramLong);
    }
    removeMessages(1);
    sendEmptyMessageDelayed(1, paramLong);
  }
  
  private void a(akic paramakic)
  {
    long l2 = 0L;
    paramakic = paramakic.a();
    long l1;
    int i;
    if (paramakic != null)
    {
      paramakic.a();
      if (QQToast.a(paramakic) == 0)
      {
        l1 = 2000L;
        this.a = (System.currentTimeMillis() + l1);
        i = 1;
      }
    }
    for (;;)
    {
      if (!QQToast.a().isEmpty())
      {
        if (i != 0) {
          l2 = 100L + l1;
        }
        a(l2);
      }
      return;
      l1 = 3500L;
      break;
      i = 0;
      l1 = 0L;
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    long l;
    do
    {
      return;
      if (QLog.isColorLevel()) {
        QLog.d("QQToast", 2, "MSG_SHOW_TOAST received");
      }
      l = System.currentTimeMillis();
      if (l <= this.a + 100L) {
        break;
      }
      paramMessage = (akic)QQToast.a().poll();
      if (paramMessage != null)
      {
        a(paramMessage);
        return;
      }
    } while (!QLog.isColorLevel());
    QLog.d("QQToast", 2, "MSG_SHOW_TOAST but no message to show");
    return;
    a(this.a - l + 100L);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     akid
 * JD-Core Version:    0.7.0.1
 */