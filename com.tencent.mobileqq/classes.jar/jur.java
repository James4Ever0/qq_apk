import com.tencent.av.ui.EffectToolbar;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;

public class jur
  implements Observer
{
  private WeakReference a;
  
  public jur(EffectToolbar paramEffectToolbar)
  {
    this.a = new WeakReference(paramEffectToolbar);
  }
  
  public void update(Observable paramObservable, Object paramObject)
  {
    EffectToolbar localEffectToolbar = (EffectToolbar)this.a.get();
    if (localEffectToolbar == null) {
      return;
    }
    EffectToolbar.access$300(localEffectToolbar, paramObservable, paramObject);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jur
 * JD-Core Version:    0.7.0.1
 */