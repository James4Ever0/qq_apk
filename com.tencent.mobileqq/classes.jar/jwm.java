import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.av.ui.MultiMembersVideoUI;
import com.tencent.av.utils.MultiVideoMembersClickListener;

public class jwm
  implements View.OnTouchListener
{
  public jwm(MultiMembersVideoUI paramMultiMembersVideoUI) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.a.a != null) {
      this.a.a.a();
    }
    return paramMotionEvent.getAction() == 2;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jwm
 * JD-Core Version:    0.7.0.1
 */