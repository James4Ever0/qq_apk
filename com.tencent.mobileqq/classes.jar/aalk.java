import com.tencent.mobileqq.ark.ArkAppCenter;
import com.tencent.open.base.BspatchUtil;
import java.io.File;

class aalk
  implements aalp
{
  aalk(aalb paramaalb, aalo paramaalo1, aalo paramaalo2, String paramString, aalq paramaalq) {}
  
  public void a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      ArkAppCenter.b("ArkApp.Dict.Update", String.format("dictIncrementalUpdate, download fail, name=%s, url=%s", new Object[] { this.jdField_a_of_type_Aalo.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Aalo.b }));
    }
    for (;;)
    {
      this.jdField_a_of_type_Aalq.a(false);
      return;
      if (!aalb.b(paramArrayOfByte, this.jdField_a_of_type_Aalo.f))
      {
        ArkAppCenter.b("ArkApp.Dict.Update", String.format("dictIncrementalUpdate, md5 mismatch, name=%s, url=%s, md5=%s", new Object[] { this.jdField_a_of_type_Aalo.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Aalo.b, this.jdField_a_of_type_Aalo.f }));
      }
      else
      {
        String str1 = aalb.a(this.b.jdField_a_of_type_JavaLangString);
        if (!new File(str1).isFile())
        {
          ArkAppCenter.b("ArkApp.Dict.Update", String.format("dictIncrementalUpdate, src path not exist, name=%s, path=s", new Object[] { this.jdField_a_of_type_Aalo.jdField_a_of_type_JavaLangString, str1 }));
        }
        else
        {
          String str2 = String.format("%s/diff-%s", new Object[] { this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Aalo.d });
          if (!aalb.a(paramArrayOfByte, str2))
          {
            ArkAppCenter.b("ArkApp.Dict.Update", String.format("dictIncrementalUpdate, write diff to file fail, name=%s, path=%s", new Object[] { this.jdField_a_of_type_Aalo.jdField_a_of_type_JavaLangString, str2 }));
          }
          else
          {
            if (BspatchUtil.a(str1, str2, String.format("%s/%s", new Object[] { this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Aalo.jdField_a_of_type_JavaLangString }))) {
              break;
            }
            ArkAppCenter.b("ArkApp.Dict.Update", String.format("dictIncrementalUpdate, patch fail, name=%s, diff-md5=%s", new Object[] { this.jdField_a_of_type_Aalo.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Aalo.f }));
          }
        }
      }
    }
    this.jdField_a_of_type_Aalq.a(true);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aalk
 * JD-Core Version:    0.7.0.1
 */