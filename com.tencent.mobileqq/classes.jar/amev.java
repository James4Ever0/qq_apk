import com.tencent.qphone.base.util.QLog;
import com.tencent.qqprotect.common.CommTvRpt;
import com.tencent.qqprotect.common.QPMiscUtils;
import com.tencent.qqprotect.qsec.CrashProtector.IProtectedMethod;
import com.tencent.qqprotect.qsec.QSecFramework;
import mqq.app.MobileQQ;

public class amev
  implements CrashProtector.IProtectedMethod
{
  public amev(QSecFramework paramQSecFramework) {}
  
  public void a()
  {
    if ((!QSecFramework.a()) || (QSecFramework.a(this.a))) {}
    for (;;)
    {
      return;
      try
      {
        Object[] arrayOfObject = new Object[1];
        if ((QSecFramework.a(1, 33751040, QPMiscUtils.a(), 0, QSecFramework.a(this.a), MobileQQ.sMobileQQ, null, arrayOfObject) == 0) && (arrayOfObject[0] != null) && ((arrayOfObject[0] instanceof Integer)))
        {
          QSecFramework.a(this.a, ((Integer)arrayOfObject[0]).intValue());
          QPMiscUtils.a = QSecFramework.a(this.a);
          QSecFramework.a(this.a, true);
        }
        if (QLog.isColorLevel())
        {
          QLog.d("QSecFramework", 2, String.format("Native ver: %d(%s)", new Object[] { Integer.valueOf(QSecFramework.a(this.a)), QPMiscUtils.a(QSecFramework.a(this.a)) }));
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d("QSecFramework", 2, "Something wrong when init native.");
    }
    CommTvRpt.a(1, 2);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     amev
 * JD-Core Version:    0.7.0.1
 */