import android.graphics.Bitmap;
import android.view.View;
import com.tencent.mobileqq.activity.VisitorsActivity;
import com.tencent.mobileqq.richstatus.IIconListener;
import com.tencent.widget.XListView;

public class ung
  implements IIconListener
{
  public ung(VisitorsActivity paramVisitorsActivity) {}
  
  public void a(int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    int i = 0;
    if ((paramBitmap != null) && (paramInt2 == 200)) {
      if (this.a.h == 0) {
        paramBitmap = this.a.a;
      }
    }
    for (;;)
    {
      if (paramBitmap != null) {
        paramInt2 = paramBitmap.getChildCount();
      }
      for (;;)
      {
        if (i < paramInt2)
        {
          Object localObject = paramBitmap.getChildAt(i).getTag();
          if ((localObject != null) && ((localObject instanceof unh)))
          {
            localObject = (unh)localObject;
            if ((((unh)localObject).a == paramInt1) && (((unh)localObject).e != null)) {
              VisitorsActivity.a(this.a, ((unh)localObject).e, paramInt1);
            }
          }
          i += 1;
          continue;
          if (this.a.h != 1) {
            break label145;
          }
          paramBitmap = this.a.b;
          break;
        }
        return;
        paramInt2 = 0;
      }
      label145:
      paramBitmap = null;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     ung
 * JD-Core Version:    0.7.0.1
 */