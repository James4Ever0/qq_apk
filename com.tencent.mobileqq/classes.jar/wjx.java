import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.contact.newfriend.SystemMsgListView;
import com.tencent.mobileqq.adapter.SystemMsgListAdapter;
import com.tencent.mobileqq.widget.QQToast;

public class wjx
  extends Handler
{
  public wjx(SystemMsgListView paramSystemMsgListView) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
    case 1012: 
      do
      {
        return;
      } while (SystemMsgListView.a(this.a) == null);
      this.a.i();
      SystemMsgListView.a(this.a).notifyDataSetChanged();
      return;
    }
    paramMessage = SystemMsgListView.a(this.a).getResources().getString(2131433178);
    QQToast.a(SystemMsgListView.a(this.a), 1, paramMessage, 0).b(this.a.a());
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes6.jar
 * Qualified Name:     wjx
 * JD-Core Version:    0.7.0.1
 */