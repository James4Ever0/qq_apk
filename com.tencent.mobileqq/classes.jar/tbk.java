import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.qqstory.storyHome.qqstorylist.view.MystoryListView;
import com.tencent.mobileqq.activity.Now;

public class tbk
  implements View.OnClickListener
{
  public tbk(Now paramNow) {}
  
  public void onClick(View paramView)
  {
    if (Now.a(this.a) != null) {
      Now.a(this.a).n();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tbk
 * JD-Core Version:    0.7.0.1
 */