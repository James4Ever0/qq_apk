import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.tencent.mobileqq.teamwork.fragment.TeamWorkAuthorizeSettingFragment;

public class aimz
  implements DialogInterface.OnClickListener
{
  public aimz(TeamWorkAuthorizeSettingFragment paramTeamWorkAuthorizeSettingFragment) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.getActivity().finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aimz
 * JD-Core Version:    0.7.0.1
 */