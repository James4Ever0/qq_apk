import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.biz.ui.CustomAnimationAdapter;

public class oxw
  implements ViewTreeObserver.OnPreDrawListener
{
  public oxw(CustomAnimationAdapter paramCustomAnimationAdapter, View paramView) {}
  
  public boolean onPreDraw()
  {
    this.jdField_a_of_type_AndroidViewView.getViewTreeObserver().removeOnPreDrawListener(this);
    CustomAnimationAdapter.a(this.jdField_a_of_type_ComTencentBizUiCustomAnimationAdapter, this.jdField_a_of_type_AndroidViewView);
    return false;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     oxw
 * JD-Core Version:    0.7.0.1
 */