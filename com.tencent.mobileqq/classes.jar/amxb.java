import android.widget.EditText;
import com.tencent.util.InputMethodUtil;
import dov.com.qq.im.capture.poi.FacePoiSearchUI;

public class amxb
  implements Runnable
{
  public amxb(FacePoiSearchUI paramFacePoiSearchUI) {}
  
  public void run()
  {
    this.a.a.setFocusableInTouchMode(true);
    this.a.a.requestFocus();
    InputMethodUtil.a(this.a.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     amxb
 * JD-Core Version:    0.7.0.1
 */