import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.open.agent.AuthorityLoginView;

public class akky
  implements View.OnClickListener
{
  public akky(AuthorityLoginView paramAuthorityLoginView) {}
  
  public void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView != null) && ((paramView instanceof String))) {
      this.a.b((String)paramView);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     akky
 * JD-Core Version:    0.7.0.1
 */