import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.tencent.mobileqq.activity.recent.LocalSearchBar;
import mqq.os.MqqHandler;

public final class xqa
  extends MqqHandler
{
  public xqa(Looper paramLooper, View paramView)
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
      LocalSearchBar.a(this.a);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xqa
 * JD-Core Version:    0.7.0.1
 */