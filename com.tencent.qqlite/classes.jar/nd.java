import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.client.android.wifi.BizWifiConfigManager;
import com.google.zxing.client.android.wifi.WifiParsedResult;
import com.tencent.biz.game.SensorAPIJavaScript;
import com.tencent.qphone.base.util.QLog;

public class nd
  extends Thread
{
  public nd(SensorAPIJavaScript paramSensorAPIJavaScript, String paramString1, String paramString2, String paramString3, boolean paramBoolean, WifiManager paramWifiManager, String paramString4) {}
  
  public void run()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("SensorApi", 4, "start connectToWiFi");
    }
    Object localObject = new WifiParsedResult(this.jdField_a_of_type_JavaLangString, this.b, this.c, this.jdField_a_of_type_Boolean);
    boolean bool = new BizWifiConfigManager(this.jdField_a_of_type_AndroidNetWifiWifiManager).a((WifiParsedResult)localObject);
    localObject = new Message();
    if (bool)
    {
      ((Message)localObject).what = 5;
      ((Message)localObject).obj = this.d;
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.a.sendMessage((Message)localObject);
      return;
      ((Message)localObject).what = 0;
      ((Message)localObject).obj = ("javascript: " + this.d + "('" + 1 + "')");
      this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.c = false;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\classes.jar
 * Qualified Name:     nd
 * JD-Core Version:    0.7.0.1
 */