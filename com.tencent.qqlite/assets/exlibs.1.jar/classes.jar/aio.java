import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mobileqq.activity.DirectForwardActivity;
import com.tencent.mobileqq.app.BrowserAppInterface;
import java.util.ArrayList;

public class aio
  extends BroadcastReceiver
{
  public aio(DirectForwardActivity paramDirectForwardActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getExtras();
    if (paramIntent != null)
    {
      paramContext = paramIntent.getStringArrayList("procNameList");
      paramIntent = paramIntent.getString("verify");
      if ((paramContext != null) && (paramContext.size() != 0) && (this.a.d != null) && (BrowserAppInterface.a(paramIntent, paramContext))) {
        break label53;
      }
    }
    for (;;)
    {
      return;
      label53:
      int i = 0;
      while (i < paramContext.size())
      {
        if (this.a.d.equals(paramContext.get(i)))
        {
          this.a.finish();
          return;
        }
        i += 1;
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.1.jar\classes.jar
 * Qualified Name:     aio
 * JD-Core Version:    0.7.0.1
 */