import android.os.Handler;
import com.tencent.mobileqq.activity.richmedia.QzDynamicVideoPreviewActivity;
import com.tencent.mobileqq.activity.richmedia.p2veffect.listener.IP2VEnginePlayerCallback;

public class xqj
  implements IP2VEnginePlayerCallback
{
  public xqj(QzDynamicVideoPreviewActivity paramQzDynamicVideoPreviewActivity) {}
  
  public void onPrepareRestart() {}
  
  public void onProgress(long paramLong1, long paramLong2)
  {
    if ((paramLong1 > 0L) && (paramLong2 > 0L)) {
      this.a.a.post(new xqk(this, paramLong1, paramLong2));
    }
  }
  
  public void onRestart()
  {
    this.a.l();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xqj
 * JD-Core Version:    0.7.0.1
 */