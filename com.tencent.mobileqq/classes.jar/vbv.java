import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.aio.item.MedalNewsItemBuilder;
import com.tencent.mobileqq.app.QQAppInterface;

public class vbv
  implements View.OnClickListener
{
  public vbv(MedalNewsItemBuilder paramMedalNewsItemBuilder) {}
  
  public void onClick(View paramView)
  {
    MedalNewsItemBuilder.a(this.a, true, this.a.a.getCurrentAccountUin());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vbv
 * JD-Core Version:    0.7.0.1
 */