import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.mobileqq.activity.IndividuationSetActivity;

public class arc
  implements View.OnClickListener
{
  public arc(IndividuationSetActivity paramIndividuationSetActivity) {}
  
  public void onClick(View paramView)
  {
    IndividuationSetActivity.a(this.a).setEnabled(false);
    IndividuationSetActivity.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     arc
 * JD-Core Version:    0.7.0.1
 */