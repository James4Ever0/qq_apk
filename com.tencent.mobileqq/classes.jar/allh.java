import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.widget.DynamicGridView;

public class allh
  implements AdapterView.OnItemClickListener
{
  public allh(DynamicGridView paramDynamicGridView) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((!this.a.a()) && (this.a.isEnabled()) && (DynamicGridView.a(this.a) != null)) {
      DynamicGridView.a(this.a).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\aaa.jar
 * Qualified Name:     allh
 * JD-Core Version:    0.7.0.1
 */