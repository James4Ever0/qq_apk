import android.view.View;
import android.widget.ImageView;
import com.tencent.mobileqq.activity.bless.BlessActivity;
import com.tencent.mobileqq.widget.QQVideoView;
import com.tencent.qphone.base.util.QLog;

class wbp
  implements Runnable
{
  wbp(wbo paramwbo) {}
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d(BlessActivity.a(this.a.a), 2, "videoview bring to top");
    }
    if (BlessActivity.b(this.a.a) != null) {
      BlessActivity.b(this.a.a).setVisibility(8);
    }
    if (BlessActivity.a(this.a.a) != null) {
      BlessActivity.a(this.a.a).bringToFront();
    }
    this.a.a.findViewById(2131363363).bringToFront();
    this.a.a.findViewById(2131363360).bringToFront();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wbp
 * JD-Core Version:    0.7.0.1
 */