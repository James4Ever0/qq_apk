import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.ModifyFriendInfoActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Card;
import com.tencent.mobileqq.model.FriendManager;

public class dbw
  extends Thread
{
  public dbw(ModifyFriendInfoActivity paramModifyFriendInfoActivity) {}
  
  public void run()
  {
    Object localObject = ((FriendManager)this.a.b.getManager(8)).a(this.a.jdField_a_of_type_JavaLangString);
    if (localObject != null) {
      this.a.c = ((Card)localObject).strReMark;
    }
    localObject = this.a.jdField_a_of_type_AndroidOsHandler.obtainMessage();
    ((Message)localObject).what = 1;
    ((Message)localObject).sendToTarget();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes2.jar
 * Qualified Name:     dbw
 * JD-Core Version:    0.7.0.1
 */