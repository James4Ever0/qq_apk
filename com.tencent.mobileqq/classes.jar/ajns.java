import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.troop.homework.arithmetic.ui.HomeworkGuideFragment;

public class ajns
  implements View.OnClickListener
{
  public ajns(HomeworkGuideFragment paramHomeworkGuideFragment) {}
  
  public void onClick(View paramView)
  {
    this.a.getActivity().setResult(1000);
    this.a.getActivity().finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     ajns
 * JD-Core Version:    0.7.0.1
 */