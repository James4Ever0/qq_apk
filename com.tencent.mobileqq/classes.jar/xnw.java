import android.widget.ProgressBar;
import com.tencent.mobileqq.activity.richmedia.EditLocalVideoActivity;
import com.tencent.mobileqq.widget.QQToast;

class xnw
  implements Runnable
{
  xnw(xnu paramxnu) {}
  
  public void run()
  {
    QQToast.a(this.a.a.a, "音乐下载失败，请稍后重试", 1).a();
    EditLocalVideoActivity.a(this.a.a.a).setVisibility(8);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xnw
 * JD-Core Version:    0.7.0.1
 */