import com.tencent.av.ui.MultiVideoCtrlLayerUIBase;
import com.tencent.qphone.base.util.QLog;

public class jya
  implements Runnable
{
  public String a;
  
  public jya(MultiVideoCtrlLayerUIBase paramMultiVideoCtrlLayerUIBase) {}
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.jdField_a_of_type_ComTencentAvUiMultiVideoCtrlLayerUIBase.c, 2, "StartRecvAllVideoRunnable-->FunctionName=" + this.jdField_a_of_type_JavaLangString);
    }
    this.jdField_a_of_type_ComTencentAvUiMultiVideoCtrlLayerUIBase.e();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     jya
 * JD-Core Version:    0.7.0.1
 */