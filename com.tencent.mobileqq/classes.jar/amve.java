import android.os.Handler.Callback;
import android.os.Message;
import dov.com.qq.im.capture.data.CaptureComboManager;
import dov.com.qq.im.capture.data.CaptureSet;

public class amve
  implements Handler.Callback
{
  public amve(CaptureComboManager paramCaptureComboManager) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return false;
      if ((paramMessage.obj instanceof CaptureSet)) {
        paramMessage = (CaptureSet)paramMessage.obj;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     amve
 * JD-Core Version:    0.7.0.1
 */