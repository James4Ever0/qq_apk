import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.activity.QQSettingMe;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.theme.NightModeLogic.NightModeCallback;
import com.tencent.qphone.base.util.QLog;

public class tiz
  extends NightModeLogic.NightModeCallback
{
  public tiz(QQSettingMe paramQQSettingMe) {}
  
  public void a(Bundle paramBundle)
  {
    this.a.r();
  }
  
  public void b(Bundle paramBundle)
  {
    int i = paramBundle.getInt("start_status");
    if (i == 1) {
      this.a.r();
    }
    do
    {
      do
      {
        return;
        if (i == 2)
        {
          this.a.r();
          return;
        }
      } while (i != 3);
      if (!(this.a.jdField_a_of_type_AndroidWidgetImageView.getDrawable() instanceof Animatable)) {
        break;
      }
      i = paramBundle.getInt("percent");
      paramBundle = String.valueOf(i) + "%";
      this.a.c.setText(paramBundle);
    } while (!QLog.isDevelopLevel());
    QLog.d("QQSettingRedesign", 4, "NIGHTMODE_ACTION_DOWNLOADING: " + i);
    return;
    if (QQSettingMe.e(this.a)) {}
    for (Drawable localDrawable = this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getResources().getDrawable(2130843194);; localDrawable = this.a.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getResources().getDrawable(2130843195))
    {
      this.a.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(localDrawable);
      if (!(localDrawable instanceof Animatable)) {
        break;
      }
      ((Animatable)localDrawable).start();
      break;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tiz
 * JD-Core Version:    0.7.0.1
 */