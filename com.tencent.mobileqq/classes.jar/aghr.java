import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.tencent.mobileqq.qzonealbumreddot.QzonePhotoGuideNotifyService;
import com.tencent.qphone.base.util.QLog;

public class aghr
  extends BroadcastReceiver
{
  public aghr(QzonePhotoGuideNotifyService paramQzonePhotoGuideNotifyService) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.qzonex.localalbum.new_photo_notification_feedback_action".equals(paramIntent.getAction())))
    {
      if (QLog.isColorLevel()) {
        QLog.i("QzonePhotoGuideNotifyServlet", 2, "QzonePhotoGuideNotifyServlet onReceive");
      }
      if (this.a.jdField_a_of_type_AndroidOsHandler != null) {
        this.a.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.a.jdField_a_of_type_JavaLangRunnable);
      }
      this.a.b();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aghr
 * JD-Core Version:    0.7.0.1
 */