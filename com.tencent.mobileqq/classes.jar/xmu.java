import com.tencent.mobileqq.activity.richmedia.NewFlowCameraActivity;
import com.tencent.mobileqq.activity.richmedia.Size;
import java.util.Comparator;

public class xmu
  implements Comparator
{
  public xmu(NewFlowCameraActivity paramNewFlowCameraActivity) {}
  
  public int a(Size paramSize1, Size paramSize2)
  {
    if ((paramSize1.a < paramSize2.a) || ((paramSize1.a == paramSize2.a) && (paramSize1.b < paramSize2.b))) {
      return -1;
    }
    if ((paramSize1.a != paramSize2.a) || (paramSize1.b != paramSize2.b)) {
      return 1;
    }
    return 0;
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xmu
 * JD-Core Version:    0.7.0.1
 */