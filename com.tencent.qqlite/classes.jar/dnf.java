import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.app.FileTransferHandler;
import com.tencent.mobileqq.filemanager.core.OnlineFileSessionCenter;
import com.tencent.qphone.base.util.QLog;

public class dnf
  implements Runnable
{
  public dnf(FileTransferHandler paramFileTransferHandler, long paramLong, boolean paramBoolean, String paramString) {}
  
  public void run()
  {
    QLog.i("FileTransferHandler<FileAssistant>", 1, "OLfilesession[" + this.jdField_a_of_type_Long + "]  handle query onlinefile upload progress resp. sucess =" + this.jdField_a_of_type_Boolean);
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerAppFileTransferHandler.a.a().b(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Long, this.jdField_a_of_type_Boolean);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     dnf
 * JD-Core Version:    0.7.0.1
 */