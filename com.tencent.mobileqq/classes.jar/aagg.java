import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.ar.ARRecord.ARVideoRecordUIControllerImpl;
import com.tencent.mobileqq.ar.ARTarget;
import com.tencent.mobileqq.ar.aidl.ArCloudConfigInfo;
import com.tencent.mobileqq.ar.arengine.AREngine;
import com.tencent.mobileqq.ar.arengine.AREngineCallback;
import com.tencent.mobileqq.arcard.ARGreetingCardListManager;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;
import mqq.os.MqqHandler;

public class aagg
  implements Runnable
{
  public aagg(AREngine paramAREngine, boolean paramBoolean, ArCloudConfigInfo paramArCloudConfigInfo) {}
  
  public void run()
  {
    int i;
    if (((!this.jdField_a_of_type_Boolean) || (!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.c())) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2) && (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != null))
    {
      AREngineCallback localAREngineCallback = AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine);
      if (this.jdField_a_of_type_Boolean)
      {
        i = 4;
        localAREngineCallback.a(1, i);
      }
    }
    else
    {
      if (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != null)
      {
        QLog.i("AREngine_AREngine", 1, "processCloudObjectClassifyResult post task for handle timeout");
        AREngine.b(AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine));
        AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, null);
      }
      if (this.jdField_a_of_type_Boolean) {
        break label161;
      }
      QLog.i("AREngine_AREngine", 1, "onARObjectClassifyDownloadComplete. download resource failed.");
      QLog.i("AREngine_AREngine", 1, "onARObjectClassifyDownloadComplete end.");
      this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.l();
      ThreadManager.getUIHandler().post(new aagh(this));
    }
    for (;;)
    {
      return;
      i = 5;
      break;
      label161:
      QLog.i("AREngine_AREngine", 1, "onARObjectClassifyDownloadComplete end. isNeedInternalRender = " + this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.f() + ", isNeedExternalRender = " + this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.g() + ", isNeedWaitUserOperation = " + this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.h());
      if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.c())
      {
        if ((AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2))
        {
          ARGreetingCardListManager.a().a(this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo, 0);
          this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo = this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo;
        }
      }
      else
      {
        if ((AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2) && (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != null)) {}
        try
        {
          ReportController.b(null, "CliOper", "", "", "0X80081DE", "0X80081DE", 0, 0, this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.b + "", "2", "", "");
          AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine).a(2L, new ARTarget(this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo));
          if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.d())
          {
            this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.l();
            return;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            QLog.i("AREngine_AREngine", 1, "0X80081DE. error = " + localException.getMessage());
          }
          if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.f())
          {
            ARVideoRecordUIControllerImpl.a().a(2);
            if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.j()) {
              AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, false);
            }
            AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, 2L, this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo, -1, 0.0F, 0.0F, 0.0F);
            return;
          }
          if ((this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.h()) || (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.g()))
          {
            if ((this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.g()) && (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.j())) {
              AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, true);
            }
          }
          else {
            this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.l();
          }
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aagg
 * JD-Core Version:    0.7.0.1
 */