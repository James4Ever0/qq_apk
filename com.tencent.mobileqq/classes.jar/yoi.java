import android.graphics.Bitmap;
import com.tencent.mobileqq.adapter.RecommendFriendAdapter;
import com.tencent.mobileqq.richstatus.IIconListener;

public class yoi
  implements IIconListener
{
  public yoi(RecommendFriendAdapter paramRecommendFriendAdapter) {}
  
  public void a(int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    if ((paramInt2 == 200) && (paramBitmap != null)) {
      this.a.notifyDataSetChanged();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     yoi
 * JD-Core Version:    0.7.0.1
 */