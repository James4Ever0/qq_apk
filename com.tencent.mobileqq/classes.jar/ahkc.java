import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mobileqq.shortvideo.BaseShortVideoOprerator;

public class ahkc
  extends Handler
{
  public ahkc(BaseShortVideoOprerator paramBaseShortVideoOprerator, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    this.a.a(paramMessage);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahkc
 * JD-Core Version:    0.7.0.1
 */