import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.ui.DoubleVideoCtrlUI;
import com.tencent.av.utils.TraeHelper;

public class jss
  implements Runnable
{
  public jss(DoubleVideoCtrlUI paramDoubleVideoCtrlUI) {}
  
  public void run()
  {
    if ((this.a.jdField_a_of_type_ComTencentAvUtilsTraeHelper != null) && (this.a.jdField_a_of_type_ComTencentAvUtilsTraeHelper.b()) && (this.a.jdField_a_of_type_ComTencentAvAppVideoAppInterface != null)) {
      this.a.jdField_a_of_type_ComTencentAvAppVideoAppInterface.runOnUiThread(new jst(this));
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jss
 * JD-Core Version:    0.7.0.1
 */