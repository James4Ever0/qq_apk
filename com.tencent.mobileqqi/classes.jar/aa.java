import android.view.View;
import com.dataline.activities.LiteActivity;
import com.dataline.util.DatalineSessionAdapter;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.widget.ListView;
import com.tencent.widget.OverScrollViewListener;
import com.tencent.widget.XListView;

public class aa
  implements OverScrollViewListener
{
  public aa(LiteActivity paramLiteActivity) {}
  
  public void a(int paramInt, View paramView, ListView paramListView) {}
  
  public boolean a(int paramInt, View paramView, ListView paramListView)
  {
    paramInt = this.a.b.a().a(15);
    if (paramInt > 0)
    {
      LiteActivity.a(this.a).a();
      LiteActivity.a(this.a).notifyDataSetChanged();
      LiteActivity.a(this.a).setSelectionFromBottom(paramInt, 0);
    }
    return false;
  }
  
  public void b(int paramInt, View paramView, ListView paramListView) {}
  
  public void c(int paramInt, View paramView, ListView paramListView) {}
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqqi\classes3.jar
 * Qualified Name:     aa
 * JD-Core Version:    0.7.0.1
 */