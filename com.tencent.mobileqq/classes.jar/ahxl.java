import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mobileqq.search.activity.ActiveEntitySearchActivity;
import com.tencent.mobileqq.search.activity.UniteSearchActivity;
import com.tencent.mobileqq.search.fragment.AssociateSearchWordsFragment;

public class ahxl
  implements View.OnTouchListener
{
  public ahxl(AssociateSearchWordsFragment paramAssociateSearchWordsFragment) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    paramView = this.a.getActivity();
    if ((paramView instanceof ActiveEntitySearchActivity)) {
      ((ActiveEntitySearchActivity)paramView).c();
    }
    for (;;)
    {
      return false;
      if ((paramView instanceof UniteSearchActivity)) {
        ((UniteSearchActivity)paramView).c();
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     ahxl
 * JD-Core Version:    0.7.0.1
 */