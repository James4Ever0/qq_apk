import com.tencent.mobileqq.app.soso.SosoInterface.OnLocationListener;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLbsInfo;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLocation;
import com.tencent.qphone.base.util.QLog;
import dov.com.tencent.mobileqq.activity.richmedia.FlowCameraActivity2;

public class anpw
  extends SosoInterface.OnLocationListener
{
  public anpw(FlowCameraActivity2 paramFlowCameraActivity2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    super(paramInt, paramBoolean1, paramBoolean2, paramLong, paramBoolean3, paramBoolean4, paramString);
  }
  
  public void a(int paramInt, SosoInterface.SosoLbsInfo paramSosoLbsInfo)
  {
    if ((paramInt == 0) && (paramSosoLbsInfo != null) && (paramSosoLbsInfo.a != null))
    {
      this.a.a = paramSosoLbsInfo.a.a;
      this.a.b = paramSosoLbsInfo.a.b;
      if (QLog.isColorLevel()) {
        QLog.d("FlowCameraActivity", 2, "onLocationUpdate() latitude=" + this.a.a + " longitude=" + this.a.b);
      }
      if (FlowCameraActivity2.a(this.a) != null) {
        FlowCameraActivity2.a(this.a);
      }
    }
    do
    {
      return;
      this.a.a = 0.0D;
      this.a.b = 0.0D;
    } while (!QLog.isColorLevel());
    QLog.d("FlowCameraActivity", 2, "onLocationUpdate() error");
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     anpw
 * JD-Core Version:    0.7.0.1
 */