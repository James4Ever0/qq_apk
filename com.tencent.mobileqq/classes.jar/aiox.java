import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.structmsg.view.StructMsgItemVideo;
import com.tencent.mobileqq.widget.AnyScaleTypeImageView;
import java.lang.ref.WeakReference;

public class aiox
  extends Handler
{
  private WeakReference a;
  
  public aiox(StructMsgItemVideo paramStructMsgItemVideo)
  {
    this.a = new WeakReference(paramStructMsgItemVideo);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((StructMsgItemVideo)this.a.get() != null) {
      ((AnyScaleTypeImageView)paramMessage.obj).setImageResource(2130842779);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     aiox
 * JD-Core Version:    0.7.0.1
 */