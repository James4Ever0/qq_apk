import android.content.res.Resources;
import com.tencent.av.ui.MultiVideoEnterPageActivity;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;

public class kab
  implements Runnable
{
  public kab(MultiVideoEnterPageActivity paramMultiVideoEnterPageActivity) {}
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.a.jdField_a_of_type_JavaLangString, 2, "TimeoutRunnable Run");
    }
    QQToast.a(MultiVideoEnterPageActivity.c(this.a), 2131429191, 1).b(MultiVideoEnterPageActivity.b(this.a).getDimensionPixelSize(2131558448));
    if (!this.a.jdField_a_of_type_Boolean) {
      MultiVideoEnterPageActivity.g(this.a);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     kab
 * JD-Core Version:    0.7.0.1
 */