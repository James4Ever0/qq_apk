import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mobileqq.filemanager.activity.cloudfile.QfileCloudFileTabView;
import com.tencent.mobileqq.filemanager.activity.cloudfile.QfileCloudFileTabView.IWeiYunImageEvent;

public class acge
  implements QfileCloudFileTabView.IWeiYunImageEvent
{
  public acge(QfileCloudFileTabView paramQfileCloudFileTabView) {}
  
  public View.OnClickListener a(TextView paramTextView)
  {
    this.a.a = paramTextView;
    return new acgf(this);
  }
  
  public boolean a()
  {
    return this.a.c;
  }
  
  public boolean b()
  {
    return this.a.b;
  }
  
  public boolean c()
  {
    return QfileCloudFileTabView.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     acge
 * JD-Core Version:    0.7.0.1
 */