import com.tencent.av.business.manager.BusinessMessageCenter;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;

public class jfr
  implements Observer
{
  private WeakReference a;
  
  public jfr(BusinessMessageCenter paramBusinessMessageCenter)
  {
    this.a = new WeakReference(paramBusinessMessageCenter);
  }
  
  public void update(Observable paramObservable, Object paramObject)
  {
    BusinessMessageCenter localBusinessMessageCenter = (BusinessMessageCenter)this.a.get();
    if (localBusinessMessageCenter == null) {
      return;
    }
    BusinessMessageCenter.a(localBusinessMessageCenter, paramObservable, paramObject);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jfr
 * JD-Core Version:    0.7.0.1
 */