import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mobileqq.nearby.now.view.viewmodel.PlayOperationViewModel;

public class aeme
  implements View.OnTouchListener
{
  public aeme(PlayOperationViewModel paramPlayOperationViewModel) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.a.c();
    PlayOperationViewModel.a(this.a).onTouchEvent(paramMotionEvent);
    return true;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aeme
 * JD-Core Version:    0.7.0.1
 */