import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.nearby.gameroom.GameRoomInviteActivity;
import com.tencent.mobileqq.nearby.gameroom.GameRoomUtils;

public class aeax
  implements DialogInterface.OnClickListener
{
  public aeax(GameRoomInviteActivity paramGameRoomInviteActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    GameRoomUtils.a(this.a, 10);
    GameRoomInviteActivity.b(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aeax
 * JD-Core Version:    0.7.0.1
 */