import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.biz.qqstory.playvideo.ProgressControler;

public class nmg
  extends Handler
{
  public nmg(ProgressControler paramProgressControler, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (this.a.jdField_a_of_type_Boolean) {
      return;
    }
    this.a.a(this.a.jdField_a_of_type_Int, this.a.c);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     nmg
 * JD-Core Version:    0.7.0.1
 */