import com.tencent.mobileqq.activity.QQSettingMe;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.vas.VipGrayConfigHelper.VipGrayConfigListener;
import com.tencent.qphone.base.util.QLog;

public class tmb
  implements VipGrayConfigHelper.VipGrayConfigListener
{
  public tmb(QQSettingMe paramQQSettingMe) {}
  
  public void a()
  {
    if (this.a.a != null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("QQSettingRedesign", 2, "enterWordListener");
      }
      this.a.b(this.a.a.getAccount());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     tmb
 * JD-Core Version:    0.7.0.1
 */