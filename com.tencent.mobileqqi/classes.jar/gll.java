import com.tencent.mobileqq.richstatus.EditActivity;
import com.tencent.mobileqq.widget.ClickableImageSpan;
import com.tencent.mobileqq.widget.ClickableImageSpan.ClickableImageSpanListener;

public class gll
  implements ClickableImageSpan.ClickableImageSpanListener
{
  public gll(EditActivity paramEditActivity) {}
  
  public void a(ClickableImageSpan paramClickableImageSpan)
  {
    if ((EditActivity.a(this.a) == paramClickableImageSpan) && (System.currentTimeMillis() - this.a.a > 1300L)) {
      this.a.d();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     gll
 * JD-Core Version:    0.7.0.1
 */