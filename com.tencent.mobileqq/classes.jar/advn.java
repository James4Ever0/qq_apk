import android.graphics.Bitmap;
import android.widget.LinearLayout;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.fragment.NearbyHybridFragment;
import com.tencent.mobileqq.nearby.NearbyFragmentEnterAdapter;
import com.tencent.mobileqq.nearby.ipc.NearbyProcObserver;

public class advn
  extends NearbyProcObserver
{
  public advn(NearbyHybridFragment paramNearbyHybridFragment) {}
  
  protected void a()
  {
    if (this.a.jdField_a_of_type_ComTencentMobileqqNearbyNearbyFragmentEnterAdapter != null) {
      this.a.jdField_a_of_type_ComTencentMobileqqNearbyNearbyFragmentEnterAdapter.a(this.a.jdField_a_of_type_ComTencentMobileqqNearbyNearbyAppInterface);
    }
    this.a.l();
    this.a.m();
  }
  
  protected void a(int paramInt, String paramString) {}
  
  protected void a(int paramInt, String paramString, Bitmap paramBitmap)
  {
    if ((this.a.d != null) && (this.a.d.equals(paramString)) && (paramBitmap != null) && (this.a.b != null) && (this.a.b.getVisibility() == 0)) {
      this.a.jdField_a_of_type_ComTencentImageURLImageView.setImageBitmap(paramBitmap);
    }
  }
  
  protected void b(int paramInt, String paramString) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     advn
 * JD-Core Version:    0.7.0.1
 */