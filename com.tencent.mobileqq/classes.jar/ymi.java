import android.graphics.Bitmap;
import com.tencent.mobileqq.activity.specialcare.SpecailCareListActivity;

public class ymi
  extends yms
{
  public ymi(SpecailCareListActivity paramSpecailCareListActivity)
  {
    super(paramSpecailCareListActivity, null);
  }
  
  public void a(int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    if (this.a.d != 0) {
      this.a.b = true;
    }
    while ((paramInt2 != 200) || (paramBitmap == null)) {
      return;
    }
    this.a.a.notifyDataSetChanged();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ymi
 * JD-Core Version:    0.7.0.1
 */