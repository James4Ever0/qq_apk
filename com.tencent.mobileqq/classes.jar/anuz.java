import android.view.View;
import android.view.View.OnClickListener;
import dov.com.qq.im.capture.music.humrecognition.HumUtils;
import dov.com.qq.im.capture.music.humrecognition.HummingActivity;

public class anuz
  implements View.OnClickListener
{
  public anuz(HummingActivity paramHummingActivity) {}
  
  public void onClick(View paramView)
  {
    if (HumUtils.b()) {
      return;
    }
    HummingActivity.a(this.a, 2);
    HummingActivity.b(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anuz
 * JD-Core Version:    0.7.0.1
 */