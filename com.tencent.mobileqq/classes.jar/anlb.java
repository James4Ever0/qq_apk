import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import dov.com.qq.im.capture.QIMManager;
import dov.com.qq.im.capture.text.DynamicTextConfigManager;
import dov.com.qq.im.capture.text.DynamicTextConfigManager.DynamicTextConfigBean;
import dov.com.qq.im.capture.text.DynamicTextConfigManager.IDynamicTextResDownloadCallback;
import dov.com.tencent.biz.qqstory.takevideo.doodle.ui.panel.EditTextEffectView;
import dov.com.tencent.biz.qqstory.takevideo.doodle.ui.panel.EditTextPanel;

public class anlb
  implements DynamicTextConfigManager.IDynamicTextResDownloadCallback
{
  public anlb(EditTextPanel paramEditTextPanel) {}
  
  public void a(float paramFloat, String paramString, int paramInt)
  {
    this.a.post(new anlc(this, paramString, paramInt));
  }
  
  public void a(boolean paramBoolean, String paramString)
  {
    if ((this.a.a == null) || (this.a.a.a == null)) {}
    for (;;)
    {
      return;
      int j = this.a.a.a.getChildCount();
      DynamicTextConfigManager localDynamicTextConfigManager = (DynamicTextConfigManager)QIMManager.a(7);
      int i = 0;
      while (i < j)
      {
        View localView = this.a.a.a.getChildAt(i);
        ankz localankz = (ankz)this.a.a.getChildViewHolder(localView);
        if (localankz.a.isContainsResUrl(paramString)) {
          localView.post(new anle(this, paramBoolean, localankz, localDynamicTextConfigManager));
        }
        i += 1;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anlb
 * JD-Core Version:    0.7.0.1
 */