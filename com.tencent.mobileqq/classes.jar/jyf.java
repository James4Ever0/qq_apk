import com.tencent.av.VideoController;
import com.tencent.av.ui.MultiVideoEnterPageActivity;
import com.tencent.mobileqq.utils.NetworkUtil;

public class jyf
  implements Runnable
{
  public jyf(MultiVideoEnterPageActivity paramMultiVideoEnterPageActivity) {}
  
  public void run()
  {
    if ((NetworkUtil.a(MultiVideoEnterPageActivity.b(this.a)) == 0) && (!this.a.jdField_a_of_type_Boolean))
    {
      MultiVideoEnterPageActivity.f(this.a);
      MultiVideoEnterPageActivity.a(this.a, 0, 2131034240);
      if (this.a.jdField_a_of_type_ComTencentAvVideoController != null) {
        this.a.jdField_a_of_type_ComTencentAvVideoController.a(this.a.c, this.a.jdField_a_of_type_Long, 22, 0);
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jyf
 * JD-Core Version:    0.7.0.1
 */