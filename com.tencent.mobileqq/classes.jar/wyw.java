import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.EditText;
import com.tencent.mobileqq.activity.qwallet.TransactionActivity;

public class wyw
  implements Runnable
{
  public wyw(TransactionActivity paramTransactionActivity) {}
  
  public void run()
  {
    MotionEvent localMotionEvent1 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0F, 0.0F, 0);
    TransactionActivity.a(this.a).dispatchTouchEvent(localMotionEvent1);
    MotionEvent localMotionEvent2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0F, 0.0F, 0);
    TransactionActivity.a(this.a).dispatchTouchEvent(localMotionEvent2);
    localMotionEvent1.recycle();
    localMotionEvent2.recycle();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wyw
 * JD-Core Version:    0.7.0.1
 */