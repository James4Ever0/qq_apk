import com.tencent.av.ui.ControlUIObserver;
import com.tencent.av.ui.VideoControlUI;

public class kcv
  extends ControlUIObserver
{
  public kcv(VideoControlUI paramVideoControlUI) {}
  
  protected void a(boolean paramBoolean, int paramInt)
  {
    if (this.a.u == 2) {
      if (!this.a.g())
      {
        if (paramBoolean) {
          this.a.b.update(null, new Object[] { Integer.valueOf(110) });
        }
      }
      else {
        this.a.v(paramInt);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     kcv
 * JD-Core Version:    0.7.0.1
 */