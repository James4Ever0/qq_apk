import com.tencent.av.report.AVPushReport;
import com.tencent.av.utils.HttpUtil.SimpleHttpPostTask;
import com.tencent.qphone.base.util.QLog;

public final class joj
  extends HttpUtil.SimpleHttpPostTask
{
  public joj(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1, paramString2, paramString3);
  }
  
  protected void a(String paramString)
  {
    AVPushReport.a(null);
    if (QLog.isColorLevel()) {
      QLog.d("AVPushReport", 2, "onAvReportPush SimpleHttpPostTask rsp = " + paramString);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     joj
 * JD-Core Version:    0.7.0.1
 */