import android.os.Handler;
import com.tencent.mobileqq.activity.aio.item.TroopSignItemBuilder.TroopSignVideoItemBuilder;
import com.tencent.mobileqq.activity.aio.item.TroopSignItemBuilder.TroopSignVideoItemBuilder.SignVideoItemHolder;
import com.tencent.mobileqq.surfaceviewaction.gl.VideoSprite.OnOnPlayedListener;

public class vps
  implements VideoSprite.OnOnPlayedListener
{
  public vps(TroopSignItemBuilder.TroopSignVideoItemBuilder paramTroopSignVideoItemBuilder, TroopSignItemBuilder.TroopSignVideoItemBuilder.SignVideoItemHolder paramSignVideoItemHolder) {}
  
  public void a()
  {
    TroopSignItemBuilder.TroopSignVideoItemBuilder.c().postDelayed(new vpt(this), 100L);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     vps
 * JD-Core Version:    0.7.0.1
 */