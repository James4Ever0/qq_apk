import android.database.ContentObserver;
import android.os.Handler;
import com.tencent.mobileqq.businessCard.activity.BusinessCardEditActivity;
import com.tencent.qphone.base.util.QLog;

public class abgb
  extends ContentObserver
{
  public abgb(BusinessCardEditActivity paramBusinessCardEditActivity, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("BusinessCard_EditActivity", 2, "Contact changed selfChange=" + paramBoolean);
    }
    if (BusinessCardEditActivity.a(this.a))
    {
      this.a.a(2131437089, 2);
      BusinessCardEditActivity.a(this.a, false);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abgb
 * JD-Core Version:    0.7.0.1
 */