import com.tencent.mobileqq.activity.specialcare.QQSpecialCareSettingActivity;
import com.tencent.mobileqq.app.QvipSpecialCareObserver;
import com.tencent.qphone.base.util.QLog;

public class yfd
  extends QvipSpecialCareObserver
{
  public yfd(QQSpecialCareSettingActivity paramQQSpecialCareSettingActivity) {}
  
  public void a(Object paramObject)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQSpecialCareSettingActivity", 2, "onSpecialSoundEvent data: " + paramObject);
    }
    if (paramObject != null) {
      this.a.stopTitleProgress();
    }
    switch (((Integer)paramObject).intValue())
    {
    default: 
      return;
    }
    QQSpecialCareSettingActivity.a(this.a);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     yfd
 * JD-Core Version:    0.7.0.1
 */