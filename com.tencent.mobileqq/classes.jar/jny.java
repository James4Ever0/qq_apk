import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.av.redpacket.ui.RedPacketRollTextView;
import java.lang.ref.WeakReference;

public class jny
  extends Handler
{
  WeakReference a;
  
  public jny(RedPacketRollTextView paramRedPacketRollTextView)
  {
    this.a = new WeakReference(paramRedPacketRollTextView);
  }
  
  public void handleMessage(Message paramMessage)
  {
    RedPacketRollTextView localRedPacketRollTextView = (RedPacketRollTextView)this.a.get();
    if (localRedPacketRollTextView == null) {}
    do
    {
      Bundle localBundle;
      do
      {
        return;
        localBundle = paramMessage.getData();
      } while (localBundle == null);
      switch (paramMessage.what)
      {
      default: 
        return;
      }
      localRedPacketRollTextView.setText(localBundle.getString("content"));
    } while (RedPacketRollTextView.a(localRedPacketRollTextView) == null);
    RedPacketRollTextView.a(localRedPacketRollTextView).a(null);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     jny
 * JD-Core Version:    0.7.0.1
 */