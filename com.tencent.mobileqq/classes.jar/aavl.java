import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.ark.ArkDispatchTask;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.ark.API.ArkAppDeviceModule;
import com.tencent.mobileqq.ark.ArkAppCenter;

class aavl
  extends BroadcastReceiver
{
  aavl(aavk paramaavk, long paramLong) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getStringExtra("com.tencent.ark.scanResultData");
    paramIntent = paramIntent.getStringExtra("com.tencent.ark.scanResultType");
    ArkAppCenter.a().post(new aavm(this, paramContext, paramIntent));
    try
    {
      BaseApplicationImpl.getApplication().unregisterReceiver(ArkAppDeviceModule.a(this.jdField_a_of_type_Aavk.a));
      label46:
      ArkAppDeviceModule.a(this.jdField_a_of_type_Aavk.a, null);
      return;
    }
    catch (Exception paramContext)
    {
      break label46;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes4.jar
 * Qualified Name:     aavl
 * JD-Core Version:    0.7.0.1
 */