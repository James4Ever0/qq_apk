import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.av.VideoController;
import com.tencent.av.ui.MultiVideoCtrlLayerUIBase;
import com.tencent.mobileqq.statistics.ReportController;

public class jxl
  implements View.OnClickListener
{
  public jxl(MultiVideoCtrlLayerUIBase paramMultiVideoCtrlLayerUIBase) {}
  
  public void onClick(View paramView)
  {
    this.a.a.j();
    paramView = this.a.j.getText().toString();
    if ((paramView != null) && (paramView.equals("自我静音")))
    {
      ReportController.b(null, "CliOper", "", "", "0X8005DF1", "0X8005DF1", 0, 0, "", "", "", "");
      return;
    }
    ReportController.b(null, "CliOper", "", "", "0X8005DF3", "0X8005DF3", 0, 0, "", "", "", "");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jxl
 * JD-Core Version:    0.7.0.1
 */