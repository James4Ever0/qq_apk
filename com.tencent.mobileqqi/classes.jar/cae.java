import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mobileqq.activity.AddRequestActivity;

public class cae
  extends Handler
{
  public cae(AddRequestActivity paramAddRequestActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
      if ((AddRequestActivity.a(this.a) != null) && (AddRequestActivity.a(this.a).isShowing()))
      {
        AddRequestActivity.a(this.a).setText(this.a.getString(2131562880));
        AddRequestActivity.a(this.a).setVisibility(8);
        AddRequestActivity.a(this.a).setVisibility(0);
        AddRequestActivity.a(this.a).setImageResource(2130837958);
        postDelayed(new caf(this), 1500L);
        return;
      }
      this.a.finish();
      return;
      this.a.a(true);
    } while ((AddRequestActivity.a(this.a) == null) || (!AddRequestActivity.a(this.a).isShowing()));
    AddRequestActivity.a(this.a).setText(this.a.getString(2131561435));
    AddRequestActivity.a(this.a).setVisibility(8);
    AddRequestActivity.a(this.a).setVisibility(0);
    AddRequestActivity.a(this.a).setImageResource(2130837947);
    postDelayed(new cag(this), 1500L);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     cae
 * JD-Core Version:    0.7.0.1
 */