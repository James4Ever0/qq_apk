import com.immersion.stickersampleapp.HapticManager;
import com.tencent.mobileqq.activity.aio.item.CustomFrameAnimationDrawable.AnimationEndListener;
import com.tencent.mobileqq.activity.aio.item.UnlimitedBladeWorks;

public class vqf
  implements CustomFrameAnimationDrawable.AnimationEndListener
{
  public vqf(UnlimitedBladeWorks paramUnlimitedBladeWorks) {}
  
  public void a()
  {
    UnlimitedBladeWorks.a(this.a).b = true;
    UnlimitedBladeWorks.a(this.a).a = false;
    if (UnlimitedBladeWorks.a(this.a) != null)
    {
      UnlimitedBladeWorks.a(this.a).a();
      if (UnlimitedBladeWorks.b(this.a))
      {
        HapticManager.a().c(UnlimitedBladeWorks.a(this.a));
        UnlimitedBladeWorks.a(this.a, 0);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vqf
 * JD-Core Version:    0.7.0.1
 */