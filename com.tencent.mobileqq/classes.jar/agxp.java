import com.tencent.mobileqq.ptt.LSRecordPanel;

public class agxp
  implements Runnable
{
  public agxp(LSRecordPanel paramLSRecordPanel) {}
  
  public void run()
  {
    LSRecordPanel.b(this.a, false);
    LSRecordPanel.a(this.a, "亲们，QQ没有使用麦克风权限呢");
    LSRecordPanel.b(this.a, false);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     agxp
 * JD-Core Version:    0.7.0.1
 */