import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.activity.contact.troop.TroopActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;

public class wqt
  implements Runnable
{
  public wqt(TroopActivity paramTroopActivity) {}
  
  public void run()
  {
    if (this.a.e)
    {
      int i = this.a.app.a().b();
      TextView localTextView = (TextView)this.a.findViewById(2131364020);
      ImageView localImageView = (ImageView)this.a.findViewById(2131364019);
      localTextView.setVisibility(0);
      localImageView.setVisibility(0);
      localTextView.setText("" + i);
      if (i <= 0) {
        localTextView.setVisibility(4);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wqt
 * JD-Core Version:    0.7.0.1
 */