import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.mobileqq.widget.BounceScrollView;

public class aken
  extends GestureDetector.SimpleOnGestureListener
{
  public aken(BounceScrollView paramBounceScrollView) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return Math.abs(paramFloat2) >= Math.abs(paramFloat1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aken
 * JD-Core Version:    0.7.0.1
 */