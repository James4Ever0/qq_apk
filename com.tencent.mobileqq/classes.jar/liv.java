import com.tencent.biz.pubaccount.readinjoy.biu.ReadInJoyDeliverBiuActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.qphone.base.util.QLog;
import mqq.os.MqqHandler;

public class liv
  extends FriendListObserver
{
  public liv(ReadInJoyDeliverBiuActivity paramReadInJoyDeliverBiuActivity) {}
  
  protected void onUpdateFriendInfo(String paramString, boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("ReadInJoyDeliverBiuActivity", 2, "current uin = " + paramString + " is success " + paramBoolean);
    }
    if (paramBoolean) {
      ThreadManager.getUIHandler().post(new liw(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     liv
 * JD-Core Version:    0.7.0.1
 */