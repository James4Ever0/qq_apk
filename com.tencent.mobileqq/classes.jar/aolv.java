import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.tencent.mobileqq.activity.Contacts.OverScrollViewTag;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.PullRefreshHeader;
import com.tencent.widget.ListView;
import com.tencent.widget.OverScrollViewListener;
import dov.com.qq.im.capture.poi.FacePoiManager;
import dov.com.tencent.biz.qqstory.takevideo.poilist.PoiListLayout;

public class aolv
  implements OverScrollViewListener
{
  public aolv(PoiListLayout paramPoiListLayout) {}
  
  public void a(int paramInt, View paramView, ListView paramListView)
  {
    paramView = (PullRefreshHeader)paramView;
    if (this.a.a == 0L) {}
    for (long l = System.currentTimeMillis();; l = this.a.a)
    {
      paramView.c(l);
      return;
    }
  }
  
  public boolean a(int paramInt, View paramView, ListView paramListView)
  {
    paramListView = (PullRefreshHeader)paramView;
    long l;
    if (this.a.a == 0L)
    {
      l = System.currentTimeMillis();
      paramListView.a(l);
      if (!NetworkUtil.g(PoiListLayout.a(this.a).getContext())) {
        break label114;
      }
      PoiListLayout.a(this.a).d();
      PoiListLayout.a(this.a).a();
      new Handler(Looper.getMainLooper()).postDelayed(new aolw(this), 300L);
    }
    for (;;)
    {
      ((Contacts.OverScrollViewTag)paramView.getTag()).a = true;
      return true;
      l = this.a.a;
      break;
      label114:
      new Handler(Looper.getMainLooper()).postDelayed(new aolx(this), 300L);
    }
  }
  
  public void b(int paramInt, View paramView, ListView paramListView)
  {
    paramView = (PullRefreshHeader)paramView;
    if (this.a.a == 0L) {}
    for (long l = System.currentTimeMillis();; l = this.a.a)
    {
      paramView.b(l);
      return;
    }
  }
  
  public void c(int paramInt, View paramView, ListView paramListView) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes7.jar
 * Qualified Name:     aolv
 * JD-Core Version:    0.7.0.1
 */