import android.os.Handler;
import android.os.Message;
import com.tencent.av.AVLog;
import com.tencent.av.ui.funchat.zimu.ZimuItemViewFilm;
import java.lang.ref.WeakReference;

public class kdz
  extends Handler
{
  WeakReference a;
  
  public kdz(ZimuItemViewFilm paramZimuItemViewFilm)
  {
    this.a = new WeakReference(paramZimuItemViewFilm);
  }
  
  public void handleMessage(Message paramMessage)
  {
    ZimuItemViewFilm localZimuItemViewFilm = (ZimuItemViewFilm)this.a.get();
    if (localZimuItemViewFilm != null) {}
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    ZimuItemViewFilm.a(localZimuItemViewFilm);
    AVLog.c("ZimuItemViewFilm", "ITEM_DISPEAR");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kdz
 * JD-Core Version:    0.7.0.1
 */