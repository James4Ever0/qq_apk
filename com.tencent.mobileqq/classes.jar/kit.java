import android.view.View;
import com.tencent.av.widget.stageview.StageEffectView;
import java.util.Comparator;

public class kit
  implements Comparator
{
  public kit(StageEffectView paramStageEffectView) {}
  
  public int a(Integer paramInteger1, Integer paramInteger2)
  {
    paramInteger1 = (kjb)this.a.getChildAt(paramInteger1.intValue()).getTag();
    paramInteger2 = (kjb)this.a.getChildAt(paramInteger2.intValue()).getTag();
    if (paramInteger1.c < paramInteger2.c) {
      return 1;
    }
    return -1;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     kit
 * JD-Core Version:    0.7.0.1
 */