import android.view.View;
import android.widget.EditText;
import com.tencent.mobileqq.nearby.now.view.ShortVideoCommentsView;

public class afcj
  implements Runnable
{
  public afcj(ShortVideoCommentsView paramShortVideoCommentsView) {}
  
  public void run()
  {
    ShortVideoCommentsView.c(this.a, true);
    ShortVideoCommentsView.a(this.a).requestFocus();
    ShortVideoCommentsView.a(this.a).setVisibility(0);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     afcj
 * JD-Core Version:    0.7.0.1
 */