import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import com.tencent.biz.pubaccount.readinjoy.activity.ReadInJoyBaseDeliverActivity;
import com.tencent.mobileqq.utils.ViewUtils;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.XPanelContainer;
import com.tencent.widget.immersive.ImmersiveUtils;

public class lei
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public lei(ReadInJoyBaseDeliverActivity paramReadInJoyBaseDeliverActivity) {}
  
  public void onGlobalLayout()
  {
    Rect localRect = new Rect();
    this.a.jdField_a_of_type_ComTencentWidgetXPanelContainer.getWindowVisibleDisplayFrame(localRect);
    int j = this.a.jdField_a_of_type_ComTencentWidgetXPanelContainer.getRootView().getHeight();
    int i = j - localRect.height();
    if (i > 100) {}
    for (boolean bool = true;; bool = false)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ReadInJoyBaseDeliverActivity", 2, "onGlobalLayout screenHeight:" + j + ", ExternalPanelheight:" + i + ", isShowKeybroad:" + bool);
      }
      if (bool != this.a.i)
      {
        if (i > this.a.e) {
          this.a.e = i;
        }
        if (QLog.isColorLevel()) {
          QLog.d("ReadInJoyBaseDeliverActivity", 2, "onGlobalLayout mMAXExternalPanelheight:" + this.a.e);
        }
        i = ViewUtils.b(this.a.f);
        j = j - ImmersiveUtils.a(this.a) - this.a.getTitleBarHeight() - this.a.e;
        int k = j - i;
        if (QLog.isColorLevel()) {
          QLog.d("ReadInJoyBaseDeliverActivity", 2, "onGlobalLayout contentHeight:" + j + ", fixedHeight:" + i + ", maxHeight:" + k);
        }
        this.a.jdField_a_of_type_AndroidWidgetEditText.setMaxHeight(k);
      }
      this.a.i = bool;
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     lei
 * JD-Core Version:    0.7.0.1
 */