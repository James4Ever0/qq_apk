import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawableDownListener.Adapter;
import com.tencent.mobileqq.structmsg.view.StructMsgItemVideo;
import com.tencent.qphone.base.util.QLog;

public class ahvv
  extends URLDrawableDownListener.Adapter
{
  public ahvv(StructMsgItemVideo paramStructMsgItemVideo) {}
  
  public void onLoadCancelled(View paramView, URLDrawable paramURLDrawable)
  {
    super.onLoadCancelled(paramView, paramURLDrawable);
    if (QLog.isColorLevel()) {
      QLog.d("structmsg.StructMsgItemVideo", 2, "onLoadCancelled");
    }
  }
  
  public void onLoadFailed(View paramView, URLDrawable paramURLDrawable, Throwable paramThrowable)
  {
    super.onLoadFailed(paramView, paramURLDrawable, paramThrowable);
    if (QLog.isColorLevel()) {
      QLog.d("structmsg.StructMsgItemVideo", 2, "onLoadFailed ,cause = " + paramThrowable);
    }
  }
  
  public void onLoadInterrupted(View paramView, URLDrawable paramURLDrawable, InterruptedException paramInterruptedException)
  {
    super.onLoadInterrupted(paramView, paramURLDrawable, paramInterruptedException);
    if (QLog.isColorLevel()) {
      QLog.d("structmsg.StructMsgItemVideo", 2, "onLoadInterrupted");
    }
  }
  
  public void onLoadSuccessed(View paramView, URLDrawable paramURLDrawable)
  {
    int i = paramView.getLayoutParams().height * paramURLDrawable.getIntrinsicWidth() / paramURLDrawable.getIntrinsicHeight();
    paramView.getLayoutParams().width = i;
    paramView.setBackgroundDrawable(paramURLDrawable);
    paramView.requestLayout();
    if (QLog.isColorLevel()) {
      QLog.d("structmsg.StructMsgItemVideo", 2, "onLoadSuccessed");
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     ahvv
 * JD-Core Version:    0.7.0.1
 */