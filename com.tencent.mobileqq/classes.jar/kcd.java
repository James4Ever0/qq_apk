import android.os.Handler;
import com.tencent.av.VideoController;
import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.ui.VideoInviteFloatBar;
import com.tencent.av.ui.VideoInviteFloatBarUICtr;
import com.tencent.av.utils.UITools;

public class kcd
  implements Runnable
{
  public kcd(VideoInviteFloatBarUICtr paramVideoInviteFloatBarUICtr) {}
  
  public void run()
  {
    String str = UITools.a(this.a.jdField_a_of_type_ComTencentAvVideoController.a());
    if (this.a.jdField_a_of_type_ComTencentAvUiVideoInviteFloatBar != null)
    {
      this.a.jdField_a_of_type_ComTencentAvUiVideoInviteFloatBar.a(str);
      if (this.a.jdField_a_of_type_ComTencentAvVideoController.a() % 60L >= 1L) {
        this.a.a();
      }
    }
    else
    {
      return;
    }
    this.a.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a().postDelayed(this, 1000L);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kcd
 * JD-Core Version:    0.7.0.1
 */