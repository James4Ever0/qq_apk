import com.tencent.av.business.manager.zimu.ARZimuTask;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;

public class jgp
  implements Observer
{
  private WeakReference a;
  
  public jgp(ARZimuTask paramARZimuTask)
  {
    this.a = new WeakReference(paramARZimuTask);
  }
  
  public void update(Observable paramObservable, Object paramObject)
  {
    ARZimuTask localARZimuTask = (ARZimuTask)this.a.get();
    if (localARZimuTask == null) {
      return;
    }
    ARZimuTask.a(localARZimuTask, paramObservable, paramObject);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jgp
 * JD-Core Version:    0.7.0.1
 */