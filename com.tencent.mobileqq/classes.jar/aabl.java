import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.ar.ARRecord.ARVideoRecordUIControllerImpl;
import com.tencent.mobileqq.ar.ARTarget;
import com.tencent.mobileqq.ar.aidl.ArCloudConfigInfo;
import com.tencent.mobileqq.ar.arengine.AREngine;
import com.tencent.mobileqq.ar.arengine.AREngineCallback;
import com.tencent.mobileqq.arcard.ARGreetingCardListManager;
import com.tencent.qphone.base.util.QLog;
import mqq.os.MqqHandler;

public class aabl
  implements Runnable
{
  public aabl(AREngine paramAREngine, boolean paramBoolean, ArCloudConfigInfo paramArCloudConfigInfo) {}
  
  public void run()
  {
    int i;
    if (((!this.jdField_a_of_type_Boolean) || (!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.b())) && (AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2) && (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != null))
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
        QLog.i("AREngine_AREngine", 1, "processCloudSceneRecogResult post task for handle timeout");
        AREngine.b(AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine));
        AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, null);
      }
      if (this.jdField_a_of_type_Boolean) {
        break label161;
      }
      QLog.i("AREngine_AREngine", 1, "onARSceneRecogDownloadComplete. download resource failed.");
      QLog.i("AREngine_AREngine", 1, "onARSceneRecogDownloadComplete end.");
      this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.n();
      ThreadManager.getUIHandler().post(new aabm(this));
    }
    label161:
    do
    {
      do
      {
        return;
        i = 5;
        break;
        QLog.i("AREngine_AREngine", 1, "onARSceneRecogDownloadComplete end. isNeedInternalRender = " + this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.e() + ", isNeedExternalRender = " + this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.f() + ", isNeedWaitUserOperation = " + this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.g());
        if (!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.b()) {
          break label276;
        }
      } while ((!AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) || (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != 2));
      ARGreetingCardListManager.a().a(this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo, 0);
      this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo = this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo;
      return;
      if ((AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2) && (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != null)) {
        AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine).a(2048L, new ARTarget(this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo));
      }
      if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.c())
      {
        this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.n();
        return;
      }
      if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.e())
      {
        ARVideoRecordUIControllerImpl.a().a(2);
        if (this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.i()) {
          AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, false);
        }
        AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, 2048L, this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo, -1, 0.0F, 0.0F, 0.0F);
        return;
      }
      if ((!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.g()) && (!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.f())) {
        break label457;
      }
    } while ((!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.f()) || (!this.jdField_a_of_type_ComTencentMobileqqArAidlArCloudConfigInfo.i()));
    label276:
    AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine, true);
    return;
    label457:
    this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.n();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aabl
 * JD-Core Version:    0.7.0.1
 */