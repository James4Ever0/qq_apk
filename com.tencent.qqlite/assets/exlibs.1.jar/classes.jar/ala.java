import android.content.Intent;
import com.tencent.mobileqq.activity.EditInfoActivity;
import com.tencent.mobileqq.app.FriendsManagerImp;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.data.TroopMemberCardInfo;
import com.tencent.mobileqq.util.Utils;
import com.tencent.mobileqq.widget.QQProgressNotifier;
import java.util.ArrayList;

public class ala
  extends TroopObserver
{
  public ala(EditInfoActivity paramEditInfoActivity) {}
  
  protected void b(boolean paramBoolean, ArrayList paramArrayList)
  {
    EditInfoActivity.a(this.a, false);
    if (this.a.a == null) {
      this.a.a = new QQProgressNotifier(this.a);
    }
    if ((!paramBoolean) || (paramArrayList == null) || (paramArrayList.size() == 0)) {
      this.a.a.a(2, 2131363088, 1000);
    }
    Object localObject1;
    do
    {
      return;
      localObject1 = null;
      int i = 0;
      if ((localObject1 == null) && (i < paramArrayList.size()))
      {
        localObject2 = (TroopMemberCardInfo)paramArrayList.get(i);
        if (localObject2 == null) {
          localObject1 = localObject2;
        }
        for (;;)
        {
          i += 1;
          break;
          localObject1 = localObject2;
          if (!Utils.a(((TroopMemberCardInfo)localObject2).troopuin, this.a.c)) {
            localObject1 = null;
          }
        }
      }
    } while (localObject1 == null);
    paramArrayList = new Intent();
    paramArrayList.putExtra("nick", localObject1.name);
    Object localObject2 = (FriendsManagerImp)this.a.app.getManager(8);
    if (localObject2 != null) {
      ((FriendsManagerImp)localObject2).a(this.a.c, this.a.d, localObject1.name, -100, null, null, -100, -100, -100, -100L, (byte)-100, -100L, -100.0D);
    }
    this.a.setResult(-1, paramArrayList);
    EditInfoActivity.e(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     ala
 * JD-Core Version:    0.7.0.1
 */