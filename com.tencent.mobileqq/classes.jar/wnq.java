import com.tencent.mobileqq.activity.main.MainAssistObserver;
import com.tencent.mobileqq.app.readinjoy.ReadInJoyObserver;
import com.tencent.qphone.base.util.QLog;

public class wnq
  extends ReadInJoyObserver
{
  public wnq(MainAssistObserver paramMainAssistObserver) {}
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    if (QLog.isDevelopLevel()) {
      QLog.i("SplashActivity", 4, "mainobserver onReadInJoyNotifyRedTouchUpdate, isSuccess=" + paramBoolean1 + ",isUpdate=" + paramBoolean2 + ", type=" + paramInt);
    }
    if ((paramBoolean1) && (paramBoolean2) && ((paramInt & 0x2) != 0)) {
      this.a.g();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wnq
 * JD-Core Version:    0.7.0.1
 */