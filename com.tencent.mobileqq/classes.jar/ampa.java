import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cooperation.troop.TroopPluginManager;
import cooperation.troop.TroopPluginManager.TroopPluginCallback;

public class ampa
  extends Handler
{
  public ampa(TroopPluginManager paramTroopPluginManager, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    ((TroopPluginManager.TroopPluginCallback)paramMessage.obj).a(paramMessage.arg1);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     ampa
 * JD-Core Version:    0.7.0.1
 */