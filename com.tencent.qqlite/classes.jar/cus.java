import com.tencent.mobileqq.app.CoreService;
import com.tencent.mobileqq.app.GuardManager;

public class cus
  extends cti
{
  protected void a()
  {
    super.a();
    if (this.b >= cte.a().a / 12000L)
    {
      CoreService.d();
      this.a.f();
      this.b = 0L;
    }
  }
  
  protected void a(String paramString)
  {
    GuardManager localGuardManager = this.a;
    if ("com.tencent.qqlite".equals(paramString)) {}
    for (int i = 2;; i = 3)
    {
      localGuardManager.a(i, paramString);
      return;
    }
  }
  
  protected void b(String paramString)
  {
    super.b(paramString);
    this.a.e();
    CoreService.c();
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     cus
 * JD-Core Version:    0.7.0.1
 */