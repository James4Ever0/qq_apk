import com.tencent.av.business.manager.magicface.MagicfaceBaseDecoder;
import com.tencent.av.business.manager.magicface.MagicfaceData;

public class jhv
  implements Runnable
{
  public jhv(MagicfaceBaseDecoder paramMagicfaceBaseDecoder) {}
  
  public void run()
  {
    int i = Thread.currentThread().getPriority();
    Thread.currentThread().setPriority(10);
    String str = this.a.jdField_a_of_type_ComTencentAvBusinessManagerMagicfaceMagicfaceData.b();
    this.a.jdField_a_of_type_Boolean = true;
    this.a.b(str);
    int j = this.a.a();
    this.a.jdField_a_of_type_Boolean = false;
    this.a.jdField_a_of_type_ComTencentAvBusinessManagerMagicfaceMagicfaceData.b();
    this.a.a(str, j);
    Thread.currentThread().setPriority(i);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     jhv
 * JD-Core Version:    0.7.0.1
 */