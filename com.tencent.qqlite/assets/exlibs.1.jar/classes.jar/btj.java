import com.tencent.mobileqq.activity.aio.audiopanel.CommonRecordSoundPanel;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.widget.QQToast;

public class btj
  implements Runnable
{
  public btj(CommonRecordSoundPanel paramCommonRecordSoundPanel) {}
  
  public void run()
  {
    QQToast.a(this.a.a, 2131363135, 1).b(this.a.a.getTitleBarHeight());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     btj
 * JD-Core Version:    0.7.0.1
 */