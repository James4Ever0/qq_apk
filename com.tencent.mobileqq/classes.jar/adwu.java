import android.widget.ImageView;
import com.tencent.common.config.AppSetting;
import com.tencent.mobileqq.emoticonview.SystemAndEmojiEmoticonPanel;
import com.tencent.mobileqq.freshnews.QQInputView;

public class adwu
  implements Runnable
{
  public adwu(QQInputView paramQQInputView) {}
  
  public void run()
  {
    QQInputView.a(this.a).setVisibility(0);
    QQInputView.a(this.a).setImageResource(2130844610);
    if (AppSetting.b) {
      QQInputView.a(this.a).setContentDescription("表情");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     adwu
 * JD-Core Version:    0.7.0.1
 */