import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mobileqq.hotpic.HotPicMainPanel;

public class adyd
  implements View.OnTouchListener
{
  public adyd(HotPicMainPanel paramHotPicMainPanel) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    HotPicMainPanel.a(this.a);
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     adyd
 * JD-Core Version:    0.7.0.1
 */