import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.biz.qrcode.activity.QRCardActivity;
import com.tencent.biz.qrcode.util.QRCard;
import java.util.HashMap;

public class pq
  implements View.OnClickListener
{
  public pq(QRCardActivity paramQRCardActivity) {}
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof Integer)) {
      if (((Integer)localObject).intValue() != 0) {
        break label101;
      }
    }
    label101:
    for (String str = (String)((TextView)paramView.findViewById(2131296566)).getText();; str = null)
    {
      if (((Integer)localObject).intValue() == 1)
      {
        this.a.a((String)this.a.a.d.get(this.a.j));
        return;
      }
      QRCardActivity.a(this.a, paramView.getContext(), ((Integer)localObject).intValue(), null, str);
      return;
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.qqlite\assets\exlibs.2.jar\classes.jar
 * Qualified Name:     pq
 * JD-Core Version:    0.7.0.1
 */