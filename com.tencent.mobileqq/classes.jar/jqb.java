import android.os.Handler;
import android.os.Message;
import com.tencent.av.ui.AVActivity;
import com.tencent.av.ui.QavVideoRecordUICtrl;
import com.tencent.av.ui.VideoLayerUI;

public class jqb
  extends Handler
{
  public jqb(AVActivity paramAVActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool = true;
    int i = 0;
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
      return;
    }
    if (paramMessage.arg1 == 1) {}
    for (;;)
    {
      this.a.h(bool);
      if (this.a.jdField_a_of_type_ComTencentAvUiQavVideoRecordUICtrl != null) {
        this.a.jdField_a_of_type_ComTencentAvUiQavVideoRecordUICtrl.n();
      }
      paramMessage = this.a.jdField_a_of_type_ComTencentAvUiVideoLayerUI;
      if (bool) {
        i = this.a.jdField_a_of_type_ComTencentAvUiQavVideoRecordUICtrl.a;
      }
      paramMessage.e(i);
      this.a.m();
      return;
      bool = false;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jqb
 * JD-Core Version:    0.7.0.1
 */