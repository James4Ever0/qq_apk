import android.os.Handler;
import android.widget.TextView;
import com.tencent.av.gaudio.AVNotifyCenter;
import com.tencent.av.smallscreen.PstnSmallScreenService;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.qcall.PstnObserver;
import com.tencent.qphone.base.util.QLog;

public class jol
  extends PstnObserver
{
  public jol(PstnSmallScreenService paramPstnSmallScreenService) {}
  
  public void a(String paramString, int paramInt)
  {
    super.a(paramString, paramInt);
    if (QLog.isColorLevel()) {
      QLog.d("PstnSmallScreenService", 2, " callId = " + paramString + "time = " + paramInt);
    }
    this.a.a().removeCallbacks(this.a.c);
    if (this.a.jdField_a_of_type_AndroidWidgetTextView != null) {
      this.a.jdField_a_of_type_AndroidWidgetTextView.setText(2131429559);
    }
    this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a().b = 2;
    this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().g = true;
    this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().e(true);
    this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jol
 * JD-Core Version:    0.7.0.1
 */