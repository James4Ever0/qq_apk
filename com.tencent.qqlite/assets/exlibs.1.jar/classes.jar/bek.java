import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.tencent.mobileqq.activity.QQSetting;

public class bek
  extends Handler
{
  public bek(QQSetting paramQQSetting) {}
  
  public void handleMessage(Message paramMessage)
  {
    ((View)paramMessage.obj).setVisibility(8);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bek
 * JD-Core Version:    0.7.0.1
 */