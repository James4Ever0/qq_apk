import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.webview.swift.component.SwiftBrowserUIStyleHandler;
import cooperation.comic.ui.QQComicTitleBarView;

public class alug
  implements View.OnClickListener
{
  public alug(QQComicTitleBarView paramQQComicTitleBarView) {}
  
  public void onClick(View paramView)
  {
    if ((this.a.a.a != null) && (!this.a.a.a.isFinishing())) {
      this.a.a.a.finish();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     alug
 * JD-Core Version:    0.7.0.1
 */