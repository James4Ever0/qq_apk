import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.aio.rebuild.DiscussChatPie;
import com.tencent.mobileqq.app.DiscussionHandler;
import com.tencent.mobileqq.app.DiscussionManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.app.proxy.RecentUserProxy;
import com.tencent.mobileqq.data.RecentUser;

class bzj
  implements DialogInterface.OnClickListener
{
  bzj(bzh parambzh, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((DiscussionManager)DiscussChatPie.g(this.jdField_a_of_type_Bzh.a).getManager(45)).a(this.jdField_a_of_type_JavaLangString);
    paramDialogInterface = DiscussChatPie.h(this.jdField_a_of_type_Bzh.a).a().a();
    RecentUser localRecentUser = paramDialogInterface.b(this.jdField_a_of_type_JavaLangString, 3000);
    if (localRecentUser != null) {
      paramDialogInterface.b(localRecentUser);
    }
    ((DiscussionHandler)DiscussChatPie.i(this.jdField_a_of_type_Bzh.a).a(6)).c();
    this.jdField_a_of_type_Bzh.a.t();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     bzj
 * JD-Core Version:    0.7.0.1
 */