import com.tencent.ark.ArkDispatchTask;
import com.tencent.mobileqq.activity.aio.item.ArkAppLocationManager;
import com.tencent.mobileqq.app.soso.SosoInterface.OnLocationListener;
import com.tencent.mobileqq.app.soso.SosoInterface.SosoLbsInfo;
import com.tencent.mobileqq.ark.ArkAppCenter;

public class urr
  extends SosoInterface.OnLocationListener
{
  public urr(ArkAppLocationManager paramArkAppLocationManager, int paramInt, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    super(paramInt, paramBoolean1, paramBoolean2, paramLong, paramBoolean3, paramBoolean4, paramString);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 3) {
      return;
    }
    b(paramInt1, null);
  }
  
  public void a(int paramInt, SosoInterface.SosoLbsInfo paramSosoLbsInfo)
  {
    b(paramInt, paramSosoLbsInfo);
  }
  
  protected void b(int paramInt, SosoInterface.SosoLbsInfo paramSosoLbsInfo)
  {
    if ((paramInt == 0) && (paramSosoLbsInfo != null)) {}
    for (boolean bool = true;; bool = false)
    {
      ArkAppCenter.a().post(new urs(this, bool, paramSosoLbsInfo));
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     urr
 * JD-Core Version:    0.7.0.1
 */