import com.tencent.mobileqq.ar.ARTarget;
import com.tencent.mobileqq.ar.aidl.ArCloudConfigInfo;
import com.tencent.mobileqq.ar.arengine.AREngine;
import com.tencent.mobileqq.ar.arengine.AREngineCallback;

public class aabr
  implements Runnable
{
  public aabr(AREngine paramAREngine, int paramInt) {}
  
  public void run()
  {
    if (!AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine).c())
    {
      if (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine).i()) {
        AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine);
      }
      if (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != 1L) {
        break label132;
      }
      this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.b(1L);
      AREngine.c(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine);
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.j();
      if ((AREngine.d(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine)) && (AREngine.e(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2) && (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) != null))
      {
        ARTarget localARTarget = new ARTarget(AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine));
        AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine).a(3, localARTarget, this.jdField_a_of_type_Int);
      }
      return;
      label132:
      if (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2L) {
        this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.l();
      } else if (AREngine.a(this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine) == 2048L) {
        this.jdField_a_of_type_ComTencentMobileqqArArengineAREngine.n();
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aabr
 * JD-Core Version:    0.7.0.1
 */