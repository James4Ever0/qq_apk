import android.widget.EditText;
import com.tencent.util.InputMethodUtil;
import dov.com.tencent.biz.qqstory.takevideo.poilist.SearchPoiListLayout;

public class anna
  implements Runnable
{
  public anna(SearchPoiListLayout paramSearchPoiListLayout) {}
  
  public void run()
  {
    SearchPoiListLayout.a(this.a).setFocusableInTouchMode(true);
    SearchPoiListLayout.a(this.a).requestFocus();
    InputMethodUtil.a(SearchPoiListLayout.a(this.a));
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anna
 * JD-Core Version:    0.7.0.1
 */