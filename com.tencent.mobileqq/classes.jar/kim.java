import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.av.widget.RatingBar;
import com.tencent.av.widget.RatingBar.OnRatingListener;

public class kim
  implements View.OnClickListener
{
  public kim(RatingBar paramRatingBar) {}
  
  public void onClick(View paramView)
  {
    if (RatingBar.a(this.a))
    {
      RatingBar.a(this.a, this.a.indexOfChild(paramView) + 1);
      this.a.setStar(RatingBar.a(this.a), true);
      if (RatingBar.a(this.a) != null) {
        RatingBar.a(this.a).a(RatingBar.a(this.a), RatingBar.a(this.a));
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kim
 * JD-Core Version:    0.7.0.1
 */