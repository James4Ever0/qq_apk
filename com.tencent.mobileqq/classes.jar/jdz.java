import android.os.Handler;
import com.tencent.av.VideoController;
import com.tencent.av.app.SessionInfo;
import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.utils.QAVNotification;
import com.tencent.av.utils.UITools;

public class jdz
  implements Runnable
{
  public jdz(VideoController paramVideoController) {}
  
  public void run()
  {
    if (this.a.f) {
      return;
    }
    String str = UITools.a(this.a.a());
    QAVNotification.a(this.a.a).a(this.a.a().b, this.a.a().d, str);
    this.a.a.a().postDelayed(this, 1000L);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jdz
 * JD-Core Version:    0.7.0.1
 */