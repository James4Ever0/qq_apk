import android.text.TextUtils;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.troop.activity.TroopAdminList;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;

public class aigu
  extends FriendListObserver
{
  public aigu(TroopAdminList paramTroopAdminList) {}
  
  protected void onUpdateCustomHead(boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) && (!TextUtils.isEmpty(paramString))) {
      this.a.c();
    }
  }
  
  protected void onUpdateFriendInfoFinished(ArrayList paramArrayList, boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.i("TroopAdminList", 2, "onUpdateFriendInfoFinished ");
    }
    this.a.c();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     aigu
 * JD-Core Version:    0.7.0.1
 */