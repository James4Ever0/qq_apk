import android.os.Process;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.hotpatch.DexPatchInstaller;
import com.tencent.hotpatch.config.PatchConfig;
import com.tencent.hotpatch.config.PatchConfigManager;
import com.tencent.hotpatch.utils.PatchSharedPreUtil;
import com.tencent.mobileqq.app.CoreService;
import com.tencent.mobileqq.app.GuardManager;
import com.tencent.mobileqq.app.MemoryConfigs;
import com.tencent.mobileqq.app.MemoryManager;
import com.tencent.mobileqq.ark.ArkMediaPlayer;
import com.tencent.mobileqq.startup.step.SetSplash;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;
import mqq.app.AppRuntime;

public class zha
  extends zlr
{
  private String a;
  
  protected void a()
  {
    this.c += 1L;
    this.d += 1L;
    if ((this.d == 1L) && (SetSplash.b()) && (this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.jdField_a_of_type_JavaLangString == null))
    {
      if (QLog.isColorLevel()) {
        QLog.d("setsplash", 2, "needshowsplashtoday , kill myself");
      }
      ReportController.a(null, "CliOper", "", "", "0X800483B", "0X800483B", 0, 0, "", "", "", "");
      System.exit(-1);
    }
    float f2 = MemoryManager.a().a();
    float f1;
    long l;
    if (MemoryConfigs.a().d > 0.0F)
    {
      f1 = MemoryConfigs.a().d;
      if (MemoryConfigs.a().b <= 0L) {
        break label416;
      }
      l = MemoryConfigs.a().b;
      label131:
      if ((MemoryConfigs.a().c) && (f2 >= f1) && (this.c >= l)) {
        this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(5, this.jdField_a_of_type_JavaLangString);
      }
      int i = zlp.a().a(MemoryManager.a(Process.myPid()));
      int j = zlp.a().a(this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.jdField_a_of_type_Array2dOfLong, this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.b);
      l = zlp.a().b[(i + j)] / 12000;
      if (this.c < l) {
        break label424;
      }
      this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(5, this.jdField_a_of_type_JavaLangString);
      label250:
      if ((this.d != 50L) && (this.d != 51L)) {
        break label505;
      }
      GuardManager.b(true);
      this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(false, new String[0]);
      Object localObject = PatchConfigManager.a(BaseApplicationImpl.sApplication, "dex");
      if ((localObject != null) && (((PatchConfig)localObject).a(BaseApplicationImpl.sApplication, false)))
      {
        localObject = ((PatchConfig)localObject).b();
        if ((PatchSharedPreUtil.a(BaseApplicationImpl.sApplication, (String)localObject)) && (this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.jdField_a_of_type_JavaLangString == null) && ((DexPatchInstaller.jdField_a_of_type_Int == 0) || (!DexPatchInstaller.jdField_a_of_type_JavaLangString.equals(localObject))))
        {
          QLog.d("PatchLogTag", 1, "GuardManager exit to install patch, target patchName=" + (String)localObject + ", installed patchName=" + DexPatchInstaller.jdField_a_of_type_JavaLangString + ", installStatus=" + DexPatchInstaller.jdField_a_of_type_Int);
          System.exit(-1);
        }
      }
    }
    label416:
    label424:
    label505:
    do
    {
      return;
      f1 = 0.95F;
      break;
      l = 50L;
      break label131;
      if (this.d == 1L)
      {
        MemoryManager.a().a(1L);
        MemoryManager.a().a("BG_GUARD");
        break label250;
      }
      if ((this.d != 3L) && (this.d != 4L)) {
        break label250;
      }
      this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(false, new String[] { "com.tencent.mobileqq:qzone", "com.tencent.mobileqq:tool", this.jdField_a_of_type_JavaLangString });
      break label250;
      if ((this.d == GuardManager.e) || (this.d == GuardManager.e + 1))
      {
        if (!"com.tencent.mobileqq:qzone".equals(this.jdField_a_of_type_JavaLangString)) {
          this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(false, "com.tencent.mobileqq:qzone");
        }
        GuardManager.b(false);
      }
    } while (((this.d != GuardManager.d) && (this.d != GuardManager.d + 1)) || ("com.tencent.mobileqq:tool".equals(this.jdField_a_of_type_JavaLangString)));
    this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(false, "com.tencent.mobileqq:tool");
  }
  
  protected void a(String paramString)
  {
    this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.a(3, paramString);
    if ("com.tencent.mobileqq".equals(paramString)) {
      ArkMediaPlayer.a();
    }
  }
  
  protected void b()
  {
    if (this.c > 2L) {
      this.c -= 2L;
    }
  }
  
  protected void b(String paramString)
  {
    super.b(paramString);
    this.jdField_a_of_type_JavaLangString = paramString;
    if ("fake_p_msg".equals(paramString)) {
      this.c = (zlp.a().a(this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.jdField_a_of_type_Array2dOfLong, this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.b, MemoryManager.a(Process.myPid())) / 12000L - 2L);
    }
    CoreService.startCoreService(zlp.a().a);
    this.jdField_a_of_type_ComTencentMobileqqAppGuardManager.b();
    BaseApplicationImpl.sApplication.getRuntime().onGuardEvent(1, 0L, 0L);
    if ("com.tencent.mobileqq".equals(paramString)) {
      ArkMediaPlayer.b();
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes.jar
 * Qualified Name:     zha
 * JD-Core Version:    0.7.0.1
 */