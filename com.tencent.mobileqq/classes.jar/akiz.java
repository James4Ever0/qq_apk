import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mobileqq.widget.WebViewProgressBarController;
import mqq.util.WeakReference;

public class akiz
  extends Handler
{
  final WeakReference a;
  
  public akiz(WebViewProgressBarController paramWebViewProgressBarController)
  {
    super(Looper.getMainLooper());
    this.a = new WeakReference(paramWebViewProgressBarController);
  }
  
  public void handleMessage(Message paramMessage)
  {
    WebViewProgressBarController localWebViewProgressBarController = (WebViewProgressBarController)this.a.get();
    if (localWebViewProgressBarController == null) {
      return;
    }
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    localWebViewProgressBarController.e();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     akiz
 * JD-Core Version:    0.7.0.1
 */