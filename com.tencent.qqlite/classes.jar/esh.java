import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.qphone.base.util.QLog;

class esh
  implements Runnable
{
  esh(esf paramesf, Exception paramException) {}
  
  public void run()
  {
    this.jdField_a_of_type_Esf.a.dismiss();
    if (QLog.isColorLevel()) {
      QLog.d("Q.profilecard.FrdProfileCard", 2, "safetyReport exception1" + this.jdField_a_of_type_JavaLangException.getMessage());
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     esh
 * JD-Core Version:    0.7.0.1
 */