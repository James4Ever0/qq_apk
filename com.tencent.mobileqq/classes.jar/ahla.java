import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.shortvideo.PtvTemplateManager;
import com.tencent.mobileqq.shortvideo.util.PtvFilterSoLoad;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ahla
  implements Runnable
{
  public ahla(PtvTemplateManager paramPtvTemplateManager, AppInterface paramAppInterface, File paramFile) {}
  
  public void run()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("PtvTemplateManager", 4, String.format("rebuildWebTemplateInfos, runnable[%s]", new Object[] { Integer.valueOf(hashCode()) }));
    }
    List localList = this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.a(this.jdField_a_of_type_ComTencentCommonAppAppInterface, this.jdField_a_of_type_JavaIoFile, null);
    if (localList != null) {}
    synchronized (this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.jdField_c_of_type_JavaLangObject)
    {
      if (this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.jdField_c_of_type_Boolean) {
        return;
      }
      this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.b.clear();
      this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.b.addAll(localList);
      this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.d = true;
      if ((this.jdField_a_of_type_ComTencentCommonAppAppInterface != null) && ((this.jdField_a_of_type_ComTencentCommonAppAppInterface instanceof QQAppInterface)) && (PtvFilterSoLoad.b())) {
        this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.b(this.jdField_a_of_type_ComTencentCommonAppAppInterface, this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager.b);
      }
      PtvTemplateManager.a(this.jdField_a_of_type_ComTencentMobileqqShortvideoPtvTemplateManager);
      if (QLog.isDevelopLevel())
      {
        QLog.d("PtvTemplateManager", 4, String.format("rebuildWebTemplateInfos, [%s] finished", new Object[] { Integer.valueOf(hashCode()) }));
        return;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ahla
 * JD-Core Version:    0.7.0.1
 */