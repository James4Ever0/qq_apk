import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.widget.SlideTabWidget;

public class ezn
  extends Handler
{
  public ezn(SlideTabWidget paramSlideTabWidget) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      SlideTabWidget.a(this.a, 0.0F);
      SlideTabWidget.a(this.a, 0.1D);
      this.a.invalidate();
      sendMessageDelayed(SlideTabWidget.a(this.a).obtainMessage(1), 10L);
      return;
    case 1: 
      if (SlideTabWidget.a(this.a) < 1.0F)
      {
        SlideTabWidget.a(this.a, 0.1D);
        if (SlideTabWidget.a(this.a) >= 1.0F) {
          SlideTabWidget.a(this.a, false);
        }
        this.a.invalidate();
        sendMessageDelayed(SlideTabWidget.a(this.a).obtainMessage(1), 10L);
        return;
      }
      sendMessageDelayed(SlideTabWidget.a(this.a).obtainMessage(2), 10L);
      return;
    }
    SlideTabWidget.a(this.a, 1.0F);
    SlideTabWidget.a(this.a, SlideTabWidget.a(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ezn
 * JD-Core Version:    0.7.0.1
 */