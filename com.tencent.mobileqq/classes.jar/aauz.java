import android.widget.RelativeLayout;
import com.tencent.mobileqq.armap.ARMapOpenRedPackDialog;

public class aauz
  implements Runnable
{
  public aauz(ARMapOpenRedPackDialog paramARMapOpenRedPackDialog) {}
  
  public void run()
  {
    ARMapOpenRedPackDialog.a(this.a).setVisibility(0);
    ARMapOpenRedPackDialog.a(this.a).startAnimation(ARMapOpenRedPackDialog.a(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aauz
 * JD-Core Version:    0.7.0.1
 */