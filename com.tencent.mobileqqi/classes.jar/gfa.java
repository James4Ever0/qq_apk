import com.tencent.mobileqq.magicface.magicfaceaction.Action;
import com.tencent.mobileqq.magicface.model.RecordVolume.RecordVolumeListener;
import com.tencent.mobileqq.magicface.service.MagicfaceActionManager;

public class gfa
  implements RecordVolume.RecordVolumeListener
{
  public gfa(MagicfaceActionManager paramMagicfaceActionManager) {}
  
  public void a(int paramInt)
  {
    if (MagicfaceActionManager.a(this.a) != null) {
      MagicfaceActionManager.a(this.a).b(paramInt, MagicfaceActionManager.a(this.a));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     gfa
 * JD-Core Version:    0.7.0.1
 */