import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mobileqq.activity.DiscussionInfoCardActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.app.proxy.RecentUserProxy;
import com.tencent.mobileqq.model.FriendManager;

class coc
  implements DialogInterface.OnClickListener
{
  coc(cob paramcob, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((FriendManager)this.jdField_a_of_type_Cob.a.b.getManager(8)).d(this.jdField_a_of_type_JavaLangString);
    paramDialogInterface = this.jdField_a_of_type_Cob.a.b.a().a();
    paramDialogInterface.b(paramDialogInterface.a(this.jdField_a_of_type_JavaLangString, 3000));
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("isNeedFinish", true);
    this.jdField_a_of_type_Cob.a.setResult(-1, paramDialogInterface);
    this.jdField_a_of_type_Cob.a.finish();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     coc
 * JD-Core Version:    0.7.0.1
 */