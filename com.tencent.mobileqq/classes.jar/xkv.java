import com.tencent.mobileqq.activity.richmedia.EditLocalVideoActivity;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.qphone.base.util.QLog;

class xkv
  implements Runnable
{
  xkv(xku paramxku) {}
  
  public void run()
  {
    if (!FileUtils.d(EditLocalVideoActivity.f(this.a.jdField_a_of_type_Xkt.a))) {
      QLog.d("EditLocalVideoActivity", 2, "delete origin final mp4 failed!" + EditLocalVideoActivity.f(this.a.jdField_a_of_type_Xkt.a));
    }
    for (;;)
    {
      EditLocalVideoActivity.f(this.a.jdField_a_of_type_Xkt.a, this.a.jdField_a_of_type_JavaLangString);
      return;
      QLog.d("EditLocalVideoActivity", 2, "delete origin final mp4 success!" + EditLocalVideoActivity.f(this.a.jdField_a_of_type_Xkt.a));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     xkv
 * JD-Core Version:    0.7.0.1
 */