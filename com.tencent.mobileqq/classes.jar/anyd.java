import android.util.SparseArray;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.GridView;
import dov.com.qq.im.capture.adapter.FilterProviderPagerAdapter;
import dov.com.qq.im.capture.view.QIMFilterProviderView;

public class anyd
  implements Runnable
{
  public anyd(QIMFilterProviderView paramQIMFilterProviderView, int paramInt) {}
  
  public void run()
  {
    GridView localGridView = (GridView)this.jdField_a_of_type_DovComQqImCaptureViewQIMFilterProviderView.a.a.get(this.jdField_a_of_type_DovComQqImCaptureViewQIMFilterProviderView.b());
    if (localGridView != null) {
      localGridView.setSelection(this.jdField_a_of_type_Int);
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.d("FilterProviderView", 2, "gridView is null ");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anyd
 * JD-Core Version:    0.7.0.1
 */