import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.biz.qqstory.takevideo.CommonPicUploadFragment;
import com.tencent.mobileqq.app.BaseActivity;

public class ogz
  implements DialogInterface.OnKeyListener
{
  public ogz(CommonPicUploadFragment paramCommonPicUploadFragment) {}
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      return true;
    }
    if (paramInt == 4)
    {
      this.a.a();
      paramDialogInterface = this.a.a;
      paramKeyEvent = this.a.a;
      paramDialogInterface.setResult(0);
      this.a.a.finish();
      return true;
    }
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     ogz
 * JD-Core Version:    0.7.0.1
 */