import android.text.TextUtils;
import com.tencent.mobileqq.ark.ArkAppCenter;
import com.tencent.mobileqq.ark.ArkLocalAppMgr;
import java.util.Iterator;
import java.util.Set;

class abbv
  implements Runnable
{
  abbv(abbu paramabbu, Set paramSet) {}
  
  public void run()
  {
    this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr.jdField_a_of_type_JavaUtilSet.addAll(this.jdField_a_of_type_JavaUtilSet);
    if (this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr.jdField_a_of_type_JavaUtilSet.isEmpty())
    {
      ArkAppCenter.b("ArkApp.ArkLocalAppMgr", String.format("getAppPathByAction, no app name found, task complete, action=%s.%s", new Object[] { this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr.b }));
      this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr.jdField_a_of_type_Boolean = true;
      ArkLocalAppMgr.a(this.jdField_a_of_type_Abbu.jdField_a_of_type_ComTencentMobileqqArkArkLocalAppMgr, this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.jdField_a_of_type_JavaUtilSet.iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        String str2 = this.jdField_a_of_type_Abbu.jdField_a_of_type_ComTencentMobileqqArkArkLocalAppMgr.a(str1, "0.0.0.0");
        if (!TextUtils.isEmpty(str2)) {
          ArkLocalAppMgr.a(this.jdField_a_of_type_Abbu.jdField_a_of_type_ComTencentMobileqqArkArkLocalAppMgr, this.jdField_a_of_type_Abbu.jdField_a_of_type_Abcr, 0, "Found on Local", str2, str1);
        } else {
          this.jdField_a_of_type_Abbu.jdField_a_of_type_ComTencentMobileqqArkArkLocalAppMgr.a(str1, "0.0.0.0", null, new abbw(this, str1));
        }
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     abbv
 * JD-Core Version:    0.7.0.1
 */