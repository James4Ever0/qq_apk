import android.view.View;
import com.tencent.biz.pubaccount.readinjoy.view.fastweb.data.VideoData;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawableDownListener;
import com.tencent.image.URLImageView;
import com.tencent.qphone.base.util.QLog;
import java.net.URL;

class mmm
  implements URLDrawableDownListener
{
  mmm(mmj parammmj) {}
  
  public void onLoadCancelled(View paramView, URLDrawable paramURLDrawable) {}
  
  public void onLoadFailed(View paramView, URLDrawable paramURLDrawable, Throwable paramThrowable)
  {
    QLog.d("Q.readinjoy.fast_web", 2, " onLoadFailed: " + paramURLDrawable.getURL().toString() + " retryCnt: " + mmj.a(this.a));
    if ((((VideoData)this.a.a).a.equals(paramURLDrawable.getURL().getFile())) && (mmj.a(this.a) < 3))
    {
      mmj.b(this.a);
      this.a.b(this.a.a, this.a.a, true);
    }
  }
  
  public void onLoadInterrupted(View paramView, URLDrawable paramURLDrawable, InterruptedException paramInterruptedException) {}
  
  public void onLoadProgressed(View paramView, URLDrawable paramURLDrawable, int paramInt) {}
  
  public void onLoadSuccessed(View paramView, URLDrawable paramURLDrawable)
  {
    mmj.a(this.a).setImageDrawable(paramURLDrawable);
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes5.jar
 * Qualified Name:     mmm
 * JD-Core Version:    0.7.0.1
 */