import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mobileqq.nearby.now.view.viewmodel.PlayOperationViewModel;

public class aena
  implements View.OnTouchListener
{
  public aena(PlayOperationViewModel paramPlayOperationViewModel) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2)) {
      this.a.a.findViewById(2131370449).setAlpha(0.5F);
    }
    for (;;)
    {
      return false;
      this.a.a.findViewById(2131370449).setAlpha(1.0F);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aena
 * JD-Core Version:    0.7.0.1
 */