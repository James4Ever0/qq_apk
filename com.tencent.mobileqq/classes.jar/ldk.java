import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.biz.pubaccount.readinjoy.ReadInJoyBaseViewController;
import java.lang.ref.WeakReference;

public class ldk
  extends GestureDetector.SimpleOnGestureListener
{
  private WeakReference a;
  
  public ldk(ReadInJoyBaseViewController paramReadInJoyBaseViewController)
  {
    this.a = new WeakReference(paramReadInJoyBaseViewController);
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if ((this.a != null) && (this.a.get() != null)) {
      ((ReadInJoyBaseViewController)this.a.get()).a(true);
    }
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ldk
 * JD-Core Version:    0.7.0.1
 */