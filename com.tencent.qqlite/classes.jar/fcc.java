import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.agent.report.ReportCenter;

public class fcc
  extends Handler
{
  public fcc(ReportCenter paramReportCenter, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      this.a.a();
      continue;
      this.a.b();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     fcc
 * JD-Core Version:    0.7.0.1
 */